# Reframe Research Continuation Policy

Date: 2026-10-03

## Operating instruction

When the project owner says **“Continue research”**, work should continue autonomously rather than stopping to ask what to research next.

The working responsibility is to:

1. Identify the highest-value unanswered research question.
2. Search current evidence and primary/reliable sources.
3. Compare findings against the existing Reframe research record.
4. Record material conclusions, conflicts, limitations, and changes in direction.
5. Update the relevant Reframe documentation in the same task.
6. Only stop when the next step genuinely requires an owner decision, missing evidence, external access, or a safety/legal/ethical constraint.

The assistant should not merely report what seems best and leave documentation for later.

## Research priority rule

Choose the next question by expected reduction of project risk, not by convenience or novelty.

Priority order:

1. Questions that could invalidate the core product concept.
2. Questions that could cause reader harm or semantic/accessibility failure.
3. Questions that determine whether a proposed representation is actually useful.
4. Questions that determine how individual calibration should work.
5. Questions that constrain source acquisition, privacy, platform feasibility, or accessibility.
6. Model/runtime/dataset questions.
7. Visual polish and implementation details.

## Current product hypothesis

Reframe is not primarily a preference survey, diagnosis system, or generic AI summarizer.

The central hypothesis is:

> Reframe can discover which source-faithful representation works best for a particular reader, task, content, and context by combining lightweight self-report with observed performance and interaction evidence.

Operationally:

**P(best representation | reader, task, content, context)**

“Best” must be defined by measurable task outcomes and interaction cost, with reader preference and confidence treated as additional evidence rather than ground truth.

## New research finding: adaptivity must remain conditional

Recent adaptive-reading research supports controlled personalization but also shows that adaptive effects can vary by domain and task. A 2026 BEA study used theory-grounded simulated learners and matched reading-assessment pairs to evaluate adaptive reading policies before deployment; results differed across subject domains rather than showing a universal adaptive benefit. This supports Reframe's decision to model representation effectiveness conditionally instead of assuming one globally optimal representation. See: https://aclanthology.org/2026.bea-1.63/

A 2026 study of adaptive support similarly argues that domain-specific processes matter in addition to general variables such as accuracy and response time. Reframe should therefore avoid reducing the reader model to generic performance metrics. See: https://doi.org/10.1016/j.learninstruc.2026.102364

## New research finding: recommendations should remain reversible

Recent mobile-reading research found that automatic adaptation can help under changing context while user customization remains important; the authors specifically discuss combining system recommendations with user customization and refining recommendations from observed preferences. Reframe should therefore make recommendations reversible and visible rather than silently locking the reader into a learned representation. See: https://doi.org/10.1145/3706598.3713367

This reinforces the existing rule:

**Recommendation -> reader control -> continued evidence**

not:

**Prediction -> automatic permanent setting**

## New research finding: more support is not automatically better

Recent work on symbolated text found that adding graphic symbols did not necessarily improve reading and, in that study, participants performed worse and read more slowly with symbolated text. This reinforces Reframe's requirement to test the marginal value and interaction cost of every representation operation instead of assuming that additional visual support is beneficial. See: https://doi.org/10.1016/j.ridd.2025.104998

## Research consequence

The calibration instrument should not ask only:

> “Which version do you like?”

It should test:

- task accuracy
- time
- rereading/navigation
- source verification
- interaction cost
- perceived difficulty
- confidence
- preference
- semantic fidelity
- switching behavior

It should also test whether the learned recommendation transfers to held-out content.

## Research consequence: representation selection is not a reader type

Avoid labels such as:

- “visual reader”
- “5W+H reader”
- “chunking reader”
- “dyslexia profile”

Use conditional evidence instead:

> “For this task class, this reader has repeatedly performed better with this representation under these conditions.”

The profile must be able to conclude that evidence is insufficient, unstable, task-specific, or content-dependent.

## Research consequence: model research comes after measurement design

Do not fine-tune a model merely because a dataset exists.

The order remains:

**research -> measurement design -> pretrained-model benchmark -> smallest research instrument -> controlled evidence -> targeted dataset -> fine-tuning**

The model is a replaceable component of the understanding/representation pipeline, not the product definition.

## Current research gate

Production implementation remains blocked until the research program has established:

- target reading/access problems and competing explanations
- populations and evidence limits
- representation hypotheses versus established evidence
- measurable outcomes
- semantic fidelity and source recovery requirements
- accessibility semantics
- privacy/source-acquisition constraints
- platform feasibility
- calibration validity
- switching costs
- held-out validation
- negative effects from added visual/semantic elements
- multilingual and alternative-access considerations
- support-versus-instruction boundary
- smallest defensible research instrument
- abandonment/narrowing criteria

Until those gates are sufficiently answered, continue research and documentation rather than beginning production implementation.
