# Reframe — Representation System

**Status:** Concept specification  
**Last reviewed:** 2026-10-02

## 1. Purpose

A representation is a deliberate way of presenting source information to make some property of that information easier to perceive.

Reframe is not defined by a single representation. It is defined by the ability to move between representations while retaining a trustworthy relationship to the source.

## 2. Representation contract

Every representation should answer:

- What source content is it based on?
- What transformation was applied?
- What information was preserved?
- What information was reorganized?
- What information was omitted, if any?
- Did wording change?
- Can the reader inspect the source?
- How confident is Reframe in the transformation?

The safest representations make the fewest semantic changes.

## 3. Representation levels

### R0 — Source

The original content with no semantic transformation.

Purpose:
- baseline;
- verification;
- recovery when another mode fails.

Invariant:
- exact source fidelity.

### R1 — Visual guidance

Words remain unchanged.

Examples:
- increased spacing;
- line/paragraph separation;
- semantic emphasis;
- current phrase highlighting;
- focus window;
- grouping.

Risk:
- low semantic risk;
- can still create visual distraction or accessibility problems if poorly designed.

### R2 — Structural representation

The words may move or be grouped, but the goal is to preserve the underlying propositions.

Examples:
- sentence segmentation;
- bullets;
- headings;
- 5W + H;
- who → action → object;
- timelines;
- comparison structures;
- ordered steps.

Risk:
- moderate semantic risk because reorganization can imply relationships that were not actually present.

### R3 — Linguistic transformation

Wording changes.

Examples:
- plain-language rewrite;
- paraphrase;
- sentence simplification;
- definition expansion.

Risk:
- high semantic risk;
- requires source comparison and stronger validation.

### R4 — Multimodal representation

The same information is expressed through another modality.

Examples:
- text-to-speech;
- synchronized audio and text;
- pronunciation support;
- future visual/interactive modalities.

Risk:
- depends on whether the modality reproduces or transforms the source.

## 4. Core representation families

### Emphasis

Make selected semantic categories visually salient.

Candidate categories:

- nouns/entities;
- verbs/actions;
- people;
- organizations;
- places;
- dates/times;
- numbers;
- conditions;
- negations;
- key phrases.

Important constraint:

Semantic emphasis must not imply that highlighted words are automatically more important than unhighlighted words unless the representation explicitly defines that meaning.

### Chunking

Group text into meaningful phrases or clauses.

Example:

The committee / reviewed the proposal / and decided / to postpone the project / until next year.

Goal:

Reduce the need to discover phrase boundaries while reading.

### Sentence breakdown

Split long or syntactically dense sentences into smaller units without changing wording where possible.

Goal:

Expose structure before attempting simplification.

### List / outline

Convert enumerations, sequences, or dense descriptive passages into explicit list structure.

Goal:

Make multiple items easier to locate and compare.

### 5W + H

Extract information into:

- Who
- What
- When
- Where
- Why
- How

Important constraint:

Fields may legitimately be unknown or not applicable. Reframe must not invent missing values.

A field should be allowed to say:

Not stated in the source.

### Timeline

Represent events in temporal order.

Important constraint:

Do not infer dates or order when the source does not establish them.

### Comparison

Represent explicit alternatives, differences, or similarities.

Important constraint:

Do not manufacture symmetry. If the source describes one side in greater detail, the representation must preserve that limitation.

### Definition support

Allow a reader to request a definition or explanation for a word or phrase without silently replacing the source.

Preferred pattern:

Source term → explanation → return to source

### Audio

Read source or transformed content aloud.

Audio should preserve a clear indication of what text is being spoken when synchronized highlighting is used.

## 5. Composability

Representations should be composable when their semantics do not conflict.

Examples:

- source + spacing;
- source + emphasis;
- chunking + emphasis;
- source + 5W + H;
- source + audio;
- chunking + audio;
- structure + source verification.

Avoid arbitrary combinations that create competing visual hierarchies.

## 6. Source traceability

Every generated structural item should be traceable to source spans when practical.

Example:

Who: the committee

should retain an internal relationship to the source phrase:

The committee reviewed...

For generated wording, the relationship should distinguish:

- exact source span;
- extracted text;
- transformed text;
- model-generated explanation.

This makes it possible to let a reader tap a representation and inspect where it came from.

## 7. Unknown is a valid value

Reframe must distinguish:

- stated;
- implied;
- inferred;
- unknown;
- contradictory.

For a reader-facing representation, only the first category should be treated as directly sourced.

Inference may be useful, but it should be labeled or constrained according to the product's eventual trust model.

## 8. Semantic preservation

A representation should preserve, where relevant:

- actors;
- actions;
- objects;
- quantities;
- dates;
- times;
- locations;
- conditions;
- negation;
- modality;
- uncertainty;
- attribution;
- causal relationships;
- temporal relationships;
- exceptions;
- scope.

Example:

The company may delay the launch if testing fails.

Must not become:

The company will delay the launch.

The latter removes uncertainty.

## 9. Transformation metadata

The eventual internal representation model should be able to describe a transformation conceptually like:

- source identifier;
- source spans;
- representation type;
- transformation version;
- model/provider if applicable;
- confidence/uncertainty;
- preserved elements;
- generated elements;
- timestamp;
- user-selected mode.

The exact implementation is intentionally undecided.

## 10. Failure behavior

If a representation cannot be generated reliably:

1. Keep the source available.
2. Do not fabricate missing content.
3. Do not silently substitute a different transformation.
4. Explain the failure only as much as necessary.
5. Allow the reader to continue with another representation.

The safest fallback is generally the source or a less transformative representation.

## 11. Representation selection

Selection can eventually happen at three levels:

### Explicit
The reader chooses the mode.

### Remembered
The system remembers a reader's preference.

### Adaptive
The system recommends or automatically applies a mode based on evidence.

Adaptive behavior should not remove explicit reader control.

## 12. Success criteria

A representation is useful only if it improves something meaningful without unacceptable tradeoffs.

Potential measures:

- comprehension;
- time;
- rereading;
- navigation;
- confidence calibration;
- recall;
- error rate;
- perceived effort;
- preference;
- source fidelity.

Preference alone is insufficient. A representation can feel easier while causing loss of important information.

## 13. Design rule

**Do not optimize for making text look easier. Optimize for making information easier to understand while preserving the information itself.**


## 14. Evidence status by representation family

The research evidence should be interpreted at the level of the operation and task, not the label alone.

| Representation family | Current evidence signal | Main limitation | Reframe status |
|---|---|---|---|
| Outline / graphic organizer | Supportive in some learning-disability and text-structure research | Benefits vary by organizer, task, outcome, and whether readers actively construct it | Test |
| Main idea / supporting details | Supported as a comprehension strategy in instructional literature | Strategy instruction is not equivalent to automatic extraction | Test |
| 5W+H | Direct evidence exists, including disability research | Current direct evidence located is very small/single-subject; why/how can require inference | Test narrowly |
| Timeline / sequence | Text-structure research supports sequence/chronology as a meaningful structure | Automatic timeline generation can misrepresent temporal relations | Test with fidelity checks |
| Cause/effect | Text-structure research supports cause-effect as a text structure | Causality may be explicit or inferred; inference must not be presented as source fact | Test with explicit state labels |
| Compare/contrast | Included in text-structure intervention research | Comparison axes can be invented or omit important qualifiers | Test with provenance |
| Visual symbols/icons | Mixed/negative evidence in some disability populations | Added visual information can increase load or distract | Experimental only |

### 15. Evidence-transfer rule

Evidence that a strategy works when **taught and practiced by a human** does not automatically establish that an automatically generated representation will work. Reframe should record the intervention type explicitly and avoid converting instructional evidence into product-effectiveness claims.

### 16. Representation-specific measurement

Each representation experiment should predefine the task it is intended to support. At minimum, test separate question types where relevant:

- literal retrieval;
- paraphrase;
- main idea;
- vocabulary;
- inference;
- temporal relationship;
- causal relationship;
- cross-sentence integration.

This prevents a representation from appearing effective merely because it improves one narrow question type while harming another.

## 20. Attention-operation taxonomy

Attention-related representations are distinct operations:

- **Emphasis:** visually mark selected information.
- **Focus:** reduce or mask competing information.
- **Tracking:** dynamically indicate current reading position.
- **Structural externalization:** expose relationships among information.
- **Content removal:** remove information judged extraneous.

Evidence for one operation must not be transferred to another.

## 21. Visual competition guardrail

The objective is not maximum visual simplification. A useful representation should reduce irrelevant competition while retaining information required for the target task.

Any content-removal operation therefore requires a source-recovery path and should be evaluated for omission errors.


## 22. Current prior-art constraint on semantic representations

The research scan confirms substantial existing work on automatic simplification, personalized presentation, source/modified alignment, and behavioral adaptation. Reframe should treat formatting, highlighting, OCR, TTS, simplification, synchronized original/modified views, profiles, and behavior-informed adaptation as established capability categories rather than differentiation claims.

The research question is whether specific representations produce measurable task benefit under controlled conditions while preserving source meaning.

## 23. Transformation operation must remain explicit

Current simplification research demonstrates that readability adjustment can trade off against meaning preservation. A representation record should therefore identify the operation performed rather than using a broad label such as "simplified."

Candidate operation classes:
- presentation-only;
- extraction;
- reorganization;
- lexical substitution;
- sentence splitting;
- syntactic restructuring;
- discourse reordering;
- definition insertion;
- inference;
- explanation.

A single representation may contain multiple operations, but those operations should remain inspectable for research and validation.

## 24. Local execution is a privacy option, not an accuracy guarantee

On-device text simplification has been demonstrated in current research, including quantized models designed to process sensitive text locally.

Source: https://aclanthology.org/2025.tsar-1.7/

Reframe may eventually use local models, remote models, or deterministic processing. The choice must be evaluated independently from representation effectiveness and semantic fidelity.


## 25. Personalization is not equivalent to comprehension benefit

Recent studies show that preference-customized presentation can improve fluency without improving comprehension, and that typography effects can vary by developmental level and language/script.

Sources:
- https://revistas.ucm.es/index.php/RLOG/en/article/view/101374
- https://www.mdpi.com/2227-7102/15/10/1306

Therefore representation preferences should be modeled as conditional signals rather than universal reader traits.

## 26. Representation profiles should be conditional

A future profile should be capable of representing:
- task-specific preferences;
- language/script-specific settings;
- content/structure-specific settings;
- situational/context effects;
- uncertainty;
- explicit reader overrides.

Avoid a single global label such as "5W+H reader" or "visual reader" unless repeated held-out evidence demonstrates that level of stability.
