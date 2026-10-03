package com.snackceo.reframe.core

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RepresentationsTest {
    private val source = SourceDocument(
        id = SourceId("test-source"),
        text = "Ada wrote the report. The report was submitted on Tuesday. The team reviewed it.",
    )

    @Test
    fun originalPreservesEntireSource() {
        val representation = Representations.original(source)

        assertEquals(source.text, representation.nodes.single().text)
        assertEquals(
            source.text,
            representation.nodes.single().sourceEvidence.single().extract(source.text),
        )
    }

    @Test
    fun chunkingKeepsEvidenceForEachChunk() {
        val representation = Representations.chunk(source, maxCharacters = 100)

        assertTrue(representation.nodes.isNotEmpty())
        assertTrue(representation.nodes.all { it.sourceEvidence.isNotEmpty() })
        assertTrue(
            representation.nodes.all { node ->
                node.sourceEvidence.all { span -> span.extract(source.text).isNotEmpty() }
            },
        )
    }

    @Test
    fun outlineDoesNotInventEvidence() {
        val representation = Representations.outline(source)

        assertTrue(representation.nodes.isNotEmpty())
        assertFalse(representation.nodes.any { node -> node.sourceEvidence.isEmpty() })
    }
}
