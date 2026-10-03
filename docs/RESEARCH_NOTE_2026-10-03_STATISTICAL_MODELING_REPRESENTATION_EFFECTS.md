# Reframe Research Note — Statistical Modeling of Representation Effects

Date: 2026-10-03

## Purpose

Reframe eventually needs a statistical model for learning whether a representation changes task utility for a reader.

The model should estimate:

**ΔU(reader, task, content, context, A, B)**

while separating reader effects from item/content effects, task effects, context effects, and representation effects.

## 1. Do not begin with a large machine-learning model

The research evidence does not justify immediately training a high-capacity personalization model.

The first model should be interpretable and auditable.

A useful progression is:

1. paired descriptive comparisons,
2. simple mixed-effects model,
3. hierarchical/Bayesian partial-pooling model,
4. contextual model,
5. more complex learner only if validation demonstrates a need.

Bayesian hierarchical approaches are established for clustered educational data and can represent uncertainty while sharing information across related units. ETS work also demonstrates hierarchical Bayesian treatment of item/testlet effects and item families. citeturn0search0turn0search1turn0search6

## 2. Why paired comparisons come first

The primary experimental unit is:

**same reader × matched content/task × representation A vs B**

A simple within-reader difference is easy to audit:

**Δaccuracy = accuracy(A) − accuracy(B)**

and similarly:

**Δtime = time(A) − time(B)**

**Δutility = utility(A) − utility(B)**

This exposes the raw evidence before model assumptions are introduced.

## 3. Mixed-effects structure

A later model can account for repeated observations without pretending every trial is independent.

Conceptually:

**outcome ~ representation + task + content_demand + context + representation×task + representation×content_demand + (representation | reader) + (1 | item/content family)**

The exact link function depends on the outcome:

- binary accuracy → logistic model,
- ordinal ratings → ordinal model,
- continuous/approximately continuous time → suitable transformed/robust model,
- count outcomes such as rereads/switches → count model where appropriate.

The random effects are important because multiple trials from one reader and multiple items from one content family are not independent evidence.

## 4. Reader-specific representation effects

The useful personalization quantity is not a general reading score.

It is a reader-specific representation effect:

**β(reader, representation, task, content condition)**

The model should permit these effects to vary across readers while partially pooling them toward a population distribution when individual evidence is sparse.

This avoids two opposite errors:

- treating every reader as identical,
- treating a few observations from one reader as perfectly reliable.

Hierarchical models are specifically useful for estimating clustered effects and borrowing information across related units. citeturn0search1turn0search9

## 5. Content/item effects are mandatory

A representation can appear effective simply because its calibration items happened to be easier.

Model or design must account for:

- passage difficulty,
- vocabulary,
- discourse structure,
- topic,
- entity density,
- question difficulty,
- item family,
- parallel-form relationship.

Testlet research demonstrates that responses associated with a common stimulus can be dependent; treating them as independent can distort uncertainty. citeturn0search1

Therefore five questions about one passage should not automatically count as five independent pieces of evidence.

## 6. Context must be modeled or controlled

Potential context variables include:

- device,
- screen dimensions,
- layout,
- visual/audio modality,
- language/script,
- reading mode,
- content type.

If context changes systematically with representation, an apparent representation effect may actually be a context effect.

Where sample size is too small to model these interactions reliably, the safer choice is to restrict the recommendation rather than fit an unstable high-dimensional model.

## 7. Utility should remain multidimensional

Do not collapse all outcomes into one score prematurely.

Retain separate primary measurements:

- task accuracy,
- source fidelity,
- time,
- rereading,
- navigation,
- switching,
- source recovery,
- abandonment.

A provisional utility function can be used for decision-making, but the underlying dimensions must remain available for diagnosis.

This makes it possible to detect cases such as:

**higher accuracy + much higher interaction cost**

or:

**faster completion + lower accuracy**

without hiding the tradeoff.

## 8. Bayesian updating is promising but must be calibrated

A Bayesian model can represent uncertainty about reader-specific effects and update that uncertainty as new observations arrive.

However, a posterior distribution is not automatically a calibrated probability.

Reframe must validate whether:
- predicted effects match later held-out effects,
- credible intervals have appropriate empirical coverage,
- confidence decreases after contradictory evidence,
- partial pooling does not erase meaningful individual differences.

Bayesian educational measurement work explicitly distinguishes estimation from uncertainty characterization, and hierarchical models have been used for small-sample settings. citeturn0search0turn0search4

## 9. Small individual samples change the goal

Early Reframe data will be sparse per reader.

Therefore the model should not attempt to estimate a separate unconstrained parameter for every reader × representation × task × content combination.

Instead:

**population prior → reader evidence → conditional posterior → held-out validation**

The population prior can stabilize cold-start estimates, while reader-specific observations progressively move the estimate when evidence is strong.

The prior must not be so strong that it prevents genuine individual differences from appearing.

## 10. Avoid overfitting through feature explosion

Potential predictors are numerous:

reader variables × representation variables × task variables × content variables × context variables.

With sparse data, unrestricted interactions will overfit.

The model should therefore begin with a small preregistered set of high-value interactions:

1. representation × task
2. representation × content demand
3. representation × context when experimentally justified

Reader-specific random slopes can capture individual variation without creating an enormous fixed-effect interaction table.

## 11. Preference should be a separate outcome

Preference should not be folded into objective comprehension as though it were equivalent.

Model separately:

**P(prefer A | reader, task, context)**

and:

**P(A improves task utility | reader, task, content, context)**

Their disagreement is itself useful research evidence.

## 12. Fidelity must remain a constraint

A representation that improves task performance by adding unsupported information must not receive a clean positive representation-effect estimate.

Model the trial validity/fidelity state separately.

Potential invalidation states:

- unsupported insertion,
- critical omission,
- altered relation,
- answer leakage,
- source-recovery failure,
- protocol violation.

A fidelity-invalid trial should not simply be treated as a low/high outcome; it may need exclusion from the efficacy estimate and separate analysis as a representation failure.

## 13. Validation hierarchy

Before increasing model complexity:

### Level 1 — descriptive
Within-reader paired differences.

### Level 2 — controlled regression
Account for task/content/context variables.

### Level 3 — mixed effects
Account for repeated readers and item/content families.

### Level 4 — hierarchical Bayesian
Estimate reader-specific effects with partial pooling and explicit uncertainty.

### Level 5 — contextual/adaptive model
Predict which comparison will be most informative.

Each level must demonstrate held-out improvement before the next is adopted.

More model sophistication is not evidence of better personalization.

## 14. Model evaluation

Every candidate model should be evaluated on:

- held-out predictive performance,
- calibration of uncertainty,
- recommendation accuracy,
- recommendation regret,
- false recommendation rate,
- harm/negative-transfer rate,
- fidelity failures,
- stability under new content,
- stability under new tasks,
- computational/battery burden where relevant.

The key comparison is not:

> Which model fits historical data best?

It is:

> Which model produces the most reliable conditional representation recommendations on unseen material?

## 15. Simulation before deployment

Before using adaptive modeling with real readers, simulate realistic data-generating conditions:

- no representation effect,
- small positive effect,
- large positive effect,
- reader heterogeneity,
- task-specific effects,
- content-specific effects,
- context interactions,
- contradictory evidence,
- noisy scoring,
- fidelity failures,
- sparse readers,
- profile drift.

Evaluate whether the proposed algorithm:
- detects real effects,
- avoids false recommendations,
- preserves alternatives,
- updates after reversals,
- stops appropriately,
- avoids overconfidence.

## 16. Initial recommended modeling path

For the research instrument:

**paired trial differences → mixed-effects model → Bayesian partial pooling only after sufficient data**

The product should not depend on a sophisticated model to begin collecting valid evidence.

The measurement protocol must work even if the model is temporarily replaced by deterministic rules.

## Conclusion

The statistical target for Reframe is not “reading ability.”

It is a conditional, reader-specific representation effect:

> **How does changing the representation alter useful task outcomes, interaction cost, and fidelity for this reader under this task and information condition?**

The safest progression is to establish clean paired evidence first, then add statistical complexity only when held-out validation demonstrates that the additional complexity improves recommendation quality.
