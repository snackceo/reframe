# Reframe — Setup and App UX

**Status:** Research-backed UX specification / hypothesis  
**Last reviewed:** 2026-10-02

This document describes the current proposed setup flow and mobile app surface. It is not a final visual design and should remain subject to usability testing.

## 1. Design objective

Reframe should feel like a reading tool first and an accessibility system second.

The reader should be able to open information, read it normally, and ask for another representation only when useful.

The core loop is:

**Read → notice difficulty/task → Reframe → choose or accept a representation → read → return to source**

The interface should not require the reader to understand diagnoses, learning-disability terminology, AI models, or representation theory.

## 2. Setup should be short

Setup should not be a long accessibility questionnaire.

The first-run experience should establish only what is needed to:

1. explain what Reframe does;
2. establish reader control;
3. obtain initial representation signals;
4. establish basic accessibility preferences;
5. get the reader into real reading quickly.

The setup should be skippable and editable later.

### Proposed setup

**Screen 1 — Welcome**

> **See information the way it works for you.**

Short explanation:

> Reframe can show the same information in different ways. You choose what helps. You can always return to the original.

Primary action: **Try it**

Secondary action: **Skip setup**

No diagnosis questions.

**Screen 2 — Basic reading preferences**

Only high-value presentation controls:

- text size;
- spacing;
- contrast/theme;
- read-aloud preference;
- optional reduced-motion preference.

These should use native platform accessibility settings where possible rather than duplicating every operating-system control.

Primary action: **Continue**

Secondary action: **Skip**

**Screen 3 — Representation calibration**

Show one short passage and one fixed task.

Example task:

> **Find out who made the decision and when it will happen.**

Show the same passage in several representations, one at a time or in a counterbalanced order:

- Original
- Focus
- Chunked
- Structure
- 5W+H
- Listen

The content and task must remain equivalent across conditions.

After each condition, capture lightweight signals:

- Which felt clearest?
- How difficult was the task?
- Optional confidence.
- Objective answer, where appropriate.

Do not call the result a test score.

**Screen 4 — Try another task**

Use a different task so Reframe does not learn a representation from only one kind of reading.

Candidate tasks:

- find a fact;
- understand who did what;
- follow a sequence;
- compare two items;
- understand an unfamiliar term.

This is important because current evidence indicates that representation benefit can depend on task and context.

**Screen 5 — Result**

Do not display:

> You are a 5W+H reader.

Instead display something like:

> **Initial preferences saved**

> Reframe will remember what you chose, but it will not lock you into one reading mode.

Optional explanation:

> Your preferences can be different for different tasks.

Primary action: **Start reading**

Secondary action: **Review preferences**

### Setup rule

The calibration result is a hypothesis about what may help, not a diagnosis and not a permanent reader type.

## 3. Home screen

The home screen should be intentionally small.

### Proposed structure

**Header**
- Reframe
- Settings/profile button

**Primary action**
- **Open something to read**

Secondary acquisition options:
- Open file
- Paste text
- Import/share from another app
- Camera/OCR, if supported by the research instrument

**Recent**
- recently opened sources;
- resume position;
- active representation shown as a small status label if different from Original.

Avoid a large dashboard.

The reader's main job is reading, not managing an AI workspace.

## 4. Reader screen

The reader should be the primary product surface.

### Proposed layout

**Top bar**
- Back
- Document title
- Source/representation status
- More/options

**Reading area**
- source or selected representation;
- normal scrolling;
- accessible text semantics;
- current reading position.

**Bottom action area**
- Reframe
- Listen
- Search
- Bookmark/notes where justified by the research instrument.

The exact control set should be validated for accessibility and interaction cost.

## 5. Reframe control

The main Reframe control opens a compact representation sheet.

Conceptually:

    ┌──────────────────────────────┐
    │ Reframe                      │
    │ Same information, another    │
    │ way of seeing it.            │
    ├──────────────────────────────┤
    │ Focus                        │
    │ Make selected information    │
    │ easier to locate             │
    ├──────────────────────────────┤
    │ Structure                    │
    │ Show relationships and order │
    ├──────────────────────────────┤
    │ Key information              │
    │ Extract important source     │
    │ information                  │
    ├──────────────────────────────┤
    │ Explain                      │
    │ Define or clarify a term     │
    ├──────────────────────────────┤
    │ Listen                       │
    │ Read it aloud                │
    ├──────────────────────────────┤
    │ Original                     │
    │ Return to source             │
    └──────────────────────────────┘

These labels are provisional.

The visible menu should stay small even if the underlying representation engine supports many operations.

## 6. Active representation indicator

When anything other than Original is active, the reader should know.

Example:

> **Structure · Same source, reorganized**

or:

> **Simplified wording · Wording changed · View source**

The indicator should be persistent but visually quiet.

A reader should never have to guess whether they are reading the original.

## 7. Source recovery

Every transformed view needs a direct path back to the source.

Possible interaction:

**View source**

or tap a representation item to reveal its source span.

For structural views, a generated item should be traceable to the relevant source text where practical.

Example:

    STRUCTURE

    Who
    The committee

    What
    Decided to postpone the project

    When
    Next year

    [View in source]

If a field is not stated:

> When  
> Not stated in the source.

If information is inferred:

> Why  
> Inferred from the passage

The interface must not visually present inference as an explicit source fact.

## 8. Switching behavior

Switching should be easy but not encouraged for its own sake.

The reader can move:

**Original ↔ Focus ↔ Structure ↔ Explain ↔ Listen**

The system should retain:

- current location;
- selected passage where possible;
- representation state;
- audio position where applicable.

If switching causes measurable confusion or navigation cost, the design should be changed rather than optimizing for more switching.

## 9. “I'm stuck” recovery

A reader should not need to know which representation to choose.

An optional recovery action can expose intent-based choices:

> **I'm stuck**

- Break it apart
- Show what matters
- Put it in order
- Explain a word
- Read it aloud

This is a research hypothesis.

It should be compared with simply presenting the representation menu.

## 10. Settings/profile

The profile should expose preferences as editable conditions, not diagnoses.

Possible sections:

### Reading
- text size;
- spacing;
- theme/contrast;
- audio preferences.

### Representations
- preferred representations;
- task-specific preferences;
- whether Reframe may recommend a representation;
- whether Reframe may automatically switch.

### Privacy
- local processing where available;
- whether content may be sent to a remote service;
- clear processing status.

### Reset
- clear learned preferences;
- restore defaults.

Avoid labels such as:

- Dyslexia mode;
- ADHD mode;
- Autism mode;
- Visual learner;
- 5W+H reader.

Those labels imply a universal relationship that the evidence does not establish.

## 11. Adaptive behavior

Adaptive recommendations should initially be opt-in and conservative.

A recommendation should be explainable:

> **Try Structure?**  
> This type of task has previously worked better for you with Structure.

The system should not claim:

> Structure is best for you.

The underlying model should retain separate evidence for:

- reader preference;
- observed task benefit;
- confidence;
- task type;
- content type;
- language/script;
- context;
- uncertainty.

A recommendation should remain dismissible.

## 12. What the first research instrument should look like

The first build should not attempt to be the final Reframe app.

It should be a controlled mobile reading instrument with:

1. a short onboarding explanation;
2. representation calibration;
3. a small set of fixed passages/tasks;
4. Original plus several candidate representations;
5. objective task questions;
6. preference/effort ratings;
7. source recovery;
8. representation switching;
9. event logging without storing raw source content unnecessarily;
10. a simple results/export mechanism for research.

The purpose is to determine whether the representation system is useful before investing in a complete system-wide product.

## 13. Visual design direction

The visual language should be:

- calm;
- text-first;
- high contrast;
- low decoration;
- predictable;
- spacious;
- platform-native;
- accessible to screen readers;
- comfortable at large text sizes.

Avoid:

- dashboard-heavy layouts;
- excessive cards;
- animated transformations;
- decorative icons competing with text;
- permanent colored semantic markup;
- crowded toolbars;
- hidden gestures as the only way to access core functions.

Reframe should look like a reading environment, not an AI chat application.

## 14. Evidence basis and design constraints

The DAISY Reading Apps User Requirements, published in 2025, documents more than 120 requirements across navigation, screen-reader support, read aloud, visual adjustments, bookmarking, highlighting, notes, answer entry, and library management. DAISY also emphasizes that needs vary across readers and contexts. Reframe should therefore treat navigation, source access, accessible controls, and reader-configurable presentation as baseline requirements rather than product differentiation.

Sources:
- https://daisy.org/activities/standards/reading-apps-user-requirements/
- https://daisy.org/activities/standards/reading-apps-user-requirements/executive-summary/

DAISY user stories also show that readers may want different presentations for different contexts, including switching between visual reading, read-aloud, navigation, and cleaner views. This supports keeping the reader in control rather than defining one universal accessibility mode.

Source:
- https://daisy.org/activities/standards/reading-apps-user-requirements/user-stories/

Mobile-reading research also shows that interface adaptations can cause readers to lose their reading position, motivating explicit reading-position recovery after adaptation.

Source:
- https://doi.org/10.1145/3706598.3713367

## 15. Current unresolved UX questions

These remain research questions:

1. Should calibration show representations one at a time or side-by-side?
2. How many calibration passages are needed before preference becomes predictive?
3. Should task choice be explicit during calibration?
4. Should Reframe recommend a representation or wait for the reader to request one?
5. When should automatic switching ever be allowed?
6. Does “I'm stuck” reduce interaction burden or add another decision?
7. How much transformation metadata should remain visible?
8. How should source highlighting behave after switching?
9. How should representation switching work with screen readers?
10. What is the minimum home screen that still makes acquisition understandable?
11. Which controls belong in the reading surface versus a secondary sheet?
12. Which representations should be available in the first research instrument?

## 16. Current provisional screen map

    FIRST RUN

    Welcome
       ↓
    Basic reading preferences
       ↓
    Representation calibration
       ↓
    Second task / confirmation
       ↓
    Initial preferences
       ↓
    Home


    NORMAL USE

    Home
      ├── Open / Import / Paste / Camera
      └── Recent
            ↓
          Reader
            ├── Original
            ├── Reframe
            │    ├── Focus
            │    ├── Structure
            │    ├── Key information
            │    ├── Explain
            │    └── Listen
            ├── View source
            └── Settings/Profile

The screen map is a hypothesis for usability testing, not an implementation commitment.