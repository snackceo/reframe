# Reframe Adaptive Calibration Strategy

Date: 2026-10-03

## Research decision

Reframe should not make every reader complete every representation trial. The next design direction is **adaptive calibration**: use early questionnaire and calibration evidence to choose the next most informative trial, while preserving enough exploration to avoid locking onto an incorrect representation.

This is informed by computerized adaptive testing (CAT) research. ROAR-CAT demonstrated that adaptive item selection can substantially reduce testing burden while retaining measurement precision in a reading-related assessment. In that study, 75 adaptive items achieved the same target reliability as approximately 125 randomly ordered items, a 40% efficiency improvement. This does **not** establish that Reframe should use the same number of trials or the same psychometric model; it establishes that adaptive measurement is a viable research pattern for reducing burden when an appropriately calibrated item bank exists. citeturn0search0turn0search1

Research on CAT with passages also warns that passage-level dependencies matter: treating items from the same passage as independent can overestimate measurement precision. Reframe therefore should treat multiple tasks from one source passage as correlated observations rather than independent proof. citeturn0search5

## What Reframe is estimating

Reframe is not primarily estimating a single latent reading ability.

It is estimating **representation utility conditional on reader, task, and content**.

Conceptually:

`U(reader, representation, task, content, context)`

The system should maintain uncertainty around each estimate.

The goal of calibration is not to find a winner as quickly as possible. The goal is to reach enough evidence to make a useful recommendation while avoiding unnecessary reader burden.

## Three phases

### Phase 1 — Broad exploration

Use a small number of representative tasks to expose the reader to different representation families.

Do not immediately optimize toward the first successful representation.

The initial set should cover materially different operations, for example:

- original/presentation-only
- emphasis
- chunking
- extraction such as 5W+H
- structural organization such as outline/timeline
- explanation/definition support
- audio

Not every reader must receive every candidate if prior evidence strongly indicates that a candidate is irrelevant or inappropriate, but the system should maintain an exploration mechanism.

### Phase 2 — Targeted comparison

Once early evidence exists, select additional trials where they are most informative.

Examples:

- two representations currently appear similar
- one representation has high uncertainty
- a representation appears useful for one task but not another
- questionnaire evidence conflicts with observed outcomes
- a promising representation has only one supporting observation

### Phase 3 — Confirmation

Before establishing a recommendation, test the leading representation on unseen content and a matched task.

A recommendation should become stronger when it generalizes.

## Stopping rules

Calibration should be allowed to stop when evidence is sufficient rather than after a fixed number of screens.

A provisional stop condition should require:

1. at least two materially different tasks or content conditions have been observed;
2. the leading representation has supporting evidence on held-out or non-identical content;
3. the leading representation is sufficiently separated from alternatives, or uncertainty is sufficiently low;
4. no major questionnaire/performance contradiction remains unexplored;
5. additional trials are unlikely to change the recommendation enough to justify their burden.

These are **research criteria**, not final numerical thresholds.

## When calibration should continue

Continue collecting evidence when:

- the top representations are close;
- results conflict across task types;
- evidence comes from only one passage;
- the representation has high interaction cost;
- the questionnaire predicts one result and behavior predicts another;
- the reader frequently overrides recommendations;
- the content condition differs materially from previous evidence;
- the system has insufficient evidence for a safe recommendation.

## Do not force a winner

The system must be able to conclude:

- no clear advantage
- multiple representations are useful
- representation depends on task
- representation depends on content
- evidence is insufficient
- reader preference should control when measured outcomes are effectively equivalent

A forced ranking would create false precision.

## Questionnaire as prior information

The setup questionnaire can help choose early candidates, but prior information must not overpower contradictory observed evidence.

This is consistent with broader adaptive-testing research showing that prior information can reduce testing burden, while also highlighting the need to account for potential bias in empirical priors. citeturn0search10

Therefore:

`questionnaire → candidate prior`

not:

`questionnaire → predetermined representation`

## Content and item selection

The calibration engine should choose trials using both reader uncertainty and content coverage.

A trial should be valuable because it can answer a question such as:

> Does this representation help this reader with this task type when the information is presented in a different passage?

Do not repeatedly test the easiest content merely because it produces clean positive results.

Recent reading-assessment research has demonstrated that item difficulty can be predicted from linguistic, passage, and contextual metadata, supporting the use of structured item metadata rather than treating every passage as interchangeable. citeturn0search9

## Recommended first algorithm

Do not begin with a neural personalization model.

The first Reframe calibration selector should be interpretable and conservative.

A practical research sequence is:

1. questionnaire priors
2. broad representation coverage
3. simple per-representation outcome estimates
4. uncertainty estimates
5. task/content stratification
6. adaptive next-trial selection
7. held-out confirmation

Only after sufficient data exists should Reframe compare more complex models.

## Critical distinction from clinical assessment

This system is intended to personalize presentation. It must not be represented as a diagnostic assessment of dyslexia, ADHD, DLD, autism, intelligence, or another condition.

A reader's calibration profile describes **what presentation appears useful under tested conditions**, not why the reader experiences difficulty.

## Build gate impact

This research substantially narrows the eventual architecture, but it does not yet authorize production implementation.

Before the build warning, research still needs to resolve:

- practical trial burden
- exact task construction
- reliability/uncertainty thresholds
- content balancing
- semantic-fidelity scoring
- accessibility of the calibration experience
- privacy/data retention
- multilingual calibration strategy
- cold-start behavior
- longitudinal drift
- safety behavior when evidence conflicts

**No production building begins from this document.**