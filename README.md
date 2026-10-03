# Reframe

**See information the way it works for you.**

Reframe is an accessibility-oriented information representation layer for mobile reading.

> **The reader chooses the representation; Reframe does the work of creating it.**

Reframe explores switching between representations such as emphasis, chunks, structure, 5W + H, timelines, definitions, audio, and other task-specific views while retaining access to the source.

This is a product hypothesis, not a claim that any particular representation is clinically validated for dyslexia.

## Product thesis

Readers differ. Content differs. Tasks differ. A useful reading aid may therefore need to change how information is represented instead of prescribing one universal format.

Conceptually:

**Content → Reframe understands → Reader chooses representation → Reframe renders → Reader**

The current research question is:

> **Can Reframe discover and deliver representations that make information structure easier to perceive for a particular reader, for a particular task, without sacrificing source fidelity?**

## Core principles

1. **Reader control** — the reader can choose, switch, override, or disable representations.
2. **Source fidelity** — transformations retain a trustworthy relationship to the source.
3. **Progressive intervention** — begin with lower-risk representations and increase assistance when needed.
4. **Representation over diagnosis** — do not assume a diagnosis determines one correct format.
5. **Deterministic before generative where practical** — reduce unnecessary semantic risk.
6. **AI is replaceable** — no particular model or provider is part of the product contract.
7. **Privacy by minimization** — sensitive source content should not be copied, transmitted, or retained unnecessarily.
8. **Validate before optimizing** — test representations before building sophisticated adaptive selection.

## Documentation

- AGENTS.md — durable engineering and agent contract.
- docs/PRODUCT.md — canonical product concept.
- docs/RESEARCH.md — evidence, hypotheses, and unknowns.
- docs/REPRESENTATIONS.md — representation semantics and fidelity rules.
- docs/VALIDATION.md — validation methodology.
- docs/EXPERIMENTS.md — experiment registry.
- docs/UX_PRINCIPLES.md — reader-facing interaction principles.
- docs/ARCHITECTURE.md — conceptual engineering boundaries.
- docs/DECISIONS.md — durable decisions.
- docs/SECURITY.md — privacy and security baseline.
- docs/GLOSSARY.md — canonical terminology.
- docs/COMPETITIVE_LANDSCAPE.md — prior art and competitive landscape.

## Current status

**Concept / prototype stage.**

Platform, model, rendering technology, persistence strategy, and system-wide integration are deliberately not locked.

The next priority is evidence about which representations help which readers perform which tasks.

## What Reframe is not

Reframe is not currently defined as:

- a generic chatbot;
- a generic summarizer;
- a single dyslexia font;
- a universal dyslexia treatment;
- a diagnosis tool;
- a replacement for reading instruction or clinical/educational support;
- a specific AI model;
- a mandatory cloud service;
- an AR-glasses product.

A system-wide HUD, OCR pipeline, glasses, cloud processing, or accessibility-service integration may become implementation options later. None is the product definition.

## Research posture

Current evidence supports investigating adaptable presentation and personalization, but does not establish that any specific Reframe representation improves reading for every person with dyslexia.

Reframe therefore follows:

**evidence → hypothesis → prototype → controlled comparison → reader feedback → revised hypothesis**

rather than:

**interesting AI capability → feature → assumption that it helps**

## Immediate product experiment

1. Provide a passage.
2. Show the original.
3. Offer a small set of representations.
4. Let the reader switch instantly.
5. Give the reader a comprehension task.
6. Compare performance and perceived effort.
7. Repeat across content and readers.
8. Preserve the source for every transformed view.

The goal is to discover which representation patterns deserve engineering effort.

## Scope rule

Only make changes in the Reframe repository unless an explicit request expands scope.
