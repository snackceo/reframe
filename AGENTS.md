# AGENTS.md — Reframe Engineering Contract

## Project identity

Reframe is an accessibility-oriented information representation layer for mobile reading.

The core idea: Reframe reads content, understands its structure, and lets the reader choose how that information is represented.

The product is not fundamentally a font, a summarizer, or a generic AI reader. It is a reader-controlled representation layer that can preserve the source while making its structure easier to perceive.

## Source of truth

- AGENTS.md is the durable engineering and agent contract.
- README.md is the concise project entry point.
- docs/PRODUCT.md is the canonical product/concept document.
- Do not create competing documents that restate the same durable requirements.
- When a durable product or engineering rule changes, update the canonical document.

## Current project state

This repository is in the concept/prototype stage.

Do not assume that platform architecture, model choice, OCR approach, accessibility APIs, rendering strategy, backend services, or UI framework have been decided. Make those decisions from product requirements and validation.

Avoid building infrastructure merely because it is technically possible.

## Product invariants

### 1. The reader chooses the representation

Potential representations include:

- Original text
- Emphasis/highlighting
- 5W + H: Who, What, When, Where, Why, How
- Sentence breakdown
- List/outline
- Information structure
- Key terms
- Audio or other multimodal representations

These are examples, not a locked feature list.

### 2. Preserve source fidelity

A representation must not silently become a different source.

When Reframe restructures or simplifies content, consider what information was preserved, omitted, or reworded, and whether meaning or nuance could have changed. The reader should be able to return to the original.

### 3. Progressive intervention

Do not assume every reader needs maximum transformation.

Support a progression from minimally invasive assistance to stronger restructuring where the product supports it:

Original → Emphasis → Structure → Restructuring → More transformative representations

### 4. Representation is the product

Do not reduce the concept to "AI summarizes text." The important capability is understanding content well enough to render its information structure in multiple useful forms.

### 5. Personalization

Different readers may benefit from different representations. Avoid claiming that one visual treatment is universally better for dyslexia or any other reading difference without evidence.

### 6. Accessibility

Consider interaction, typography, contrast, motion, touch targets, audio, semantics, and assistive technology compatibility. Do not use accessibility language as a substitute for testing with real users.

## AI/model rules

AI may interpret content and propose representations, but model output is not automatically authoritative.

Agents must:

- preserve the distinction between source content and generated representation;
- validate structured outputs;
- handle uncertainty and extraction failures explicitly;
- avoid inventing facts not supported by the source;
- avoid silently dropping important information;
- keep model/provider choices replaceable until evaluation justifies a commitment;
- avoid fine-tuning or model infrastructure before a demonstrated product need exists.

A small language model may eventually be appropriate, but the representation layer—not the model brand, parameter count, or training method—is the product boundary.

## Engineering principles

Before changing code:

1. Read this file.
2. Read relevant product/subsystem documentation.
3. Inspect existing implementation and tests.
4. Trace producers, consumers, state, and external boundaries.
5. Identify the smallest coherent change.
6. Implement.
7. Validate behavior.

Do not guess about existing behavior.

Keep these concerns distinguishable as the implementation grows:

- source acquisition;
- content understanding;
- representation selection;
- representation generation;
- rendering;
- user interaction/preferences.

Where practical, representation transformations should be independently testable with explicit input/output contracts.

If a representation cannot be generated reliably, do not silently fabricate or materially alter content. Prefer an explicit fallback to the original representation.

Do not perform unrelated refactors during feature work. Avoid generic utils/helpers/common dumping grounds. Prefer descriptive names tied to responsibility.

## Security and privacy

Screen content may contain sensitive information.

Treat captured screen content, OCR results, extracted text, model inputs/outputs, logs, and cached representations as potentially sensitive.

Agents must minimize collection and retention, avoid logging source content unless explicitly required, and avoid sending screen content to external services without an intentional product decision and appropriate user disclosure/consent.

Keep secrets and credentials out of source control. Treat model output and external content as untrusted input.

## Validation expectations

For representation logic, validate normal prose, dense sentences, lists, headings, dates, names, numbers, punctuation, ambiguous language, source structures, and failure/uncertainty cases.

For UI changes, validate readability, contrast, touch interaction, dynamic text sizing, layout changes, accessibility semantics, and behavior when transformation is unavailable.

## Agent workflow

For a feature request:

1. Clarify the user outcome.
2. Check the product contract.
3. Inspect the repository.
4. Plan the smallest coherent implementation.
5. Implement with explicit boundaries.
6. Test behavior.
7. Review for source fidelity, accessibility, privacy, and unintended semantic changes.
8. Update documentation when durable behavior or the contract changes.

When a request is ambiguous at the product level, surface the ambiguity before locking architecture.

## Do not

- Turn Reframe into a generic chatbot without an explicit product decision.
- Assume "simpler" means "better."
- Rewrite source text when visual/structural representation would solve the problem.
- Hide uncertainty behind confident generated text.
- Select a model solely because it is larger, newer, cheaper, or easier to integrate.
- Add cloud dependencies before privacy and product implications are understood.
- Edit unrelated repositories as part of Reframe work.