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
