# Reframe — Research Log

**Status:** Living research record  
**Last reviewed:** 2026-10-02

This log records research cycles, what changed, and what the evidence means for Reframe. A research finding does not automatically become a product decision.

## Research cycle 2026-10-02 — Semantic and structural representations

### 19. Graphic organizers have a meaningful evidence base, but context matters

A meta-analysis of graphic-organizer studies involving students with learning disabilities reviewed 16 articles and 808 participants. Across conditions, graphic organizers were associated with gains in vocabulary, comprehension, and inferential knowledge. However, effects varied by organizer type, measure, subject, and transfer condition.

Source: https://doi.org/10.1177/073194871103400104

An earlier synthesis of 21 intervention studies also found overall improvement in reading comprehension, but noted that gains seen during initial organizer use did not necessarily transfer to later or novel comprehension tasks.

Source: https://pubmed.ncbi.nlm.nih.gov/15493233/

**Reframe implication:** structure extraction is worth testing, but a successful supported-task effect does not automatically establish independent transfer or a universal benefit.

### 20. Computer-based organizers are not automatically effective

A systematic review of 12 studies on computer-based graphic organizers for students with learning disabilities found encouraging findings in some academic outcomes but less promising comprehension results. The review found no evidence that these tools were efficacious without explicit instruction and guided practice.

Source: https://onlinelibrary.wiley.com/doi/10.1111/ldrp.12017

**Reframe implication:** a digital representation should not be assumed to work merely because the same conceptual structure has educational evidence. Reframe must distinguish an assistive interface from an instructional intervention.

### 21. Main idea and higher-level comprehension are established research targets

A synthesis of informational-text interventions for elementary students with learning disabilities found that many studies targeted fact acquisition and main-idea identification. Cognitive-strategy interventions and graphic-organizer study guides showed encouraging outcomes, while the review identified relatively little research targeting higher-level comprehension skills.

Source: https://pubmed.ncbi.nlm.nih.gov/24958632/

**Reframe implication:** main-idea extraction is a legitimate research target, but Reframe should test whether automatically exposing a main idea provides access without replacing the reader's own comprehension process.

### 22. Reading-comprehension strategies are multi-component

A Bayesian network meta-analysis covering 52 studies of students with reading difficulties examined combinations of main idea, inference, text structure, retell, prediction, self-monitoring, and graphic organizers. The evidence base is largely from English-speaking populations.

Source: https://doi.org/10.3102/00346543231171345

**Reframe implication:** there is no justification for assuming one representation is universally sufficient. Reframe should investigate task-specific combinations and whether the reader can select among them.

### 23. 5W+H is a task representation, not a neutral summary

The research on main idea, questioning, inference, and text structure indicates that a 5W+H view belongs to the semantic-extraction class. It changes the representation of information rather than merely changing typography.

For a source sentence such as:

> The committee reviewed the proposal and decided to postpone the project until next year.

A representation might expose:

- Who: committee
- What: decided to postpone the project
- When: next year

But a missing field must remain missing. If the source does not state where, why, or how, Reframe must not infer those fields.

**Research implication:** 5W+H should be tested against literal question-answering accuracy, inference accuracy, omission rate, and source-fidelity errors—not simply user preference.

### 24. Graphic structure can support comprehension without proving remediation

The evidence for graphic organizers and comprehension strategies largely comes from instructional contexts where learners are taught to use the strategy. This is materially different from a passive overlay that automatically transforms arbitrary content.

**Reframe implication:** evidence that a teacher-taught graphic organizer helps does not prove that an automatically generated HUD provides the same benefit. This is a central research boundary.

### 25. New experimental model

The evidence now supports a more precise experimental unit:

**Reader × content × task × representation × assistance level → outcome**

Assistance level should distinguish:

- original text;
- presentation-only transformation;
- structural transformation;
- semantic extraction;
- interactive guidance;
- audio/multimodal support.

Outcomes should include:

- literal comprehension;
- inferential comprehension;
- information-location accuracy;
- recall;
- task completion time;
- rereading/navigation;
- subjective effort;
- preference;
- semantic fidelity.

### 26. New failure hypothesis: support can become substitution

A representation may improve performance because it performs part of the comprehension task for the reader. That can be useful for access, but it changes what is being measured.

For example, automatically supplying a main idea may improve a main-idea question while providing little evidence that the reader independently understood the passage.

**Reframe implication:** experiments must specify whether the goal is access to information, independent comprehension, learning, or remediation. These are different outcomes.

## Research cycle 2026-10-02 — Comprehension architecture and semantic assistance

### 27. Reading comprehension involves an evolving mental representation

A 2024 review of situation-model research describes comprehension as constructing and updating a mental representation of what a text describes. New information is integrated with existing information and prior knowledge; when new information conflicts with what was previously represented, the reader may need to revise the representation.

Source: https://www.jstage.jst.go.jp/article/sjpr/67/2/67_191/_article/-char/en

**Reframe implication:** a useful representation may need to expose relationships and updates, not merely isolated facts. This makes timelines, causal/temporal relationships, entity tracking, and contradiction/exception handling legitimate research areas.

It also creates a warning: extracting individual facts can be insufficient if comprehension depends on how those facts relate to one another.

### 28. No single comprehension strategy emerges as a universal active ingredient

A 2024 Bayesian network meta-analysis of 52 studies found no single reading-comprehension strategy that consistently produced the strongest effect. Main idea, text structure, and retell used together appeared promising, while background-knowledge instruction interacted with strategy effects. The studies were predominantly from English-speaking settings and involved grades 3–12.

Source: https://doi.org/10.3102/00346543231171345

**Reframe implication:** the product should not assume that one universal "dyslexia mode," "5W+H mode," or "summary mode" is the correct representation. A reader/task may need different representations at different moments.

### 29. Inference is a particularly important boundary

Inference is essential to comprehension and can be difficult for students with reading disabilities. Research and instructional literature explicitly treats inference as a skill that can be taught, including through graphic organizers.

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC12456325/

A review of inferencing research also emphasizes that inference is defined, instructed, and assessed in different ways across studies.

Source: https://doi.org/10.1007/s10758-023-09660-y

**Reframe implication:** an automatic system that answers an inference question is doing something different from a system that merely makes source relationships easier to see. Those must be separate modes and separate experiments.

### 30. Graphic representations have newer evidence in autism, but the evidence base is small

A 2025 meta-analysis of pictorial/graphic representations in reading-comprehension interventions for autistic students identified only five eligible studies after screening more than 2,000 abstracts. The interventions included interactive categorization, videos modeling inference, graphic organizers, story mapping, and other multi-component approaches.

Source: https://doi.org/10.1007/s10803-025-07014-4

The small number of eligible studies is itself important. It limits generalization and makes it inappropriate to treat the findings as proof of a universal visual representation effect.

### 31. 5W+H has an evidence-adjacent foundation, but Reframe's version is still untested

A 2024 meta-analytical review of shared-text reading for students with intellectual disability identified teaching the meaning of WH-words as an evidence-supported instructional component and found benefits from shared-text reading interventions.

Source: https://doi.org/10.1016/j.edurev.2024.100615

**Important distinction:** teaching a learner what WH-words mean is not the same intervention as automatically converting arbitrary text into a Who/What/When/Where/Why/How display.

**Reframe status:** the 5W+H representation remains a hypothesis. The literature supports studying question structure and WH concepts, but does not establish Reframe's automatic extraction algorithm as effective.

### 32. Structure must preserve relationships, not just labels

Situation-model research indicates that comprehension depends on integrating information into a coherent representation. Therefore, a future structural mode that displays only isolated entities or facts could lose important relationships such as:

- who did what to whom;
- when an event occurred;
- what changed;
- why an action occurred;
- what condition applies;
- what is uncertain;
- what was denied;
- what is an exception;
- how two claims relate.

**New design requirement:** semantic representations should preserve relationships and qualifiers, not merely extract nouns and verbs.

### 33. New distinction: extraction versus explanation

Reframe should separate:

**Extraction:** identifying information explicitly present in the source.

**Reorganization:** changing the structure in which that information is presented.

**Inference:** deriving information that is not directly stated but is supported by the source and/or prior knowledge.

**Explanation:** adding instructional material intended to help the reader understand.

These four operations have different risks and should never be silently combined.

### 34. New safety/fidelity principle for semantic modes

A semantic representation should be able to distinguish at minimum:

- **stated** — directly supported by source text;
- **inferred** — derived rather than explicitly stated;
- **unknown** — not established by available text;
- **conflicting** — source contains incompatible or unresolved information.

This is a research requirement, not yet an implementation specification.

## Research cycle 2026-10-02 — Personalization and onboarding hypothesis

### 35. A reader-selected setup is scientifically plausible, but preference is not the same as benefit

A 2024 global meta-analysis of personalized/adaptive learning technologies for K–12 reading literacy synthesized 27 studies and found a positive aggregate effect (g = 0.29), while also finding substantial context dependence and multiple moderators. The literature distinguishes simple adaptable systems, where learners choose presentation options, from adaptive systems that change content delivery using performance, preferences, or other learner information.

Source: https://doi.org/10.1016/j.edurev.2023.100587

**Reframe implication:** a setup experience in which the same passage is shown through multiple representations is consistent with an established personalization concept. However, Reframe should not assume that the representation a reader prefers is the representation that objectively helps most.

### 36. Direct evidence exists for personalized reading parameters

A 2024 validation study tested an automated procedure for selecting personalized visual and text-to-speech parameters in 78 school-aged participants, including children with atypical reading skills. The study reported advantages for personalized parameters in its reading/writing tests, with a larger text-to-speech personalization advantage for dyslexic readers.

Source: https://www.mdpi.com/2414-4088/8/1/5

A more recent study of 60 children aged 7–12 found that preference-based text customization slightly improved reading fluency but did not improve reading comprehension; the authors also reported that the dyslexia and typical-reader groups selected broadly similar configurations apart from font size.

Source: https://doi.org/10.5209/rlog.101374

**Reframe implication:** personalization deserves its own experimental track. It may affect fluency, comfort, or experience without necessarily improving comprehension.

### 37. The proposed onboarding test should be a preference-and-performance probe, not a diagnostic test

The proposed setup concept is now defined as a **representation calibration** rather than a dyslexia test.

A possible flow is:

1. Show the same short passage in several representations.
2. Let the reader choose which representation feels clearest/easiest.
3. Optionally ask what they prefer for different tasks rather than asking for a single universal favorite.
4. Measure simple objective outcomes on comparable passages.
5. Save the reader's choices as editable preferences.
6. Allow the reader to override the chosen representation at any time.

Candidate representations can include:

- original text;
- spacing/typography changes;
- emphasis of selected linguistic categories;
- chunked text;
- bullets/outline;
- 5W+H extraction;
- timeline/event structure;
- key facts/entity-action structure;
- read-aloud/synchronized text;
- progressive assistance.

**Critical boundary:** this should not be presented as diagnosing dyslexia, identifying a disability, or determining a clinically correct reading mode.

### 38. The same content should drive the comparison

If onboarding shows different passages for different modes, differences in content can contaminate the result. The research prototype should therefore use equivalent or repeated content across representations and rotate presentation order where practical.

**Research implication:** the onboarding experience can itself become an experiment: representation is the variable; the content and task are controlled as much as practical.

### 39. Preference should be multidimensional

A reader may prefer one representation for one purpose and another for a different purpose. For example:

- visual emphasis for reading continuously;
- 5W+H for locating facts;
- timeline for events;
- audio for long passages;
- original text for close reading.

Therefore, Reframe should avoid creating a single permanent "reader type" from onboarding.

### 40. Personalization should be reversible and non-diagnostic

The onboarding result should be treated as an editable preference profile, not a diagnosis or immutable cognitive profile. Research should test whether preferences remain stable across content types, tasks, fatigue, language, and time.

**New hypothesis:** Reframe may eventually learn a **task-specific representation profile**, rather than a single user-wide mode.

## Current research conclusions

### Stronger conclusions

- Reframe should not be centered on dyslexia-specific fonts.
- Typography and spacing remain legitimate variables to test.
- Reading comprehension needs decomposition into mechanisms and task demands.
- Language and semantic processing require separate research tracks.
- Cross-language and orthographic generalization is a first-class constraint.
- Audio/read-aloud is a legitimate representation family with existing evidence.
- More visual content is not automatically more accessible.
- Graphic/structural representations have a meaningful evidence base, but effects depend on context and transfer.
- Situation-model research supports studying relationships and information updates, not only isolated facts.
- Semantic extraction must be evaluated differently from formatting.
- Source fidelity is a product requirement, not a cosmetic quality metric.
- Assistive representation must not be confused with instructional remediation.
- Extraction, reorganization, inference, and explanation should be treated as different operations.
- Personalization is worth studying, but preference and objective benefit must be measured separately.
- A reader-selected onboarding experience can be a research instrument as well as a product mechanism, provided it is not presented as diagnosis.

### Still hypotheses

- noun/verb highlighting;
- 5W+H representation;
- timeline representation;
- explicit entity/action structure;
- automatic main-idea extraction;
- automatic mode selection;
- progressive assistance;
- content-aware representation selection;
- combining multiple representations;
- whether reader preference predicts measured benefit;
- whether exposing relationships improves comprehension without substituting for comprehension;
- whether explicit provenance reduces semantic errors enough to make automatic extraction useful;
- whether a short onboarding calibration predicts which representation helps a reader on later tasks;
- whether representation preference is stable or task/content dependent.

### New risks identified

1. A representation can improve readability without improving comprehension.
2. A semantic transformation can introduce information not present in the source.
3. A support can improve task performance by doing part of the task for the reader.
4. A strategy that works when explicitly taught may not work when automatically generated.
5. A benefit on a researcher-created measure may not transfer to standardized or novel tasks.
6. Extracting facts without preserving relationships can produce a misleading representation.
7. Mixing extraction and inference without labeling them can make the transformed view appear more certain than the source.
8. A preference-calibration test can create a false sense of personalization if preferences are not stable across tasks and content.
9. Optimizing for preference alone could select a comfortable representation that does not improve the intended outcome.

Therefore Reframe needs at least three validation dimensions:

1. **Legibility/access**
2. **Task benefit**
3. **Source/semantic fidelity**

Personalization adds a fourth research dimension:

4. **Preference-to-benefit relationship**

## Next research cycle

Priority order:

1. Evidence on semantic/structural representations: main idea, question answering, graphic organizers, timelines, and information extraction.
2. Evidence distinguishing comprehension support from reading instruction/remediation.
3. Adult reading-disability and adult low-literacy evidence.
4. Multilingual and non-English/non-Latin evidence.
5. Attention, working memory, and executive-function interactions with reading presentation.
6. User-controlled personalization versus automatically selected adaptations, including whether preferences predict measured benefit.
7. Mobile/digital reading contexts.
8. Prior art/open-source systems that transform or adapt reading presentation.
9. Platform feasibility only after research determines what the first experiment actually requires.

## Build status

**Do not begin production implementation yet.**

The next acceptable build target is a deliberately small **research instrument** after the representation hypotheses and outcome measures are sufficiently specified. The first instrument should compare representations; it should not attempt to become the final system-wide HUD.


## Research cycle 2026-10-02 — Reader calibration and personalization

### 35. Personalization has evidence, but preference is not the same as benefit

A global meta-analysis of personalized/adaptive learning technologies found a positive aggregate effect on reading literacy, while also identifying multiple moderators. This supports studying personalization, but does not establish that self-selected presentation modes improve comprehension for every reader or task.

Source: https://doi.org/10.1016/j.edurev.2023.100587

A 2025 study of children with dyslexia and typical readers compared standard versus preference-customized typography. Customization slightly improved reading fluency but did not improve comprehension. This is directly relevant to Reframe's proposed setup flow: a reader can have a genuine preference without that preference predicting an objective comprehension gain.

Source: https://doi.org/10.5209/rlog.101374

**Reframe implication:** onboarding should collect preferences as hypotheses to test, not treat them as diagnoses or proven optimal settings.

### 36. Individualized visual manipulation can work for a subgroup

Research on visual crowding found a subgroup of adults with dyslexia who read faster when letter, word, and line spacing were increased. The study explicitly framed this as personalization to an individual's visual characteristics.

Source: https://pubmed.ncbi.nlm.nih.gov/29679920/

A 2024 study likewise found increased inter-word spacing improved standardized comprehension scores for participants with dyslexia and reduced migration errors, although it was a small study and should not be generalized to all readers.

Source: https://pubmed.ncbi.nlm.nih.gov/39139062/

**Reframe implication:** a calibration system is scientifically plausible when it tests a representation against an individual rather than assuming a group diagnosis determines the correct setting.

### 37. Calibration should include performance, not only preference

A personalization web-app study with 78 school-aged participants tested automatically selected visual and text-to-speech parameters against standard settings and reported advantages for personalized parameters. However, the study concerned visual/audio parameter personalization rather than Reframe's semantic representations.

Source: https://www.mdpi.com/2414-4088/8/1/5

A separate study of automatic text adaptation for students with intellectual disability iteratively tested lexical, syntactic, and discourse adaptations. Overall comprehension gains were not significant, although later rounds showed promising lexical and syntactic effects and substantial heterogeneity.

Source: https://pubmed.ncbi.nlm.nih.gov/40749139/

**Reframe implication:** calibration should not simply ask "Which version do you like?" It should combine:
- preference;
- task performance;
- effort/difficulty;
- rereading/navigation;
- and semantic fidelity where transformation occurs.

### 38. Proposed Reader Calibration protocol

The proposed onboarding experiment should use the same passage and the same task across multiple representations.

Potential sequence:

1. Show a short passage.
2. Show several representations of the same passage.
3. Ask which representation feels clearest.
4. Repeat with a different passage/content type.
5. Optionally ask the reader to answer a factual or structural question.
6. Record objective performance separately from preference.
7. Allow the reader to revise selections.
8. Repeat across task types where useful.
9. Create an initial preference profile only after multiple observations.

Candidate representation families:
- Original;
- presentation/spacing;
- emphasis;
- chunking;
- outline/list;
- 5W+H;
- timeline;
- comparison;
- definitions;
- audio.

**Important:** this should not be framed as a diagnostic test. It is a product calibration procedure.

### 39. Avoid premature profiling

The profile should not initially say:

> "This reader is a 5W+H reader."

A better hypothesis representation is:

> "For information-location tasks, this reader has repeatedly preferred and/or performed better with 5W+H."

This preserves task and content context.

The profile should also permit:
- no stable preference;
- different representations for different tasks;
- different settings for different content types;
- insufficient evidence;
- explicit reader override.

### 40. Calibration itself needs validation

The calibration procedure creates a new research question:

**Does a short onboarding calibration predict later benefit on unseen content?**

A useful experiment would compare:
- self-selected preference;
- calibration based on objective performance;
- fixed/default representation;
- potentially random representation assignment.

The important outcome is not whether the reader can pick a favorite view. It is whether calibration improves subsequent performance on new material.

### 41. New design principle: preference is a signal, not ground truth

Reframe should treat:
- preference as one signal;
- observed performance as another;
- task as context;
- content as context;
- source fidelity as a constraint.

No single signal should automatically determine the representation.

### 42. Calibration should not overfit to onboarding passages

A setup test can accidentally teach the system the quirks of its own sample passages.

Therefore, eventual validation must include:
- calibration passages;
- unseen test passages;
- multiple content types;
- multiple task types;
- counterbalanced representation order where practical.

A representation should be considered useful only if the effect survives beyond the examples used during setup.

## Research cycle 2026-10-02 — Personalized semantic adaptation

### 43. Automatic text adaptation remains uncertain

A 2025 exploratory study involving students with intellectual disability tested automatic lexical, syntactic, and discourse adaptations over multiple rounds. Overall comprehension gains were not significant, although later iterations showed promising lexical and syntactic effects and substantial heterogeneity.

Source: https://pubmed.ncbi.nlm.nih.gov/40749139/

**Reframe implication:** semantic transformation should be treated as an empirical intervention, not assumed to work because a transformed passage looks simpler.

### 44. Personalization should be layered

Current evidence suggests a safer hierarchy:

**Reader choice → measured outcome → repeated observation → optional adaptive suggestion**

rather than:

**diagnosis → automatic transformation**

Automatic selection should remain an advanced stage after the underlying representations have demonstrated measurable utility.

### 45. New research question

**Can a short reader-calibration procedure identify representations that improve performance on unseen content, while preserving reader control and source fidelity?**

This is now a first-class Reframe research question.

## Current research conclusions — personalization update

- Personalization is scientifically plausible.
- Preference alone is insufficient evidence of benefit.
- Individual differences can matter even within the same diagnostic group.
- Visual personalization may improve fluency or reduce specific visual difficulties without improving comprehension.
- Semantic personalization is less established and requires stronger validation.
- Calibration should test transfer to unseen content.
- A useful reader profile should be task- and content-conditioned rather than diagnosis-based.
- Automatic adaptation should come after representation validation, not before it.

## Next research cycle

Priority order now adds:

1. Validate the Reader Calibration hypothesis against existing personalization research.
2. Investigate whether preference predicts objective performance.
3. Study calibration/transfer methods and counterbalancing.
4. Continue semantic/structural representation evidence.
5. Continue adult and multilingual evidence.
6. Investigate attention, working memory, and task-specific effects.
7. Continue mobile/digital reading and prior-art research.
8. Reassess platform requirements only after the first research instrument is defined.

## Build status

**Do not begin production implementation yet.**

The calibration concept is now a research hypothesis and should be tested in the eventual research instrument before becoming a permanent onboarding system.


## Research cycle 2026-10-02 — Prior-art update

DAISY's 2025 Reading Apps User Requirements establish navigation, semantic structure, read-aloud, synchronized text/audio, visual adjustments, bookmarking, highlighting, and reversibility as core accessibility requirements. Existing assistive products already provide many presentation-level features. Reframe therefore needs to validate its semantic representation, representation-selection, and source-fidelity hypotheses rather than treating a larger accessibility feature set as differentiation.


## Research cycle 2026-10-02 — Assistive reading prior art and representation boundaries

### 55. Mainstream reading tools already provide substantial presentation-level assistance

Microsoft Immersive Reader currently supports text size, spacing, font changes, themes, line focus, read-aloud, syllabification, parts-of-speech highlighting, picture dictionary, translation, and reading-coach functionality in supported products and languages.

Sources:
- https://support.microsoft.com/en-us/accessibility/word/use-immersive-reader-in-word
- https://support.microsoft.com/en-us/education/learning-accelerators/languages-and-products-supported-by-immersive-reader

Helperbird currently provides spacing controls, text-to-speech, reading modes, dyslexia-oriented fonts, reading rulers, color overlays, OCR/screenshot reading, dictionaries, and accessibility profiles.

Source:
- https://www.helperbird.com/features/

**Reframe implication:** these are established prior art. Reframe should not treat a larger collection of presentation controls as the central product hypothesis.

### 56. Accessibility profiles are already an established personalization pattern

Existing products can apply preset accessibility configurations for labels such as dyslexia or ADHD.

**Reframe implication:** a diagnosis- or label-based preset is not sufficient differentiation and should not replace the research question around task-conditioned calibration. Reframe should continue testing whether reader preference and measured performance can identify useful representations without assigning a permanent reader type.

### 57. Reading-app standards make continuity part of representation quality

The 2025 DAISY Reading Apps User Requirements treat forward/back navigation, table-of-contents navigation, location restoration, structural navigation, semantic exposure to screen readers, read-aloud starting position, synchronized text/audio, and user-controlled visual emphasis as important requirements.

Source:
- https://daisy.github.io/reading-apps-ux-reqs/requirements/published/FINAL-20251031/

**Reframe implication:** representation quality must include continuity. A transformed view should preserve or provide a clear path back to the source location and should not destroy structural accessibility information.

### 58. Multilingual support must account for capability differences

Microsoft's current Immersive Reader language documentation shows that available capabilities vary substantially by language: some languages support read-aloud, spacing, syllables, parts of speech, line focus, picture dictionary, and translation in combinations rather than uniformly.

Source:
- https://support.microsoft.com/en-us/education/learning-accelerators/languages-and-products-supported-by-immersive-reader

**Reframe implication:** multilingual support cannot be specified as a simple feature toggle. Research and later implementation must track which representation operations are actually valid and available for each language/script.

### 59. Prior-art research narrows the research gap

The current scan does not establish that Reframe is the first system to offer alternate reading views, TTS, personalization, OCR, or semantic assistance.

It does establish a more useful research gap:

**Can a reader-controlled representation layer switch among source-faithful semantic views and produce measurable task-specific benefit while preserving navigation, accessibility semantics, and source fidelity?**

This remains a hypothesis requiring controlled evaluation.

### 60. Competitive research must distinguish capability from evidence

A competitor having a feature demonstrates that the capability exists. It does not demonstrate that the capability improves comprehension for a particular population or task.

Therefore future landscape research should record two separate fields:

- **Capability evidence:** what the system actually provides.
- **Effectiveness evidence:** what controlled or published evidence, if any, supports the feature.

This prevents feature inventories from being mistaken for scientific validation.

## Current research conclusions — prior-art update

- Presentation-level reading assistance is a mature capability area.
- TTS, spacing, focus, highlighting, OCR, reading modes, and accessibility profiles are established prior art.
- Navigation, reversibility, semantic accessibility, and source continuity are core requirements, not optional polish.
- Multilingual capabilities vary by language and cannot be assumed to generalize uniformly.
- Reframe's research question should focus on source-faithful semantic representation and validated task-specific selection.
- Competitive research must separate feature existence from evidence of effectiveness.


## Research cycle 2026-10-02 — Semantic reading prior art and source alignment

### 61. Open-source prior art now directly overlaps several Reframe capabilities

ReadAble combines on-device OCR, summarization, date/amount extraction, a dyslexia-oriented reader, TTS with sentence highlighting, Q&A, document history, and offline-first storage. Dyslexa combines AI text simplification, visual preferences, TTS, word definitions, and user-defined processing rules. Readapt focuses on configurable reading aids for reading challenges. ClearPath combines browser read-aloud, synchronized word highlighting, plain-language rewriting, reading mode, focus tools, and symbol overlays.

Sources:
- https://github.com/nazarli-shabnam/ReadAble
- https://github.com/btaniemie/dyslexa
- https://github.com/ContentSquare/readapt
- https://github.com/clearpath-ext/clearpath-extension

**Reframe implication:** OCR → transformation → presentation is already an established open-source pattern. Reframe should therefore investigate the *representation model and validation method*, not merely reproduce this pipeline.

### 62. Source-aligned alternate views are already present in patent prior art

US20240086616A1 describes a browser reading assistant that presents original content alongside extracted, simplified/reformatted content and synchronizes scrolling between the two views to preserve context.

Source: https://patents.google.com/patent/US20240086616A1/en

**Reframe implication:** preserving source context while displaying transformed content is not sufficient by itself to establish novelty. Reframe's source-fidelity requirement should therefore be more rigorous: transformations need explicit provenance and semantic-state handling, and experimental evaluation should measure transformation errors rather than relying on synchronized views alone.

### 63. Visual augmentation remains an evidence-sensitive intervention

A 2025 study of symbolated text for people with intellectual and developmental disabilities found that participants performed worse with symbolated text than traditional text and concluded that graphic-symbol augmentation should not automatically be assumed to improve accessibility.

Source: https://doi.org/10.1016/j.ridd.2025.104998

**Reframe implication:** representations such as icons, symbols, diagrams, or other visual additions must remain experimental operations. The system should support abandoning a representation when it increases cognitive or visual load.

### 64. New research distinction: source alignment vs source fidelity

Prior art shows several ways to keep transformed content visually or spatially aligned with the source. Reframe should distinguish this from **semantic source fidelity**.

- **Source alignment:** the reader can locate the transformed passage relative to the original.
- **Source fidelity:** the transformed representation preserves what the source states, including qualifiers, uncertainty, relationships, exceptions, and contradictions.

This distinction should become explicit in future experiments. A transformed view can be perfectly aligned with the source while still changing its meaning.

### 65. Updated prior-art research question

**When a representation changes information structure, can Reframe preserve semantic source fidelity while improving a defined reading task, and can that benefit be demonstrated on unseen content?**

This is narrower and more testable than a general claim that Reframe makes reading easier.

## Current research conclusions — semantic prior-art update

- Several open-source systems already combine OCR, TTS, simplification, visual controls, and Q&A.
- Source-aligned transformed views also exist in patent prior art.
- Visual augmentation can reduce rather than improve comprehension.
- Source alignment and semantic source fidelity must be measured separately.
- The research instrument should include semantic-fidelity checks whenever a representation changes information structure.
- Reframe should continue prior-art research before making any novelty or differentiation claim.


## Research cycle 2026-10-02 — Semantic representations: structure, main idea, graphic organizers, 5W+H

### 66. Text-structure evidence supports structure-aware comprehension, but not a generic visual overlay

A meta-analysis of 44 experimental/quasi-experimental studies in grades 4–6 found immediate positive effects from text-structure instruction, with effects differing substantially by outcome: comprehension questions, recall, summarization, and text-structure knowledge did not behave as interchangeable measures. Effects were no longer detectable at delayed posttests overall. Active construction of graphic organizers/story maps was more useful than simply exposing students to organizational graphics.

Source: https://doi.org/10.1002/rrq.311

**Reframe implication:** a representation such as an outline, timeline, cause/effect map, or comparison view should be evaluated against a specific task and outcome. Merely rendering structure visually is not sufficient evidence of benefit.

### 67. Graphic organizers have supportive evidence in learning disabilities, with important scope limits

A meta-analysis covering 16 studies and 808 students with learning disabilities found graphic-organizer use associated with moderate-to-large gains across vocabulary, comprehension, and inferential knowledge, depending on outcome, organizer type, and subject. A separate systematic review of computer-based graphic organizers found less promising comprehension results than results for some other academic outcomes.

Sources:
- https://doi.org/10.1177/073194871103400104
- https://doi.org/10.1111/ldrp.12017

**Reframe implication:** “graphic organizer” is evidence-supported enough to test, but the evidence does not justify assuming every automatically generated organizer will help. Computer-mediated delivery and organizer design are potential moderators.

### 68. Main idea and visual-graphic-organizer strategies can behave differently by population

A study comparing a main-idea extractor with a visual-graphic-organizer strategy in third-grade children with and without autism found the visual-graphic-organizer strategy outperformed the main-idea extractor in the reported comparison. The study explicitly examined question type as well as strategy effects.

Source: https://www.sciencedirect.com/science/article/pii/S1750946723000697

**Reframe implication:** representation effectiveness may depend on both reader population and question type. Experiments should not collapse literal, main-idea, inference, and other comprehension questions into one score.

### 69. 5W+H has direct but very low-level evidence

A 2024 single-subject study of one elementary student with moderate intellectual disability reported improvement after instruction using a 5W+1H strategy. The intervention emphasized question words, keywords, and visual images; the report noted that visual images were less useful for why/how questions than reliance on textual keywords.

Source: https://doi.org/10.33394/jp.v11i4.12877

**Reframe implication:** 5W+H is a reasonable experimental representation, especially for information-location tasks, but current evidence is far too limited to treat it as a broadly effective representation. Why/how also require special handling because they can involve inference or causal interpretation rather than direct extraction.

### 70. New representation taxonomy for experiments

The current evidence supports separating representations into at least four functional classes:

1. **Structure exposure** — showing relationships or organization without requiring active construction.
2. **Structure construction** — asking the reader to create/fill a map or organizer.
3. **Information-location views** — e.g., 5W+H for locating explicitly stated entities/events/details.
4. **Meaning-relation views** — e.g., cause/effect, sequence, comparison, or main-idea/supporting-detail representations.

Reframe's automatic representations are primarily in classes 1, 3, and 4. Evidence from instructional interventions involving class 2 cannot automatically be transferred to an automatic representation. This distinction should be preserved in future evidence mapping.

### 71. Updated experimental requirement

For every representation, the research instrument should specify:

- target task;
- source text type;
- expected mechanism;
- population/context;
- question type;
- whether the representation exposes, reorganizes, or adds information;
- semantic-fidelity risks;
- immediate outcome;
- transfer/unseen-content outcome;
- reader preference separately from objective performance.

**Current hypothesis:** Reframe should not ask whether an outline, timeline, 5W+H, or comparison view is “better.” It should test whether a particular representation improves a particular task for a particular reader/context while preserving source meaning.


## Research cycle 2026-10-02 — Transfer and calibration: a critical constraint

### 72. Text-structure benefits show a transfer gradient

A randomized study of 62 students with reading disabilities in grades 4–5 found significant gains in text-structure identification and main-idea generation on near- and mid-transfer measures, but no statistically significant effect on a far-transfer measure of general reading comprehension. The intervention involved 25 lessons and explicit paraphrasing/text-structure instruction.

Source: https://pubmed.ncbi.nlm.nih.gov/33041619/

A broader meta-analysis of 45 studies found text-structure instruction effective across proximal, maintenance, near-transfer, and far-transfer outcomes, but far-transfer effects were small and inconsistent. Stronger effects were associated with teaching more text structures and incorporating writing.

Source: https://eric.ed.gov/?id=EJ1105625

**Reframe implication:** improvement on the exact task a representation targets cannot be treated as evidence that the representation improves general reading comprehension. Reframe experiments need at least one transfer condition.

### 73. Transfer can occur across domains, but transfer support matters

A randomized controlled trial with second-grade children experiencing difficulty in both reading comprehension and word-problem solving found cross-domain transfer from text-structure intervention. However, the interventions included explicit instruction designed to sensitize children to shared structures across domains.

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC12499653/

**Reframe implication:** transfer is not automatic. If Reframe expects a representation preference or skill learned on one content type to generalize to another, that assumption must be experimentally tested rather than encoded as a product rule.

### 74. Graphic-organizer evidence also contains a transfer warning

A synthesis of graphic-organizer studies for students with learning disabilities found overall comprehension benefits, but earlier research reported that initial gains were not consistently present on later or new comprehension tasks. A later meta-analysis found benefits across near- and far-transfer measures, demonstrating that results depend on study design and intervention characteristics.

Sources:
- https://pubmed.ncbi.nlm.nih.gov/15493233/
- https://doi.org/10.1177/073194871103400104

**Reframe implication:** every representation needs a defined transfer level: same passage, new passage with same structure, new structure, new task, or broader comprehension.

### 75. Calibration should separate preference from judgment accuracy

Digital-learning research has explicitly measured students' judgments of learning against subsequent comprehension performance and found that metacognitive support can affect both performance and judgment accuracy. This reinforces the distinction between “this looks/feels easier” and “this representation actually improved comprehension.”

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC11570305/

**Reframe implication:** Reader Calibration should collect at least two separate signals: subjective preference/perceived clarity/effort and objective task performance on the same and unseen material.

### 76. Revised Reader Calibration model

Calibration should be treated as a prediction problem rather than a preference survey:

calibration examples → candidate representation signal → unseen-content test → prediction error → editable reader profile

For each candidate representation, measure: preference; perceived effort/clarity; task accuracy; response time where appropriate; rereading/navigation; semantic-fidelity errors; performance on unseen content; and whether the result transfers to a new task or structure.

The system should retain uncertainty when evidence is insufficient and permit task-specific profiles instead of forcing one global “reading style.”

### 77. New research-gate requirement: transfer

Before Reframe can claim that calibration identifies a useful representation for a reader, evidence should demonstrate prediction beyond the calibration material. At minimum, a prototype experiment should include held-out passages and counterbalanced representation order.

**Updated hypothesis:** A reader-controlled calibration can identify useful representation/task relationships only if subjective preference and performance are evaluated separately and the learned relationship predicts benefit on unseen content without unacceptable semantic-fidelity costs.