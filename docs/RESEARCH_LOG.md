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
