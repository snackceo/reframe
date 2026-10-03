# Reframe Research Note — Experimental Design and Power Planning

Date: 2026-10-03

## Purpose

The statistical model cannot rescue a weak experiment. Reframe needs a design that separates representation effects from practice, fatigue, order, content, task, and context effects before estimating personalization.

## 1. Primary design

For representation comparisons, the default research design should be a randomized, counterbalanced within-reader comparison using matched but non-identical content.

Core unit:

**reader × matched content/task × representation**

Within-reader comparisons reduce noise from stable individual differences because each reader serves as their own comparison. The cost is exposure to multiple conditions, which introduces order, practice, fatigue, and carryover risks. Counterbalancing distributes order effects rather than eliminating all carryover. citeturn0search0turn0search1

## 2. Do not repeatedly show identical scored content

Showing the same passage under multiple representations can create learning, memory, and answer-pattern effects.

Therefore the primary efficacy experiment should use matched parallel forms:

**source A + representation A**

versus

**source B + representation B**

where A and B are matched on the intended construct and important demand characteristics.

Exact same-content comparisons remain useful for controlled demonstrations and selected mechanistic experiments, but should not automatically be treated as independent evidence.

## 3. Counterbalancing

For two representations:

- half of comparable trials/readers receive A before B,
- half receive B before A,
- assignment is randomized subject to balance.

For more than two representations, use an appropriate balanced order design rather than every possible permutation when the full factorial order set becomes impractical. Latin-square approaches can balance condition position efficiently. citeturn0search1turn0search6

Counterbalancing addresses systematic order effects but does not prove that carryover is absent. Recent methodological work emphasizes that carryover assumptions can affect inference in within-subject designs, so Reframe should record sequence and perform sensitivity analyses rather than simply assuming counterbalancing solved the problem. citeturn0academia24

## 4. Separate practice from measurement

Participants/readers should receive practice opportunities sufficient to understand the interaction mechanics before scored trials.

Practice trials must not become calibration evidence.

This separates:

**learning how to use Reframe**

from:

**evidence that a representation improves the task.**

## 5. Randomization layers

Randomization should operate at multiple levels where practical:

1. representation/order,
2. parallel-form assignment,
3. item selection within eligible strata,
4. question/response presentation order,
5. optional breaks or session blocks.

Randomization should never override required content balancing.

## 6. Content blocking

Because content difficulty can vary substantially, calibration and validation should use predefined content strata such as:

- task construct,
- information density,
- vocabulary burden,
- discourse structure,
- entity/relationship density,
- approximate item difficulty,
- genre/purpose.

Representation conditions should be balanced within these strata.

This reduces the risk that one representation receives systematically easier material.

## 7. Item families and dependence

Multiple questions from one passage are not automatically independent observations.

The analysis should identify:

**reader → passage/content family → item**

and account for this hierarchy in analysis or aggregate appropriately.

This is consistent with evidence that common-stimulus item sets can create local dependence and inflate apparent information if treated as independent observations.

## 8. Carryover in Reframe is unusual

Traditional treatment studies may use washout periods. Reframe cannot always “wash out” a representation because the reader may learn a strategy from seeing it.

Examples:

- learning what a timeline looks like,
- learning where key facts are placed in a 5W+H view,
- learning that highlighting predicts answer locations,
- learning how chunk boundaries encode structure.

Therefore the safer primary solution is often **matched parallel content + counterbalanced order**, not repeated identical-content crossover.

## 9. Side-by-side is a separate experiment

If two representations are displayed simultaneously, the reader may integrate them.

That creates a different question:

> Does simultaneous access to representations improve performance?

It does not cleanly answer:

> Which representation works better when used alone?

Therefore side-by-side comparisons must be analyzed as a separate condition.

## 10. Outcome hierarchy

Primary:

- task correctness / construct-valid score.

Secondary:

- time,
- rereading,
- navigation,
- switching,
- source recovery,
- confidence,
- perceived difficulty,
- preference.

Safety/fidelity:

- unsupported information,
- critical omissions,
- altered relations,
- answer leakage,
- invalid transformation.

Do not define success as speed alone.

## 11. Power planning

Power analysis should be based on the actual planned model and expected effect structure, not a generic “N = 30” rule.

For early research:

1. specify the smallest practically meaningful representation effect,
2. estimate outcome variance from pilot data or defensible prior evidence,
3. specify within-reader correlation,
4. specify number of readers and repeated content units,
5. specify clustering by passage/item family,
6. simulate the planned mixed model,
7. examine power across plausible effect sizes and missing-data rates.

Power calculations for repeated-measures designs depend strongly on correlation and the interaction structure; repeated observations are not equivalent to independent participants. citeturn0search2

## 12. Simulation-based planning

Simulation should precede expensive recruitment.

Simulate at least:

- zero representation effect,
- small effect,
- moderate effect,
- heterogeneous reader effects,
- task-specific effects,
- content-specific effects,
- order effects,
- carryover,
- item clustering,
- missing trials,
- fidelity-invalid trials.

Evaluate:

- false positive rate,
- power for the target effect,
- interval coverage,
- recommendation accuracy,
- recommendation regret,
- negative-transfer detection.

## 13. What counts as an independent evidence point

Do not equate:

**number of questions = amount of evidence.**

Evidence depends on:

- number of readers,
- number of independent content families,
- number of task/content strata,
- within-reader correlation,
- item dependence,
- representation coverage.

Five questions from one passage may provide much less independent information than five matched passages.

## 14. Pilot versus confirmatory evidence

A small pilot can establish:

- interaction feasibility,
- timing,
- item ambiguity,
- representation validity,
- variance estimates,
- likely effect magnitude,
- carryover risks.

It should not be treated as definitive evidence that a representation works.

Pilot results should inform design refinement and power simulation.

## 15. Missing and invalid trials

Every trial needs a disposition state.

Examples:

- VALID,
- READER_ABORT,
- TECHNICAL_FAILURE,
- TASK_AMBIGUOUS,
- SOURCE_INVALID,
- REPRESENTATION_INVALID,
- FIDELITY_FAILURE,
- PROTOCOL_VIOLATION.

Do not silently convert invalid trials into incorrect answers.

Primary analysis should be prespecified, with sensitivity analyses for plausible missing-data mechanisms.

## 16. Recommended first experimental instrument

The first research instrument should use:

**2–3 representations per experiment**

rather than exposing a reader to every possible representation.

Use:

- one primary comparison,
- one matched alternative,
- optional third representation only when scientifically justified.

This limits burden and reduces order complexity.

A later adaptive system can select comparisons based on information value.

## 17. Research acceptance gate

Before using experimental results to train personalization, Reframe should demonstrate:

- randomized representation assignment,
- balanced/counterbalanced order,
- matched parallel forms,
- content blocking,
- explicit item-family structure,
- separate practice and scored trials,
- fidelity validation,
- side-by-side separation,
- valid-trial disposition,
- simulation-based sample-size planning,
- prespecified primary outcome,
- held-out validation.

## Conclusion

The experimental design should make the representation comparison trustworthy before Reframe attempts to learn from it.

The core design is:

**matched content → randomized representation condition → counterbalanced order → task measurement → fidelity check → hierarchical analysis → held-out validation**

The number of trials should be determined by information needs and statistical precision, not by an arbitrary calibration-question count.
