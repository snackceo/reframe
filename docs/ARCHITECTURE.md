# Reframe — Architecture Direction

**Status:** Implementation baseline
**Last reviewed:** 2026-10-05

This document defines the boundaries of the first implementation. Platform-specific details remain replaceable where the product evidence does not require permanence.

## 1. System concept

Conceptually:

Source → Acquisition → Understanding → Representation → Rendering → Reader

The reader can provide feedback or choose another representation at any point.

## 2. Current implementation boundary

The first implementation establishes the shared semantic core before adding platform UI or privileged acquisition.

Current layers:

1. `SourceDocument` — source identity and original text.
2. `EvidenceSpan` — source offsets used for provenance.
3. `SemanticStatus` — STATED, INFERRED, UNKNOWN, CONFLICTING.
4. `Representation` — structured output with explicit source identity.
5. Deterministic representations — original, chunking, and outline.
6. Shared tests — provenance and source-preservation assertions.

The implementation deliberately does **not** yet include system-wide capture, AccessibilityService ingestion, cloud processing, persistent reader profiles, adaptive recommendations, or production model integration.

## 3. Source acquisition

Obtains content from the current reading context.

Candidate sources remain:

- selected text;
- shared text;
- web content;
- application content exposed through accessibility APIs;
- OCR from images;
- documents;
- screenshots.

The least-privileged mechanism that satisfies the use case must be preferred. AccessibilityService is a privileged fallback, not the universal ingestion architecture.

## 4. Content understanding

Converts source content into a structured representation that downstream transformations can reason about.

Potential information:

- text spans;
- sentences;
- tokens;
- entities;
- actions;
- dates/times;
- relationships;
- lists;
- headings;
- uncertainty;
- source boundaries.

This layer must not decide how the reader wants content displayed.

## 5. Representation selection

Determines which representation the reader requested or which representation the calibration system recommends.

Selection remains separate from generation.

The long-term selection problem is conditional rather than universal:

`P(best representation | reader, task, content, context)`

## 6. Representation generation

Produces a structured transformation with explicit source relationships.

The output must be testable without a UI.

Deterministic transformations are preferred where they can reliably perform the operation. Generative transformations require the same provenance/fidelity contract.

## 7. Rendering

Turns the representation into an accessible visual or multimodal interface.

Rendering must not decide semantic meaning.

## 8. Reader interaction

Handles:

- mode selection;
- switching;
- source inspection;
- preferences;
- undo/recovery;
- feedback;
- accessibility controls.

Automatic recommendations must remain understandable and reversible.

## 9. AI boundary

An AI model is an implementation option inside content understanding or representation generation.

It is not the product boundary.

The model adapter must expose:

- provider;
- model identifier;
- model version where available;
- execution location;
- transformation/protocol version;
- failure state.

No silent fallback from local processing to external processing is allowed for sensitive content.

## 10. Structured intermediate representation

The target pipeline is:

`SourceDocument → SemanticDocument → Representation → RenderedView`

The first implementation currently has the source and representation portions of this contract. `SemanticDocument` is intentionally not invented before its required fields are demonstrated by fidelity tests.

## 11. No hidden semantic mutation

Rendering must never silently alter source meaning.

If a component performs a semantic transformation, that transformation must exist as an explicit representation step.

Every semantic node should eventually be able to answer:

> Which source evidence supports this output?

## 12. Fidelity

Fidelity testing must cover at least:

- actors;
- actions;
- objects;
- quantities;
- dates;
- times;
- locations;
- negation;
- uncertainty;
- attribution;
- conditions;
- temporal relationships;
- causal relationships;
- exceptions.

The source must remain recoverable when a representation fails.

## 13. Privacy boundary

Screen content and extracted text are sensitive by default.

Architecture must distinguish:

**personalization | research | model training | external processing**

Reader evidence is not training data by default.

Do not log raw source content by default.

## 14. State model

Eventually state must distinguish:

- source state;
- current representation;
- reader preference;
- transformation status;
- failure state;
- source/representation relationship;
- calibration evidence;
- evidence uncertainty.

Do not persist source content merely because the UI makes persistence convenient.

## 15. Latency and offline behavior

The system should distinguish:

- instant visual transformations;
- fast deterministic parsing;
- model-dependent transformations;
- slower multimodal processing.

A network-dependent representation must be distinguishable from a local representation.

The architecture should remain capable of useful offline behavior.

## 16. Observability

Telemetry should measure product behavior without unnecessarily collecting source content.

Preferred event categories include:

- representation_selected;
- representation_switched;
- transformation_failed;
- source_restored;
- audio_started;
- audio_stopped;
- calibration_trial_started;
- calibration_trial_completed.

Raw screen/source content must not enter ordinary analytics logs.

## 17. Security

Treat captured content, OCR, model input, model output, cached representations, and external content as untrusted or sensitive data.

Validate model output before rendering it as structured content.

## 18. Platform direction

The current implementation uses **Kotlin Multiplatform for the shared semantic core** with native platform layers planned for Android and iOS.

This is an implementation choice, not a product contract. The architecture deliberately avoids tying representation semantics to KMP so that the core can be tested independently of UI and platform acquisition.

Kotlin 2.2.20 remains the pinned Kotlin version. The Android shared library currently uses the Android Gradle Library Plugin compatible with the selected Kotlin/Gradle toolchain.

## 19. Technology-selection rule

Do not choose architecture because it is sophisticated.

Choose the smallest architecture that can answer the current product question.

The first question is:

> Which representations actually help readers, for which content, and with what tradeoffs?

Architecture follows that evidence.
