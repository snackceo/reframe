# Reframe Agent Contract

## Purpose

Reframe is an accessibility-oriented information representation layer for mobile reading.

> **The reader chooses the representation; Reframe does the work of creating it.**

## Canonical documentation

- AGENTS.md — durable engineering and agent contract.
- README.md — project entry point.
- docs/PRODUCT.md — canonical product concept.
- docs/RESEARCH.md — evidence, hypotheses, and unknowns.
- docs/REPRESENTATIONS.md — representation semantics and source-fidelity rules.
- docs/VALIDATION.md — validation methodology.
- docs/EXPERIMENTS.md — experiment registry.
- docs/UX_PRINCIPLES.md — reader-facing interaction principles.
- docs/ARCHITECTURE.md — conceptual engineering boundaries.
- docs/DECISIONS.md — durable decisions.
- docs/SECURITY.md — privacy and security baseline.
- docs/GLOSSARY.md — canonical terminology.
- docs/COMPETITIVE_LANDSCAPE.md — prior art and competitive landscape.

## Product invariants

### Reader control
The reader must be able to choose or override the representation. Automatic behavior must remain understandable and reversible.

### Source fidelity
Every transformation must retain a trustworthy relationship to its source. Pay particular attention to actors, actions, objects, quantities, dates, times, locations, conditions, negation, uncertainty, attribution, temporal relationships, causal relationships, and exceptions.

### Progressive intervention
Prefer source → light guidance → structure → stronger transformation. Do not default to the strongest transformation.

### No universal dyslexia mode
Do not claim that one visual treatment is the correct representation for dyslexia. Do not claim that dyslexia is primarily visual, that letters are literally scrambled, or that a font cures dyslexia.

### Representation is the product
Do not reduce Reframe to “AI summarizes text.” The product hypothesis concerns a reusable vocabulary of source-preserving representations and combinations.

### Deterministic before generative where practical
Use deterministic processing when it can reliably perform the transformation. Introduce generative processing where it solves a demonstrated problem.

### AI is replaceable
No specific model, provider, parameter count, or training strategy is part of the product contract.

### Privacy and security
Treat screen content, selected text, OCR, messages, documents, URLs, model prompts/responses, cached representations, and source mappings as sensitive by default. Minimize collection, transmission, retention, and logging.

### No hidden semantic mutation
Rendering must not silently change source meaning. Semantic transformations must be explicit and testable representation steps.

### Validate before adaptive AI
Test individual representations before building sophisticated automatic selection. A better model cannot rescue a representation that does not help.

## Engineering boundaries

Keep these concerns separable:

**Source acquisition → Understanding → Representation selection → Representation generation → Rendering → Reader interaction**

The model belongs inside understanding/generation, not at the product boundary.

## Documentation rules

- Label hypotheses as hypotheses.
- Separate research evidence from product decisions.
- Record durable decisions in docs/DECISIONS.md.
- Update canonical documentation when durable assumptions change.
- Prefer precise terminology over marketing language.
- Keep rejected ideas when they explain important boundaries.

## Validation rules

Every representation should be testable outside the UI where practical.

Tests should include semantic edge cases such as negation, uncertainty, attribution, conditions, dates, numbers, temporal order, causal relationships, and exceptions.

Failure should preserve the source and avoid fabricated information.

## Privacy rules

Do not log raw source content by default.

Do not introduce system-wide capture, cloud processing of screen content, persistent reading histories, account-linked reading profiles, or source-derived analytics without an explicit product/security decision.

## Scope rule

Only edit the Reframe repository unless the user explicitly expands scope.

## Current product question

> **Can Reframe discover and deliver representations that make information structure easier to perceive for a particular reader, for a particular task, without sacrificing source fidelity?**

HUDs, OCR, models, cloud processing, glasses, and platform integrations are downstream implementation questions.
