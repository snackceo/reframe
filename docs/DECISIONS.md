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


## D013 — Technology direction remains research-gated

**Decision:** Reframe will target iOS and Android. Kotlin Multiplatform is the current leading technology candidate for shared core logic, with native platform layers retained where native accessibility and system integration matter.

**Status:** Provisional; not an implementation lock.

**Why:** Reframe needs substantial shared semantic logic while also requiring deep mobile-platform integration. KMP provides a path to share domain logic without requiring the entire product to abandon native platform APIs.

**Alternatives retained:** Flutter and React Native remain viable alternatives until the platform comparison is complete.

**Explicit non-decision:** Moshi is not an application architecture choice; it is a Kotlin serialization library and is not being selected as Reframe's stack.

**Consequence:** The technology choice must be validated against research findings and platform feasibility before implementation. Documentation may describe the candidate direction, but no production architecture should be built from this decision alone.

## D014 — Research gate precedes implementation

**Decision:** Do not begin Reframe implementation until the research program has sufficiently mapped the relevant reading, learning, language, cognitive, developmental, acquired, and accessibility evidence.

**Minimum gate questions:**

1. What reading/access problems are documented?
2. Which mechanisms or processing demands are implicated?
3. Which populations and contexts have been studied?
4. Which interventions or assistive technologies have evidence?
5. Where does evidence conflict or remain uncertain?
6. Which Reframe representations have defensible hypotheses?
7. How will comprehension, effort, task performance, and semantic fidelity be measured?
8. What failure modes could make a representation harmful, misleading, or unnecessarily difficult?
9. What platform capabilities are actually required by the validated research prototype?
10. What privacy and consent boundaries follow from those requirements?

**Consequence:** The first implementation, when the gate is met, should be a research instrument/prototype rather than a full product or system-wide HUD.


## D013 — Technology direction remains provisional

**Decision:** Reframe will document a cross-platform technology direction before implementation, with Kotlin Multiplatform currently the leading candidate for a shared semantic/core layer and native iOS/Android integration.

**Why:** Reframe targets both iOS and Android, while the product concept depends heavily on platform capabilities such as accessibility, content acquisition, text rendering, OCR, audio, and potentially on-device intelligence. A shared core can reduce duplicated semantic logic while native layers preserve platform-specific capabilities.

**Boundary:** This is a provisional technology direction, not authorization to begin implementation. Flutter and React Native remain alternatives until the research and platform-feasibility gate is complete. Moshi is a library-level dependency, not an application architecture.

**Consequence:** Technology documentation can evolve during research without forcing premature implementation.

## D014 — Research gate precedes product implementation

**Decision:** Do not begin full product implementation until the research gate has been sufficiently completed.

**Minimum gate:**
1. target reading/access problems are explicitly defined;
2. relevant mechanisms and competing explanations are mapped;
3. populations and evidence limitations are documented;
4. proposed representations are separated into evidence-supported approaches and hypotheses;
5. conflicting evidence is recorded;
6. measurable outcomes are defined;
7. semantic-fidelity requirements are defined;
8. privacy/source-acquisition risks are mapped;
9. platform feasibility is researched;
10. the first prototype is defined as a research instrument rather than a full product.

**Consequence:** The next work is research synthesis, evidence mapping, competitive/prior-art review, and technology feasibility—not feature implementation.
