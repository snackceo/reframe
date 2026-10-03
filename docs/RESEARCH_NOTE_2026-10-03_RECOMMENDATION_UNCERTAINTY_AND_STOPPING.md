# Reframe Research Note — Recommendation Uncertainty and Stopping

Date: 2026-10-03

## Purpose

Reframe needs a principled answer to two different questions:

1. **Is there enough evidence to recommend a representation?**
2. **Is another trial likely to materially change that recommendation?**

These are decision problems under uncertainty, not a request for a single permanent “reading ability” score.

## 1. What Reframe is estimating

The target should be conditional representation utility:

**ΔU(reader, task, content, context, A, B)**

where ΔU is the observed difference in useful outcome between two representations.

A profile should retain uncertainty around this difference.

Possible evidence states:

- **STRONG** — repeated evidence across appropriate held-out conditions supports the same conditional effect.
- **TENTATIVE** — evidence suggests an effect but validation is limited.
- **UNCERTAIN** — evidence is sparse or differences are small/noisy.
- **CONFLICTING** — credible observations point in different directions.
- **INSUFFICIENT** — not enough comparable evidence exists to make a recommendation.

These are evidence states, not reader diagnoses or ability labels.

## 2. Do not use a fixed item count as the primary stopping rule

Adaptive-testing research shows why variable-length stopping can be preferable: additional items should be administered when they are expected to improve measurement precision, while low-information items can be avoided. Predicted-standard-error-reduction approaches explicitly ask whether another item is likely to reduce uncertainty enough to justify its burden. citeturn0search0turn0search1

Reframe should adapt this principle to representation comparisons rather than importing clinical or educational thresholds.

A fixed minimum and maximum trial count can still provide safety bounds, but they should not be the evidence criterion.

## 3. Reframe's stopping question

For the next candidate trial, ask:

> If this trial were run, how likely is it to change the representation decision enough to matter?

This is more appropriate than asking whether the reader has completed a predetermined number of questions.

A useful conceptual quantity is:

**expected value of information (EVI) − trial burden**

EVI can include the expected reduction in uncertainty about representation utility and the expected chance of changing the current recommendation.

If expected information gain is low and the current evidence is adequate, stop.

If expected information gain is high, continue.

If evidence is uncertain but the remaining plausible alternatives have high potential impact, continue targeted exploration.

## 4. Minimum safety requirements

Even when evidence appears strong, stopping must not occur solely because the current representation has repeatedly been selected.

Require:

- minimum number of independent content units,
- minimum representation coverage,
- minimum task coverage appropriate to the intended recommendation,
- at least some unseen validation material,
- fidelity checks,
- negative-transfer checks,
- no unresolved protocol-invalid trials.

The minimums are research-design safeguards, not proof thresholds.

## 5. Evidence quality hierarchy

A trial should contribute more useful evidence when it has:

1. valid source provenance,
2. valid task construction,
3. correct answerability/scoring,
4. independent or appropriately parallel content,
5. controlled representation comparison,
6. low protocol contamination,
7. objective task outcome,
8. acceptable fidelity,
9. low unexplained confounding,
10. relevance to the intended recommendation condition.

A preference-only trial should not outweigh a clean objective comparison.

## 6. Recommendation confidence must be conditional

A recommendation should store its conditions and uncertainty.

Conceptually:

**recommendation = representation + applicability conditions + evidence state + uncertainty + last validated time**

For example:

> Chunking — TENTATIVE — evidence currently supports dense instructional passages for relational-integration tasks; validation across other genres is limited.

This is fundamentally different from:

> Chunking is the reader's preferred format.

## 7. Two separate stopping decisions

### Calibration stopping

Stop setup when the evidence is sufficient to produce a useful conditional recommendation, subject to minimum safety requirements.

### Trial stopping

During an individual comparison, stop collecting additional observations when another observation is unlikely to materially change the decision or reveal a meaningful harm.

These should not be conflated.

A reader may finish calibration while the longitudinal system remains open to future evidence.

## 8. Exploration floor

A strong early recommendation must not suppress all alternatives.

The system should periodically test a credible alternative when:

- the profile is old,
- task class changes,
- content characteristics change materially,
- context changes,
- confidence is low,
- current performance deteriorates,
- fidelity risk changes,
- a new representation becomes available.

This prevents self-confirming personalization.

## 9. Recommendation reversal

Reversal should be an ordinary evidence update, not treated as a failure.

If held-out evidence repeatedly contradicts the current profile:

1. lower confidence,
2. mark the evidence as conflicting,
3. test the strongest alternative,
4. validate on new material,
5. replace the recommendation only when the updated evidence supports doing so.

Never use the recommendation itself as evidence that the recommendation works.

## 10. Uncertainty sources

Uncertainty can arise from:

- too few observations,
- high within-reader variability,
- weak content matching,
- task heterogeneity,
- context changes,
- measurement noise,
- scoring uncertainty,
- fidelity uncertainty,
- conflicting representation effects,
- sparse evidence for alternatives.

The profile should preserve these distinctions where practical rather than collapsing all uncertainty into one number.

## 11. Avoid false precision

Do not expose an arbitrary percentage such as “92% confident” unless the underlying statistical model has been validated for that interpretation.

A calibrated Bayesian or statistical model may eventually produce probability distributions, but the probability must have a defined meaning and be empirically checked.

Early Reframe versions should prefer interpretable evidence states plus supporting trial counts/conditions over unsupported numerical confidence.

## 12. Validation of confidence itself

A confidence system is only useful if confidence predicts future correctness.

For held-out validation, evaluate:

- whether high-confidence recommendations generalize more reliably,
- whether low-confidence recommendations are appropriately unstable,
- whether confidence falls after contradictory evidence,
- whether confidence is inflated by repeated similar passages,
- whether confidence transfers across content/task conditions only when those conditions are represented in the evidence.

This creates a second calibration problem:

**recommendation confidence → future recommendation correctness**

not merely:

**model probability → observed response probability**

## 13. Recommendation decision matrix

Research instrumentation should distinguish:

| Evidence | Held-out support | Action |
|---|---|---|
| Strong | Yes | Recommend conditionally |
| Strong | No/insufficient | Keep tentative; validate |
| Tentative | Yes | Conditional recommendation with limited scope |
| Tentative | No | Continue exploration |
| Conflicting | Mixed | Do not collapse into a global preference |
| Insufficient | Any | Do not make an automatic recommendation |

This is an internal research decision framework, not a user score.

## 14. Why this matters

Adaptive testing literature demonstrates that stopping is a substantive design decision: different stopping rules trade precision against burden, and the value of another item depends on how much additional information it is expected to provide. citeturn0search0turn0search1turn0search7

For Reframe, the corresponding question is:

> Will another controlled comparison meaningfully improve what Reframe knows about when a representation helps this reader?

That becomes the basis for adaptive calibration stopping.

## 15. Research gate

Before production personalization, Reframe should be able to demonstrate:

- a defined representation-effect target,
- explicit uncertainty states,
- minimum evidence safeguards,
- held-out validation,
- negative-transfer detection,
- an exploration floor,
- recommendation reversal,
- confidence validation,
- separation of calibration stopping from longitudinal learning,
- an auditable reason for every automatic recommendation.

## Conclusion

Reframe should not aim to “identify the reader type.”

It should estimate, with explicitly bounded uncertainty:

> **Which representation is supported for which reader, task, information characteristics, and context—and how strong is the evidence that this remains true on new material?**

Stopping is justified when additional evidence is unlikely to materially change that conditional decision, not merely because a fixed number of calibration questions has been completed.
