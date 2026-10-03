# Reframe — Validation Plan

**Status:** Product validation specification  
**Last reviewed:** 2026-10-02

## 1. Objective

Validate whether reader-controlled representations improve access to information without unacceptable loss of meaning.

The objective is not to prove that Reframe "fixes dyslexia."

## 2. Primary outcome

The primary outcome should eventually be:

> Can a reader extract and use information from a passage more effectively with a selected Reframe representation than with the source presentation alone?

"More effectively" must be operationalized for each experiment.

Possible measures:

- comprehension accuracy;
- time to answer;
- number of rereads;
- navigation/backtracking;
- recall;
- task completion;
- perceived effort;
- confidence;
- preference.

## 3. Secondary outcome: fidelity

For every transformation that reorganizes or rewrites information, measure whether important source information survives.

Fidelity checks should include:

- actors;
- actions;
- objects;
- numbers;
- dates;
- conditions;
- negations;
- uncertainty;
- attribution;
- temporal order;
- causal claims;
- exceptions.

## 4. Test corpus

Build a deliberately varied corpus rather than testing only clean paragraphs.

### Content types

- short messages;
- news;
- instructions;
- workplace communication;
- product descriptions;
- schedules;
- forms;
- educational material;
- technical explanations;
- narratives;
- legal/policy-like prose;
- tables and lists.

### Linguistic characteristics

Include:

- short and long sentences;
- embedded clauses;
- passive voice;
- pronouns;
- dates and times;
- numbers;
- names;
- abbreviations;
- negation;
- conditional statements;
- uncertainty;
- quotations;
- parenthetical information;
- lists;
- headings;
- punctuation-heavy text.

## 5. Representation matrix

Start with:

| Representation | Semantic change | Expected risk | Primary question |
|---|---:|---:|---|
| Source | None | Very low | Baseline |
| Spacing | None | Low | Does presentation help? |
| Emphasis | None | Low | Does semantic salience help? |
| Chunking | Low | Low–moderate | Does phrase structure help? |
| Sentence breakdown | Low | Moderate | Does syntax become easier to process? |
| Bullets | Low–moderate | Moderate | Does explicit grouping help? |
| 5W + H | Moderate | Moderate | Does semantic extraction help? |
| Timeline | Moderate | Moderate | Does temporal structure help? |
| Definitions | Variable | Moderate–high | Does local explanation help? |
| Simplification | High | High | Does wording change help enough to justify risk? |
| Audio | None if source is read | Low | Does another modality help? |

This table is a starting hypothesis, not a scientific ranking.

## 6. Experimental principle

Compare representations against the same source.

Do not compare different content with different representations and infer causality.

Where practical, randomize presentation order to reduce learning and fatigue effects.

## 7. Reader-centered testing

Do not assume a diagnosis predicts a preferred representation.

Collect:

- explicit preference;
- task performance;
- content type;
- reading experience;
- representation history.

Avoid collecting unnecessary medical or diagnostic information.

If diagnostic information is collected in future research, treat it as sensitive research data and establish an appropriate consent and privacy process.

## 8. Qualitative questions

After a task, ask questions such as:

- What made this easier or harder?
- Did the representation help locate the important information?
- Did it ever make the meaning less clear?
- Did it feel like the same information?
- What would you change?
- When would you want this mode automatically?
- When would you never want it automatically?

## 9. Failure taxonomy

Classify failures rather than treating all failures as generic "AI errors."

### Extraction failure
The source element was not detected.

### Attribution failure
Information was assigned to the wrong actor/source.

### Relation failure
A relationship was incorrectly created.

### Temporal failure
Time or order was changed.

### Negation failure
A negative or conditional statement became positive.

### Omission
Important information disappeared.

### Hallucination
Information not supported by the source was introduced.

### Presentation failure
The semantic representation was correct but visually or interactively unusable.

## 10. Acceptance thresholds

Thresholds should be defined per representation before broad rollout.

A transformation should not ship merely because users prefer it visually.

At minimum, a representation should have:

- demonstrated usefulness for its target task;
- acceptable semantic fidelity;
- predictable failure behavior;
- accessible rendering;
- a source-recovery path.

## 11. Progressive validation

Validate in this order:

1. Source preservation.
2. Deterministic representations.
3. Structural transformations.
4. Linguistic transformations.
5. Adaptive selection.
6. Automatic application.

This prevents an adaptive AI system from hiding an unvalidated representation problem.

## 12. MVP validation

A minimal prototype does not need system-wide screen access.

A useful first experiment can be:

1. Provide a passage.
2. Show the source.
3. Offer four or five representations.
4. Let the reader switch instantly.
5. Ask the reader to answer the same question from each representation.
6. Record performance and preference.
7. Repeat across different content types.

The purpose is to discover which representation patterns deserve engineering effort.

## 13. Decision rule

A feature earns implementation priority when evidence shows a meaningful benefit for a defined task or reader population and the benefit survives fidelity and accessibility checks.

Do not prioritize a feature because it is technically impressive.

## 14. Transfer-aware validation

The MVP validation sequence must distinguish immediate task benefit from transfer.

Minimum experimental levels:
1. **Within-passage:** same source, same task, representation switched.
2. **Held-out passage:** new source with the same task and representation type.
3. **Structure transfer:** new source using a different text structure.
4. **Task transfer:** new question type or task where appropriate.
5. **Context transfer:** different reading context when context is part of the hypothesis.

Calibration data should never be treated as sufficient evidence of a stable reader preference. Candidate selection must be evaluated on held-out material.

## 15. Calibration evaluation

Reader Calibration should report at least:
- subjective preference;
- perceived effort/clarity;
- objective accuracy;
- response time where appropriate;
- rereading/navigation;
- semantic-fidelity errors;
- prediction accuracy on held-out passages.

Representation order should be counterbalanced where practical to reduce order and fatigue effects.

### Calibration outcome categories

- **Supported:** preference and/or performance relationship replicates on held-out material.
- **Performance-supported:** objective benefit exists despite weak preference agreement.
- **Preference-only:** reader consistently prefers a representation without demonstrated task benefit.
- **Uncertain:** insufficient evidence to distinguish representations.
- **Harmful:** representation produces unacceptable semantic, accessibility, or task-performance costs.

These are experimental evidence states, not diagnoses or permanent reader identities.