# Reframe — Architecture Direction

**Status:** Conceptual architecture  
**Last reviewed:** 2026-10-02

This document defines boundaries rather than committing Reframe to a platform, framework, model, or backend.

## 1. System concept

Conceptually:

Source → Acquisition → Understanding → Representation → Rendering → Reader

The reader can provide feedback or choose another representation at any point.

## 2. Boundary definitions

### Source acquisition

Obtains content from the current reading context.

Possible future sources:

- selected text;
- shared text;
- web content;
- application content exposed through accessibility APIs;
- OCR from images;
- documents;
- screenshots.

No acquisition method is currently mandated.

### Content understanding

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

This layer should not decide how the reader wants the content displayed.

### Representation selection

Determines which representation the reader requested or which representation the product recommends.

Selection should remain separate from generation.

### Representation generation

Produces a structured transformation with explicit source relationships.

The output should be testable without a UI.

### Rendering

Turns the representation into an accessible visual or multimodal interface.

Rendering should not be responsible for deciding semantic meaning.

### Reader interaction

Handles:

- mode selection;
- switching;
- source inspection;
- preferences;
- undo/recovery;
- feedback;
- accessibility controls.

## 3. AI boundary

An AI model is an implementation option inside content understanding or representation generation.

It is not the product boundary.

This allows Reframe to use:

- deterministic parsing;
- traditional NLP;
- local models;
- remote models;
- multiple models;
- no model for some transformations.

The architecture should make it possible to replace the model without rewriting the reader experience.

## 4. Deterministic before generative

Where a transformation can be performed reliably without generation, prefer deterministic processing.

Examples:

- spacing;
- text sizing;
- line width;
- exact source highlighting;
- sentence segmentation when a reliable parser is sufficient;
- extracting explicit dates;
- preserving source text.

Generative processing may be appropriate for:

- ambiguous structural extraction;
- complex relationship identification;
- plain-language rewriting;
- explanations;
- adaptive recommendations.

This is a default engineering principle, not a prohibition on AI.

## 5. Structured intermediate representation

The system should eventually use a structured intermediate representation rather than passing raw strings between every component.

Conceptually:

SourceDocument → SemanticDocument → Representation → RenderedView

This creates explicit contracts and makes transformations independently testable.

## 6. No hidden semantic mutation

Rendering must never silently alter source meaning.

If a component performs a semantic transformation, that transformation must exist as an explicit representation step.

## 7. Privacy boundary

Screen content and extracted text should be treated as sensitive by default.

Architectural questions include:

- what content leaves the device;
- whether processing can be local;
- retention duration;
- logging;
- caching;
- model telemetry;
- user consent;
- deletion;
- third-party provider access.

Privacy decisions should be made before committing to remote processing.

## 8. Latency

The eventual system should distinguish:

- instant visual transformations;
- fast deterministic parsing;
- model-dependent transformations;
- slower multimodal processing.

The reader should not be blocked unnecessarily by a transformation that can be applied incrementally.

## 9. Offline behavior

Offline operation is a product question, but the architecture should avoid making it impossible.

A representation that requires a network request should be distinguishable from one that can run locally.

## 10. State model

At minimum, eventual state should distinguish:

- source state;
- current representation;
- reader preference;
- transformation status;
- failure state;
- source/representation relationship.

Do not persist source content merely because the UI makes persistence convenient.

## 11. Observability

Telemetry should measure product behavior without unnecessarily collecting source content.

Prefer events such as:

- representation_selected;
- representation_switched;
- transformation_failed;
- source_restored;
- audio_started;
- audio_stopped.

Avoid raw screen-content logging.

## 12. Security

Treat:

- captured content;
- OCR;
- model input;
- model output;
- cached representations;
- external content

as untrusted or sensitive data.

Validate model output before rendering it as structured content.

## 13. Architectural decision rule

Do not choose architecture because it is sophisticated.

Choose the smallest architecture that can answer the current product question.

The first question is not:

How do we build a system-wide AI HUD?

The first question is:

Which representations actually help readers, for which content, and with what tradeoffs?

Architecture should follow that evidence.


## 14. Provisional platform and technology direction

**Status:** Research-gated / provisional. This is a direction, not a final implementation decision.

Reframe targets **iOS and Android**. The leading ecosystem under investigation is **Kotlin Multiplatform (KMP)** because it can share core Kotlin logic while retaining native platform integration. This choice is not final until the research gate and platform-feasibility review are complete.

### Candidate direction

- **Shared core:** Kotlin Multiplatform.
- **iOS application layer:** native Swift/SwiftUI where platform-native behavior or accessibility integration is important.
- **Android application layer:** Kotlin with Android/Jetpack APIs.
- **Shared UI:** Compose Multiplatform is an option, not a requirement. Native UI remains available where it provides better platform integration.
- **Semantic core:** shared, platform-independent Kotlin domain logic for source models, semantic structures, representations, transformation metadata, and fidelity rules.
- **OCR / text acquisition:** prefer native platform capabilities first; exact APIs and cross-platform abstractions remain research items.
- **Text-to-speech:** prefer native platform capabilities first; exact abstraction remains a research item.
- **AI/ML:** provider- and model-agnostic. Local/on-device and remote processing remain separate options subject to privacy, latency, quality, and evidence requirements.
- **Storage:** local-first bias; exact persistence technology remains undecided.
- **Backend:** not required by the architecture. Introduce one only if a demonstrated product requirement requires it.
- **Testing:** shared semantic/fidelity tests plus platform-specific UI, accessibility, integration, and performance tests.

### Why this remains provisional

The technology choice must be evaluated against the actual research findings, especially:

1. access to text from real mobile reading contexts;
2. native accessibility APIs and system integration;
3. OCR and document/image handling;
4. text rendering and interaction;
5. text-to-speech;
6. on-device processing;
7. offline behavior;
8. semantic transformation testability;
9. privacy boundaries;
10. performance and battery cost;
11. maintainability of shared versus native code.

Flutter and React Native remain viable alternatives until this comparison is completed. They are not rejected; KMP is simply the current leading candidate.

**Moshi is not the Reframe stack.** Moshi is a Kotlin JSON serialization library, whereas the stack decision concerns the application/platform ecosystem, shared core, native integrations, and supporting services.

No implementation should begin solely because this provisional direction is documented.
