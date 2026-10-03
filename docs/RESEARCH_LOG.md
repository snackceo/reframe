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

## Research cycle 2026-10-02 — Automatic adaptation, semantic fidelity, and calibration signals

### 78. Human comprehension can directly test semantic fidelity of a transformation

Agrawal and Carpuat (TACL 2024) evaluated text simplification by asking readers comprehension questions about the original content after reading simplified versions. Even the strongest supervised automatic system left at least 14% of questions unanswerable from the simplified content.

Source: https://aclanthology.org/2024.tacl-1.24/

**Reframe implication:** semantic fidelity should not be evaluated only with readability metrics, lexical overlap, or model-based similarity. Reader-answerable source-fact questions provide a direct behavioral test of whether a representation retained information.

### 79. Automatic adaptation evidence supports involving readers during development

A 2025 exploratory TextAD study tested lexical, syntactic, and discourse adaptations with 27 students with intellectual disability across three iterative rounds. Overall comprehension gains were not significant, although later lexical and syntactic adaptations showed promising results. Importantly, self-reported comprehension and perceived difficulty did not consistently align with actual comprehension.

Source: https://doi.org/10.1080/17483107.2025.2536701

**Reframe implication:** reader participation is valuable for discovering useful transformations, but self-report cannot substitute for behavioral validation. Iterative reader-in-the-loop research should be part of Reframe's development methodology.

### 80. Simplification is not one operation

Current text-adaptation research distinguishes lexical, syntactic, and discourse-level transformations. These can have different effects. A representation that changes only vocabulary is fundamentally different from one that restructures clauses or discourse relations.

**Reframe implication:** Reframe should record the transformation operations used to create a representation rather than labeling the result simply "simplified."

Candidate operation metadata:
- lexical substitution;
- sentence splitting;
- syntactic restructuring;
- discourse reordering;
- explicit definition insertion;
- information extraction;
- information reorganization;
- inference/explanation.

### 81. Readability improvement can coexist with meaning loss

The 2024 text-simplification study demonstrates that a transformation can appear successful under conventional simplification metrics while still making source facts unavailable to readers. Separate medical-text research likewise evaluates readability and content fidelity as distinct outcomes.

Sources:
- https://aclanthology.org/2024.tacl-1.24/
- https://pubmed.ncbi.nlm.nih.gov/39667051/

**Reframe implication:** "easier to read" must never be used as a proxy for "better understood" or "faithful to the source."

### 82. New semantic-fidelity experiment design

For any representation that rewrites or reorganizes language, construct a source-fact question set before transformation.

Measure:
1. source condition accuracy;
2. representation condition accuracy;
3. unanswered/unsupported items;
4. omission errors;
5. changed relationship errors;
6. changed certainty/negation errors;
7. attribution errors;
8. reader-reported clarity.

A representation should be considered semantically risky when it improves task performance while causing systematic loss of source facts or relationships.

### 83. Calibration should learn transformation suitability, not merely a "reading style"

The current evidence argues against a single latent label such as "this reader is an outline reader." The useful unit is closer to:

**reader × task × content/structure × representation operation → outcome**

The same reader may benefit from lexical simplification for vocabulary-heavy material, a timeline for chronological material, and an outline for expository structure. The profile should therefore remain conditional and editable.

### 84. Research-gate addition

Before adaptive semantic transformation is built, Reframe should demonstrate that:
- a representation produces measurable benefit on a defined task;
- benefit survives held-out content;
- reader preference does not substitute for performance;
- semantic fidelity is measured behaviorally;
- transformation operations are identifiable;
- harmful or uncertain transformations can be rejected or bypassed.



## Research cycle 2026-10-02 — Working memory, executive function, and task-specific cognitive load

### 85. Working memory is relevant, but should not become a diagnostic shortcut

A 2024 systematic review/meta-analysis covering 40 studies and 3,168 children found substantially poorer performance by children with developmental language disorder on multiple verbal working-memory tasks. Findings for visuospatial working memory were less consistent.

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC11345193/

**Reframe implication:** representations that reduce simultaneous verbal storage demands are plausible research targets, but Reframe should not infer a working-memory deficit from a user's representation preference.

### 86. Executive functions are associated with reading outcomes

A 2026 meta-analysis of 60 studies and 275 effect sizes found significant associations between executive functions and reading outcomes in children, with updating/working-memory measures showing the largest descriptive association. The review also emphasized that associations vary with measurement approach.

Source: https://doi.org/10.1007/s10648-026-10160-5

**Reframe implication:** task design matters. A representation should be evaluated under the cognitive demand it is intended to change rather than assuming that all comprehension tasks impose the same working-memory burden.

### 87. DLD reading-comprehension evidence specifically points to self-regulation and question type

A 2026 scoping review of 24 DLD reading-comprehension intervention studies found interventions targeting active self-regulation, word recognition, bridging processes, and extended discourse. Most studies reported some improvement, but the review identified major variation in dosage and measurement and limited multilingual representation. A separate 2024 systematic review identified expressive language, question type, and language-disorder history as factors associated with reading comprehension beyond the standard Active View of Reading components.

Sources:
- https://pubmed.ncbi.nlm.nih.gov/41401742/
- https://pubmed.ncbi.nlm.nih.gov/38663332/

**Reframe implication:** representations should be evaluated with explicit task goals and question types. A system that simply reduces text length or visual density may miss the actual bottleneck.

### 88. Cognitive-load hypothesis for Reframe

A representation may help when it reduces unnecessary simultaneous demands while preserving the information needed for the task.

Candidate mechanisms:
- reduce irrelevant visual information;
- externalize relationships that must otherwise be held in working memory;
- make relevant entities or events easier to locate;
- reduce repeated navigation;
- expose structure without adding unsupported content;
- permit audio/visual coordination when appropriate.

These are hypotheses, not established product effects.

### 89. New experimental factor: demand decomposition

The first research instrument should characterize each task by demands rather than only by representation:

- retrieval vs integration;
- local vs cross-sentence information;
- literal vs inferential;
- temporal/causal reasoning;
- vocabulary burden;
- amount of information that must be retained simultaneously;
- navigation burden.

The same representation may help one demand while harming another.

### 90. New guardrail

Do not use performance in a representation condition to label a reader as having a particular cognitive deficit. Reframe's research unit remains **reader × task × representation × content × outcome**, not diagnosis.


## Research cycle 2026-10-02 — Attention, visual competition, and highlighting

### 91. Digital attentional interference has a measurable comprehension cost

A 2025 meta-analysis synthesized 32 empirical studies and 124 experiments of attentional distraction during digital reading. Across studies, attentional interference was associated with lower reading comprehension (Hedges' g = -0.64), although heterogeneity was high (I² = 88.3%) and moderators included distraction type, study design, educational level, and device/context.

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC12684101/

**Reframe implication:** reducing irrelevant visual competition is a legitimate research target, but "focus mode" should not be assumed universally beneficial. Distraction intensity and reading context should be experimental variables.

### 92. Visual simplification can improve comprehension when removed content is genuinely extraneous

An eye-tracking study of 60 first- and second-grade children found higher comprehension in a streamlined condition in which extraneous illustration details were removed. Gaze shifts away from text and fixations on extraneous details were associated with poorer comprehension.

Source: https://doi.org/10.1038/s41539-020-00073-5

A preregistered follow-up found the best comprehension in a condition containing text plus relevant illustrations, rather than either extraneous illustrations or text alone.

Source: https://escholarship.org/uc/item/1131r9kf

**Reframe implication:** the goal is not maximum visual reduction. The goal is minimizing irrelevant competition while retaining useful information.

### 93. Highlighting is not uniformly beneficial

A 2026 eye-tracking study of 42 undergraduate students found that visually distinguishing keywords and providing hyperlinks did not produce statistically significant group differences in reading outcomes; the authors concluded that keyword highlighting alone did not fundamentally change reading literacy or comprehension.

Source: https://doi.org/10.3991/ijep.v16i2.59031

A separate study with 191 seventh graders found limited benefits of highlighting in a broader experiment examining paper/screen reading, cognitive load, and comprehension.

Source: https://doi.org/10.1016/j.lindif.2024.102604

**Reframe implication:** "highlight important words" should remain a testable representation operation rather than a default intervention.

### 94. Active vs passive highlighting matters

A study of 130 college students comparing plain text, highlighted text, filled graphic organizers, active highlighting, and active organizer completion found that graphic-organizer conditions improved both rote-memory and comprehension outcomes, while highlighting primarily improved rote-memory performance. Eye tracking showed highlighting increased attention to marked words.

Source: https://doi.org/10.1016/j.chb.2014.11.038

**Reframe implication:** directing attention to selected words is not equivalent to externalizing information structure. Reframe should keep emphasis and structural representations as separate operations.

### 95. Dynamic highlighting may help some readers while preference points the other way

A 2025 eye-tracking study of 70 Danish second graders found gaze-contingent word highlighting improved reading speed, shortened fixations, reduced regressions and rereading, without reducing pronunciation accuracy or comprehension. Participants nevertheless preferred static text.

Source: https://pubmed.ncbi.nlm.nih.gov/40504601/

**Reframe implication:** this is another direct example of preference diverging from performance. A representation can improve behavior without being preferred, and a preferred representation need not improve performance.

### 96. Mobile reading should be treated as a distinct context

A 2024 systematic review of mobile-assisted reading eye-tracking research covering 2010–2022 concluded that eye tracking provides information about online processing that offline accuracy measures cannot capture, while also identifying methodological and interpretation challenges.

Source: https://doi.org/10.1016/j.edurev.2024.100643

**Reframe implication:** future experiments should record context where relevant: device, screen size, reading posture/activity, distraction, and whether the task is sustained reading or information lookup.

### 97. New representation taxonomy refinement

Attention-related operations should be separated into:
- **emphasis:** visually mark selected information;
- **focus:** reduce or mask competing information;
- **tracking:** dynamically indicate current reading position;
- **structural externalization:** expose relationships among information;
- **content removal:** remove information judged extraneous.

These operations have different evidence bases and different failure modes.

### 98. Updated research-gate requirement

A visual representation should not be considered beneficial merely because it reduces gaze dispersion, fixation time, or perceived effort. The experiment must establish whether the attentional change improves the target task without removing information required for comprehension.


## Research cycle 2026-10-02 — Current semantic-assistance prior art and on-device adaptation

### 99. 2026 research activity confirms semantic adaptation is an active field

The 2026 READIxTSAR workshop combines research on readability, text simplification, accessibility, and reading difficulties, with 18 papers in the proceedings. This confirms that semantic adaptation for reading access remains an active research area rather than a settled engineering problem.

Source: https://aclanthology.org/volumes/2026.readi-1/

**Reframe implication:** semantic transformation should remain an empirical research area, not a solved capability delegated to a general-purpose language model.

### 100. Controlled readability and meaning preservation remain in tension

TSAR 2025 included 48 submissions from 20 teams to a shared task on readability-controlled text simplification. The organizers reported that dependable controlled simplification often required iterative processes and evaluated systems for both readability-level accuracy and semantic similarity. A separate TSAR 2025 report describes a trade-off between precise readability adjustment and faithful meaning preservation.

Sources:
- https://aclanthology.org/2025.tsar-1.8/
- https://aclanthology.org/2025.tsar-1.12/

**Reframe implication:** readability control and semantic fidelity must remain separate objectives. Reaching a target reading level does not validate an accessibility transformation.

### 101. On-device simplification is technically plausible and privacy-relevant

A 2025 TSAR paper describes on-device text simplification intended to keep sensitive text local, reporting model-size reductions of up to 75% with limited benchmark degradation using quantization and controllable transformations.

Source: https://aclanthology.org/2025.tsar-1.7/

**Reframe implication:** local semantic transformation is a credible research direction, but local execution does not establish semantic fidelity or task benefit.

### 102. Gaze-guided adaptation adds another personalization signal

A 2026 EACL study used gaze information to control reading ease and reported measurable changes in reading time and perceived difficulty, with effects largely associated with lexical-processing features.

Source: https://aclanthology.org/2026.eacl-long.107/

**Reframe implication:** personalization can use behavioral/context signals beyond explicit preference, but such signals should not be interpreted as evidence of a disability or cognitive state.

### 103. Open-source implementations confirm capability overlap

ReadAble combines mobile OCR, text processing, summarization/simplification, and TTS for dyslexia-oriented reading assistance. DyLexAid combines text simplification, TTS, and accessible reading modes in a Swift application.

Sources:
- https://github.com/nazarli-shabnam/ReadAble
- https://github.com/JanSteinhauer/DyLexAid

**Reframe implication:** OCR, simplification, TTS, and accessible reading modes are already represented in open-source projects. Reframe's research value depends on validating representation selection and source fidelity, not assembling these capabilities alone.

### 104. Patent prior art materially overlaps with personalization and source-preserving transformation

US20240086616A1 describes a browser reading assistant using accessibility-tree semantics for extraction, user preferences for modified content, and side-by-side original/modified views with synchronized scrolling. Older patent families describe dynamic personalized reading instruction, tunable summaries, salient-information highlighting, comprehension aids, and performance-based adaptation. A newer patent publication describes personalization using gaze and reading-behavior signals.

Sources:
- https://patents.google.com/patent/US20240086616A1/en
- https://patents.google.com/patent/US20030093275A1/en
- https://patents.google.com/patent/US7386453B2/en
- https://patents.google.com/patent/US20250362743A1/en

**Reframe implication:** no novelty claim should be based on source-preserving modified views, personalization, highlighting, or behavioral adaptation alone. Prior-art review must continue before any legal or competitive novelty statement.

### 105. Representation selection is not the same as representation effectiveness

The current scan shows substantial overlap at the capability level: extraction, simplification, formatting, TTS, synchronized source/modified views, profiles, highlighting, and behavioral personalization all have existing implementations or disclosures.

The unresolved empirical question remains narrower:

**Under what reader, task, content, and context conditions does switching to a particular source-faithful representation produce measurable benefit, and can a calibration procedure predict that benefit on unseen content?**

This is an effectiveness question, not a claim that the underlying mechanisms are new.

### 106. Privacy feasibility does not remove fidelity requirements

On-device transformation can reduce the need to send sensitive text to a remote service, but local execution does not guarantee semantic accuracy, accessibility, or appropriate transformation behavior.

**Updated rule:** privacy architecture and semantic validation are independent gates. A local model can still fail the research gate if it loses source facts, changes relationships, or does not improve the target task.


## Research cycle 2026-10-02 — Calibration, adults, multilingual readers, and representation effects

### 107. Preference is not a reliable proxy for comprehension

A 2025 study of undergraduates reading multimodal material found that performance judgments were imperfect in both print and digital conditions. After a digital-reading intervention, comprehension and reading duration improved, but calibration accuracy declined.

Source: https://www.sciencedirect.com/science/article/pii/S1041608025000020

A separate 2022 study of 150 eighth graders found that reading medium affected main-idea comprehension and calibration bias, with larger calibration bias on screen; calibration bias mediated some comprehension differences.

Source: https://www.sciencedirect.com/science/article/pii/S0360131522000914

**Reframe implication:** Reader Calibration must not optimize solely for "which representation feels clearest." Preference and confidence are separate signals from objective task performance and must be validated against held-out content.

### 108. Recent personalization evidence again separates fluency from comprehension

A 2025 study of children with dyslexia and typical readers compared standard and preference-customized typography. Customization slightly improved reading fluency but produced no comprehension improvement and no differential comprehension benefit for the dyslexia group.

Source: https://revistas.ucm.es/index.php/RLOG/en/article/view/101374

**Reframe implication:** presentation personalization may improve access/fluency without improving understanding. Reframe experiments should report these outcomes separately rather than using reading speed as a proxy for comprehension.

### 109. Typography remains context- and reader-dependent rather than universally corrective

A 2025 study of digital letter spacing in Hebrew found developmental differences: increased spacing improved comprehension in second graders but showed an opposite trend in third graders. Reading rate remained stable. The study also found more accurate comprehension monitoring under individually optimal spacing.

Source: https://www.mdpi.com/2227-7102/15/10/1306

**Reframe implication:** even a low-level presentation variable can interact with reader development and language/script. Typography should remain an adjustable representation parameter, not a universal intervention.

### 110. Adult assistive-technology evidence remains comparatively sparse

A 2024 systematic literature review specifically examined current assistive technology for adults with dyslexia and identified a research gap beyond the child-focused literature.

Source: https://research.jku.at/en/publications/words-unleashed-a-systematic-literature-review-study-on-the-use-o/

A 2025 study of adults with dyslexia found no significant reading-accuracy or efficiency differences among tested font types, despite differences in satisfaction and preference.

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC12779878/

**Reframe implication:** adult readers should be treated as a distinct evidence population. Child evidence cannot simply be assumed to generalize to adults.

### 111. Multilingual disability research identifies the exact gaps relevant to Reframe

A 2026 systematic review synthesized 28 studies of reading-comprehension interventions for multilingual learners with disabilities. The review found limited evidence, emphasized the need for linguistically accessible and responsive interventions, and noted that most research treats multilingual learners and disability separately.

Source: https://stars.library.ucf.edu/jele/vol19/iss1/1/

A 2025 systematic review of cross-linguistic syntactic awareness synthesized 23 studies and found evidence for a positive role of syntactic-awareness transfer in reading comprehension, while noting narrow language-pair coverage and a need for more longitudinal and experimental work and more adult participants.

Source: https://ejournal.ukm.my/gema/article/view/92100

A 2026 scoping review of second-language reading interventions likewise found the literature under-researched and dominated by English-reading contexts.

Source: https://journals.us.edu.pl/index.php/TAPSLA/article/view/18499

**Reframe implication:** multilingual support cannot be reduced to translation. Experiments should record language/script, vocabulary, syntax, morphology, and cross-language demands when relevant.

### 112. DLD evidence reinforces the need to vary question type and genre

A 2026 scoping review of 24 reading-comprehension intervention studies involving children with developmental language disorder found that most studies reported improvements, with all studies targeting vocabulary knowledge and morphological awareness reporting positive gains. The review also identified insufficient examination across genres and question types, limited multilingual representation, and substantial variation in dosage and measurement.

Source: https://pubmed.ncbi.nlm.nih.gov/41401742/

**Reframe implication:** the research instrument should not collapse comprehension into one score. Question type and genre should be explicit experimental factors.

### 113. Updated calibration model

The evidence now supports a stricter Reader Calibration model:

**preference/confidence signal → candidate representation → held-out task performance → prediction error → editable profile**

The system should preserve cases where:
- preference predicts performance;
- performance improves without preference;
- preference improves without performance;
- neither changes reliably;
- effects differ by task, language, content, or context.

A stable "reader type" should not be inferred unless repeated held-out evidence supports that level of generalization.

### 114. Research-gate expansion: population × language × task

Before implementation, validation plans should specify the intended population and language context. Evidence from children with dyslexia, adults with dyslexia, DLD, multilingual learners, and other populations should not be pooled into a single assumption about "reading difficulty."

**Updated research unit:**

**reader population × language/script × content × task demand × representation operation × outcome**

This is now the preferred unit for experimental planning.


## Research cycle 2026-10-02 — Reader control, alternate presentation, and adaptive selection

### 115. Reader-controlled presentation is not a new interaction concept

A 1988 experimental study explicitly investigated “reader-controlled computerized presentation of text,” including self-pacing and regression control in rapid serial visual presentation. The study found no comprehension or reading-speed difference attributable to the input method used to control presentation speed, while allowing reader control changed how participants adjusted speed.

Source: https://doi.org/10.1177/001872088803000408

**Reframe implication:** reader control should be treated as an established interaction principle, not a novelty claim. The research question is what the reader is controlling: Reframe is interested in switching among semantic/structural representations, not merely controlling presentation speed.

### 116. Separating structure from presentation is an established accessibility architecture principle

W3C Technique G140 describes separating information and structural encoding from presentation so that user agents and assistive technologies can generate alternate presentations while retaining semantic structure. It specifically describes meaningful transformations such as reordering sections or generating lists from structural information.

Source: https://www.w3.org/WAI/WCAG21/Techniques/general/G140.html

**Reframe implication:** the architecture should preserve semantic structure independently of rendering. Alternate representations should be derived from a structured intermediate rather than mutating the source presentation directly.

### 117. Adaptive reading benefit is context-dependent even in controlled simulation

A 2026 BEA paper proposed a theory-grounded simulated-learner framework for testing adaptive educational reading policies before classroom deployment. Across three sampled subject ontologies, adaptive reading produced a significant improvement in computer science, smaller inconclusive gains in inorganic chemistry, and neutral-to-slightly-negative results in general biology.

Source: https://aclanthology.org/2026.bea-1.63/

**Reframe implication:** adaptive selection should not be assumed to generalize across content domains. Held-out evaluation should include multiple content types and should be capable of detecting no-benefit or negative-benefit conditions.

### 118. Accessibility alternatives can become counterproductive when added information competes with the text

A 2025 study of symbolated texts for people with intellectual and developmental disabilities found significantly lower comprehension and slower reading with graphic symbols added to text compared with text alone.

Source: https://pubmed.ncbi.nlm.nih.gov/40168874/

**Reframe implication:** “more support” is not a monotonic design principle. Every added representation element needs a task-based benefit test and an interference/omission check.

### 119. Current personalization evidence supports an evidence loop rather than preference-only adaptation

A 2024 global meta-analysis found a positive aggregate effect for personalized/adaptive learning technologies in K–12 reading literacy (g = 0.29), while identifying multiple moderators. A separate 2026 adaptive-reading framework found domain-dependent results, and recent personalized typography work shows that preference-based customization can affect fluency without necessarily improving comprehension.

Sources:
- https://doi.org/10.1016/j.edurev.2023.100587
- https://aclanthology.org/2026.bea-1.63/
- https://doi.org/10.5209/rlog.101374

**Reframe implication:** the calibration loop should be explicit: preference signal → candidate representation → objective outcome on held-out material → update or reject the preference hypothesis. A preference that does not predict benefit should not be silently converted into an adaptive rule.

### 120. New research requirement: test representation switching itself

The literature establishes reader-controlled presentation and adaptive personalization separately, but does not establish that switching among source-faithful semantic representations improves comprehension for readers with reading/access difficulties.

**Research gap:** test whether switching among representations is beneficial compared with a fixed representation, while controlling content and task and measuring transition cost, source fidelity, and task performance.

### 121. New experimental variables: switching cost and representation persistence

A multi-view system introduces costs that single-view assistive tools do not necessarily expose. Experiments should measure:
- time to switch;
- number of switches;
- whether switching interrupts comprehension;
- whether readers return to the original source;
- whether a representation remains useful after switching;
- whether frequent switching reflects successful self-regulation or uncertainty/confusion.

These variables should be reported separately from comprehension accuracy.

## Updated research gate additions

Before production implementation, the research instrument should be able to test:
- fixed representation versus reader-controlled switching;
- preference prediction on held-out passages;
- switching cost;
- source recovery;
- semantic fidelity;
- negative effects from added visual/semantic elements;
- domain/content dependence of adaptive selection.

## Research cycle 2026-10-02 — Representation switching, multimodal cues, and source navigation

### 122. Switching between text and diagrams can carry a comprehension cost

Research on multi-text, multimodal reading found that navigation patterns matter: some text-to-diagram switches were negatively associated with higher-level comprehension strategies and performance, with authors suggesting that some switches may indicate confusion rather than productive integration.

Source: https://doi.org/10.1016/j.learninstruc.2020.101401

**Reframe implication:** representation switching should not be measured only by whether readers switch. The system must distinguish productive switching from recovery/confusion switching. A switch event is an interaction signal, not evidence of successful adaptation.

### 123. Preference and observed performance can diverge in multimodal support

A 2026 study of multilingual students with developmental disabilities using metacognitive and multimodal cueing reported higher accuracy with digital anaphoric cueing than paper-based cueing, while students preferred the paper condition. This is direct evidence that preference and measured performance can point in different directions.

Source: https://doi.org/10.1177/00224669251393231

**Reframe implication:** Reader Calibration must record preference separately from objective outcome. The adaptive layer should be allowed to recommend a representation the reader did not initially prefer, while preserving explicit override.

### 124. Automatic text adaptation still benefits from reader-in-the-loop iteration

A 2025 exploratory TextAD study tested lexical, syntactic, and discourse adaptations with 27 students with intellectual disability over three iterative rounds. Overall comprehension gains were not significant, although later lexical and syntactic adaptations showed promising results and substantial heterogeneity.

Source: https://pubmed.ncbi.nlm.nih.gov/40749139/

**Reframe implication:** adaptation should be experimentally decomposed by operation. “Simplification” is too coarse a variable for deciding what helped.

### 125. Easy-to-read formatting has measurable effects outside diagnosed populations

A 2026 eye-tracking study of 24 university students without cognitive disabilities found higher comprehension in Easy-to-Read formatting than in a hard-to-read condition, along with some eye-movement patterns compatible with reduced processing demand.

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC13296324/

**Reframe implication:** representation effects should not automatically be restricted to diagnosed populations. However, this does not establish that the same formatting benefits readers with disabilities or that it generalizes across tasks.

### 126. Visual representation evidence remains population- and intervention-dependent

A 2025 meta-analysis of pictorial/graphic representations for K–12 students with autism synthesized only five single-case experimental studies. It reported an overall positive Tau-U estimate but substantial variation across modalities and instructional contexts.

Source: https://doi.org/10.1007/s10803-025-07014-4

**Reframe implication:** the evidence supports testing carefully selected visual representations, but not treating “visual support” as a single intervention class.

### 127. Alternate text is established instructional practice, but differs from automatic representation

Research on alternate texts for adolescents with learning disabilities describes readability-controlled alternate texts as a way to support access to content-area curriculum.

Source: https://doi.org/10.1177/1053451213480031

**Reframe implication:** alternate-text accessibility has prior art. Reframe's research question remains whether multiple source-traceable representations can provide task-specific access while retaining the original source and measuring semantic cost.

### Updated research gate

The first research instrument should also capture representation-switch events and classify them where possible as:
- productive task support;
- source verification;
- uncertainty/recovery;
- repeated cycling;
- abandonment of the representation.

This should be analyzed alongside comprehension, time, and semantic fidelity rather than treated as a simple engagement metric.


## Research cycle 2026-10-02 — Setup and app-surface research

### 128. Accessible reading applications already establish a broad baseline for the reading surface

The DAISY Reading Apps User Requirements, formally published in 2025, contains more than 120 requirements across 11 themes including navigation, screen-reader support, read aloud, visual adjustments, bookmarking, highlighting, notes, answer entry, and library management. The requirements were developed with people with print disabilities, accessibility experts, developers, and other stakeholders.

Sources:
- https://daisy.org/activities/standards/reading-apps-user-requirements/
- https://daisy.org/news-events/articles/reading-apps-user-requirements-published/

**Reframe implication:** these capabilities should be treated as accessibility baseline requirements. Reframe should not use basic TTS, visual customization, navigation, or bookmarking as its central differentiation.

### 129. Reader needs are contextual rather than one fixed accessibility configuration

DAISY user stories describe readers changing presentation and interaction according to content and task. Examples include changing font size and spacing, switching between visual reading and read aloud, using cleaner views, and requiring different navigation levels.

Source: https://daisy.org/activities/standards/reading-apps-user-requirements/user-stories/

**Reframe implication:** setup should not produce a single permanent accessibility mode. Preferences should remain editable and may be conditional on task, content, language, or context.

### 130. Setup should establish control before personalization

Existing accessible reading systems expose many controls, while research on calibration shows that preference and objective performance can diverge. A long questionnaire risks collecting self-description that does not predict task benefit.

**Reframe implication:** the first-run flow should establish what Reframe does, provide basic presentation controls, then use a small controlled representation calibration with the same content/task across conditions. Setup should be skippable and revisitable.

### 131. The reader screen should be the product center of gravity

Current accessible reading systems such as EasyReader and Kibo organize their experience around opening content, reading, navigation, audio, and adjustable presentation rather than an AI-centric dashboard.

Sources:
- https://daisy.org/info-help/guidance-training/reading-systems/easyreader-for-ios-and-android-getting-started-guide/
- https://daisy.org/guidance/info-help/guidance-training/reading-systems/kibo-app-overview/

**Reframe implication:** Reframe should use a small home surface and make the reader the primary screen. Representation controls should appear in context instead of forcing the reader into a separate assistant workflow.

### 132. Interface adaptation needs reading-position recovery

A 2025 CHI mobile-reading study designed an iOS reading application with explicit recovery cues because readers can lose their reading position after interface adaptations. The study used a reading ruler and a cue marking the text being read before adaptation.

Source: https://doi.org/10.1145/3706598.3713367

**Reframe implication:** switching representations must preserve or visibly recover reading position. Representation switching should be treated as a state transition with a navigation cost, not just a button click.

### 133. Current provisional setup and screen architecture

Based on the evidence and prior Reframe research, the provisional first-run flow is:

**Welcome → basic presentation preferences → representation calibration → second task → editable preferences → Home → Reader**

The provisional normal-use surface is:

**Home → Reader → Reframe sheet → representation → Source recovery**

Settings/profile remains secondary.

The setup should not ask readers to identify as dyslexic, ADHD, autistic, visual learners, or any other fixed category. The product should learn conditional evidence about representations and tasks instead.

**Status:** UX hypothesis; requires usability testing before implementation.

## Research gate addition: setup and UI

Before production implementation, research should establish:

- whether setup can remain short without losing useful calibration information;
- whether the same-content/same-task comparison is understandable to readers;
- whether one-at-a-time or side-by-side comparison reduces bias and interaction burden;
- whether readers understand the difference between Original and a transformed representation;
- whether source recovery is discoverable;
- whether switching preserves reading position;
- whether the proposed small representation sheet is accessible with screen readers and large text;
- whether the first research instrument should include automatic recommendations at all.


## Research cycle 2026-10-02 — Calibration presentation, comparison order, and interaction cost

### 134. Preference should not determine calibration validity

Research comparing reading media repeatedly finds that readers can prefer one presentation while performing better with another. Studies of both adults and school-age readers have found preference-performance mismatches.

Sources:
- https://doi.org/10.1080/00220973.2016.1143794
- https://doi.org/10.1016/j.compedu.2018.08.001

**Reframe implication:** calibration cannot be a preference picker. Each candidate representation needs an objective task measure whenever it is intended to affect comprehension or information retrieval.

### 135. Confidence is useful, but it is not a substitute for performance

Recent multimodal-reading research found comprehension can improve while calibration accuracy worsens. Calibration research defines the construct as the relationship between predicted and actual performance.

Sources:
- https://doi.org/10.1016/j.lindif.2025.102627
- https://pubmed.ncbi.nlm.nih.gov/9769183/

**Reframe implication:** confidence should be collected as a separate metacognitive signal. High confidence must never be treated as evidence that a representation worked.

### 136. Counterbalancing is required when comparing representations

Controlled reading research uses counterbalanced presentation or text-version order to reduce familiarity and carryover effects. Recent AI-adapted reading research also uses parallel forms and counterbalanced original/adapted order.

Source:
- https://www.frontiersin.org/journals/education/articles/10.3389/feduc.2026.1737903/full

**Reframe implication:** calibration should not always run Original → Focus → Structure → 5W+H → Listen. Representation order should be randomized or counterbalanced, with practical constraints for audio and learning effects.

### 137. One-at-a-time and side-by-side are different experiments

Side-by-side comparison allows direct visual comparison but adds simultaneous display density and source-comparison effects. One-at-a-time reduces simultaneous competition but increases memory and switching demands.

Sources:
- https://doi.org/10.1016/j.learninstruc.2020.101396
- https://doi.org/10.1145/3706598.3713879
- https://doi.org/10.1145/3706598.3713367

**Reframe implication:** the first calibration instrument should use one-at-a-time presentation as the primary controlled condition. A separate usability experiment should compare it with side-by-side presentation.

### 138. Calibration should use matched parallel passages

Repeating exactly the same passage across many representations can teach the answer rather than reveal a representation effect. Completely different passages confound representation with content.

**Reframe implication:** use matched parallel passages and equivalent task structures for later calibration rounds. A single repeated passage may be used only for the initial demonstration.

### 139. Demonstration and measurement should be separate

A strong setup flow should contain:

1. Demonstration: one short passage explaining what Reframe does.
2. Calibration round: unseen passage/task with controlled representation comparisons.
3. Second calibration round: different passage/task to test stability.
4. Preference/performance review: explain that preferences are editable and conditional.

**Reframe implication:** the welcome demonstration should not become the evidence used to build the reader profile.

### 140. Interaction cost belongs in representation benefit

Mobile and hybrid-display research shows that a representation can improve legibility while switching or compensatory behavior removes the practical benefit.

Sources:
- https://doi.org/10.1145/3706598.3713879
- https://doi.org/10.1145/3706598.3713367

**Reframe implication:** evaluate net representation benefit using task outcome together with relevant interaction cost rather than optimizing accuracy alone.

### Updated setup hypothesis

**Explain → Demonstrate → Calibrate on unseen content → Test a second task/content condition → Save conditional evidence → Start reading**

Minimum calibration data:
- representation condition;
- task type;
- content identifier;
- objective accuracy;
- response time where meaningful;
- rereading/navigation events;
- preference;
- perceived difficulty;
- confidence;
- source-recovery actions;
- switching events.

### Updated research gate: calibration

Before production implementation, establish:
- whether one-at-a-time comparison is usable;
- whether side-by-side introduces display-density or source-comparison confounds;
- how many unseen passages are needed for stable prediction;
- whether preference predicts later performance;
- whether performance benefit persists on held-out content;
- whether switching cost changes net benefit;
- whether audio requires a separate calibration protocol;
- whether calibration remains accessible with large text and screen readers.


### 148. Transformed reading must preserve assistive-technology text navigation

Apple's current reading-app guidance treats long-form reading as a distinct accessibility problem. VoiceOver and Speak Screen require granular line/word/character navigation, continuous reading across pages, and usable text selection. Custom-rendered or scanned text needs explicit text-input/accessibility support rather than only visual accessibility.

Source: Apple Developer, WWDC26 “Enhance the accessibility of your reading app.”

**Reframe implication:** every transformed representation must retain an accessible semantic text path. A visually successful representation that breaks VoiceOver navigation is not a successful representation.

### 149. Representation changes must not unexpectedly reset reading position

Apple's VoiceOver evaluation criteria explicitly calls out preserving reading position when content reloads or refreshes. Current reading-app guidance also provides mechanisms for continuous reading across paginated content.

**Reframe implication:** switching Original → Structure → Original must preserve or explicitly restore the reader's semantic position. Representation switching should be reversible without forcing the reader to rediscover location.

### 150. Source recovery should be an accessibility operation, not only a visual control

Accessible reading systems need logical navigation order and meaningful grouping, while screen-reader users may encounter elements non-linearly.

**Reframe implication:** “show source” cannot depend on a visually obvious button or spatial relationship. The source-recovery action, transformed claim, and corresponding source location must all be discoverable through the accessibility tree.

### 151. Semantic transformation should be evaluated with answerability, not readability alone

Human evaluation of automatic simplification found that even the best-performing tested system left at least 14% of evaluated questions unanswerable from its simplified output.

**Reframe implication:** Reframe should distinguish:
- easier to read;
- task performance;
- source-supported;
- omitted;
- inferred;
- unexplained.

A transformation that improves readability while making a source fact unavailable is not automatically beneficial.

### 152. Large-scale simplification evidence strengthens the case for controlled semantic experiments

Google Research reports a randomized study of roughly 50,000 multiple-choice responses in which participants reading a minimally-lossy simplified version showed a roughly 4% absolute comprehension improvement and lower perceived cognitive load. The result persisted whether participants could refer back to the text.

**Reframe implication:** semantic simplification is now supported by stronger experimental evidence than many presentation interventions, but this evidence concerns simplification specifically. It should not be generalized to all semantic representations.

### 153. Reframe needs a transformation ledger

The research now supports recording the relationship between every transformed element and its source status.

Minimum state:
- source span;
- operation;
- representation;
- status: STATED / INFERRED / UNKNOWN / CONFLICTING;
- recoverable source location;
- whether content was omitted;
- whether wording was changed;
- confidence/evidence metadata where appropriate.

**Reframe implication:** this ledger becomes a validation artifact before it becomes an implementation detail.

### Research gate addition: accessible transformation

Before production implementation, establish:
- continuous VoiceOver/Speak Screen navigation through transformed content;
- preserved semantic reading position across representation switches;
- accessible source recovery;
- answerability testing for transformed claims;
- explicit handling of omitted and inferred information;
- transformation-level traceability back to source.


### 154. Fidelity evaluation should test source-derived answerability

The 2024 TACL human-evaluation framework evaluates simplified text by asking readers questions whose answers depend on information in the original text. It found that even the best tested supervised simplification system left at least 14% of questions unanswerable from its output.

Source: https://aclanthology.org/2024.tacl-1.24/

**Reframe implication:** every semantic representation that changes wording, ordering, or inclusion should be evaluated against source-derived questions, not only readability metrics or model similarity scores.

### 155. Semantic simplification evidence is becoming more task-specific

A 2026 scoping review of automated text simplification for patient education materials identified recurring concerns around linguistic quality, content fidelity, and actual understandability by readers. The evidence base spans multiple technologies and study designs rather than establishing one generally effective simplification method.

Source: https://www.jmir.org/2026/1/e88365/

**Reframe implication:** “simplification” should remain an operation with a defined target population, content domain, and task—not a universal accessibility transformation.

### 156. Clinical simplification demonstrates why omission severity matters

A 2026 blinded study comparing AI- and human-simplified orthopaedic patient education materials evaluated hallucinations, omissions, and inconsistencies against originals rather than treating lower reading level as sufficient evidence of quality.

Source: https://pubmed.ncbi.nlm.nih.gov/41747019/

**Reframe implication:** Reframe's fidelity checks should classify errors by consequence, especially omitted constraints, changed facts, unsupported additions, and misleading rewording.

### 157. Screen-reader failures often arise from interaction structure, not visual appearance

A 2026 CHI study of mobile screen-reader accessibility identified navigation problems including unfocusable elements, unnatural navigation order, navigation loops, complex operations, and dynamic content changes. The study combined systematic review with user-experience investigation.

Source: https://doi.org/10.1145/3772318.3791293

**Reframe implication:** the Reframe sheet, representation selector, transformed reader, and source-recovery controls must be tested as a screen-reader interaction sequence, not merely checked for labels.

### 158. Custom rendering is a particular accessibility risk

The same CHI research identifies custom-rendered views and WebViews as potential sources of screen-reader navigation problems.

**Reframe implication:** a native semantic accessibility tree should be treated as a first-class rendering requirement. Avoid making the transformed reading surface an opaque visual canvas.

### 159. The transformation ledger should support error severity

The current STATED / INFERRED / UNKNOWN / CONFLICTING state model is useful but insufficient for validation if all failures are treated equally.

**Reframe implication:** add an error-impact dimension:
- harmless presentation change;
- recoverable omission;
- task-relevant omission;
- factual alteration;
- unsupported inference;
- accessibility/navigation failure.

### Research gate addition: fidelity and accessibility failure taxonomy

Before production implementation, establish:
- source-derived answerability tests for semantic transformations;
- omission/addition/error severity categories;
- screen-reader navigation tests across the complete interaction sequence;
- no navigation loops or inaccessible dynamic changes;
- native semantic accessibility for transformed content;
- preservation of source recovery and reading position under assistive technology.


### 160. Structure exposure and structure construction are different interventions

Meta-analyses of text-structure research consistently find benefits from explicit instruction, but the interventions often require active construction, such as creating graphic organizers or practicing rule-based summarization. Immediate comprehension effects are stronger and more consistent than delayed or far-transfer effects.

Sources:
- https://ila.onlinelibrary.wiley.com/doi/10.1002/rrq.311
- https://eric.ed.gov/?id=EJ1105625
- https://doi.org/10.1177/0731948720906490

**Reframe implication:** automatically displaying a structure is not equivalent to teaching the reader to recognize or construct that structure. Reframe should not claim instructional transfer from a passive representation.

### 161. Representation benefit depends on the outcome being measured

The upper-elementary meta-analysis found different effect sizes for comprehension questions, summarization, recall, and knowledge about text structure. Effects also changed by intervention features.

**Reframe implication:** calibration should define the task before selecting the outcome. “Comprehension” should not be treated as a single interchangeable metric.

### 162. Far transfer is a separate research question

Text-structure interventions show small or inconsistent far-transfer effects compared with stronger immediate/proximal effects.

**Reframe implication:** a reader successfully answering questions with Reframe's Structure view does not establish that the reader's general reading comprehension improved. Product claims and experiments must distinguish immediate task assistance from durable skill transfer.

### 163. Reader support can improve task performance without teaching the underlying skill

The literature supports instructional strategies such as graphic/semantic organizers, question answering, question generation, story structure, and summarization, but these often involve active learning or guided practice.

Source: https://www.nichd.nih.gov/publications/pubs/nrp/Pages/findings.aspx

**Reframe implication:** Reframe should initially position semantic representations as accessibility/task-support mechanisms, not as substitutes for reading instruction.

### 164. Self-assessment and metacomprehension are distinct from objective comprehension

Research on situation-model interventions indicates that self-explanation can affect metacomprehension accuracy, but metacomprehension itself remains a distinct outcome from actual comprehension.

Source: https://link.springer.com/article/10.1007/s10648-020-09558-6

**Reframe implication:** preference, confidence, perceived clarity, metacomprehension, and objective task performance should remain separate fields in calibration data.

### 165. The first research instrument should avoid teaching effects during calibration

If the calibration task repeatedly asks readers to construct or practice the same text structures, later performance may reflect learning the task rather than discovering a representation preference or benefit.

**Reframe implication:** calibration should use brief, controlled exposure to representations, matched unseen passages, and minimal repeated instruction. Any instructional training condition should be a separate experiment.

### Research gate addition: support vs instruction

Before production implementation, establish:
- whether passive representations produce immediate task benefits;
- whether active construction produces different effects;
- whether any observed benefit persists on delayed or transfer tasks;
- whether calibration itself teaches the reader the tested structure;
- whether Reframe's claims remain limited to accessibility/task support unless instructional effects are independently demonstrated.


### 166. Concept maps are promising but introduce a measurable time trade-off

A 2025 ACL study evaluated an LLM-generated concept-mapping system across ten academic disciplines. In a small user evaluation (n=14), participants reported lower perceived cognitive load and completed comprehension assessments faster with concept maps at comparable accuracy, but spent more time interacting with the visualization.

Source: https://aclanthology.org/2025.bea-1.58/

**Reframe implication:** structural representations should measure both comprehension outcome and interaction time. A representation that reduces cognitive load but substantially increases navigation time may have a different net benefit depending on task.

### 167. Concept-map generation quality depends on processing granularity

The same study found section-level processing had higher concept-extraction precision while paragraph-level processing had higher recall.

**Reframe implication:** semantic representations should not assume one universal extraction granularity. The transformation pipeline may need to preserve section/paragraph boundaries and expose uncertainty where extraction is incomplete.

### 168. Inference is a distinct comprehension bottleneck for some autistic readers

A 2025 eye-tracking study found autistic children had greater difficulty with discourse requiring bridging inferences and that lack of coherence reduced comprehension efficiency.

Source: https://www.sciencedirect.com/science/article/pii/S3050656525001932

**Reframe implication:** representations that expose explicit relationships may be useful research candidates for inference-heavy tasks, but the evidence does not establish that automatically adding inferred relationships improves comprehension. Inference-support views must clearly distinguish source statements from derived relationships.

### 169. Automatic adaptation studies support explicit-vs-inferred question separation

A study of automatic text adaptation for students with intellectual disability used both explicit-information and inference questions, allowing the researchers to distinguish effects on information that was directly stated from effects requiring inference.

Source: https://doi.org/10.1080/17483107.2025.2536701

**Reframe implication:** calibration tasks should deliberately include both literal retrieval and inference conditions. A representation can improve one while harming or failing to affect the other.

### 170. Visual additions can invalidate comprehension measurement

The same automatic-adaptation study deliberately removed pictures because images could reveal answers or shift the task from reading to visual interpretation, increasing cognitive load and reducing measurement validity.

Source: https://doi.org/10.1080/17483107.2025.2536701

**Reframe implication:** calibration passages should control non-textual cues. If a representation adds diagrams/icons, the experiment must determine whether the participant solved the intended reading task or used an alternative visual cue.

### 171. Strong simplification evidence does not generalize to semantic representations

A large randomized study of 4,563 participants across 31 texts found a 3.9 percentage-point absolute comprehension improvement from minimally-lossy simplification, with effects varying substantially by subject area.

Source: https://arxiv.org/abs/2505.01980

**Reframe implication:** simplification is now a particularly strong candidate for direct testing, but its evidence should not be transferred to Structure, Timeline, 5W+H, Comparison, or other representations without separate experiments.

### 172. Visual accessibility and semantic simplification should remain independently testable

A 2026 dyslexia-focused preprint proposes separating fidelity safety from rendered visual accessibility and reports bilingual evaluation across English and Chinese materials.

Source: https://arxiv.org/abs/2608.13583

**Reframe implication:** Reframe should preserve the separation between semantic transformation quality and presentation accessibility. A visual improvement should be measurable without requiring a semantic rewrite, and vice versa.

### Research gate addition: representation-specific experiments

Before production implementation, establish:
- whether structural views improve literal retrieval;
- whether they improve inference tasks;
- whether interaction time offsets comprehension gains;
- whether visual additions introduce alternate-answer cues;
- whether extraction granularity affects representation quality;
- whether simplification and structural reorganization produce different benefit/fidelity profiles;
- whether semantic and visual transformations can be independently evaluated.


### 173. Multilingual representation effects cannot be reduced to translation

A 2025 Applied Psycholinguistics study of 1,073 adults found that L1 writing-script type (alphabetic, logographic, or alphasyllabic) was associated with differences in English word-reading speed and accuracy beyond L2 usage.

Source: https://www.cambridge.org/core/journals/applied-psycholinguistics/article/how-does-ones-first-language-writing-script-modulate-second-language-reading-evidence-from-the-english-reading-online-project-enro/0232AF1AAB66C4D2C5ECE29862A7A38D

**Reframe implication:** multilingual representation support must model language and script, not merely translated text. Reading profiles should not silently transfer across scripts.

### 174. Reading comprehension can differ across languages even within multilingual learners

A 2025 study of 199 multilingual children found different comprehension performance across Spanish, Basque, and English, with language exposure and individual factors contributing to differences.

Source: https://doi.org/10.1016/j.system.2025.103665

**Reframe implication:** conditional profiles should include language context. “Reader preference” without language context is insufficient evidence for adaptive selection.

### 175. Text-to-picture switching has language-dependent processing costs

Research comparing English and Chinese L1/L2 readers found increased comprehension time for several groups in the text-to-picture switch condition, while Chinese L1 readers did not show the same disruption.

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC12696150/

**Reframe implication:** switching cost should be measured separately by language/script rather than assumed to be universal.

### 176. Multimodal literacy interventions can expose vocabulary and sequence bottlenecks

A 2026 study of multilingual sixth-grade learners using multimodal science texts reported limited-to-moderate improvement for two of three participants and identified discipline-specific vocabulary and sequence interpretation as recurring challenges.

Source: https://doi.org/10.1080/19388071.2025.2557801

**Reframe implication:** task decomposition should include vocabulary burden and sequence interpretation as separate demands. A Structure or Timeline view should not be evaluated as a generic comprehension intervention.

### 177. Executive-function demands may differ for bilingual readers

A 2025 study of third-grade bilingual and monolingual children found executive functions contributed more strongly to reading comprehension among bilingual children, while the groups did not differ in executive-function performance overall.

Source: https://doi.org/10.1016/j.jecp.2025.106333

**Reframe implication:** differences in representation benefit should not be interpreted as evidence of a reader deficit. Task demand and language context may change which support is useful.

### 178. Cross-language eye-tracking resources make language-specific experiments more feasible

Wave 2 of the Multilingual Eye-Movement Corpus added N=654 readers across 13 languages, 16 laboratories, and 15 countries, expanding data for studying online reading processes across languages.

Source: https://www.nature.com/articles/s41597-025-05453-3

**Reframe implication:** multilingual evaluation can use language-specific processing measures rather than assuming English-derived reading behavior generalizes.

### 179. AAC users introduce an additional accessibility population with different literacy constraints

A 2025 review of literacy for people who need or use AAC reports significant barriers when literacy instruction depends on spoken responses and notes limited evidence about which instructional approaches work best for whom.

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC13122432/

**Reframe implication:** Reframe should not assume spoken interaction, speech output, or conventional input as prerequisites for calibration. Accessibility of the calibration task itself must include non-speech interaction paths.

### Research gate addition: multilingual and alternative-access reading

Before production implementation, establish:
- language/script-specific representation effects;
- whether profiles transfer across languages;
- language-specific switching cost;
- vocabulary and sequence-demand conditions;
- non-speech calibration and interaction paths;
- whether representation benefit differs because of task demand rather than reader diagnosis.


### 180. Representation effects can reverse by reader group

A 2026 study of 166 third- and fourth-grade students compared the same informational content presented in descriptive versus narrative structure. Overall comprehension did not differ significantly, but low-achieving readers improved with the narrative structure while typical readers performed better with the original informational structure.

Source: https://link.springer.com/article/10.1007/s11145-026-10791-8

**Reframe implication:** the same semantic content can produce different outcomes depending on reader characteristics. Adaptive representation should therefore remain conditional and evidence-based rather than applying one universally “easier” structure.

### 181. Ambiguous visualizations can distort rather than clarify

A 2025 Reading Research Quarterly study with 120 university students found that participants often ignored or distorted an ambiguous graph when interpreting an accompanying informational text, and their reproductions of the graph were biased toward the text's argument.

Source: https://doi.org/10.1002/rrq.70043

**Reframe implication:** generated diagrams must be tested for interpretability and ambiguity. A visual representation that appears to externalize structure can introduce a competing or misleading interpretation.

### 182. Representation proficiency may matter independently of reading proficiency

Recent work on multimodal comprehension continues to show that successful text–visual integration requires learning how representations relate, not merely presenting both together.

**Reframe implication:** Reframe should not assume that a reader who benefits from one representation automatically understands another representation's conventions. Calibration needs a short explanation/demonstration, while measurement should test transfer to unseen content without repeatedly teaching the representation.

### 183. Visual support should be proficiency-sensitive

2026 research on Chinese L2 reading reports that illustration type and proficiency interact, with segmented and concrete representations more suitable for lower proficiency readers and more integrated/abstract representations becoming useful at higher proficiency.

Source: https://www.frontiersin.org/journals/psychology/articles/10.3389/fpsyg.2026.1770079/full

**Reframe implication:** representation complexity should be treated as a variable. “Timeline” or “diagram” is not one fixed intervention; density, abstraction, segmentation, and relation explicitness can change its effect.

### 184. Personalized technology can improve reading outcomes, but this is not evidence for automatic semantic selection

A 2025 randomized study of 473 intermediate EFL learners found improved comprehension progress, engagement, and reduced reading anxiety with personalized technology-enhanced learning that included automated individualized feedback.

Source: https://doi.org/10.1016/j.chbr.2025.100817

**Reframe implication:** personalization has evidence as a broad learning approach, but Reframe still needs direct evidence that its representation-selection mechanism predicts and improves performance on held-out reading tasks.

### 185. TTS effects remain population-dependent

A 2026 eye-tracking study of junior-high students with dyslexia, ADHD-related reading difficulties, and typical development found that TTS affected groups differently, reinforcing that audio should not be treated as a universally beneficial accessibility mode.

Source: https://doi.org/10.1007/s11145-025-10738-5

**Reframe implication:** audio requires its own representation/calibration protocol. The reader's response to TTS should be measured by fluency, comprehension, interaction burden, and preference separately.

### 186. Evidence increasingly supports separating visual, semantic, and interaction variables

Across the current evidence, typography/spacing, semantic simplification, structural reorganization, diagrams, TTS, and representation switching have different mechanisms and different outcome profiles.

**Reframe implication:** the first research instrument should manipulate one representation operation at a time whenever possible. Combining typography + simplification + diagram + TTS would make a positive or negative result uninterpretable.

### Research gate addition: causal isolation

Before production implementation, establish:
- whether each representation operation has an independently measurable effect;
- whether reader-group differences interact with representation;
- whether representation complexity changes the effect;
- whether ambiguous visuals introduce interpretation errors;
- whether personalization improves held-out task outcomes rather than only preference;
- whether TTS benefits are population/task dependent;
- whether combined transformations can be evaluated only after their component effects are understood.


## Research cycle 2026-10-03 — Calibration, adaptation, and representation safety

### 187. Perceived ease can move in the opposite direction from measured comprehension

The 2026 publication of the TextAD study tested automatic lexical, syntactic, and discourse adaptations with 27 students with intellectual disability across three iterative groups. In later iterations, some comprehension measures favored adapted texts, while ratings of perceived difficulty, self-assessed comprehension, and interest did not consistently favor the version with better measured performance. The authors explicitly report substantial heterogeneity across participants.

Source: https://doi.org/10.1080/17483107.2025.2536701

**Reframe implication:** calibration must retain subjective preference/perceived clarity as a separate signal from objective task performance. A representation should not be promoted merely because readers report that it feels easier.

### 188. Automatic adaptation effects can be task- and proficiency-specific

A 2026 Frontiers study compared original and AI-adapted versions of the same source texts for inference-making and specific-information tasks in 48 university EFL learners. Text order was counterbalanced with parallel test forms. Intermediate-low learners performed better on adapted texts, while advanced-low learners showed comparable performance across versions, producing a significant interaction between text version and proficiency.

Source: https://doi.org/10.3389/feduc.2026.1737903

**Reframe implication:** representation selection should condition on task demand and reader/context evidence. A transformation that helps inference or information location for one population should not be assumed to help every reader or task.

### 189. Semantic support should be evaluated at the operation level

The TextAD study iterated through lexical substitution, syntactic adaptation, discourse-level changes, summaries, bullet lists, and explained keywords. Results did not support treating all adaptations as one intervention: lexical and syntactic changes showed promising effects in later rounds, while discourse-level adaptations and word definitions were less clear.

Source: https://doi.org/10.1080/17483107.2025.2536701

**Reframe implication:** Reframe experiments should isolate operations before combining them. “Simplification” is too coarse a treatment label; each transformation should have its own fidelity and task-benefit measurement.

### 190. Visual scaffolding can create coordination cost even when users request it

A 2026 conference paper on AI-driven reading scaffolds compared unmodified text, sentence segmentation, segmentation plus pictograms, and segmentation plus pictograms and keyword labels in a small within-subject pilot with 14 primary-school learners with special educational needs and disabilities. Responses were heterogeneous: some learners showed patterns consistent with benefits from segmentation/pictograms, while others showed patterns consistent with increased coordination costs.

Source: https://doi.org/10.1007/978-3-032-29760-0_52

**Reframe implication:** representation complexity must be measured as an independent variable. Calibration should test whether an added visual layer improves the target task after accounting for coordination/navigation burden.

### 191. Source fidelity needs an explicit recoverability test, not only a quality score

Recent adaptation research reinforces that semantic transformation can alter what is available to the reader. The TextAD study showed that adaptation outcomes varied by operation and that some concepts remained difficult despite changes to wording and structure. Separately, Reframe's prior fidelity research established that readability and semantic preservation cannot be treated as interchangeable.

Source: https://doi.org/10.1080/17483107.2025.2536701

**Reframe implication:** every semantic transformation experiment should include a source-recovery condition: when a reader encounters uncertainty or disagreement, can the reader locate the original supporting span and determine whether the transformed view omitted, altered, or inferred information?

### 192. Calibration should test disagreement between preference and performance explicitly

The combination of automatic-adaptation and digital-reading calibration evidence indicates at least four meaningful states:
- preferred and objectively beneficial;
- preferred but not objectively beneficial;
- not preferred but objectively beneficial;
- neither preferred nor beneficial.

The 2026 TextAD results provide a direct example of perception/performance divergence, while prior digital-reading research also shows that self-assessment and actual comprehension can diverge.

Sources:
- https://doi.org/10.1080/17483107.2025.2536701
- https://doi.org/10.1016/j.lindif.2025.102627

**Reframe implication:** the calibration model should preserve disagreement instead of forcing a single “best mode.” Prediction error is itself useful evidence for deciding whether an adaptive selector is trustworthy.

### 193. Demonstration and measurement need different success criteria

Recent adaptation experiments use controlled comparisons of original and adapted texts, while the broader intervention literature distinguishes supported performance from independent transfer. This supports separating the onboarding demonstration phase from the measurement phase.

**Reframe implication:** demonstration should establish what each representation does and how to interact with it. Measurement should then use unseen but matched content, minimal additional instruction, controlled task demands, and objective outcomes. If performance changes during measurement, the experiment should be able to distinguish representation benefit from learning the representation itself.

### Research gate addition: calibration validity and recoverability

Before production implementation, establish:
- preference/perceived clarity and objective performance are stored separately;
- task and proficiency/context are explicit conditioning variables;
- individual representation operations are tested before combinations;
- representation complexity and coordination cost are measured;
- preference-performance disagreement is preserved rather than collapsed;
- semantic transformations have source-recovery tests;
- demonstration is separated from measurement;
- matched unseen content and counterbalanced order are used where practical.


## Research cycle 2026-10-03 — Fidelity, support layers, and adult evidence

### 194. Recent GenAI adaptation research separates passage simplification from support-layer adaptation

A 2026 study of 135 adult EAP learners compared original, unified-AI, and proficiency-differentiated AI materials. The differentiated materials did not primarily differ through large changes in passage-level structural complexity; the meaningful differences were often in functional support such as glosses, sentence unpacking, rhetorical cues, claim–evidence notes, and critical prompts. The study also included explicit academic-fidelity checking for terminology, stance, evidence relations, and unsupported additions.

Source: https://doi.org/10.3389/fpsyg.2026.1887565

**Reframe implication:** semantic support should not be modeled as simply “making text easier.” Reframe should distinguish changes to the source wording from support layers that help a reader work with the unchanged source.

### 195. Support can be proficiency-sensitive without requiring wholesale rewriting

The same 2026 EAP study found heterogeneous effects across proficiency groups, with differentiated support showing different magnitudes of benefit relative to a unified AI-adapted condition. Its strongest differences were associated with functional support rather than simple passage-complexity reduction.

Source: https://pubmed.ncbi.nlm.nih.gov/42661697/

**Reframe implication:** the representation selector should be able to choose a support operation without necessarily rewriting the source. This strengthens the case for a reversible layer architecture: source remains intact while structure, glosses, cues, or other views are added around it.

### 196. Academic fidelity must include discourse function, not only factual correctness

The 2026 EAP adaptation study treated academic fidelity as preservation of disciplinary meaning, terminology, stance, hedging, claim–evidence relations, and genre function. This is broader than checking whether individual facts survived rewriting.

Source: https://doi.org/10.3389/fpsyg.2026.1887565

**Reframe implication:** Reframe's fidelity ledger should eventually include qualifiers, uncertainty, negation, evidence relationships, and discourse function where those properties matter to the task. A transformed view can be factually accurate sentence-by-sentence and still distort the author's argument.

### 197. Visual additions continue to show a non-monotonic accessibility pattern

A 2025 meta-analysis of visualization added to easy-to-read text for people with reading difficulties found no reliable overall comprehension benefit. Included studies involved adults with aphasia, intellectual disabilities, and adults with low literacy learning English; methodological quality was frequently questionable and visualization choices were highly heterogeneous.

Source: https://doi.org/10.1080/17489539.2025.2551910

A separate 2025 controlled study of symbolated text found significantly lower comprehension and slower reading when graphic symbols were paired with text for people with intellectual/developmental disabilities.

Source: https://doi.org/10.1016/j.ridd.2025.104998

**Reframe implication:** “visual support” cannot remain a single positive intervention category. Every added visual layer should have a defined target task and a measured coordination/interpretation cost.

### 198. Evidence-chain representation is relevant to source traceability

A 2026 ACL paper on document understanding introduced a retrieval approach that represents both physical document adjacency and semantic relevance as a graph, constructing chains of evidence for multi-hop questions rather than relying only on isolated retrieval matches.

Source: https://aclanthology.org/2026.acl-long.445/

**Reframe implication:** source recovery should preserve both the original location of evidence and the relationships used to construct a representation. For complex views, a single source-span pointer may be insufficient; the provenance model may need an ordered set or graph of supporting spans.

### 199. Adaptive personalization can be evaluated before classroom deployment, but simulation is not human validation

A 2026 ACL workshop paper proposes theory-grounded simulated learners for evaluating adaptive educational-reading policies before classroom deployment. The framework aligns reading materials with learning objectives and uses question answering as an observation channel while modeling encoding, integration, prior knowledge, and misconception revision.

Source: https://aclanthology.org/2026.bea-1.63/

**Reframe implication:** simulation could eventually help screen representation-selection policies before human testing, particularly for avoiding obviously unstable policies. However, simulated-reader results cannot establish real-world accessibility benefit; held-out human evaluation remains necessary.

### 200. Adult dyslexia evidence reinforces persistent heterogeneity rather than a single accommodation profile

Recent adult research continues to show substantial variation. A 2026 study of 101 adults compared compensated and non-compensated dyslexia groups and found different patterns across phonological awareness, technical-text reading, vocabulary, and word recognition. A 2025 adult font study found no significant reading-accuracy or efficiency differences across tested fonts despite differences in satisfaction and preference.

Sources:
- https://pubmed.ncbi.nlm.nih.gov/42442778/
- https://pubmed.ncbi.nlm.nih.gov/41523822/

**Reframe implication:** adult calibration should not assume that a diagnosis, a preferred font, or a single accessibility profile predicts the representation that will improve a particular task. Conditional evidence remains the safer model.

### 201. Compensatory access and remediation must remain separate in adult research

A computer-reader study of students with dyslexia found that many participants achieved better reading-related performance with the technology, while some performed worse; the authors characterized the technology as a compensatory aid and found no evidence that it supplied additional remediation beyond intensive reading intervention.

Source: https://pubmed.ncbi.nlm.nih.gov/24233995/

**Reframe implication:** Reframe should initially measure whether a representation improves access to a task. Claims about improving the underlying reading skill require a separate longitudinal instructional study.

### 202. Adult accessibility research should include functional reading tasks

A 2025 randomized pilot with 44 young adults with intellectual/developmental disabilities found that instruction using functional texts improved use of reading-comprehension strategies and multiple-choice comprehension, while several functional outcomes did not differ significantly.

Source: https://pubmed.ncbi.nlm.nih.gov/40779715/

**Reframe implication:** evaluation should include realistic reading tasks such as messages, emails, instructions, forms, and other everyday information—not only researcher-authored comprehension passages. Task ecology may change which representation is useful.

### Research gate addition: provenance and support-layer separation

Before production implementation, establish:
- source wording versus support-layer changes as separate experimental variables;
- discourse-level fidelity, including stance, hedging, negation, and evidence relations where task-relevant;
- visual-support costs rather than assuming added graphics are beneficial;
- provenance that can represent multiple supporting source spans and relationships;
- simulation only as pre-screening, never as a substitute for human validation;
- adult and functional-task evaluation;
- compensatory access outcomes separated from remediation/learning outcomes.


## Research cycle 2026-10-03 — functional Easy Read, human oversight, and multilingual fidelity

### 203. Images in Easy Read do not reliably improve comprehension

A 2026 pilot study with nine adults with intellectual disabilities compared Easy Read health information with and without images. Including images did not produce a statistically significant improvement in learning scores, although performance was more variable without images and participants described images as important to the reading experience.

Source: https://pubmed.ncbi.nlm.nih.gov/41928410/

**Reframe implication:** subjective value and measured comprehension can diverge again in an adult accessibility population. Visual layers should therefore be optional, task-specific, and evaluated with both objective outcomes and reader-reported usefulness.

### 204. Functional reading tasks are a necessary validation domain

A randomized pilot with 44 young adults with intellectual/developmental disabilities used functional materials such as text messages and emails. The intervention improved use of reading-comprehension strategies and multiple-choice comprehension, but did not significantly improve every functional outcome.

Source: https://pubmed.ncbi.nlm.nih.gov/40779715/

**Reframe implication:** a research instrument should include ecologically realistic tasks in addition to standardized passages. A representation can improve question accuracy without necessarily improving the ability to compose a response, summarize, or act on information.

### 205. Maintenance and transfer should be measured separately from immediate access

A 2026 follow-up of the FRAME randomized trial examined whether improvements in reading-comprehension strategy use and comprehension questions persisted six months after intervention. This reinforces the distinction between immediate task access and durable learning/strategy change.

Source: https://pubmed.ncbi.nlm.nih.gov/42659048/

**Reframe implication:** Reframe's initial endpoint should remain compensatory access to information. If later research investigates learning or remediation, it needs separate delayed and transfer measures rather than treating immediate comprehension as evidence of durable skill improvement.

### 206. Human oversight is becoming an explicit design component of accessible text generation

A 2026 ACL paper proposes a human-in/on-the-loop framework for accessible text generation, arguing that automated simplification and metric-driven evaluation can miss user comprehension and normative accessibility requirements. The framework incorporates human guidance during generation, post-generation review, standards-aligned checklists, trigger rules, and accessibility KPIs.

Source: https://aclanthology.org/2026.lrec-1.574/

**Reframe implication:** high-risk semantic transformations should have an explicit review/validation path. Reframe should not treat an automatic readability score or model confidence as sufficient evidence that a transformation is accessible or faithful.

### 207. Multilingual simplification infrastructure is still less mature than English

A 2026 ACL paper on multilingual text simplification reports that high-quality training/evaluation datasets remain scarce outside English and introduces sentence-aligned resources covering Catalan, English, French, Italian, and Spanish.

Source: https://aclanthology.org/2026.bucc-1.8/

**Reframe implication:** multilingual support requires language-specific evaluation infrastructure, not merely a multilingual model. Source alignment and fidelity tests should be language-aware, and unsupported languages should not silently inherit English-derived assumptions.

### 208. Meaning preservation is becoming a first-class evaluation target for simplification

A 2026 EACL paper on German text simplification developed a human-evaluated dataset and reports stronger correlation with human judgments for meaning preservation and fluency than common automatic text-simplification metrics.

Source: https://aclanthology.org/2026.eacl-long.131/

**Reframe implication:** automated fidelity metrics can be useful screening signals but should not be the sole acceptance criterion. Reframe's transformation ledger should support human-evaluable meaning-preservation checks, especially for high-impact transformations.

### 209. Accessibility generation should expose an intervention boundary

The 2026 human-in/on-the-loop and multilingual simplification work suggests a useful architecture boundary: source content, transformation/support operation, and validation should remain distinguishable. This makes it possible to reject a generated layer without rejecting the source, and to compare the same source under multiple independently evaluated operations.

Sources:
- https://aclanthology.org/2026.lrec-1.574/
- https://aclanthology.org/2026.bucc-1.8/
- https://aclanthology.org/2026.eacl-long.131/

**Reframe implication:** preserve an explicit transformation object between semantic source state and rendered representation. It should carry operation type, language, affected spans, fidelity status, validation state, and reversibility/source-recovery information.

### Research gate addition: functional validation and human oversight

Before production implementation, establish:
- functional reading tasks alongside passage-based comprehension;
- immediate access outcomes separately from delayed learning/remediation outcomes;
- reader-reported value separately from measured task performance;
- explicit human-review/validation paths for high-risk semantic transformations;
- language-specific fidelity/evaluation coverage;
- meaning preservation as an acceptance criterion rather than a readability proxy;
- an explicit intervention boundary so generated support can be rejected or replaced without mutating the source.


## Research cycle 2026-10-03 — task decomposition, inference, and fidelity testing

### 210. Literal and inferential comprehension should be separate calibration targets

Recent reading-disability guidance and research explicitly distinguish questions whose answers are stated in the text from inference-demanding questions that require connecting textual clues with background knowledge. A 2024 practice review describes inference as a multi-step process: identify relevant text, activate knowledge, then integrate the two. A 2026 eye-tracking study likewise found different reading/re-reading behavior for literal versus inferential question types.

Sources:
- https://pmc.ncbi.nlm.nih.gov/articles/PMC12456325/
- https://onlinelibrary.wiley.com/doi/10.1111/1467-9817.70018

**Reframe implication:** calibration should not use a single generic “comprehension” score. At minimum, task labels should distinguish literal retrieval from inference. A representation that improves finding stated information may not improve constructing an inference.

### 211. Re-reading is an informative behavior, not simply failure

The 2026 eye-tracking study found that lower-achieving readers spent more effort reading passages and questions and were less likely to obtain correct answers from searches; when higher-achieving readers reread, rereading was more associated with successful literal-question answering.

Source: https://onlinelibrary.wiley.com/doi/10.1111/1467-9817.70018

**Reframe implication:** rereading events should be logged with context rather than counted as universally negative. The research instrument should distinguish productive source verification from confusion-driven repeated searching.

### 212. Graphic representations have task-dependent limits

A 2025 meta-analysis of pictorial/graphic representations for autistic students included only five single-case studies and used heterogeneous outcomes including story-element questions, literal questions, inferential questions, general comprehension, and Maze tasks. The review notes that overly simple organizer structures may be inadequate for inferencing.

Source: https://doi.org/10.1007/s10803-025-07014-4

**Reframe implication:** a representation's information structure must match the task. Reframe should not treat “graphic organizer” as one treatment. Organizer topology, information density, interaction model, and question type should be recorded separately.

### 213. Inference support should preserve the boundary between text evidence and reader knowledge

Instructional research on reading disabilities commonly separates what the text explicitly says from what the reader already knows before combining them into an inference. This provides a useful model for Reframe's semantic state model.

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC12456325/

**Reframe implication:** an inference-oriented view should expose provenance such as:
- TEXT EVIDENCE;
- READER/PRIOR KNOWLEDGE REQUIRED;
- INFERENCE;
rather than rendering the inferred statement as though it were directly stated by the source.

### 214. Meaning-preservation testing should use question answerability, not only textual similarity

Human evaluation of automatic simplification has shown that sentence-level similarity and readability measures are insufficient for determining whether readers can recover information from transformed text. In the 2024 TACL evaluation, even the strongest tested automatic simplification system left at least 14% of questions unanswerable from the simplified content.

Source: https://aclanthology.org/2024.tacl-1.24/

**Reframe implication:** the fidelity test harness should include source-derived questions with an explicit UNANSWERABLE state. Similarity or readability scores can be secondary diagnostics, but they should not be the acceptance criterion for a semantic transformation.

### Research gate addition: task-specific comprehension and provenance

Before production implementation, establish:
- literal retrieval and inference as separate experimental task classes;
- productive versus confusion-driven rereading/search behavior;
- representation topology and density as experimental variables;
- explicit separation of source evidence, required prior knowledge, and inference;
- source-derived answerability tests with an UNANSWERABLE outcome;
- textual similarity/readability treated as secondary diagnostics rather than semantic acceptance criteria.
