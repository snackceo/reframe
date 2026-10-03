5082e99398a76dd34c84169bff28047cc5f9da07
## 15. Core abstraction: representation recipes

A future Reframe mode does not have to be a single fixed template.

A **representation recipe** is a combination of transformations selected for a particular reader, content type, and task.

Conceptually:

`recipe = grouping + emphasis + hierarchy + modality + optional wording`

Examples:

- chunking + noun/verb emphasis
- 5W + H + source
- timeline + source
- steps + emphasis + audio
- definitions + source
- spacing + focus

This is intentionally more flexible than a large menu of named modes.

The reader could still experience a simple interface such as:

**Original | Focus | Structure | Explain | Listen**

while the implementation treats each as a recipe.

## 16. The representation should explain itself

Reframe should avoid a "magic transformation" UX.

When a representation is active, the product should make it possible to understand:

- what changed;
- what did not change;
- where transformed information came from;
- how to return to the source.

The representation itself should remain visually simple even if the underlying system is sophisticated.

## 17. Information structure as the target

Reframe should optimize for **information structure**, not visual novelty.

The system may eventually identify structures such as:

- actor → action → object;
- event → time → location;
- cause → effect;
- condition → outcome;
- problem → solution;
- claim → evidence;
- option A ↔ option B;
- sequence of steps;
- definition → example.

A representation is useful when exposing one of these structures helps the reader perform a task without distorting the source.

## 18. Minimal product surface

The product should resist turning every discovered transformation into a permanent button.

A possible conceptual interface is:

**Read normally**

Then, when needed:

**Reframe**
- Focus
- Structure
- Key information
- Explain
- Listen

The exact labels are unresolved.

The underlying system may support many transformations while the reader-facing surface remains small.

This is consistent with accessibility guidance emphasizing personalization and simplification rather than forcing every capability into the default interface.

## 19. The "stuck" interaction

A particularly important product hypothesis is an explicit recovery action:

> **I'm stuck.**

Instead of requiring the reader to understand a technical list of representations, Reframe could offer a small set of next-step representations.

For example:

**I'm stuck →**
- Break it apart
- Show what matters
- Put it in order
- Explain a word
- Read it aloud

This should remain an experiment rather than a locked UX decision.

## 20. What the algorithm is actually trying to learn

If adaptive behavior eventually becomes useful, the system should not simply learn "this person likes dyslexia mode."

It should learn relationships such as:

**reader × content × task × representation → observed outcome**

Possible outcomes:

- comprehension;
- time;
- rereading;
- error rate;
- source-fidelity judgment;
- explicit preference;
- abandonment.

The system could eventually learn that a reader often chooses one representation for one class of content and another representation elsewhere.

Any automatic recommendation should remain explainable and reversible.

## 21. Product moat hypothesis

The potential long-term value is not the existence of an LLM or OCR pipeline.

The potential value is a **representation system**:

1. a vocabulary of transformations;
2. source-preserving intermediate structures;
3. validation methods;
4. reader preferences;
5. content-to-representation matching;
6. evidence about which combinations actually help.

That is the product knowledge that can compound over time.

This is a hypothesis, not an established competitive advantage.

## 22. Updated product question

The central question is now:

> **Can Reframe discover and deliver representations that make information structure easier to perceive for a particular reader, for a particular task, without sacrificing source fidelity?**

Everything else — HUDs, accessibility services, OCR, models, cloud processing, glasses, and UI details — is downstream of that question.
