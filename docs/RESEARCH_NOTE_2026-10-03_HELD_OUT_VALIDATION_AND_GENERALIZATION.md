# Reframe Research Note — Held-Out Validation and Generalization

Date: 2026-10-03

## Purpose

A representation recommendation is not validated merely because it predicts performance on the content used to create the reader profile. Reframe must test whether a recommendation remains supported on content, tasks, and contexts that were not used to select or tune it.

The central validation question is:

> Given evidence gathered during setup and use, does the recommended representation produce better useful outcomes for this reader under genuinely unseen conditions, without introducing unacceptable fidelity or interaction costs?

This is a decision-validation problem, not simply a model-accuracy problem.

## 1. What must generalize

A recommendation can fail to generalize in several ways:

- **Passage leakage:** the system learns a property of a calibration passage rather than a reader–representation relationship.
- **Topic leakage:** the recommendation works for one subject because of topic familiarity or vocabulary.
- **Item leakage:** repeated or near-duplicate questions make the validation look stronger than it is.
- **Form leakage:** parallel forms are too similar to be independent evidence.
- **Task leakage:** a recommendation learned for literal retrieval is incorrectly applied to inference, comparison, or action tasks.
- **Context leakage:** a representation works on one device/layout/audio environment but is assumed to work elsewhere.
- **Representation leakage:** the test accidentally gives one representation answer cues unavailable in another.
- **Adaptive-selection bias:** the system preferentially tests representations that already look promising, leaving alternatives insufficiently explored.
- **Fidelity failure:** a representation improves task scores by adding, deleting, or altering information.

Research on adaptive testing supports explicit content balancing and controlled item selection; unrestricted selection can repeatedly expose highly informative items and distort the effective evidence pool. citeturn0search5turn0search1

## 2. Held-out validation must be separated from profile formation

Maintain distinct evidence sets:

1. **Exploration set** — used to discover plausible representation effects.
2. **Calibration set** — used to estimate the reader's conditional representation profile.
3. **Validation set** — sealed from recommendation tuning until the validation decision.
4. **Optional longitudinal challenge set** — later unseen material used to test whether the profile remains useful over time.

A validation item must not influence the recommendation that is subsequently evaluated on that item.

For a controlled study, freeze the recommendation rule before opening the validation set.

## 3. Generalization dimensions

Validation should vary the dimensions that can plausibly change representation utility:

### Content
- topic/domain
- genre/purpose
- information density
- passage length
- vocabulary burden
- entity density
- discourse structure
- temporal/causal relationships
- prior-knowledge requirement

### Task
- literal retrieval
- relational integration
- temporal ordering
- causal reasoning
- inference
- structure identification
- action selection
- summary

### Context
- device
- screen size/layout
- visual versus audio access
- reading mode
- language/script where supported

The profile should therefore remain conditional:

**reader × task × content characteristics × context × representation**

rather than:

**reader → preferred representation**

## 4. Parallel-form design

When the same semantic construct must be tested more than once, use matched but non-identical content.

Parallel forms should match, as appropriate:

- primary task construct
- secondary cognitive demands
- genre/purpose
- information density
- vocabulary burden
- discourse structure
- number and type of entities
- relationship structure
- response format
- evidence-span structure
- approximate difficulty

Do not assume lexical similarity proves equivalence.

## 5. Primary validation metrics

The recommendation should be evaluated against a prespecified utility function rather than preference alone.

Provisional:

**utility = task outcome − interaction cost**

Task outcome may include:
- accuracy
- successful sequencing
- correct comparison
- correct action selection
- valid inference
- source-supported summary

Interaction cost may include:
- reading time
- rereading
- navigation
- switching
- source recovery
- visual density
- audio-control burden
- abandonment

Preference and confidence are secondary evidence, not substitutes for task performance.

## 6. Decision-level validation

Reframe should eventually report metrics such as:

- **Recommendation utility:** outcome under recommended representation.
- **Counterfactual utility:** outcome under a credible alternative when tested.
- **Recommendation regret:** loss incurred when the recommendation is not the best supported choice among tested alternatives.
- **False preference rate:** cases where the reader prefers a representation but objective task performance does not support the preference.
- **Harm rate:** cases where a representation causes a meaningful decline or fidelity failure.
- **Generalization rate:** proportion of held-out conditions in which the recommendation remains supported.
- **Evidence stability:** whether the recommendation survives new content/task/context observations.

These are research metrics, not user-facing scores or labels.

## 7. Prediction versus preference

Reframe must distinguish:

**P(reader prefers representation | context)**

from:

**P(representation improves task utility | reader, task, content, context)**

A reader may prefer a representation that does not improve objective performance. Conversely, a representation may improve performance without being preferred.

The product can expose user control without allowing preference alone to become evidence of efficacy.

## 8. Conditional recommendations

A recommendation should only generalize as far as the evidence supports.

Example:

> Evidence supports increased spacing for longer dense passages in visual reading tasks.

is materially different from:

> Increased spacing works for this reader.

The first is conditional and testable; the second is an unsupported global claim.

If evidence is sparse, the system should retain an **uncertain** state and continue controlled exploration.

## 9. Negative transfer is a first-class outcome

Validation must actively search for cases where the recommendation hurts.

A representation that improves average accuracy but creates substantial failures for a particular content/task class may need to be restricted to the conditions where its benefit is supported.

Do not hide negative cases inside an overall average.

Report:
- benefit distribution
- harm distribution
- subgroup/condition differences
- fidelity failures
- interaction-cost changes

## 10. Adaptive validation

Adaptive selection can reduce burden, but it must not eliminate the evidence needed to detect generalization failure.

Selection should eventually consider:

**expected information about representation differences + task relevance + content relevance + uncertainty + fidelity risk + burden + novelty**

Content balancing and exposure control are established concerns in adaptive testing; Reframe should adapt those ideas to representation comparisons rather than directly importing educational/clinical CAT thresholds. citeturn0search5turn0search3

A minimum exploration floor is required so that alternatives are not permanently suppressed by an early incorrect recommendation.

## 11. Longitudinal validation

A profile is not validated once.

Later trials should test whether:
- the representation still helps,
- the effect changes with task/content,
- the reader's context changed,
- a previously rejected alternative has become useful,
- fidelity risks have changed with model/version changes.

Replication and robustness research supports treating repeatability and generalizability as separate evidence questions rather than assuming an initial finding is stable. citeturn0search0

## 12. Acceptance gate before production personalization

Before Reframe can make an automatic representation recommendation, research should demonstrate:

1. A frozen recommendation rule.
2. A genuinely held-out validation set.
3. No leakage from calibration into validation.
4. Matched parallel forms where repeated constructs are required.
5. Evaluation across multiple relevant content/task conditions.
6. Explicit negative-transfer and fidelity checks.
7. Separation of preference from objective benefit.
8. Measurement of interaction cost.
9. Evidence uncertainty and conditional applicability.
10. A mechanism for continued alternative testing.
11. A method for detecting profile drift.
12. A validation report showing performance on unseen material.

## 13. Research conclusion

The core product claim should not be:

> Reframe knows what representation a reader likes.

It should be closer to:

> Reframe learns, with uncertainty, which representations tend to improve a reader's outcomes for particular tasks and information conditions, and verifies those recommendations on new material.

That distinction is central to making personalization evidence-based rather than self-confirming.
