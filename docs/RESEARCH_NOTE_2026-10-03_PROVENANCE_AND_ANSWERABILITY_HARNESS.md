# Reframe — Provenance and Answerability Evaluation Harness

**Date:** 2026-10-03  
**Status:** Research specification; not a production implementation

## 1. New research conclusion

The representation contract should be tested with a **source-to-answerability harness**, not only with text similarity or model-based semantic scores.

The key question is:

> After a reader receives a representation, can the reader still recover the information needed for the intended task from source-supported content, and can every transformed claim be traced to appropriate evidence?

Human evaluation of text simplification demonstrates why this matters: paragraph-level comprehension questions can expose meaning-preservation failures that ordinary simplification metrics miss, including cases where questions become unanswerable after transformation. citeturn0search0

## 2. The evidence chain

For every scored semantic representation, research data should support this chain:

**Source span(s) → semantic proposition → transformation operation → rendered representation → task question → reader answer**

If any link is missing, the trial should be marked as having incomplete provenance rather than silently treated as valid evidence.

## 3. Question classes

The fidelity/answerability bank should deliberately contain different constructs:

### Literal
Answer is explicitly stated in the source.

### Relational
Answer requires connecting multiple source statements.

### Temporal
Answer depends on event order, duration, or temporal qualifiers.

### Causal
Answer depends on an explicit causal relationship.

### Inferential
Answer requires deriving information not directly stated.

### Action
Answer requires selecting or executing an action supported by the source.

Do not combine these into a single undifferentiated comprehension score.

## 4. Answerability states

Each question should be classifiable against the representation as:

- **ANSWERABLE_CORRECT** — representation preserves sufficient information and reader answers correctly.
- **ANSWERABLE_INCORRECT** — sufficient information remains but reader answers incorrectly.
- **UNANSWERABLE_BY_REPRESENTATION** — necessary information was removed, altered, obscured, or otherwise made unavailable.
- **AMBIGUOUS_AFTER_TRANSFORMATION** — representation introduces or increases ambiguity.
- **ANSWERABLE_ONLY_BY_EXTERNAL_KNOWLEDGE** — answer depends on information not supplied by the source/declared support layer.
- **INVALID_TRIAL** — representation fidelity or protocol fidelity failed independently of reader performance.

The distinction between reader error and representation-induced unanswerability is essential.

## 5. Critical-span coverage

Before testing a representation, the research item should identify source spans required by each question.

For each critical span, record:

- preserved;
- omitted;
- altered;
- reordered;
- visually obscured;
- recoverable through source link;
- unavailable in the transformed view.

This creates a direct bridge between semantic fidelity and task performance.

A representation should not receive credit for a correct answer if it required information that the representation was supposed to expose but that was absent and supplied from memory or external knowledge.

## 6. Provenance levels

Research should distinguish:

**P0 — no provenance**
- claim cannot be traced.

**P1 — source document**
- claim points to the document but not a precise span.

**P2 — source span**
- claim points to the supporting passage.

**P3 — structured evidence**
- claim points to source span plus the extracted proposition/relationship.

**P4 — auditable transformation**
- claim records source span, operation, semantic state, transformation details, validation status, and recovery path.

The research instrument should aim for P3/P4 for semantic representations.

## 7. Representation-level fidelity tests

### Presentation representations

Examples:
- typography;
- spacing;
- emphasis;
- line focus.

Primary test:
**source text equivalence**

Secondary tests:
- unintended visual cueing;
- navigation;
- selection;
- reading-position preservation.

### Reorganization representations

Examples:
- chunking;
- outline;
- timeline;
- comparison.

Primary test:
**relationship preservation**

Secondary tests:
- ordering;
- qualifier preservation;
- omission;
- source recovery.

### Extraction representations

Examples:
- 5W+H;
- entities;
- dates;
- definitions.

Primary test:
**critical-span coverage + answerability**

Secondary tests:
- extraction omissions;
- unsupported insertions;
- ambiguity handling.

### Inference/explanation

Primary test:
**provenance + distinction between source-supported and added information**

Secondary tests:
- reader ability to distinguish stated versus inferred;
- factual correctness;
- usefulness;
- external-knowledge contamination.

## 8. Parallel-form experiment

The primary comparison should use matched or parallel source material:

**Form A**
- source → representation A → task

**Form B**
- matched source → representation B → equivalent task

Counterbalance:
- representation order;
- passage order;
- answer-option order where applicable.

Avoid repeatedly scoring the exact same passage across conditions unless the experiment explicitly models practice and memory effects.

The 2024 TACL evaluation demonstrates the value of paragraph-level comprehension questions for testing whether transformed text preserves information that readers can actually use. citeturn0search0

## 9. Reader-source recovery test

A separate task should test whether the reader can move from transformed information back to the relevant source evidence.

Measure:

- recovery success;
- time to recovery;
- source location accuracy;
- number of navigation actions;
- whether recovery resolves uncertainty.

This should remain separate from the primary comprehension score because source recovery is an accessibility/fidelity capability, not necessarily a comprehension outcome.

## 10. Automated checks versus human checks

Automated checks may flag:

- missing source spans;
- unsupported entities;
- changed numbers/dates;
- changed negation;
- changed modality/certainty;
- altered temporal relations;
- altered actor/object relationships;
- missing qualifiers.

They should be treated as screening/diagnostic mechanisms.

Human evaluation remains necessary for semantic cases where surface similarity does not establish equivalence. The TACL evidence specifically shows that human comprehension-based evaluation can expose meaning failures not captured by conventional metrics. citeturn0search0

## 11. Acceptance matrix

Every representation condition should ultimately produce a matrix containing:

| Dimension | Required evidence |
|---|---|
| Access | readable/navigable/accessible |
| Task | accuracy appropriate to construct |
| Process | time, rereading, navigation, switching |
| Fidelity | insertion, deletion, alteration, relationships |
| Answerability | preserved task-critical information |
| Provenance | source evidence available |
| Recovery | source can be located |
| Reader distinction | stated vs inferred vs explained |
| Generalization | held-out content |
| Protocol fidelity | intended representation actually delivered |

No single dimension substitutes for another.

## 12. New experiment: fidelity stress test

The existing comprehension-trajectory experiment should add a second axis:

**information demand × representation operation × fidelity risk**

For example:

- low-density literal passage;
- medium-density relational passage;
- high-density temporal/causal passage.

Test:
- Original;
- Chunking;
- Outline;
- 5W+H;
- Timeline.

Record both task outcome and transformation errors.

This can identify the point where a representation stops merely reorganizing information and begins losing or altering meaning.

## 13. Important distinction: reader failure versus representation failure

A wrong answer is not automatically evidence that the representation failed.

Classify the trial first:

1. Was the representation generated according to its declared contract?
2. Was the needed source evidence present?
3. Was the evidence recoverable?
4. Was the task valid?
5. Only then evaluate reader performance.

This prevents Reframe from incorrectly learning that a representation is ineffective when the actual problem was a renderer failure, missing source span, malformed item, or invalid task.

## 14. Research gate addition

Before production implementation, Reframe should have a research-ready harness capable of answering:

> **What source evidence supported this representation, what operation changed it, what information was potentially lost or added, and could the reader still complete the intended task without hidden external information?**

The harness is a measurement requirement, not a production feature specification.

**No production implementation is authorized by this document.**
