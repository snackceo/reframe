# UX Architecture — Calibration-Driven Representation Selection

**Date:** 2026-10-03  
**Status:** Research-derived architecture; not production implementation

## Product principle

**The reader chooses the representation during exploration; Reframe learns from the chosen representation and the resulting outcome.**

The reader remains able to override recommendations.

## Core flow

**Source → Reframe understanding → candidate representations → controlled calibration → evidence profile → recommended representation → reader override → continued evidence**

The source remains recoverable at all times.

## Setup experience

The setup should not begin with a diagnostic questionnaire.

It should introduce the representation concept briefly, demonstrate candidate outputs, and then move into controlled calibration using unseen or held-out material.

### Calibration screen concept

- same source content
- same task
- one representation at a time as the primary comparison
- clear representation identity
- easy return to original
- task response captured after reading
- confidence captured separately
- optional preference captured separately

Side-by-side comparison should be treated as a separate experiment because it can introduce integration and comparison costs.

## Representation profile

Do not create a single "reader type."

Store evidence by dimensions such as:

- reader
- representation
- task
- content structure
- language/script
- content domain
- device/context when relevant
- objective outcome
- interaction cost
- preference
- confidence
- evidence strength
- last validation

## Recommendation UX

When enough evidence exists, Reframe may present a recommended representation first.

The UI should make the recommendation reversible and understandable without implying diagnosis.

Example:

> "Based on previous reading tasks like this, Reframe started with 5W+H."

The reader can immediately choose another representation.

When evidence is insufficient:

> "Try a representation"

rather than pretending to know the best option.

## Source recovery

Every transformed representation must provide a direct path back to the corresponding source material.

Source recovery is not an advanced feature. It is part of the representation contract because transformed content can introduce omissions, substitutions, or unsupported material.

## Accessibility

The transformed representation must remain accessible through platform semantics and logical reading order.

Visual-only cues must not be the sole mechanism for:

- structure
- emphasis
- current reading position
- source mapping
- navigation
- task state

## Architecture boundary

The UI should consume a structured representation rather than raw model text.

Conceptually:

**SourceDocument → SemanticDocument → Representation → RenderedView**

The personalization layer selects a representation; it does not own rendering.

## Product boundary

The first UX architecture should support:

- original/source view
- representation selection
- recommendation
- source recovery
- calibration tasks
- evidence collection
- explicit override

It should not assume a chatbot-first interface or a generic "rewrite everything" workflow.

## Research constraint

UX decisions about exact visual styling, animation, density, and navigation details remain implementation/design questions. The structural UX above is supported by the research findings and can be specified before production implementation.

No production UI implementation is authorized by this document.
