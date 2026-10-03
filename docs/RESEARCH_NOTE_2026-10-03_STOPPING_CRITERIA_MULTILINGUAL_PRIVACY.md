# Reframe Research Note — Calibration Stopping, Multilingual Safeguards, and Privacy

**Date:** 2026-10-03  
**Status:** Research decision  
**Scope:** Adaptive calibration stopping criteria, multilingual fairness, and personalization data minimization

## 1. Calibration should stop on evidence, not a fixed number alone

Computerized adaptive testing research distinguishes fixed-length stopping from variable-length stopping based on measurement precision or expected information gain. Recent 2026 research on multidimensional adaptive calibration likewise evaluates variable-length stopping rules using information and estimation-error criteria. citeturn0search0turn0search1

Reframe should borrow the **principle**, not copy psychometric thresholds designed for standardized tests.

The product problem is different: Reframe is estimating which representation is useful for a reader under particular reading conditions, not diagnosing ability.

### Proposed Reframe stopping concept

Stop calibration when all of the following are sufficiently satisfied:

1. A small number of credible candidate representations have been tested.
2. The leading candidate has enough evidence relative to alternatives.
3. Evidence includes more than one content/task instance.
4. The result is not obviously explained by passage or task difficulty.
5. Additional testing is unlikely to materially change the recommendation.
6. A maximum burden limit has not been exceeded.

If those conditions are not met, Reframe should either continue with a high-information comparison or return **insufficient evidence**.

This is preferable to a universal rule such as “always test ten examples.” Adaptive-testing research specifically identifies the tradeoff between precision and testing burden and shows why fixed length can administer unnecessary items. citeturn0search0turn0search5

## 2. Calibration should have a hard burden ceiling

Evidence should never be pursued indefinitely at the reader's expense.

The calibration system therefore needs:

- maximum trials per session
- maximum expected time
- immediate skip/stop control
- ability to defer calibration until later
- no penalty for stopping early

The exact numerical limits remain an experimental UX question.

## 3. Do not pretend statistical confidence is clinical certainty

Reframe's confidence value should mean something narrow, such as:

> “How stable is the observed difference between representations under the tested conditions?”

It must not mean:

> “How confident are we about this person's disability or cognitive profile?”

The latter is outside Reframe's intended scope.

## 4. Multilingual calibration is a separate research requirement

Recent systematic-review evidence shows that reading-assessment validity for emergent bilingual readers varies by skill, language of assessment, and linguistic background, with substantial gaps in the populations represented by existing studies. citeturn1search2turn1search3

Research also shows that background knowledge and language proficiency can interact with reading performance on particular items and passages. citeturn1search0turn1search11

Therefore Reframe must not interpret a low calibration result as evidence that a representation is ineffective for a reader without considering:

- language of the source
- language proficiency/context
- script
- vocabulary familiarity
- cultural/background knowledge
- translation versus original-language content
- whether the task itself is language-dependent

### Product implication

A reader should be able to identify the language being read, and Reframe should maintain evidence separately by language/script where the evidence supports doing so.

A representation that works in English should not automatically inherit the same score in Spanish, Arabic, Japanese, or another language.

Likewise, a multilingual reader should not be forced into a monolingual “reading ability” estimate.

## 5. Avoid using calibration as an indirect disability screener

The existing research gate remains important: Reframe is an assistive representation system, not a diagnostic instrument.

A calibration result such as “this reader performed better with chunking” should remain a product-level observation.

It should not become:

> “This indicates dyslexia.”

The multilingual assessment literature reinforces this caution because even formal reading assessments can have validity limitations across language groups. citeturn1search2turn1search3

## 6. Response format itself can contaminate measurement

Reading-comprehension research shows that response format can account for substantial variance in observed comprehension scores and can interact with language knowledge. citeturn1search8

Therefore Reframe should not rely on one response mechanism.

Where feasible, calibration should include task-appropriate response formats, for example:

- multiple choice for low-friction factual retrieval
- selection/highlighting for evidence location
- ordering for sequence
- matching for relationships
- short response when genuinely necessary

The response mechanism must be treated as part of the measurement design.

## 7. Data minimization

The reader model should store only information needed to improve representation selection and evaluate the system.

Potentially useful data:

- representation used
- task class
- content/task metadata
- outcome
- interaction cost
- confidence
- explicit preference
- language/script context
- evidence strength
- timestamp/recency when needed for drift

Avoid collecting or retaining unnecessary sensitive information.

A disability diagnosis should not be required to personalize Reframe.

For education deployments, privacy obligations can be materially different when identifiable student records are involved; U.S. Department of Education guidance notes that FERPA governs disclosure of personally identifiable information from education records in covered circumstances and that agreements/controls may be required when vendors handle such data. citeturn1search7

This is a legal-design consideration, not a claim that every Reframe deployment is subject to FERPA.

## 8. Privacy architecture implication

The research model should distinguish:

**personal identity data**
from
**representation-performance data**.

Where practical, representation-performance data should be pseudonymous or locally retained, and raw source content should not be retained merely because it was used for calibration.

The minimum viable personalization record should be substantially smaller than a full reading history.

## 9. New research gate

Before production implementation, Reframe must establish experimentally:

- a practical calibration burden ceiling
- a stopping rule suitable for representation comparison
- minimum evidence required before recommending a representation
- handling for insufficient/conflicting evidence
- multilingual calibration strategy
- response-format controls
- data retention/minimization rules
- user-visible explanation and override behavior

## 10. Current direction

The calibration system is now best conceptualized as a **small adaptive measurement system**, not a quiz and not a diagnostic test.

The loop is:

**questionnaire prior → broad exploration → high-information comparison → stopping decision → recommendation → ongoing validation**

The next research priority is therefore to define the **representation taxonomy and transformation fidelity contract**: exactly what each representation is allowed to change, what must remain invariant, and how Reframe verifies that constraint.

**No production implementation has started.**
