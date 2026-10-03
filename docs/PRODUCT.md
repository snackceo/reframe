# Reframe — Product Concept

## One-line concept

Reframe lets a reader choose how information is represented.

## The problem

A reader can receive the correct words and still have difficulty efficiently extracting the structure and meaning of those words.

Traditional reading assistance often focuses on typography: fonts, spacing, contrast, or larger text.

Reframe explores a different layer:

"What if the device could understand the information on the screen and represent that information in a form the reader chooses?"

The goal is not to replace reading. The goal is to reduce the amount of mental work required to extract structure from content.

## The representation layer

Reframe sits conceptually between content and reader:

Content → Reframe understands → Reader chooses representation → Reframe renders → Reader

The representation can change while the underlying source remains available.

## Example: emphasis

Source:

"The committee reviewed the proposal and decided to postpone the project until next year."

Possible representation:

"The committee reviewed the proposal and decided to postpone the project until next year."

In the actual interface, selected semantic categories could receive visual emphasis. For example, nouns, verbs, dates, names, or important phrases could be visually distinguished while the rest of the words remain present.

The purpose is to make semantic structure easier to perceive without requiring the system to rewrite the sentence.

## Example: 5W + H

Source:

"The committee reviewed the proposal yesterday at City Hall and decided to postpone the project until next year because funding was unavailable."

Possible representation:

- Who: the committee
- What: reviewed the proposal; postponed the project
- When: yesterday; until next year
- Where: City Hall
- Why: funding was unavailable
- How: through the committee's decision to postpone the project

This is a stronger transformation because information has been reorganized.

## Other representations

A dense sentence or paragraph could be separated into smaller statements.

A paragraph could become a list or outline.

Relationships could be made explicit, such as who → action → object.

Information could be represented through audio or synchronized highlighting.

These are exploratory modes, not a locked feature list.

## Levels of intervention

### Level 1 — Visual emphasis

The words stay the same.

Examples: nouns, verbs, dates, names, key phrases, spacing, grouping.

### Level 2 — Structural representation

The information stays substantially the same, but organization changes.

Examples: 5W + H, bullets, outlines, timelines, relationships.

### Level 3 — Linguistic transformation

The wording itself changes.

Examples: breaking complex sentences apart, simplifying language, paraphrasing.

This level requires stronger safeguards because wording changes can alter nuance or meaning.

### Level 4 — Multimodal representation

The information is represented through another modality.

Examples: text-to-speech, phonetic assistance, synchronized highlighting, and future modalities.

## Reader control

A reader may want Original, Original + emphasis, 5W + H, Original + structure, or another combination.

The reader should be able to move between representations rather than being locked into one "dyslexia mode."

## Product principle

The reader chooses the representation; Reframe does the work of creating it.

The system should assist comprehension without taking control of the content.

## Open product questions

1. Should Reframe be always-on, on-demand, or both?
2. Should transformed content overlay the original or temporarily replace it?
3. How should a reader move between representations?
4. Can multiple representations be combined?
5. How much transformation is useful before it becomes distracting?
6. How should uncertainty be shown?
7. How can the product verify that a representation preserved important meaning?
8. Which representations actually help different readers?
9. What should happen with images, tables, webpages, PDFs, chats, or video?
10. Which processing can happen locally, and when is an external model justified?

These are product research questions, not assumptions for implementation.

## Non-goals for the current stage

Reframe is not currently defined as:

- a generic chatbot;
- a summarization app;
- a replacement for a human reader;
- a single dyslexia font;
- a universal dyslexia treatment;
- a specific AI model or model architecture.

The implementation should remain flexible until the core interaction is validated.