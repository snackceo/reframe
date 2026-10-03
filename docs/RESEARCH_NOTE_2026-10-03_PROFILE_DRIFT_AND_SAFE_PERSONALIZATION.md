# Reframe Research Note — Profile Drift and Safe Personalization

**Date:** 2026-10-03  
**Status:** Research decision  
**Scope:** Cold start, longitudinal learning, profile drift, and recommendation safety

## Finding

Reframe should not treat its initial calibration as a permanent determination of what works for a reader.

Reading difficulty is produced by interactions among reader, passage, and task characteristics. Large-scale reading research has found that passage features such as sentence length, word frequency, syntax, and temporality can affect comprehension, with effects moderated by reader characteristics and task type. citeturn0search7turn0search13

This means a representation can be useful in one context and less useful in another. Reframe therefore needs **conditional personalization** rather than a single global reader profile.

## Cold-start strategy

The new-reader flow should combine three evidence sources:

1. **Self-report prior** — the short setup questionnaire.
2. **Calibration evidence** — controlled comparisons across representations.
3. **Population prior** — aggregate evidence about which representations tend to work for similar task/content conditions.

The population prior must never override observed reader evidence. Its purpose is to make the first few interactions informative when there is little individual data.

Recent work on cold-start personalization describes the same general problem: sparse initial interactions can be addressed using structured population-level priors followed by online inference rather than retraining a model for every new user. This is useful methodological support, not evidence that Reframe should copy that particular algorithm. citeturn0search12

## Contextual profile

The representation profile should be indexed by meaningful context, including where supported:

- task type
- content structure
- domain
- language/script
- representation
- reading environment
- confidence/evidence strength

Do not store only:

> preferred_representation = 5W+H

Prefer evidence such as:

> 5W+H has repeatedly improved explicit information-retrieval performance for this reader under comparable conditions.

## Profile drift

Reader evidence can change because:

- the reader becomes more familiar with a task
- the content domain changes
- the reading purpose changes
- the device/environment changes
- the reader's preferred workflow changes
- a previously useful representation becomes tiring
- new evidence contradicts the earlier estimate

Therefore older observations should not have unlimited authority.

The eventual system should use recency and evidence strength rather than simply averaging every observation forever.

## Exploration requirement

A purely exploitative system creates a feedback loop:

**early recommendation → repeated use → insufficient alternative evidence → recommendation appears increasingly certain**

Reframe should retain a controlled amount of exploration.

Exploration should increase when:

- confidence is low
- evidence is stale
- the task type changes
- content characteristics change substantially
- the reader repeatedly overrides the recommendation
- the recommended representation produces declining outcomes

Exploration should decrease when the system has strong, recent, repeated evidence.

## Override is evidence

When a reader manually changes representation, that action should not be treated simply as a preference event.

Possible interpretations include:

- the recommendation was wrong
- the task changed
- the representation was visually uncomfortable
- the reader wanted a different workflow
- the reader was verifying information
- the reader simply prefers another interface despite equivalent performance

The system should therefore combine the override with subsequent task outcome before changing confidence substantially.

## Avoiding self-reinforcing errors

Reframe must not use its own recommendation as proof that the recommendation works.

Evidence hierarchy should remain approximately:

**objective task outcome → repeated held-out evidence → interaction evidence → confidence/preference → recommendation history**

Recommendation history is contextual information, not independent evidence of efficacy.

## Safe recommendation states

The system should support at least four states:

### Strong evidence
Repeated, recent, comparable observations support the representation.

### Tentative evidence
Some evidence exists, but context or sample size is limited.

### Uncertain
Available evidence does not distinguish representations reliably.

### Conflicting
Different contexts produce materially different results.

The UI should not manufacture certainty when the evidence is uncertain.

## Adaptive testing implication

A 2026 adaptive reading-comprehension model demonstrates the feasibility of dynamically adjusting task complexity from learner performance. This supports adaptive experimentation as a technical direction, but it does not establish Reframe's representation-selection algorithm. citeturn0search2

For Reframe, the first implementation of adaptive calibration should therefore remain interpretable. A simple evidence model should be preferred over a black-box controller until there is empirical evidence that additional complexity is necessary.

## Content/task confounding remains a hard requirement

A reader's score cannot be interpreted without knowing the difficulty of the content and task.

Research on reading assessment shows that passage and question characteristics can independently influence difficulty. citeturn0search0turn0search5

Therefore each calibration observation must retain enough metadata to determine whether an apparent representation effect could instead be explained by:

- vocabulary
- syntax
- passage structure
- temporal/causal complexity
- question type
- inference demand
- distracting information
- prior knowledge

## Product consequence

The setup should not promise:

> "We'll figure out exactly how you read."

It should implicitly operate as:

> **"We'll learn what helps you with different kinds of reading."**

That is a more defensible representation of the evidence and leaves room for the profile to change.

## Current research gate

The cold-start and longitudinal personalization problem is now sufficiently specified for a future prototype experiment, but production implementation remains gated.

Before the build warning, research should still establish:

- minimum viable calibration burden
- statistical confidence/stopping criteria
- population-prior construction
- privacy/data minimization
- accessibility of the calibration procedure
- multilingual calibration strategy
- semantic-fidelity evaluation
- negative-effect detection
- recommendation explanation language

**No production implementation is authorized by this document.**
