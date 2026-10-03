# Reframe Cold-Start and Longitudinal Personalization

Date: 2026-10-03

## Research decision

Reframe should not expect the first setup session to perfectly identify the best representation. The initial profile is an uncertain estimate that must improve through later evidence.

Adaptive-learning research identifies this as a cold-start problem: systems initially have limited information about the individual and can make poor recommendations until evidence accumulates. Studies show that informed priors and data about the material can reduce this problem. citeturn0search0turn0search2

A 2026 paper on cold-start personalization provides additional support for using a small number of adaptive questions with population-level priors rather than requiring a long onboarding interaction. Its reported results are from general preference elicitation, not reading accessibility, so Reframe should treat the method as methodological evidence rather than direct efficacy evidence. citeturn0search1

## Consequence for Reframe setup

The questionnaire should be short because it supplies priors, not because it is expected to diagnose the reader's needs.

The first calibration trials should then be selected to maximize useful information about competing representation hypotheses.

Conceptually:

**questionnaire prior → exploratory trials → posterior representation estimates → confirmation trials → recommendation**

## Do not over-personalize from too little data

Early evidence should have low confidence.

A single successful trial should not cause Reframe to permanently prefer a representation. The system should distinguish:

- evidence count
- evidence quality
- task match
- content match
- consistency across trials
- recency
- uncertainty

The recommendation engine should be able to say that evidence is insufficient.

## Content matters as much as the reader

Cold-start research shows that predictions can benefit from information about the material as well as the learner. In one large adaptive-learning simulation, predictions based on the characteristics of the item generally outperformed predictions based only on the learner, while both contributed useful information. citeturn0search2

For Reframe this means the model should not simply learn:

> “This reader likes 5W+H.”

It should learn something closer to:

> “This representation has performed well for this reader on this class of task and this class of content.”

## New-user strategy

A new reader should receive a safe baseline experience while Reframe gathers evidence.

The baseline should favor:

- source fidelity
- low transformation risk
- easy source recovery
- clear controls
- low interaction cost
- broad usefulness

The system can then test more transformative representations when the task makes them relevant.

## Longitudinal learning

The profile should continue updating after setup.

Evidence can change because:

- the reader becomes familiar with a representation
- a different task requires a different representation
- content complexity changes
- reading context changes
- the reader's needs change
- an earlier estimate was simply wrong

Research on adaptive instructional systems indicates that assuming identical learning rates or fixed learner parameters can create systematic prediction errors; online adjustment improves model accuracy. citeturn0search9

Therefore Reframe should not freeze the initial setup profile.

## Avoid self-reinforcing recommendations

A major risk is:

**early mistake → recommendation → reader mostly uses recommendation → system observes only recommendation → false confidence**

Reframe should periodically perform exploration against credible alternatives.

This can be lightweight and task-triggered rather than a repeated formal test.

For example, if 5W+H has a strong estimate for literal retrieval, Reframe does not need to challenge it on every paragraph. But when a new task type appears, it should reconsider the candidate set.

## Exploration versus exploitation

The personalization system should balance:

**Exploitation:** use the representation currently supported by evidence.

**Exploration:** occasionally test an alternative when uncertainty or task/content changes justify it.

The exact algorithm is not yet selected. A simple Bayesian or contextual-bandit-style model is a research candidate; a complex reinforcement-learning system is not justified yet.

## Profile expiration and recency

Evidence should not be treated as permanently valid.

The profile should retain historical evidence while allowing newer, context-matched evidence to influence current recommendations.

Do not use arbitrary expiration periods until research establishes them. Instead, track timestamps and context and allow the model to learn whether older evidence remains predictive.

## Privacy implication

Longitudinal personalization creates a sensitive behavioral dataset even without storing a diagnosis. Reframe should therefore minimize stored information and prefer derived representation evidence over raw reading content whenever the raw content is not necessary.

The system should distinguish:

- content needed temporarily to perform a transformation
- evidence needed to personalize
- raw reading history that does not need to be retained

This requirement must be carried into the later privacy architecture.

## Current recommendation

The initial personalization engine should be deliberately simple and interpretable.

A suitable research progression is:

1. rule-based baseline
2. Bayesian evidence model
3. contextual statistical model
4. more complex model only if simpler approaches fail

There is currently no research justification for starting with reinforcement learning or a large language model as the personalization controller.

The language model may perform representation generation; it does not need to decide the reader's profile.

## Current research gate

Cold-start and longitudinal behavior are now sufficiently specified at the conceptual level.

Remaining questions include:

- how much exploration is acceptable before reader fatigue becomes a problem
- how representation utility should be weighted
- how task/content context should be encoded
- how privacy-preserving evidence storage should work
- what minimum evidence threshold should trigger a recommendation
- how to evaluate longitudinal benefit rather than short-term preference

No production implementation begins yet.
