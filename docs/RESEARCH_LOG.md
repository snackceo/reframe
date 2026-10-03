# Reframe — Research Log

**Status:** Living research record  
**Last reviewed:** 2026-10-02

This log records research cycles, what changed, and what the evidence means for Reframe. It is intentionally separate from the product decision log: a research finding does not automatically become a product decision.

## Research cycle 2026-10-02 — Representation, typography, language, and assistive technology

### 1. Specialized fonts are not a sufficient theory

A 2026 meta-analysis examined 15 empirical studies, 91 effect sizes, and 688 dyslexic students and found no consistent or reliable reading-performance advantage for dyslexia-specific fonts over standard fonts. The pooled effect was negligible. This is important because Reframe should not become a "better dyslexia font" product.

Source: https://pubmed.ncbi.nlm.nih.gov/42536336/

**Reframe implication:** typography remains a representation variable, but specialized-font selection should not be treated as the central intervention.

### 2. Spacing deserves controlled testing, but evidence is not universal

A 2024 study reported that increased inter-word spacing reduced migration errors and improved comprehension scores in its dyslexic participants. The same paper discusses prior mixed findings, including research where increased inter-letter spacing changed fixation behavior without improving accuracy or comprehension, and reports that excessive inter-word spacing could become counterproductive in exploratory testing.

Source: https://onlinelibrary.wiley.com/doi/full/10.1002/dys.1787

A separate experimental study directly manipulated letterform, inter-letter spacing, and inter-word spacing and found the literature on dyslexia-friendly fonts and spacing to be controversial rather than establishing one universal setting.

Source: https://link.springer.com/article/10.1007/s11881-020-00194-x

**Reframe implication:** spacing belongs in the representation inventory, but the system should expose it as a controllable variable rather than hard-code a supposedly optimal value.

### 3. General format readability matters beyond dyslexia

A 2024 study of 51 children in grades 3–5 examined eight fonts and three character-spacing conditions across narrative passages and measured reading speed and comprehension. This provides a useful broader research track because formatting effects are not necessarily specific to dyslexia.

Source: https://www.mdpi.com/2227-7102/14/8/854

**Reframe implication:** visual presentation research should include general readers as well as disability-specific populations. This helps distinguish universal readability effects from disability-specific effects.

### 4. Visual-design evidence is promising but should be weighted cautiously

A 2026 systematic literature review of visual design elements for children with dyslexia synthesized 21 articles and reported recurring support for spacing, line spacing, simple layouts, clear hierarchy, and moderate contrast. The review also identifies gaps in classroom implementation and empirical validation.

Source: https://alishlah.ahfpublishing.id/alishlah/article/view/9416

**Reframe implication:** layout and hierarchy are worth testing. However, this review should not be treated as equivalent to a large randomized evidence base; its recommendations are hypotheses/design guidance that require direct validation in Reframe's target tasks.

### 5. Reading comprehension is not one mechanism

A 2026 scoping review of reading-comprehension interventions for children with developmental language disorder included 24 studies. Interventions targeted self-regulation, word recognition, bridging processes, and extended discourse. The review reported mostly positive comprehension findings but identified substantial limitations, including variability in dosage and measurement and underrepresentation of multilingual children, non-English first languages, genres, and question types.

Source: https://pubmed.ncbi.nlm.nih.gov/41401742/

**Reframe implication:** a 5W+H mode, timeline, definitions, or other structural representation cannot be justified merely by saying it "helps comprehension." The relevant mechanism and task must be specified.

### 6. Cross-linguistic generalization remains a hard constraint

A meta-analysis of 79 dyslexia studies involving 14,947 participants found that orthographic depth moderated some reading outcomes, with accuracy differences more strongly linked to orthographic depth than fluency measures. The study also reported an Anglo-Saxon/English-language bias in the included literature.

Source: https://link.springer.com/article/10.1007/s11881-021-00226-0

**Reframe implication:** an algorithm designed around English sentence structure, spelling, morphology, or visual presentation cannot be assumed to generalize to other languages/scripts.

### 7. Semantic processing deserves its own research track

A 2024 systematic review and meta-analysis of N400 studies included 20 studies and found differences between readers with dyslexia and typically developing readers in lexico-semantic processing, with effects moderated by modality, task type, age, and orthography.

Source: https://pubmed.ncbi.nlm.nih.gov/38128616/

**Reframe implication:** the project should not treat reading as only a visual decoding problem. Semantic processing and language comprehension need their own hypotheses and outcome measures.

### 8. Text-to-speech is evidence-supported but reader/task dependent

A meta-analysis of text-to-speech and related read-aloud tools found a positive average effect on reading comprehension for students with reading difficulties, while noting meaningful variability and the need to identify moderators.

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC5494021/

**Reframe implication:** audio belongs in the representation system, but it should be tested as a mode with measurable outcomes rather than treated as a universal accessibility answer.

## Research conclusions from this cycle

### Stronger conclusions

- Reframe should not be centered on dyslexia-specific fonts.
- Typography and spacing remain legitimate representation variables.
- Reading comprehension needs to be decomposed into mechanisms and task demands.
- Language and semantic processing must remain separate research tracks.
- Cross-language/orthographic generalization must be treated as a first-class constraint.
- Audio/read-aloud is a legitimate representation family with existing evidence.

### Still hypotheses

- noun/verb highlighting;
- 5W+H representation;
- timeline representation;
- explicit entity/action structure;
- automatic mode selection;
- progressive assistance;
- content-aware representation selection;
- combining multiple representations;
- whether reader preference predicts measured benefit.

### New risk identified

A representation can improve readability while failing to improve comprehension, or improve a task by removing information that should have remained available. Therefore Reframe needs at least two separate validation dimensions:

1. **Task benefit** — did the reader perform the intended task better?
2. **Source fidelity** — did the representation preserve the information and qualifiers necessary to perform that task correctly?

## Next research cycle

Priority order:

1. Evidence on semantic/structural representations such as main idea, question answering, graphic organizers, timelines, and information extraction.
2. Evidence distinguishing comprehension support from reading instruction/remediation.
3. Adult reading-disability evidence.
4. Multilingual and non-English/non-Latin evidence.
5. Evidence for attention, working memory, and executive-function interactions with reading presentation.
6. Evidence on user-controlled personalization versus automatically selected adaptations.
7. Evidence on mobile/digital reading contexts.
8. Prior art/open-source projects that transform or adapt reading presentation.
9. Platform feasibility only after the research questions determine what the first experiment actually requires.

## Build status

**Do not begin production implementation yet.**

The next acceptable build target is a deliberately small **research instrument** after the representation hypotheses and outcome measures are sufficiently specified. The first instrument should be capable of comparing representations; it should not attempt to become the final system-wide HUD.
