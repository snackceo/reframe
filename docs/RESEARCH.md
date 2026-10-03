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

## 13. Important distinction: accessibility support vs. reading instruction

Reframe is an assistive representation concept, not a replacement for evidence-based reading instruction.

The International Dyslexia Association's current definition emphasizes difficulties with word reading and/or spelling and notes that targeted instruction remains important. IDA describes Structured Literacy as an explicit, systematic approach to teaching the structure of written language. Reframe should therefore be positioned as something that can help a person access information, not as a tool that teaches the underlying reading skill or treats dyslexia. 

This distinction matters to product claims:

- **Instruction:** builds reading and language skills.
- **Representation:** changes how already-existing information is presented.
- **Accommodation/support:** reduces barriers to accessing information.
- **Reframe:** currently belongs primarily in the latter two categories.

Reframe should not imply that easier presentation eliminates the need for appropriate instruction or clinical/educational support.

## 14. A stronger theoretical direction: reduce extraction cost

The research and accessibility guidance suggest a more useful product abstraction than "make text easier."

A reader must perform several operations when processing connected text:

1. locate relevant information;
2. identify boundaries between ideas;
3. determine relationships between entities and actions;
4. track time, conditions, negation, and uncertainty;
5. integrate information across sentences;
6. retain enough structure to answer a question or complete a task.

Reframe can investigate whether different representations reduce the work required for one or more of these operations.

Examples:

- **Chunking** may expose boundaries.
- **Emphasis** may expose salient elements.
- **5W + H** may expose common information slots.
- **Timeline** may expose temporal relationships.
- **Comparison** may expose explicit contrasts.
- **Lists** may expose item boundaries.
- **Definitions** may reduce vocabulary lookup cost.
- **Audio** may provide an alternative decoding pathway.

These are mechanisms to investigate, not established effects of Reframe.

This leads to a stronger hypothesis:

> Reframe may be useful when it makes the information structure that a reader needs for a task more directly perceivable.

That hypothesis is broader than dyslexia and can be tested without assuming a single neurological explanation.

## 15. Reader-controlled adaptation is consistent with accessibility guidance

W3C cognitive accessibility guidance explicitly recommends adaptation and personalization, including allowing users to select preferred alternatives and supporting simplification. It also recommends that users control when content changes and that interfaces provide a way to return to a familiar version. citeturn0search0turn0search5turn0search13

This aligns with a key Reframe interaction principle:

**Do not make the representation change mysterious.**

A reader should be able to understand:

- what mode is active;
- what changed;
- switch modes;
- return to source;
- turn automatic behavior off.

Automatic adaptation can eventually be explored, but it should remain reversible and subordinate to reader control.

## 16. New research questions

The next research cycle should investigate:

### RQ1 — What is the unit of assistance?

Is the most useful transformation applied to:

- a word;
- a phrase;
- a sentence;
- a paragraph;
- a section;
- an entire document?

### RQ2 — What problem is the reader solving?

Does a representation help primarily with:

- decoding;
- locating;
- grouping;
- sequencing;
- extracting;
- comparing;
- remembering;
- understanding vocabulary;
- following instructions?

### RQ3 — Does representation need to be content-aware?

For example:

- narrative → character/action structure;
- instructions → ordered steps;
- event → date/time/location;
- news → 5W + H;
- comparison → aligned alternatives;
- technical material → definitions + structure.

### RQ4 — Can one representation be parameterized?

Instead of many independent modes, perhaps a small number of underlying controls can generate many useful views:

- density;
- grouping;
- emphasis;
- hierarchy;
- modality;
- wording transformation.

### RQ5 — When should the system intervene?

Possible triggers:

- explicit request;
- reader preference;
- content structure;
- repeated rereading;
- navigation behavior;
- task context.

Behavioral inference should be treated as a later research area because it creates privacy and false-positive risks.

## 17. Research implication

The long-term algorithm may not be:

**dyslexia → special format**

It may instead become:

**content + task + reader preference → representation**

That is a much more general and testable system.

The product should remain open to discovering that some proposed modes are ineffective, unnecessary, or useful only for particular content types.


## Research scope expansion

Reframe research is intentionally broader than dyslexia alone. Before implementation, the evidence program must separately map reading disabilities, learning disabilities, language-related disabilities, cognitive processes relevant to reading, reading comprehension, other developmental and acquired conditions, accessibility and assistive technology, and the distinction between educational remediation and assistive representation.

A dedicated research-gate map is planned to track populations, mechanisms, evidence strength, conflicting findings, intervention evidence, accessibility evidence, failure conditions, semantic risk, and claim boundaries. No proposed representation should be treated as clinically or educationally established merely because it is intuitively plausible.

The scope specifically includes dyslexia; specific reading comprehension difficulties; decoding, fluency, and comprehension; cross-linguistic and orthographic differences; reading and written-expression learning difficulties; mathematics where language interacts with the task; developmental language disorder and receptive/expressive language; vocabulary, morphology, syntax, discourse, inference, and comprehension monitoring; working memory, attention, processing speed, and executive functions; ADHD; autism; intellectual/developmental disabilities; sensory disabilities; acquired reading/language disorders; traumatic brain injury; text-to-speech; speech-to-text; alternative presentation; simplification; personalization; multimodal learning; cognitive accessibility; and user-controlled adaptations.

**Research gate:** evidence → competing explanations → hypothesis → explicit uncertainty → controlled test → revised hypothesis.

**Until the research coverage is sufficiently mature, Reframe remains in research mode and no implementation decision should be treated as scientifically justified.**


## 18. Evidence update — technology-assisted reading support

Research reviewed in the current cycle strengthens the case for studying assistive representations, but does not validate Reframe's specific semantic modes.

### Text-to-speech

A meta-analysis of text-to-speech and related read-aloud tools for students with reading disabilities found a positive average effect on reading comprehension, while noting meaningful variation between studies and the need to identify moderators. citeturn0search0

A 2023 study of children with reading and language difficulties found higher comprehension with TTS than silent reading in its tested conditions. It did not find a significant comprehension difference between TTS with highlighting and TTS without highlighting. The authors also reported differences between children classified as dyslexia-only and those with reading and language impairment. citeturn0search1

**Implication:** Audio is worth treating as a representation, but synchronized highlighting should not be assumed to add benefit merely because it is intuitively attractive. TTS effects also appear sensitive to reader characteristics.

### Technology-based reading interventions

A 2026 meta-analysis of 30 randomized controlled trials involving 4,851 students with reading difficulties found a small-to-moderate overall effect for technology-based reading interventions. The analysis reported no significant moderation by the examined learner, intervention, setting, or duration variables. This evidence concerns technology-based interventions broadly, not Reframe's representation model, and therefore cannot establish that a particular interface transformation is effective. citeturn0search6

**Implication:** Technology is a legitimate research domain for reading support, but product claims must remain tied to the specific intervention being tested.

### Dyslexia-specific fonts

A 2026 meta-analysis of 15 studies, 91 effect sizes, and 688 dyslexic students found no consistent or reliable reading-performance benefit from dyslexia-specific fonts compared with standard fonts; the pooled effect was negligible. citeturn0search13

**Implication:** This is useful disconfirming evidence for a font-centered product strategy. Reframe should continue treating typography as one adjustable presentation variable rather than the product's therapeutic mechanism.

### Developmental language disorder and reading

A 2024 systematic review examined factors associated with reading comprehension in children with developmental language disorder and emphasized the high rate of co-occurring reading difficulties. citeturn0search4

A 2026 scoping review of reading-comprehension interventions for populations with developmental language disorder found a literature base spanning multiple intervention targets and highlighted gaps in the evidence. citeturn0search8turn0search12

A 2026 systematic review specifically examining children with comorbid developmental dyslexia and developmental language disorder synthesized evidence across four languages and distinguished shared from distinct reading characteristics. citeturn0search5

**Implication:** The broader research scope is justified. Reading difficulty cannot be modeled solely as a dyslexia-versus-no-dyslexia distinction; language ability and comorbidity can materially change the reading profile and response to support.

### AI evidence requires caution

A 2025 systematic review of AI-based interventions for students with learning disabilities reported promising results in some stronger studies but also substantial methodological limitations and risk of bias. The review explicitly called for stronger randomized and longitudinal evidence and cautioned about long-term effects such as cognitive offloading. citeturn0search11

**Implication:** AI should remain an implementation option, not the research premise. Reframe should first establish whether a representation is useful and safe, then determine whether AI is necessary to produce or select it.

### Updated research conclusions

The current evidence supports these narrower statements:

- Assistive technology can improve some reading outcomes, but effects depend on the intervention and population.
- TTS has evidence worth incorporating into the representation inventory, with reader-specific and feature-specific questions still open.
- Font changes alone should not be treated as the central mechanism.
- Language-related difficulties and comorbidities materially broaden the research problem.
- AI evidence is promising but not strong enough to justify making AI the product premise.
- Reframe's semantic representations — noun/verb emphasis, 5W + H, timelines, relationship views, and similar transformations — remain **unvalidated hypotheses**.

### New research priority

Before implementation, the next evidence cycle should map each proposed representation to:

**target processing demand → relevant population → evidence for analogous intervention → expected benefit → semantic risk → measurable outcome → known failure conditions.**

This is now a required research artifact for deciding what belongs in the first prototype.


## 18. Research update — reading difficulty is multidimensional

Recent systematic reviews strengthen the reason for keeping Reframe broader than dyslexia while avoiding the assumption that all reading difficulty has the same mechanism. A 2024 systematic review of developmental language disorder (DLD) reading comprehension identifies multiple factors affecting comprehension. A later scoping review found interventions targeting word recognition, vocabulary/morphological knowledge, bridging processes, discourse, and self-regulation, while noting gaps in multilingual populations, genre/question diversity, and dosage.

Sources: https://pubmed.ncbi.nlm.nih.gov/38663332/ ; https://pubmed.ncbi.nlm.nih.gov/41401742/

A 2026 systematic review comparing developmental dyslexia, DLD, and their comorbidity reported different profiles across decoding, fluency, and comprehension, with comorbidity producing broader difficulty. This supports testing mechanisms separately rather than mapping diagnosis directly to a representation.

Source: https://pubmed.ncbi.nlm.nih.gov/42053752/

For Reframe, relevant variables should remain distinct: decoding demand, language comprehension, vocabulary/morphology, syntax, discourse/inference, working memory/executive demands, attention, task requirements, content structure, and reader preference.

## 19. Intervention evidence changes the product boundary

Reading-intervention evidence reinforces the distinction between helping someone access information and changing the underlying reading skill. Reviews find benefits from explicit/systematic instruction for foundational reading skills, while comprehension effects are generally smaller or more variable.

Sources: https://pubmed.ncbi.nlm.nih.gov/37416303/ ; https://pubmed.ncbi.nlm.nih.gov/42609867/

Reframe should therefore measure access to a task rather than imply that a presentation transformation treats or remediates a reading disability.

## 20. Language and comprehension need separate research tracks

DLD evidence indicates that vocabulary, morphology, syntax, discourse, and executive functions can all be relevant to academic and reading outcomes. These mechanisms should not be collapsed into a visual-accessibility hypothesis.

Sources: https://pubmed.ncbi.nlm.nih.gov/36382072/ ; https://pubmed.ncbi.nlm.nih.gov/39188807/

Research tracks should ask separately whether presentation reduces visual/navigation demands, whether structure makes relationships easier to locate, whether language-support representations reduce processing demands, and when transformation crosses from access support into instruction.

## 21. Autism and other developmental populations

Systematic reviews of autistic reading interventions report improvements in targeted areas including comprehension, vocabulary, fluency, and phonological awareness. Studied approaches include explicit instruction, visualization, main-idea/vocabulary work, question generation, graphic organizers, prediction, and technology-supported interventions.

Sources: https://pubmed.ncbi.nlm.nih.gov/35728668/ ; https://pubmed.ncbi.nlm.nih.gov/33396646/ ; https://pubmed.ncbi.nlm.nih.gov/24218240/

These findings are not evidence that Reframe's representations work. They support treating main idea, inference, organization, and task strategy as distinct research mechanisms.

## 22. Stronger research taxonomy

The research program should separate four layers:

**A — Underlying difficulty/mechanism:** decoding, fluency, vocabulary, morphology, syntax, discourse/inference, attention, working memory/executive function, visual/oculomotor factors, sensory access.

**B — Task demand:** read accurately, find a fact, understand gist, compare alternatives, follow steps, remember details, identify 5W+H, integrate information across a document.

**C — Representation intervention:** spacing, emphasis, chunking, structural extraction, list/outline, timeline, comparison, definitions, audio, synchronized highlighting, wording simplification.

**D — Outcome:** accuracy, comprehension, time, rereading, navigation, recall, effort, confidence, preference, semantic errors.

The central experimental unit should therefore become:

**mechanism × task × representation × content × reader → outcome**

rather than diagnosis → mode.

## 23. Research contradictions and limits

Do not assume that a representation that helps decoding will help comprehension; that preference equals objective benefit; that findings in children generalize to adults; that findings in one language/orthography generalize to another; that an instructional strategy is automatically an accessibility representation; or that technology-supported instruction proves the transformation itself caused the benefit.

## 24. Provisional evidence map

| Area | Evidence signal | Reframe relevance | Unknown |
|---|---|---|---|
| Dyslexia/decoding | Strong intervention evidence, heterogeneous profiles | Keep decoding distinct from presentation | Which representations help access without replacing instruction |
| Reading comprehension | Multifactorial | Structural/task representations are hypotheses | Which improve objective comprehension |
| DLD/language | Language, vocabulary, morphology, syntax and discourse matter | Definitions/structure/language support merit testing | Which transformations help which profiles |
| Autism | Targeted reading interventions can help | Main idea, inference, structure and task support merit study | Generalization to Reframe representations |
| Audio/TTS | Positive average evidence with heterogeneity | Legitimate multimodal representation family | Which readers/tasks benefit most |
| Personalization | Accessibility guidance supports user-controlled adaptation | Strong alignment with reader control | Which preferences predict objective gains |
| Simplification | Recognized accessibility technique | Potentially useful but high semantic risk | Fidelity and comprehension tradeoffs |
| Visual presentation | Relevant but not a complete theory | Test spacing/emphasis/grouping as variables | Individual/task-specific effects |

This is a research map, not an evidence ranking.

## 25. Research gate — expanded

Before implementation, the research program must sufficiently answer: target access problems; mechanisms and competing explanations; populations and limitations; evidence-supported versus hypothetical representations; conflicting evidence; measurable outcomes; unacceptable semantic failures; deterministic versus generative transformations; privacy/source-acquisition risks; platform requirements; smallest useful research instrument; and findings that would cause a representation to be abandoned or narrowed.

**Until this gate is sufficiently mature, Reframe remains in research mode and implementation decisions remain provisional.**
