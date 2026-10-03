package com.snackceo.reframe.core

@JvmInline
value class SourceId(val value: String)

data class SourceDocument(
    val id: SourceId,
    val text: String,
)

data class EvidenceSpan(
    val start: Int,
    val endExclusive: Int,
) {
    init {
        require(start >= 0)
        require(endExclusive >= start)
    }

    fun extract(source: String): String = source.substring(start, endExclusive)
}

enum class SemanticStatus {
    STATED,
    INFERRED,
    UNKNOWN,
    CONFLICTING,
}

enum class RepresentationKind {
    ORIGINAL,
    EMPHASIS,
    CHUNKING,
    OUTLINE,
    FIVE_W_H,
    TIMELINE,
    COMPARISON,
    DEFINITIONS,
    AUDIO,
}

data class RepresentationNode(
    val id: String,
    val text: String,
    val sourceEvidence: List<EvidenceSpan>,
    val status: SemanticStatus = SemanticStatus.STATED,
)

data class Representation(
    val kind: RepresentationKind,
    val sourceId: SourceId,
    val nodes: List<RepresentationNode>,
)
