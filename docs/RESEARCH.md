# Reframe — Research Foundation

**Status:** Working research synthesis  
**Last reviewed:** 2026-10-02

This document records the evidence and reasoning that currently inform Reframe. It is not a clinical guideline, a diagnosis framework, or proof that any particular representation will improve reading for every person with dyslexia.

## 1. Research question

Reframe is exploring a product hypothesis:

> Reading assistance may be more useful when it gives a reader control over how information is represented, rather than prescribing one universal visual treatment.

The central research question is therefore not:

> What is the best dyslexia font?

It is:

> Which transformations of written information reduce unnecessary processing demands for a particular reader while preserving meaning, and how can the reader control those transformations?

That separates:

1. Reading disability characteristics — what may make reading difficult.
2. Representation variables — how the same information is presented.
3. Reader preference and performance — what actually helps a particular person with a particular type of content.

## 2. What dyslexia research supports

The International Dyslexia Association's 2025 definition describes dyslexia as a specific learning disability involving difficulties in word reading and/or spelling that can affect accuracy, speed, or both. It emphasizes that severity varies, that causes are complex, and that phonological and morphological processing difficulties are common but not universal.

Source: https://dyslexiaida.org/definition-of-dyslexia/

This matters for Reframe because it argues against a single mechanistic explanation such as "the brain sees letters scrambled" or "all dyslexic readers need the same visual treatment."

Dyslexia can affect word recognition and decoding, while comprehension can also be affected secondarily. A reader may therefore understand sophisticated language and concepts while experiencing difficulty with the mechanics or efficiency of reading connected text.

## 3. Visual presentation is relevant, but not a complete theory

Research has examined visual, attentional, eye-movement, and other factors in dyslexia. A 2023 critical review describes several visual factors that have been investigated while emphasizing that reading is a complex activity and that no single visual explanation accounts for the whole condition.

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC10312247/

Reframe should therefore treat visual presentation as one family of possible interventions, not as the definition of dyslexia.

The product should be able to test:

- spacing;
- line length;
- grouping;
- visual emphasis;
- position and hierarchy;
- synchronized highlighting;
- audio;
- structural representations;
- linguistic simplification;
- other representations discovered through testing.

## 4. Accessibility guidance supports user-controlled presentation

W3C guidance recognizes that users may need to adjust text spacing and presentation. WCAG 1.4.12 requires content to remain usable when text spacing is adjusted, and W3C cognitive accessibility guidance recommends personalization, simplification, clear grouping, and user control.

Sources:
- https://www.w3.org/WAI/WCAG21/Understanding/text-spacing
- https://www.w3.org/WAI/WCAG2/supplemental/objectives/o8-personalization/
- https://www.w3.org/WAI/WCAG2/supplemental/patterns/o3p10-whitespace/
- https://www.w3.org/WAI/WCAG21/Understanding/visual-presentation

These guidelines do not establish that any specific Reframe transformation works for dyslexia. They do establish a useful design principle: accessibility can be improved by allowing people to adapt presentation to their needs.

## 5. Simplification is a legitimate accessibility representation

W3C guidance for readable content includes shorter sentence structures, clearer logical relationships, shorter or more familiar words where appropriate, and lists in place of dense prose. WCAG 3.1.5 recognizes the value of a supplemental simplified version for complex information.

Sources:
- https://www.w3.org/WAI/WCAG21/Techniques/general/G153.html
- https://www.w3.org/WAI/WCAG21/Understanding/reading-level.html

This supports a Reframe distinction:

- Representation changes organization or presentation.
- Simplification changes wording.
- Simplification therefore requires stronger safeguards than visual emphasis or structural rearrangement.

## 6. Audio is a meaningful modality, but not the whole product

A meta-analysis of text-to-speech and read-aloud tools for students with reading disabilities found a positive average effect on reading-comprehension measures, while also finding substantial heterogeneity and calling for more research into moderators and reading-disability profiles.

Source: https://pmc.ncbi.nlm.nih.gov/articles/PMC5494021/

For Reframe, audio should be treated as one representation mode. The product should not assume that audio is always preferable, nor should it require a reader to abandon visual reading.

A useful pattern is:

same source → multiple synchronized representations

For example:

- visual text;
- semantic emphasis;
- sentence/phrase grouping;
- audio;
- synchronized word or phrase highlighting.

## 7. What the research does NOT establish

Reframe should not claim that:

- dyslexia is primarily a visual disorder;
- letters are literally perceived as scrambled by all dyslexic readers;
- a particular font cures dyslexia;
- increased spacing works for every reader;
- noun/verb highlighting is clinically validated as a dyslexia intervention;
- 5W + H is universally superior to prose;
- AI-generated simplification preserves meaning automatically;
- one representation can be inferred from a dyslexia diagnosis alone.

These are hypotheses or product questions unless supported by specific evidence.

## 8. Product implication: optimize for the reader, not the diagnosis

A diagnosis is too coarse to determine the correct representation.

The same reader may need different representations for different tasks:

- short message → original + emphasis;
- dense article → chunking;
- factual report → 5W + H;
- event information → timeline;
- unfamiliar technical material → definitions;
- difficult passage → audio + synchronized highlighting;
- complex instructions → numbered steps.

This suggests that Reframe should eventually model content difficulty and representation preference, not simply "dyslexic vs. non-dyslexic."

## 9. Research hypotheses

These are hypotheses to test, not product claims.

### H1 — Representation choice matters
Readers will show measurable differences in comprehension, speed, confidence, or rereading behavior across representations.

### H2 — Effects are reader-specific
No single representation will dominate across all readers or content types.

### H3 — Effects are content-specific
A representation that helps with narrative prose may not help with instructions, tables, news, or technical text.

### H4 — Progressive assistance reduces unnecessary intervention
Starting with the source and increasing assistance only when needed may be preferable to permanently transforming all content.

### H5 — Structural representations can reduce extraction work
Explicitly exposing relationships such as who → action → object or 5W + H may help some readers extract meaning from dense prose.

### H6 — Source fidelity is measurable
Representations can be evaluated for whether they preserve the propositions and important qualifiers contained in the source.

## 10. Research program

Before building sophisticated AI, test representations directly.

### Phase A — Representation inventory

Create a small controlled set:

1. Original
2. Spacing
3. Chunking
4. Noun/verb emphasis
5. Key-entity emphasis
6. Sentence breakdown
7. Bullets
8. 5W + H
9. Timeline
10. Audio + synchronized highlighting
11. Plain-language rewrite
12. Combined modes

### Phase B — Human evaluation

Use a diverse set of short passages across:

- narrative;
- news;
- instructions;
- workplace communication;
- forms;
- technical explanations;
- schedules/events;
- lists;
- conversational messages.

For each representation, measure where practical:

- comprehension accuracy;
- time to answer;
- rereads/backtracking;
- perceived effort;
- confidence;
- preference;
- information retained;
- information incorrectly inferred.

### Phase C — Representation combinations

Test whether modes compose:

- emphasis + spacing;
- chunking + emphasis;
- 5W + H + source;
- structure + audio;
- simplification + source comparison.

### Phase D — Adaptive selection

Only after useful representations are identified, test whether Reframe can recommend a representation based on:

- content structure;
- reader preference;
- observed interaction;
- explicit reader choice.

## 11. Research principle

The strongest evidence for a Reframe feature should come from:

evidence → hypothesis → prototype → controlled comparison → reader feedback → revised hypothesis

Not:

interesting AI capability → feature → assumption that it helps.

## 12. Research status

Current confidence:

- **High:** reader control and adaptable presentation are compatible with established accessibility guidance.
- **High:** dyslexia is heterogeneous and should not be reduced to one visual mechanism.
- **Moderate:** audio/read-aloud can support reading comprehension for some readers with reading disabilities.
- **Unknown:** whether Reframe's proposed semantic representations materially improve reading outcomes.
- **Unknown:** which representation combinations work best for which readers and content.
- **Unknown:** whether an AI model can reliably select or generate the right representation without introducing unacceptable semantic errors.

Those unknowns define the product research agenda.
