# Reframe — Research Completion and Build Readiness Gate

**Date:** 2026-10-03  
**Status:** READY FOR IMPLEMENTATION  
**Production implementation:** NOT STARTED

## Decision

The research phase has reached the implementation gate.

The evidence is sufficient to begin building a **research-instrument-first Reframe prototype**, provided implementation follows the constraints below.

This does not mean the research questions are permanently closed. It means the remaining unknowns should now be answered by controlled prototype testing rather than by continuing indefinitely with literature review.

## What the research establishes

### Product model

Reframe should not assign a permanent reader type.

The target is conditional representation utility:

**P(best representation | reader, task, content, context)**

The questionnaire provides a prior. Controlled calibration provides evidence. Longitudinal use updates the evidence.

### Measurement

The primary experimental unit is:

**reader × task × content × representation × context**

Primary outcome is task performance.

Secondary outcomes include:
- time;
- rereading;
- navigation;
- source recovery;
- switching;
- abandonment;
- confidence;
- perceived difficulty;
- preference.

Speed alone is not success.

### Calibration

Required sequence:

**questionnaire → broad exploration → targeted comparison → confirmation → recommendation → held-out validation → longitudinal update**

Calibration must use:
- matched semantic content;
- counterbalanced order;
- trial-level logging;
- held-out content;
- separate demonstration and measurement;
- controlled exploration;
- uncertainty;
- alternative testing.

### Representation integrity

Every semantic transformation must be traceable:

**source → evidence → operation → representation → task → answer**

Representations must distinguish:
- STATED;
- INFERRED;
- UNKNOWN;
- CONFLICTING.

No inference or explanation may silently become source fact.

### Fidelity

Representation evaluation must test:
- omissions;
- additions;
- substitutions;
- altered relationships;
- unsupported claims;
- critical-span preservation;
- answerability;
- source recovery.

Reader performance cannot compensate for semantic corruption.

### Task validity

Calibration items must be treated as measurement instruments.

Every scored item needs:
- construct;
- source evidence;
- critical spans;
- answerability state;
- scoring rule;
- leakage review;
- representation-impact review;
- ambiguity review.

LLM-generated items require validation; generation alone does not establish validity.

### Generalization

A representation recommendation is not established until it survives held-out content/tasks.

The key acceptance question is:

> Can Reframe demonstrate that a recommendation remains supported when tested on new content and tasks that were not used to produce the recommendation?

### Diversity and fairness

Evidence must be conditional on relevant:
- language/script;
- content/prior knowledge;
- task;
- access modality;
- device/context.

Population evidence supplies priors, not deterministic mappings.

Sparse evidence produces uncertainty rather than a claim of no effect.

### Privacy and governance

The architecture must enforce separate boundaries for:

**personalization | research | model training | external processing**

Reader evidence is not training data by default.

Sensitive disability/health identities must not be inferred or persisted as product labels from behavioral evidence.

### Acquisition

Preferred hierarchy:

**user selection/import → document picker/share → clipboard → OCR → privileged accessibility access**

The least-privileged mechanism satisfying the use case should be used.

AccessibilityService must not be assumed to be the universal Android ingestion mechanism.

### Model boundary

The model adapter must expose execution location and version provenance.

No silent transition from local processing to external/cloud processing is permitted.

Deterministic transformations should precede generative transformations wherever practical.

### Platform direction

The provisional implementation direction remains:

- iOS + Android;
- Kotlin Multiplatform for shared semantic/core logic;
- native Swift/SwiftUI and Android/Kotlin UI/accessibility integration;
- native platform OCR/TTS where advantageous;
- model adapter independent of a specific model;
- local-first persistence;
- no backend dependency unless evidence requires one.

This remains a provisional implementation decision and can change if prototype evidence invalidates it.

## What is deliberately NOT being claimed

Research does not establish that:
- one representation is universally superior;
- dyslexia has one optimal visual treatment;
- 5W+H works broadly for all readers;
- TTS improves comprehension for every reader;
- visual additions always help;
- a diagnosis determines a representation;
- a specific model is the correct production model;
- a particular fine-tuning dataset is sufficient;
- personalization will improve outcomes without controlled validation.

## Build scope

The first build should be a **research instrument/prototype**, not the finished consumer product.

It should prove:

1. source acquisition from controlled inputs;
2. preserved semantic source model;
3. at least a small set of deterministic representations;
4. provenance/evidence mapping;
5. task presentation and scoring;
6. calibration trial logging;
7. representation comparison;
8. uncertainty-aware recommendation state;
9. source recovery;
10. accessibility semantics;
11. local privacy boundary;
12. model adapter seam;
13. exportable research data without source leakage.

## First representations

Initial implementation should favor representations whose operations are explicit and testable:

- original;
- structural emphasis;
- chunking;
- outline/list;
- 5W+H extraction where evidence exists;
- timeline where temporal evidence exists;
- comparison where comparable entities/claims exist;
- definitions;
- audio as a separate modality.

Generative simplification should not be the first fidelity-critical dependency.

## First model strategy

Do not fine-tune at the beginning.

First benchmark candidate pretrained models against a deterministic baseline and the Reframe fidelity/answerability harness.

A model earns a production role only if it demonstrates acceptable:
- semantic extraction;
- structured output reliability;
- provenance;
- fidelity;
- latency;
- memory/resource use;
- privacy characteristics;
- failure behavior.

## First data strategy

Do not build a large training corpus before the research instrument produces evidence.

Initial data should come from:
- validated calibration items;
- source/evidence annotations;
- representation transformations;
- fidelity judgments;
- trial outcomes.

Only then should model-training requirements be reconsidered.

## Required build-time gates

Implementation may proceed, but each production-facing subsystem must pass its own gate:

### Gate A — Semantic correctness
Source facts survive transformation tests.

### Gate B — Provenance
Every semantic representation can recover supporting source evidence.

### Gate C — Answerability
Tasks cannot accidentally become answerable/unanswerable because of representation leakage or corruption.

### Gate D — Accessibility
Native accessibility tree, reading order, focus, source position, TTS, and recovery work correctly.

### Gate E — Privacy
No source text or sensitive reader evidence leaks into ordinary logs or unauthorized external processing.

### Gate F — Calibration validity
Recommendations are based on comparative evidence and held-out validation.

### Gate G — Failure safety
When a model fails, Reframe degrades to a safer representation rather than inventing facts.

### Gate H — Reversibility
Reader can return to source and undo/reset representation choices.

## Research-to-build transition

Research artifacts remain living documents.

After implementation begins:
- new empirical evidence can revise the architecture;
- failed hypotheses must be recorded;
- production behavior must never be treated as research evidence without a valid measurement protocol;
- model changes require regression evaluation;
- representation changes require fidelity evaluation;
- profile changes require calibration/validation evidence.

## Final gate statement

**RESEARCH COMPLETE ENOUGH TO BUILD: YES**

**READY TO START PRODUCTION IMPLEMENTATION: YES, after the required build warning.**

**PRODUCTION IMPLEMENTATION STARTED: NO**

The next production action must begin only after the explicit warning:

> **BUILD WARNING: Research has reached the implementation gate. I am about to begin building Reframe.**

