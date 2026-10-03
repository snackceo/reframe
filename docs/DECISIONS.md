# Reframe — Decision Log

**Status:** Living record  
**Last reviewed:** 2026-10-02

This document records durable product and engineering decisions. Rejected ideas are retained when they explain an important boundary.

## D001 — Reframe is a representation layer

**Decision:** Reframe is defined as a reader-controlled information representation system.

**Why:** The core product opportunity is not a font, summarizer, or chatbot. The differentiator under investigation is the ability to transform the presentation and structure of information while preserving access to the source.

**Consequence:** Model and platform choices remain implementation details.

## D002 — Reader control is a product invariant

**Decision:** The reader must be able to choose or override the representation.

**Why:** Research and accessibility guidance support personalization, while dyslexia and reading difficulty are heterogeneous.

**Consequence:** Automatic adaptation cannot become an opaque mode that the reader cannot understand or reverse.

## D003 — Source fidelity is a first-class requirement

**Decision:** Every representation must retain a trustworthy relationship to its source.

**Why:** Structural and linguistic transformations can introduce omission, inference, or changed nuance.

**Consequence:** Source traceability and recovery are architectural concerns, not optional UI polish.

## D004 — Progressive intervention

**Decision:** Reframe should favor increasing assistance from low-transformation to high-transformation representations.

**Why:** A reader may need only visual guidance for one passage and substantial restructuring for another.

**Consequence:** The system should not default to the strongest transformation.

## D005 — No universal dyslexia mode

**Decision:** Do not encode a single presentation as the correct format for dyslexia.

**Why:** Current scientific understanding emphasizes variability, and evidence for particular presentation features is not sufficient to define one universal representation.

**Consequence:** Reframe experiments with representation choices rather than diagnosis-based presets.

## D006 — Validate representations before adaptive AI

**Decision:** Test representations directly before building sophisticated automatic selection.

**Why:** If a representation does not help, a better model will not solve the product problem.

**Consequence:** The first research prototype can be simple and may not require screen-wide access, cloud AI, or a custom model.

## D007 — Deterministic transformations first where practical

**Decision:** Use deterministic processing for transformations that can be performed reliably without generation.

**Why:** Deterministic behavior is easier to test and can reduce semantic risk and latency.

**Consequence:** AI should be introduced where it solves a demonstrated ambiguity or transformation problem.

## D008 — AI is replaceable

**Decision:** No specific model provider, model family, parameter count, or training strategy is part of the product contract.

**Why:** The product hypothesis concerns representations, not a particular model.

**Consequence:** Interfaces should permit model replacement and mixed deterministic/generative implementations.

## D009 — Do not build the HUD first

**Decision:** A system-wide overlay or HUD is a future integration option, not the first validation target.

**Why:** It is technically and privacy-wise more complex than testing the underlying representation hypothesis.

**Consequence:** Early prototypes can use selected text, shared content, or a dedicated reading view.

## D010 — Glasses are not required

**Decision:** AR glasses and similar hardware are not part of the current product definition.

**Why:** Hardware may eventually be useful, but it does not answer whether the representation system works.

**Consequence:** Hardware concepts remain future interface possibilities.

## D011 — Privacy by minimization

**Decision:** Screen content and extracted text are sensitive by default; collection and retention should be minimized.

**Why:** A representation layer may eventually process private messages, documents, credentials, and other sensitive material.

**Consequence:** Remote processing, telemetry, caching, and persistence require explicit product decisions.

## D012 — Documentation is a product asset

**Decision:** Durable product assumptions, research findings, representation rules, validation plans, and architecture boundaries belong in version-controlled documentation.

**Why:** Reframe is still discovering its product. Unrecorded assumptions become accidental architecture.

**Consequence:** Agents must update canonical documents when durable decisions change.

## Reconsideration rule

A decision should be revisited when:

- new research materially changes its premise;
- user testing contradicts the hypothesis;
- implementation evidence reveals an unacceptable tradeoff;
- privacy or accessibility requirements change;
- the product boundary changes.

A decision is not permanent merely because it is documented.
