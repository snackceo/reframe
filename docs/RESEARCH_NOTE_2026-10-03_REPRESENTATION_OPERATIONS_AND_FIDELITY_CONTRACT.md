# Reframe — Representation Operations and Fidelity Contract

**Date:** 2026-10-03  
**Status:** Research specification; not a production implementation  
**Scope:** Define what a representation is allowed to change, what it must preserve, and how the research instrument should detect semantic drift.

## 1. Research conclusion

Reframe should treat representations as **declared transformations over a preserved semantic source**, not as unconstrained rewrites.

The core contract is:

> A representation may change how information is presented only within the permissions of its declared operation. Information that is added, removed, reordered, generalized, inferred, or explained must be identifiable and evaluable.

This follows from evidence that readability and textual similarity do not establish meaning preservation. Human comprehension evaluation has found that automatic simplification can make questions unanswerable through deletion or alteration even when outputs appear readable or adequate. citeturn0search0

The research model therefore becomes:

**Source → preserved semantic content → declared representation operation → rendered view**

rather than:

**Source → unrestricted generated rewrite → rendered view**

## 2. Transformation classes

Every representation should declare one primary operation class.

### A. Presentation

Changes visual or auditory presentation without changing semantic content.

Examples:
- spacing;
- typography;
- line focus;
- emphasis;
- synchronized highlighting;
- read-aloud.

Default semantic permission:
- **no insertion**
- **no deletion**
- **no substitution**
- **no reordering of semantic content**

Presentation may change perceptual grouping, but the underlying source order and wording remain recoverable.

### B. Reorganization

Changes the structural arrangement while preserving source propositions and relationships.

Examples:
- chunking;
- outline/list;
- timeline;
- comparison table;
- entity/action structure.

Allowed:
- grouping;
- labeling;
- visual ordering when the represented relationship explicitly justifies it.

Not allowed without explicit provenance:
- inventing relationships;
- collapsing distinct claims;
- changing temporal or causal direction;
- silently resolving ambiguity.

### C. Extraction

Selects information explicitly present in the source.

Examples:
- Who/What/When;
- named entities;
- explicit dates;
- explicit definitions;
- explicit actions.

Extraction must be able to point back to source evidence.

A missing field is **UNKNOWN**, not an invitation to infer.

### D. Inference

Derives information not explicitly stated.

Examples:
- answering an unstated “why”;
- resolving an implied relationship;
- deriving a consequence.

Inference must never be rendered as though it were a source fact.

Minimum label:
**INFERRED**

The research instrument should separately test whether inference support helps and whether readers can distinguish source evidence from derived content.

### E. Explanation

Adds information intended to help understanding.

Examples:
- definitions not present in the source;
- background context;
- examples;
- explanatory paraphrases.

Explanation carries the highest semantic-addition risk among these classes and therefore requires stricter provenance and validation.

## 3. Semantic states

Every extracted or generated proposition should be classifiable as:

| State | Meaning | Source evidence required |
|---|---|---|
| STATED | Directly supported by the source | Yes |
| INFERRED | Derived from source evidence and/or external knowledge | Yes, plus inference provenance |
| UNKNOWN | Not established by available evidence | No; must not be fabricated |
| CONFLICTING | Source contains incompatible or unresolved claims | Yes, with competing spans preserved |

The representation must not silently convert UNKNOWN into STATED.

## 4. Fidelity error taxonomy

Research and evaluation should keep at least these error classes separate:

1. **INSERTION** — information appears that is unsupported by the permitted source evidence.
2. **DELETION** — source information needed for the representation/task is omitted.
3. **SUBSTITUTION/ALTERATION** — information is changed in meaning, scope, certainty, quantity, actor, time, condition, or relationship.
4. **REORDERING ERROR** — a transformation changes an order or relationship that carries meaning.
5. **RELATIONSHIP LOSS** — entities/events remain individually present but their source relationship is lost or distorted.
6. **CERTAINTY ERROR** — uncertainty, attribution, negation, modality, or qualification is strengthened or weakened.
7. **PROVENANCE FAILURE** — a claim cannot be traced to the source or declared support layer.
8. **RECOVERY FAILURE** — the reader cannot return from a transformed item to its source evidence.

Information precision and recall are useful complementary diagnostics: unsupported additions reduce precision; omissions reduce recall; substitutions can affect both. This is consistent with established text-simplification error taxonomies. citeturn0search0

## 5. Representation contracts

### Original

**Purpose:** source access.

Must preserve:
- wording;
- order;
- paragraph/document structure;
- source metadata where available.

Permitted changes:
- accessibility presentation only.

### Spacing / typography

**Purpose:** alter perceptual presentation.

Must preserve:
- exact text;
- semantic order;
- punctuation;
- emphasis meaning.

Risk:
- visual emphasis can create unintended cues.

### Emphasis

**Purpose:** direct attention to selected source elements.

Must preserve:
- exact source text;
- surrounding context.

The highlighted category must be declared. Highlighting must not imply a semantic relationship that is absent from the source.

### Chunking

**Purpose:** expose manageable units.

Must preserve:
- source wording;
- proposition boundaries;
- relationships across chunks.

A chunk boundary must not imply that adjacent clauses are independent when their meaning depends on one another.

### Outline / list

**Purpose:** expose hierarchical structure.

Must preserve:
- parent/child relationships;
- qualifiers;
- exceptions;
- ordering where meaningful.

A list is not automatically a summary. Omitted material must be detectable.

### 5W+H

**Purpose:** support information-location tasks.

Must preserve:
- explicit source evidence for each populated field.

Rules:
- Who/What/When/Where/How may be populated from explicit evidence.
- Why may be STATED or INFERRED; it must not silently become STATED.
- Missing fields remain UNKNOWN.
- Multiple valid entities/events must not be collapsed without indicating multiplicity.
- Negation, uncertainty, attribution, and conditions must remain visible.

5W+H is therefore a **task representation**, not a universal summary.

### Timeline

**Purpose:** expose temporal relationships.

Must preserve:
- event identity;
- temporal evidence;
- ordering;
- uncertainty;
- relative versus absolute dates.

Rules:
- an undated event must not receive a fabricated date;
- approximate language such as “later” or “around” must not become exact;
- simultaneous/overlapping events must not be forced into a false sequence.

### Comparison

**Purpose:** make source-supported differences/similarities easier to inspect.

Must preserve:
- compared entities;
- comparison dimensions;
- direction of each difference;
- qualifiers and exceptions.

A blank comparison cell means UNKNOWN, not “no difference.”

### Definitions

**Purpose:** expose definitions already present or explicitly added as support.

Must distinguish:
- SOURCE-DEFINITION;
- REFRAME-EXPLANATION;
- INFERRED-DEFINITION.

A generated definition must never appear visually identical to a source quotation or source-derived definition without provenance.

### Audio / TTS

**Purpose:** alternate access modality.

Must preserve:
- semantic text;
- reading order;
- current reading position;
- source recovery.

Audio-specific interaction cost must be measured separately from semantic representation benefit.

## 6. Provenance requirements

Every semantic transformation should be capable of representing:

- source document identifier;
- source span(s);
- operation;
- representation;
- semantic state;
- omitted source spans;
- altered wording;
- confidence/evidence status;
- validation status;
- review requirement;
- source-recovery target.

The research instrument does not need to expose all metadata to the reader, but the evaluation layer must retain enough information to audit a representation.

## 7. Task-critical spans

A task-critical span is source material required to answer the intended task correctly.

Research should support marking such spans before representation generation.

For each task-critical span, record whether the representation:
- preserves it;
- visually emphasizes it;
- reorganizes it;
- omits it;
- alters it;
- makes it harder to recover.

A representation that improves a task by deleting information necessary for another legitimate task must not be treated as universally beneficial.

## 8. Fidelity versus usefulness

Reframe should never reduce evaluation to a single score.

At minimum report separately:

**Access**
- perceived readability/difficulty;
- navigation/accessibility success.

**Task benefit**
- accuracy;
- task completion;
- recall/integration/inference as appropriate.

**Process**
- time;
- rereading;
- navigation;
- switching;
- continuation;
- abandonment.

**Fidelity**
- insertion;
- deletion;
- substitution/alteration;
- relationship loss;
- certainty errors;
- answerability;
- source recovery.

A representation can therefore be:
- useful and faithful;
- useful but fidelity-risky;
- faithful but not useful;
- neither.

This prevents an apparent comprehension gain from masking semantic substitution.

## 9. Research protocol consequence

The representation stress test should compare operations at the smallest realistic context that preserves the relationship being tested.

For example:

**same source information + same task**
→ Original
→ Chunking
→ 5W+H
→ Timeline

Then score both:
- task outcome;
- fidelity to the source.

For semantic transformations, the evaluation set should include:
- literal retrieval;
- relational integration;
- temporal ordering;
- causal relationships;
- inference;
- action selection where relevant.

Paragraph/document context matters because sentence-level evaluation can miss discourse-level meaning changes. Human evaluation research on text simplification explicitly moved to paragraph-level contexts for this reason. citeturn0search0

## 10. Acceptance rule for future research

A representation should not advance toward production merely because readers:
- prefer it;
- read it faster;
- report lower effort;
- find it more readable;
- answer some questions more accurately.

Advancement requires evidence that:
1. the intended task improves or remains acceptably stable;
2. semantic fidelity remains within the declared contract;
3. negative effects are understood;
4. source recovery remains possible;
5. accessibility behavior remains valid;
6. effects survive matched/held-out content where applicable;
7. the transformation's assistance level is explicit.

## 11. Research questions created by this contract

The next experiments should determine:

1. Which representation operations reliably preserve task-critical relationships?
2. Which operations create the most insertion, deletion, or substitution errors?
3. Does provenance/source recovery reduce the practical impact of semantic errors?
4. Which transformations help literal retrieval versus integration versus inference?
5. When does reorganization become substitution?
6. How much semantic compression can occur before answerability falls?
7. Which visual cues create answer-contamination or false relationship cues?
8. Which operations remain useful across content genres and languages?
9. Does the reader benefit from seeing provenance during the task, or only when verifying?
10. Can the representation contract support safe adaptive selection without turning a temporary recommendation into a fixed reader identity?

## 12. Gate status

This document is a **research artifact**.

It does not authorize production implementation.

Before the implementation gate, Reframe still needs sufficient evidence and protocol definition for:
- representation-specific effectiveness;
- fidelity measurement;
- target-reader validation;
- multilingual behavior;
- accessibility semantics;
- source recovery;
- switching/interaction cost;
- calibration validity;
- held-out validation;
- privacy and data governance;
- narrowing/abandonment criteria.

The central rule remains:

> **A representation does not become semantically safe because it is readable, fluent, preferred, or textually similar.**
