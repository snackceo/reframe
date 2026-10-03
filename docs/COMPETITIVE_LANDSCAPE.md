# Reframe — Competitive and Prior-Art Landscape

**Status:** Working landscape  
**Last reviewed:** 2026-10-02

This document records adjacent products, open-source projects, standards, and concepts that overlap with parts of Reframe.

It is not a claim that Reframe is unique. The purpose is to identify existing capabilities so the project does not mistake a familiar accessibility feature for a novel product principle.

## 1. Landscape categories

Reframe overlaps several established categories:

1. text presentation tools;
2. dyslexia-oriented reading tools;
3. text-to-speech/read-aloud;
4. OCR and screen understanding;
5. simplification and summarization;
6. accessibility overlays;
7. semantic personalization standards;
8. assistive AR/HUD concepts.

These categories should be evaluated separately because combining them does not automatically create a new product.

## 2. Existing capabilities to treat as prior art

Research has identified open-source projects providing combinations of OCR, reading modes, dyslexia-oriented styling, text-to-speech, highlighting, simplification, configurable reading preferences, screen overlays, local processing, and adaptive reading modes.

Projects previously reviewed include:

- ClearReadAR — OCR/reading assistance with an AR-oriented interface.
- Legilo — configurable accessibility reading features and read-aloud.
- ReadAble — mobile assistive reading with OCR and language transformation.
- DyslexicAssist — multiple reading modes and personalization.
- dyslexa — personalized reading/accessibility features.
- ContentSquare/readapt — configurable reading preferences and reading aids.
- Speeedy — local-first reading/RSVP concepts and configurable presentation.

Project existence and capabilities should be re-verified before being used in investor, marketing, or legal materials.

## 3. Standards are part of the landscape

W3C WAI-Adapt explicitly addresses user-driven personalization of content presentation. It describes assistive technologies and user agents adapting content according to individual needs and preferences.

WCAG also states that content should be capable of being presented in different ways without losing information or structure.

This means personalization and alternate presentation are established accessibility concepts. Reframe should not claim otherwise.

## 4. Where Reframe's hypothesis is narrower

The current Reframe hypothesis is specifically about a representation system in which:

- the same source can produce multiple representations;
- representations can expose semantic structure;
- the reader controls or overrides selection;
- transformations retain source traceability;
- representations can be composed into recipes;
- usefulness is evaluated by task and content;
- adaptive selection is considered only after individual representations are validated.

The combination may still overlap with existing work. It requires broader market and prior-art research before any uniqueness claim.

## 5. Comparison framework

Future research should compare products on a common matrix:

| Capability | Landscape question | Reframe hypothesis |
|---|---|---|
| Source-preserving alternate views | How is source retained? | Core invariant |
| Reader-controlled representations | Can readers switch views? | Core interaction |
| Semantic structure views | Which relationships are exposed? | Core research area |
| Representation recipes | Can transformations compose? | Explicit hypothesis |
| Source-to-transformation traceability | Can changes be inspected? | Core requirement |
| Task-aware representation | Is task context used? | Future hypothesis |
| Content-aware representation | Is content structure used? | Future hypothesis |
| Adaptive selection | Is selection personalized? | Future research |
| Semantic fidelity testing | How are meaning errors measured? | Core validation method |
| Cross-content representation vocabulary | Are transformations reusable across content? | Potential system asset |

This is descriptive, not a scorecard.

## 6. Competitive research rule

Do not claim:

- “no one does this”;
- “first”;
- “unique”;
- “only product”;
- “patentable because nobody has done it”

without a sufficiently broad, current prior-art investigation.

Open-source projects, commercial accessibility products, academic systems, patents, standards, and platform capabilities all matter.

## 7. Strategic implication

The product should not depend on novelty claims to justify experimentation.

The strongest current argument for continuing Reframe is empirical:

> There may be value in a reader-controlled system for moving between source-preserving representations of information, but the usefulness of that system remains an empirical question.

That question can be tested independently of whether competitors already implement parts of it.
