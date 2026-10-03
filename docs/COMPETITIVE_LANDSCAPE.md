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


## 8. Prior-art update — mainstream reading systems already cover many presentation controls

Microsoft Immersive Reader currently exposes text size, spacing, font, themes, line focus, read-aloud, syllables, parts-of-speech highlighting, picture dictionary, translation, and reading-coach capabilities across supported products and languages.

Sources:
- https://support.microsoft.com/en-us/accessibility/word/use-immersive-reader-in-word
- https://support.microsoft.com/en-us/education/learning-accelerators/languages-and-products-supported-by-immersive-reader

Helperbird likewise offers spacing controls, text-to-speech, reading modes, dyslexia-oriented fonts, reading rulers, color overlays, OCR/screenshot reading, dictionaries, and accessibility profiles across web browsers and Apple mobile platforms.

Source:
- https://www.helperbird.com/features/

**Landscape implication:** presentation customization, TTS, focus tools, OCR, and profile-based personalization are established capabilities. Reframe should not position these capabilities alone as novel.

## 9. Prior-art update — accessibility requirements emphasize continuity

The DAISY Reading Apps User Requirements (2025) establishes navigation, semantic structure, reading-position restoration, TTS control, synchronized text/audio, visual emphasis controls, bookmarks, highlights, and notes as important requirements for accessible reading applications.

Source:
- https://daisy.github.io/reading-apps-ux-reqs/requirements/published/FINAL-20251031/

**Landscape implication:** any Reframe representation must preserve the user's relationship to the source, reading position, navigation structure, and accessibility semantics. Switching representations cannot become a dead-end view.

## 10. Reframe's research gap should be framed carefully

The current prior-art scan does not establish that Reframe is uniquely the first system to provide semantic restructuring or personalization. It does establish that the market already contains extensive presentation-level assistance.

The research question that remains worth testing is narrower:

**Can a reader-controlled representation layer provide measurable task-specific benefit by switching between source-faithful semantic views, while preserving navigation, accessibility semantics, and source fidelity?**

That is a research hypothesis rather than a uniqueness claim.


## 11. Semantic prior-art update

Open-source projects now identified in the research scan include ReadAble, Dyslexa, Readapt, and ClearPath. Their capabilities overlap with OCR, simplification, TTS, highlighting, visual customization, reading modes, word support, and other reading assistance. This reinforces that Reframe's differentiation cannot rest on assembling these functions.

A separate patent, US20240086616A1, describes a reading assistant that keeps original and simplified/reformatted views together with synchronized scrolling. This is relevant prior art for source-context preservation.

**Updated landscape distinction:**

| Concept | Meaning for Reframe research |
|---|---|
| Presentation accommodation | Mature prior art; not sufficient differentiation |
| Source alignment | Existing prior art; useful requirement |
| Semantic source fidelity | Must be explicitly tested; not guaranteed by alignment |
| Task-specific representation | Core research hypothesis |
| Reader calibration | Research hypothesis |
| Representation effectiveness | Must be experimentally demonstrated |

The landscape should therefore be treated as a research input, not a claim of novelty.


## 12. 2026 prior-art update — semantic adaptation and personalization are established capability areas

The current scan found substantial overlap beyond presentation controls.

### Academic systems and methods

The 2025 TSAR shared task attracted 48 submissions from 20 teams for readability-controlled text simplification. Results emphasize that dependable control can require iterative generation and selection, and that readability targeting must be evaluated separately from semantic similarity.

Source: https://aclanthology.org/2025.tsar-1.8/

A 2025 paper demonstrates efficient on-device text simplification intended to keep sensitive text local to the device.

Source: https://aclanthology.org/2025.tsar-1.7/

### Open-source overlap

ReadAble combines mobile OCR, text processing, summarization/simplification, and TTS. DyLexAid combines text simplification, TTS, and accessible reading modes.

Sources:
- https://github.com/nazarli-shabnam/ReadAble
- https://github.com/JanSteinhauer/DyLexAid

These projects reinforce that OCR, simplification, TTS, and accessibility-oriented reading modes are not sufficient differentiation.

### Patent overlap

US20240086616A1 describes a reading assistant using accessibility-tree semantics for extraction, user preferences for modified presentation, and side-by-side original/modified content with synchronized scrolling.

Source: https://patents.google.com/patent/US20240086616A1/en

Older patent families describe dynamically personalized reading instruction, tunable summaries, salient-information highlighting, comprehension aids, and adaptation based on user performance. A 2025 publication also describes personalized reading based on gaze and reading-behavior signals.

Sources:
- https://patents.google.com/patent/US20030093275A1/en
- https://patents.google.com/patent/US7386453B2/en
- https://patents.google.com/patent/US20250362743A1/en

### Updated competitive conclusion

The following are established capability areas rather than useful novelty claims by themselves:

- presentation customization;
- OCR/text acquisition;
- text simplification;
- TTS and synchronized reading;
- highlighting/focus;
- user preference profiles;
- original/modified source alignment;
- behavioral personalization;
- on-device text transformation.

The research gap should remain an effectiveness question: whether a reader-controlled representation layer can identify and deliver source-faithful representations that measurably improve a defined task, with prediction validated on unseen content and semantic/accessibility costs explicitly measured.
