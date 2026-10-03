package com.snackceo.reframe.core

object Representations {
    fun original(source: SourceDocument): Representation =
        Representation(
            kind = RepresentationKind.ORIGINAL,
            sourceId = source.id,
            nodes = listOf(
                RepresentationNode(
                    id = "source-0",
                    text = source.text,
                    sourceEvidence = listOf(EvidenceSpan(0, source.text.length)),
                ),
            ),
        )

    fun chunk(source: SourceDocument, maxCharacters: Int = 280): Representation {
        require(maxCharacters > 0)

        val nodes = source.text
            .split(Regex("\\n\\s*\\n|(?<=[.!?])\\s+"))
            .filter { it.isNotBlank() }
            .flatMapIndexed { index, sentence ->
                val trimmed = sentence.trim()
                if (trimmed.length <= maxCharacters) {
                    listOf(
                        RepresentationNode(
                            id = "chunk-$index",
                            text = trimmed,
                            sourceEvidence = evidenceFor(source.text, trimmed),
                        ),
                    )
                } else {
                    trimmed.chunked(maxCharacters).mapIndexed { part, chunk ->
                        RepresentationNode(
                            id = "chunk-$index-$part",
                            text = chunk.trim(),
                            sourceEvidence = evidenceFor(source.text, chunk.trim()),
                        )
                    }
                }
            }

        return Representation(
            kind = RepresentationKind.CHUNKING,
            sourceId = source.id,
            nodes = nodes,
        )
    }

    fun outline(source: SourceDocument): Representation {
        val nodes = source.text
            .split(Regex("\\n\\s*\\n|(?<=[.!?])\\s+"))
            .filter { it.isNotBlank() }
            .mapIndexed { index, sentence ->
                val text = sentence.trim()
                RepresentationNode(
                    id = "outline-$index",
                    text = "• $text",
                    sourceEvidence = evidenceFor(source.text, text),
                )
            }

        return Representation(
            kind = RepresentationKind.OUTLINE,
            sourceId = source.id,
            nodes = nodes,
        )
    }

    private fun evidenceFor(source: String, text: String): List<EvidenceSpan> {
        val normalized = text.removePrefix("• ").trim()
        val start = source.indexOf(normalized)
        return if (start >= 0) {
            listOf(EvidenceSpan(start, start + normalized.length))
        } else {
            emptyList()
        }
    }
}
