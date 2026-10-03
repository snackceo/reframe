# Reframe — Glossary

**Status:** Canonical terminology  
**Last reviewed:** 2026-10-02

## Representation
A deliberate way of presenting source information so that some property of that information is easier to perceive or use.

## Source
The information Reframe is representing. The source remains the reference point even when a transformed view is active.

## Transformation
An operation that changes presentation, organization, wording, modality, or structure.

## Representation recipe
A composition of transformations selected for a reader, content type, and task.

**grouping + emphasis + hierarchy + modality + optional wording**

## Semantic structure
Relationships among information elements, such as actor → action → object, event → time → location, cause → effect, condition → outcome, or option A ↔ option B.

## Source fidelity
The degree to which a representation preserves material information and relationships in the source, including qualifiers such as negation, uncertainty, attribution, conditions, time, quantities, and exceptions.

## Source traceability
The ability to connect a transformed element back to the source material from which it came.

## Semantic mutation
A change in meaning introduced by a transformation.

Examples: “may happen” → “will happen”; “not approved” → “approved”; or removing an attribution such as “according to the report.”

Semantic mutation is a product failure, not merely a cosmetic bug.

## Extraction cost
The amount of cognitive or interaction work required to locate, group, relate, sequence, compare, or retain information needed for a task.

This is a product hypothesis, not a clinically established mechanism.

## Progressive assistance
Increasing transformation strength only as needed:

**source → guidance → structure → linguistic transformation → multimodal**

## Reader control
The reader's ability to select, change, override, inspect, or disable representations.

## Representation selection
The decision about which representation should be shown. Selection may eventually be explicit, preference-based, heuristic, or adaptive.

Selection is distinct from generation.

## Representation generation
Producing the structured representation after a representation has been selected.

## Rendering
Turning a representation into an interface that a reader can perceive and operate. Rendering should not silently decide semantic meaning.

## Task
What the reader is trying to accomplish with the information, such as finding a deadline, following instructions, comparing options, or understanding a term.

## Content class
A structural or functional category of source material, such as news, instructions, narrative, schedule, comparison, or technical explanation.

## Reader profile
A set of reader-specific preferences or observed interaction patterns. It must not be treated as synonymous with a diagnosis.

## Explicit preference
A representation preference directly stated or selected by the reader.

## Observed outcome
A measurable result of using a representation, such as accuracy, time, rereading, effort, or task completion.

## Adaptive selection
Choosing a representation using information about the reader, content, and task.

## Automatic intervention
Changing or suggesting a representation without the reader explicitly requesting it. It requires stronger evidence and safeguards than explicit selection.

## Confidence
A property of a system's interpretation or transformation, not a guarantee of correctness. Confidence is never a substitute for source fidelity.

## Inference
Information or a relationship derived by reasoning rather than explicitly stated in the source. Inferences should be distinguishable from source facts when exposed to the reader.

## Representation metadata
Information describing how a representation was produced, including source identifier, transformation type, parameters, source spans, semantic changes, uncertainty, and generation method.

## Local processing
Processing performed on the user's device or in an environment controlled so that source content does not unnecessarily leave the device. Local does not automatically mean secure.

## HUD
A heads-up display or overlay that places transformed information over another application or visual field. A HUD is a possible future interface, not the definition of Reframe.

## Semantic overlay
An interface layer that changes or augments presentation while maintaining a relationship to underlying content. W3C WAI-Adapt is relevant prior work on user-driven personalization of content.

## Fidelity test
A test that checks whether a representation preserves material source information.

## Representation failure
Any case where a representation is misleading, incomplete, semantically incorrect, inaccessible, or unusable for its intended task.

## Null result
An experiment in which a proposed representation does not produce the expected improvement. Null results are product evidence and should not be hidden as implementation failures.
