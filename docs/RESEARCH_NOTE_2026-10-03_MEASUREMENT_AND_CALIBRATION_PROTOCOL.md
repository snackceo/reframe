# Reframe Measurement and Calibration Protocol

Date: 2026-10-03

## Decision

The next research priority is not choosing an AI model or designing the final interface.

It is defining how Reframe will determine whether one representation actually works better for an individual reader.

The central question is:

> Given the same underlying information and task, does representation A produce a better useful outcome than representation B for this reader, and does that advantage persist on unseen content?

This is the measurement problem that must precede production personalization.

## What “best” means

“Best representation” must not mean:

- the representation the reader says they like most
- the representation that looks most accessible
- the representation that is easiest to generate
- the representation associated with a diagnosis
- the representation that produces the fastest reading time alone

Instead, Reframe should estimate a conditional utility that combines task success with the cost of using the representation.

A provisional conceptual model is:

**utility = task outcome − interaction cost**

Task outcome can include:

- comprehension accuracy
- factual retrieval accuracy
- correct sequencing
- correct comparison
- correct action selection
- appropriate inference

Interaction cost can include:

- reading time
- rereading
- navigation
- switching
- source verification
- visual density
- audio controls
- abandonment

The exact weighting must be determined empirically rather than assumed now.

## Why time cannot be the objective by itself

Reading research demonstrates that reading speed and comprehension are not interchangeable. Deliberate reading tasks can produce different eye-movement patterns from faster reading, and rereading itself can improve comprehension. Therefore a representation that reduces time while reducing answer accuracy must not be treated as an improvement.

A 2025 study examining reading-speed manipulation found systematic changes in eye-movement behavior as speed changed, including reduced rereading at higher speeds. This supports measuring comprehension alongside time rather than optimizing speed alone.

A 2025 rereading study similarly found that rereading changed reading behavior and improved comprehension in its experimental setting. Re-reading therefore cannot automatically be coded as failure.

## Rereading must be classified, not simply counted

Reframe should distinguish at least:

### Productive rereading
Examples:

- returning to verify a source statement
- checking a temporal relationship
- resolving an ambiguity
- confirming an answer before submission

### Potentially confusion-driven rereading
Examples:

- repeatedly returning to the same region without improved task performance
- oscillating between representation and source without resolution
- repeated navigation caused by unclear structure

A raw reread count is therefore insufficient.

## Core outcome families

Every calibration trial should be associated with a defined task type.

### 1. Literal retrieval
Question answerable directly from the source.

Examples:
- Who?
- What?
- When?
- Where?

### 2. Relational integration
Requires combining information across sentences or regions.

Examples:
- What happened after X?
- How are A and B related?

### 3. Inference
Requires a conclusion not explicitly stated.

Examples:
- Why did X happen?
- What is most likely implied?

### 4. Structure
Requires understanding organization.

Examples:
- Which event came first?
- What is the main point?
- Which claim supports the conclusion?

### 5. Action
Requires using the information.

Examples:
- Which step should happen next?
- Which option satisfies the stated constraint?

### 6. Summary
Requires preserving the central meaning without introducing unsupported information.

These task classes should not be collapsed into one comprehension score because a representation can help one demand while harming another.

## Primary calibration design

The primary research instrument should use:

**same content -> same task -> different representation -> measured outcome**

with randomized or counterbalanced representation order.

Where practical:

- use parallel, unseen passages/items rather than repeatedly testing the exact same text
- prevent answer-memory from contaminating later conditions
- keep question difficulty approximately matched
- separate demonstration from measurement
- record trial-level data rather than only final preference

## Questionnaire role

A short setup questionnaire is appropriate, but it is a prior rather than a conclusion.

It may collect:

- reading goals
- self-reported difficulties
- existing accessibility/assistive supports
- known representation preferences
- typical device/context
- relevant language/script information
- optional accessibility information

It must not:

- diagnose
- assign a permanent reader type
- select the final representation
- replace behavioral calibration
- require disability disclosure

A mismatch between questionnaire expectation and observed performance is useful evidence, not a failure of the questionnaire.

## Calibration evidence profile

Reframe should maintain conditional evidence rather than a fixed identity.

Example:

> For information-location tasks on tested content, this reader has shown repeated benefit from a structured extraction representation.

Not:

> This reader is a 5W+H reader.

The profile should support:

- stable benefit
- no detectable benefit
- task-specific benefit
- content-dependent benefit
- insufficient evidence
- conflicting evidence
- explicit reader override

## Validation requirement

A representation recommendation is not established merely because it predicts the condition that performed best during calibration.

The recommendation must be evaluated on held-out content.

Minimum conceptual validation:

1. calibration items
2. learned conditional recommendation
3. unseen parallel items
4. compare recommended representation against relevant alternatives
5. measure whether the observed advantage persists

This prevents Reframe from learning the quirks of the calibration passages.

## Side-by-side versus one-at-a-time

The primary calibration experiment should use one representation at a time.

Side-by-side comparison introduces additional variables:

- visual comparison
- integration cost
- answer-copying
- cross-view navigation
- attention divided between representations

Side-by-side comparison can be studied later as a separate UX experiment.

## Semantic fidelity

For any transformation that changes wording or adds information, outcome measurement must be paired with fidelity measurement.

At minimum track:

- source-supported information
- omitted information
- altered information
- unsupported insertion
- conflicting information
- provenance/source location
- whether the original can be recovered

Readable or preferred content is not automatically source-faithful.

A recent 2026 dyslexia-focused preprint similarly separates visual accessibility from fidelity safety and uses protected spans and reviewable risk flags. This is promising research direction, not established clinical efficacy.

## Research implication

The smallest useful Reframe research instrument is therefore not a polished reader app.

It is a controlled experiment capable of answering:

> Which representation, for which reader and task, produces which measurable outcome, at what interaction cost, while preserving source meaning?

Only after that question can be answered reliably should Reframe automate representation selection at scale.

## Current gate

No production implementation begins yet.

Before the build warning, remaining research should establish:

- matched-content construction
- task/question construction
- outcome scoring
- fidelity scoring
- switching-cost measurement
- questionnaire wording
- minimum sample/protocol considerations
- held-out validation procedure
- privacy/minimization requirements
- accessible experimental UI requirements

Then the project can reach the explicit build-warning gate.
