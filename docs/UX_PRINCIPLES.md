# Reframe — UX Principles

**Status:** Product design specification  
**Last reviewed:** 2026-10-02

## 1. Purpose

Reframe should make information easier to work with without making the reader surrender control over the information.

The interface is therefore subordinate to the representation system.

## 2. Reader control is primary

The reader should be able to:

- choose a representation;
- switch representations;
- return to source;
- understand when a transformation is active;
- disable automatic behavior;
- recover from an unhelpful transformation.

Automatic assistance is useful only when it remains understandable and reversible.

W3C guidance explicitly supports adaptation and personalization and emphasizes user control when content changes. Reframe follows that principle while testing whether its specific representations are useful. 

## 3. Source-first interaction

The source should remain a first-class object.

A transformed view should never make the original difficult to recover.

Preferred relationship:

**Source ↔ Representation**

not:

**Source → irreversible rewrite**

The reader should be able to compare a transformation with the source when meaning is uncertain.

## 4. Progressive assistance

Reframe should not make every passage maximally transformed.

Conceptual progression:

**Source → Focus → Structure → Transform → Multimodal**

A reader may stop at any level.

The least invasive representation that solves the task is preferable as a product hypothesis, not as a universal rule.

## 5. No surprise transformations

The interface should clearly communicate:

- active representation;
- whether wording changed;
- whether information was reorganized;
- whether information was added as explanation;
- whether audio is reading the source or a transformed version.

A transformation should never silently become the user's new source of truth.

## 6. Small surface, deep system

The underlying representation vocabulary may become large.

The visible interface should remain small.

Instead of exposing every transformation as a permanent button, the product can group them by reader intent:

- **Focus** — make salient information easier to locate.
- **Structure** — expose relationships and organization.
- **Explain** — support vocabulary or difficult language.
- **Listen** — provide another modality.

These labels are provisional.

## 7. Task-oriented assistance

The UI should ask what the reader is trying to accomplish rather than assuming a diagnosis determines the correct mode.

Examples:

- Find the deadline.
- Understand who did what.
- Follow the steps.
- Compare two options.
- Understand an unfamiliar term.
- Remember the sequence.

This suggests a future interaction:

**What are you trying to do? → Reframe chooses candidate representations → reader confirms or changes them.**

This is a hypothesis for testing, not a committed workflow.

## 8. "I'm stuck" as recovery

A reader who cannot determine the correct mode should not need to understand representation terminology.

Possible recovery actions:

- Break it apart.
- Show what matters.
- Put it in order.
- Explain a word.
- Read it aloud.

The goal is to turn failure into a representation-selection opportunity.

## 9. Explainability without technical overload

Reframe should expose enough information to establish trust without forcing the reader to understand the implementation.

Good:

> **Structure view**  
> Same source, reorganized into relationships.

Potentially useful:

> **Simplified wording**  
> Some sentences were rewritten. View source.

Avoid exposing model names, token counts, or internal confidence scores unless they help the reader make a meaningful decision.

## 10. Preserve uncertainty

The UI must not make uncertain information look certain.

If the source says:

- may;
- might;
- reportedly;
- according to;
- approximately;
- possibly;

the representation must preserve that status.

If Reframe infers a relationship that is not explicitly stated, the product should distinguish the inference from source content.

## 11. Accessibility of the accessibility layer

Reframe itself must support:

- dynamic text sizing;
- sufficient contrast;
- screen-reader access;
- keyboard or switch access where relevant;
- predictable focus;
- reduced motion;
- user-controlled timing;
- accessible audio controls.

The representation system cannot be considered successful if its controls introduce a new barrier.

## 12. Failure should be graceful

When a representation cannot be generated reliably:

1. keep the source available;
2. do not fabricate missing information;
3. explain the failure briefly;
4. offer another representation;
5. allow retry.

Failure should never force the reader into an empty or misleading transformed view.

## 13. Privacy should be visible at the right moments

Privacy controls should not require the reader to understand the entire architecture.

When content may leave the device, the product should provide understandable disclosure and meaningful control.

Default behavior should minimize unnecessary transmission.

## 14. UX success criteria

A UX experiment should evaluate more than visual preference.

Measure, where relevant:

- task completion;
- comprehension;
- time;
- rereading;
- errors;
- confidence;
- effort;
- representation switching;
- source recovery;
- user-reported trust.

A representation that looks cleaner but increases misunderstanding is not a successful representation.

## 15. Design principle

**The reader should feel more in control of the information, not less.**

W3C's current accessibility work also emphasizes adaptable presentation and user personalization; Reframe's UX should align with those principles without treating W3C guidance as validation of any particular Reframe feature.
