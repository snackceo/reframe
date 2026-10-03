# Reframe Content and Item Bank Research

**Date:** 2026-10-03  
**Status:** Research-derived planning document  
**Build status:** No production implementation

## Research question

How should Reframe construct calibration content so that differences between representations can be attributed to the representation rather than to passage difficulty, question wording, prior knowledge, or test-order effects?

## Findings

### 1. Passage difficulty and item difficulty are separate variables
Reading-assessment research shows that both passage/text characteristics and item characteristics contribute to difficulty. ETS research has found relationships between item difficulty and variables from the passage and text-item overlap. citeturn0search0turn0search4

**Reframe consequence:** a calibration trial cannot treat a passage and its question as interchangeable. Both require metadata.

### 2. Task type must be explicitly controlled
Established reading-assessment designs distinguish explicit/detail, main-idea, inference, application, and evaluation demands. citeturn0search6turn0search11

**Reframe consequence:** each calibration item must declare its intended cognitive/task demand before it is used.

### 3. Passage position and information placement can affect difficulty
ETS research found that where relevant main-idea information occurs in a passage can affect item difficulty. citeturn0search1

**Reframe consequence:** matched passages must control more than word count/readability. Information location and discourse structure matter.

### 4. Reader and task attributes matter
Psychometric work has incorporated reader attributes such as interest and prior familiarity alongside task attributes when modeling reading comprehension. citeturn0search3

**Reframe consequence:** calibration should capture content familiarity/interest when relevant, and should avoid interpreting a representation effect as a reader effect when background knowledge explains the difference.

### 5. Accessible assessment requires explicit validity testing
IES-funded research on accessible reading assessments uses differential-boost designs, cognitive labs, process data, surveys/interviews, and accessibility-feature experiments rather than assuming that an accessibility feature is beneficial. citeturn0search12turn0search13

**Reframe consequence:** each representation is a testable access feature, not a presumed accommodation.

## Content-bank architecture

Reframe should eventually maintain an item bank with at least these dimensions:

- `item_id`
- `passage_id`
- `passage_family_id`
- `parallel_form_id`
- `domain`
- `genre`
- `language`
- `script`
- `length`
- `sentence_complexity`
- `vocabulary_characteristics`
- `discourse_structure`
- `information_density`
- `temporal_structure`
- `causal_structure`
- `number_of_entities`
- `coreference_complexity`
- `background_knowledge_requirement`
- `task_type`
- `question_format`
- `answer_key`
- `evidence_span`
- `difficulty_estimate`
- `fidelity_requirements`

These fields are for experimental control, not for diagnosing readers.

## Parallel-form requirement

A calibration set should contain matched but non-identical material.

Example:

**Form A:** committee delays library project.

**Form B:** school board delays renovation project.

Both can test the same task structure without allowing memorized answers to transfer directly.

Parallel forms should match on the variables that matter to the intended construct while remaining independently answerable.

## Question construction

Questions should be written so that the question itself does not become the primary reading challenge.

The target task must be explicit.

For example:

**Literal retrieval:**
> When will the project resume?

**Relation:**
> What event caused the project to be delayed?

**Sequence:**
> What happened immediately before the delay?

**Action:**
> Based on the instructions, what should happen next?

**Inference:**
> What can reasonably be inferred from the passage?

Question wording should not introduce information unavailable in the source unless the task explicitly tests that operation.

## Evidence-span requirement

Each objective answer should map back to the source evidence used to establish it.

This provides three benefits:

1. validates the question itself;
2. supports representation-fidelity scoring;
3. permits later source-recovery testing.

## Item quality gate

An item should not enter the calibration bank solely because an author believes it is easy, medium, or hard.

Pilot analysis should examine:

- item difficulty
- discrimination
- response distribution
- ambiguity
- missing-answer evidence
- unexpected prior-knowledge effects
- representation interaction
- language complexity of the question

IES assessment-development work uses item difficulty/discrimination, parallel-form equating, reliability, and validity analyses when constructing assessment forms. citeturn0search15turn0search16

## Accessibility-design gate

The experimental interface must distinguish an accessibility feature from the construct being measured.

IES research specifically examined whether accessibility features alter the validity of reading-proficiency measurement. citeturn0search12

Therefore, Reframe must ask:

> Did the representation improve access to the intended information, or did it change the underlying task being measured?

This distinction is essential for every candidate representation.

## Content categories for the first bank

The first bank should not be dominated by school passages.

Use controlled examples across:

- instructions
- schedules
- notices
- short policies
- messages
- forms/information sheets
- workplace information
- service information
- narrative passages
- explanatory passages
- procedural passages
- comparison passages

The initial bank can begin with synthetic or openly licensed material for research instrumentation, but eventual ecological validation should include authentic functional reading material with appropriate permissions.

## Calibration sequence

The eventual research instrument should follow this conceptual sequence:

1. lightweight setup questionnaire
2. brief representation orientation
3. practice/demo items excluded from scoring
4. calibration Form A
5. controlled representation comparisons
6. short break/context reset when needed
7. held-out Form B
8. recommendation evaluation
9. reader preference/confidence collection
10. profile update

## Important limitation

A small calibration set cannot establish a universal claim about a representation or a diagnosis.

Its purpose is to estimate whether the system can detect **individual, task-conditional differences** reliably enough to justify further testing.

## Next research gate

Before implementation, research must finalize:

- minimum number of candidate representations for the first experiment;
- minimum item count per representation/task cell;
- parallel-form construction rules;
- scoring rubric;
- fidelity rubric;
- pilot exclusion rules;
- participant burden limits;
- statistical model;
- privacy/data-minimization rules.

No production implementation is authorized by this document.