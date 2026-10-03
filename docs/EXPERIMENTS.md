# Reframe — Experiment Registry

**Status:** Research execution plan  
**Last reviewed:** 2026-10-02

This document converts Reframe's hypotheses into experiments that can produce evidence.

The registry should be updated as experiments are completed. Failed experiments are valuable results and should remain documented.

## 1. Experiment rules

Every experiment should specify:

- hypothesis;
- target reader/task;
- source material;
- baseline;
- representation being tested;
- independent variables;
- outcome measures;
- fidelity checks;
- failure conditions;
- interpretation rule.

Do not change the success criterion after seeing the result.

## 2. EXP-001 — Representation choice

**Question:** Does changing representation change task performance on the same source?

**Hypothesis:** At least some readers will perform differently across representations.

**Design:**
- same passage;
- source baseline;
- 3–5 representations;
- same information-retrieval task;
- randomized or counterbalanced order where practical.

**Measures:**
- accuracy;
- completion time;
- rereads;
- effort;
- confidence;
- preference.

**Failure condition:** No meaningful difference across tested representations.

**Interpretation:** A null result is evidence against investing in the tested transformation for that task/content class.

## 3. EXP-002 — Reader-specific effects

**Question:** Do different readers benefit from different representations?

**Hypothesis:** Representation effects vary across readers.

**Design:**
- multiple readers;
- multiple representations;
- multiple content types;
- within-reader comparisons.

**Measures:**
- individual performance deltas;
- preference stability;
- interaction with content type.

**Failure condition:** A single representation performs consistently across the tested population.

**Interpretation:** This would weaken the need for sophisticated personalization for the tested task, while not establishing a universal rule.

## 4. EXP-003 — Content-specific effects

**Question:** Does the useful representation depend on the structure of the content?

Test content classes:

- narrative;
- instructions;
- news;
- workplace communication;
- event information;
- comparison;
- technical material.

**Hypothesis:** Content structure interacts with representation usefulness.

Example predictions to test:

- instructions → ordered steps;
- events → date/time/location;
- comparisons → aligned alternatives;
- news → 5W + H.

These are predictions, not assumptions.

## 5. EXP-004 — Progressive intervention

**Question:** Is progressive assistance preferable to always-on transformation?

Compare:

**A:** source only  
**B:** source + reader-requested assistance  
**C:** automatic strongest transformation

Measures:

- task performance;
- time;
- switching;
- perceived control;
- frustration;
- source recovery.

The key outcome is not simply preference for one interface. It is whether assistance can increase without unnecessary transformation or loss of control.

## 6. EXP-005 — Semantic fidelity

**Question:** Can representations preserve the information a reader needs?

Construct passages containing:

- negation;
- uncertainty;
- attribution;
- conditions;
- dates;
- numbers;
- temporal order;
- causal claims;
- exceptions.

Evaluate transformed output against annotated source facts/propositions.

A transformation fails if it changes a material proposition, even when readers prefer its presentation.

## 7. EXP-006 — Representation recipes

**Question:** Do combinations outperform isolated transformations?

Compare:

- emphasis;
- chunking;
- emphasis + chunking;
- 5W + H;
- 5W + H + source;
- structure + audio.

Do not assume additive benefit.

Potential failure modes include:

- visual overload;
- conflicting signals;
- slower interaction;
- semantic confusion.

## 8. EXP-007 — "I'm stuck" interaction

**Question:** Can readers select useful assistance without understanding technical mode names?

Compare:

**Mode-first:** Focus / Structure / Explain / Listen

against:

**Problem-first:** Break it apart / Show what matters / Put it in order / Explain a word / Read it aloud

Measures:

- successful mode selection;
- time to recover;
- incorrect mode selection;
- confidence;
- abandonment.

## 9. EXP-008 — Source comparison

**Question:** Does showing source-to-representation correspondence increase trust and error detection?

Compare:

- transformed view only;
- transformed view + source toggle;
- transformed view + highlighted source mapping.

Measure:

- detection of transformation errors;
- confidence;
- comprehension;
- interaction cost.

## 10. EXP-009 — Adaptive selection

Run only after useful representations have been identified.

**Question:** Can the system recommend a representation using content, task, and reader history?

Candidate input:

**content structure + task + reader preference/history**

Compare:

- reader-selected representation;
- simple heuristic;
- learned recommendation.

Automatic selection must not be evaluated solely on click-through or preference. It must also preserve performance, fidelity, and control.

## 11. EXP-010 — Automatic intervention

This is a later-stage experiment.

**Question:** Can Reframe identify when assistance should appear without becoming distracting or intrusive?

Potential signals:

- explicit request;
- repeated rereading;
- task context;
- content complexity;
- reader history.

Because behavioral inference can expose sensitive reading behavior, privacy and false-positive costs must be part of the experiment.

## 12. Experiment data model

For each trial, conceptually record:

- experiment ID;
- participant/session ID;
- content ID;
- content class;
- task ID;
- representation ID;
- representation parameters;
- outcome measures;
- fidelity result;
- errors;
- explicit preference;
- timestamp where necessary.

Avoid storing raw source text unless the research protocol requires it.

## 13. Interpretation discipline

Results should be classified as:

- supports hypothesis;
- weak/ambiguous evidence;
- contradicts hypothesis;
- inconclusive due to study limitations.

Avoid converting a successful experiment on one reader population or content class into a universal claim.

## 14. Research sequence

Recommended order:

1. EXP-001 representation choice.
2. EXP-005 semantic fidelity.
3. EXP-002 reader-specific effects.
4. EXP-003 content-specific effects.
5. EXP-006 recipes.
6. EXP-007 recovery interaction.
7. EXP-004 progressive intervention.
8. EXP-008 source comparison.
9. EXP-009 adaptive selection.
10. EXP-010 automatic intervention.

The sequence is intentionally biased toward proving the representation concept before building prediction systems.
