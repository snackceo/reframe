# Research Note — Personalized Representation Calibration

**Date:** 2026-10-03  
**Status:** Research decision  
**Scope:** Reframe setup/calibration and representation selection

## Decision

Reframe's setup/calibration is not merely a preference survey or usability exercise. Its purpose is to collect controlled evidence that can estimate which representation is most effective for a particular reader **for a particular task and content condition**.

The product should therefore learn from the reader's chosen output **and from observed outcomes**, rather than treating the chosen output itself as the answer.

## Research basis

Personalized/adaptive learning research supports adapting delivery using learner performance, preferences, interactions, and related evidence. A 2024 global meta-analysis of 27 K–12 reading studies found a positive aggregate effect for personalized/adaptive learning, while also finding substantial contextual moderation. This supports personalization as a research-backed direction, but does not establish a universal representation or prove Reframe's specific algorithm. 

Reading research also shows that preference and performance can diverge. Studies comparing print and digital reading have found cases where participants preferred one medium while comprehension or calibration favored another. Therefore preference must be retained as a signal, not treated as ground truth.

## Reframe calibration model

The core target is:

**P(best representation | reader, task, content, context)**

"Best" must be operationalized through measured outcomes, not a subjective label.

A representation profile should be conditional rather than a single permanent reader type.

Example:

- 5W+H may have strong evidence for explicit information-location tasks.
- Chunking may have stronger evidence for sequential/procedural content.
- Timeline may be useful for temporal organization.
- Simplification may help under some language/readability conditions but requires semantic-fidelity validation.
- Presentation changes may reduce visual competition for some readers but not universally.

These are hypotheses and candidate operations; calibration determines their individual utility.

## Setup protocol

### 1. Controlled content

Present the same underlying information across representation conditions.

### 2. Controlled task

Keep the task equivalent across conditions. Do not compare representations using different questions or different information demands.

### 3. Candidate representations

Initial candidate set may include:

- Original
- Presentation/spacing
- Emphasis
- Chunking
- Outline/list
- 5W+H
- Timeline
- Comparison
- Definition support
- Audio

The candidate set is configurable and should not be interpreted as a diagnostic taxonomy.

### 4. Measurement

Collect, where applicable:

- objective comprehension accuracy
- literal information retrieval
- cross-sentence/relational understanding
- inference accuracy
- task completion time
- rereading
- navigation
- source-recovery actions
- representation switching
- perceived difficulty/effort
- confidence
- explicit preference

Confidence and preference are separate from objective performance.

### 5. Held-out validation

Do not learn a reader's representation profile only from the passage used for calibration.

After calibration, test the candidate recommendation on unseen but matched content/tasks.

A representation should gain confidence in the profile only when its benefit generalizes beyond the demonstration item.

### 6. Continuous updating

The initial setup creates a prior, not a permanent identity.

Subsequent reading sessions provide additional evidence. Reframe should update representation estimates as new reader/task/content observations arrive.

The profile must permit:

- no stable winner
- multiple useful representations
- task-specific preferences
- content-specific effects
- insufficient evidence
- explicit reader override

## Recommendation logic

The initial system should prefer evidence-backed rules or simple statistical models before a complex AI selector.

Conceptually:

**reader evidence + task + content features + representation → predicted utility**

Predicted utility should account for both outcome and interaction cost.

A useful decomposition is:

**Utility = task outcome − interaction cost**

Interaction cost can include:

- switching time
- navigation disruption
- rereading caused by the representation
- source verification burden
- visual density
- audio-control burden
- abandonment

A representation that produces high accuracy but creates excessive interaction cost should not automatically be treated as optimal.

## Switching

Switching is evidence, not automatically success or failure.

Classify switching where possible as:

- productive switching: reader intentionally changes representation and subsequently improves task progress/outcome
- confusion-driven switching: repeated switching accompanies difficulty, uncertainty, or failure
- verification switching: reader returns to the source to confirm information

Do not use raw switch count as the personalization target.

## Demonstration versus measurement

Showing multiple representations and explaining them is not itself evidence that the reader benefits from them.

Separate:

1. explanation
2. demonstration
3. calibration measurement
4. held-out validation
5. ongoing in-product evidence

## Personalization boundary

Reframe should not infer a fixed identity such as "5W+H reader" or "timeline reader."

Use conditional evidence such as:

> "For explicit information-location tasks, this reader has repeatedly shown better outcomes with 5W+H."

The system should be able to change that estimate when later evidence disagrees.

## Research implication

The purpose of setup is therefore:

**discover → measure → estimate → validate → adapt**

not:

**ask preference → save preference → always use that representation**

This becomes a central product requirement for Reframe.

## Current research gate

The literature establishes enough evidence to specify this calibration architecture. The remaining empirical question is not whether personalization is conceptually justified, but how well Reframe's representation candidates predict and improve outcomes for individual readers across held-out content and tasks.

No production implementation is authorized by this note.
