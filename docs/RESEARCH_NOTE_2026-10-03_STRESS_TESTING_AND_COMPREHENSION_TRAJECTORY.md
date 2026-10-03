# Reframe Representation Stress Testing and Comprehension Trajectory

Date: 2026-10-03

## Owner hypothesis

The setup/calibration experience may be more useful if Reframe does not merely ask which representation a reader prefers.

It can instead show comparable information in different representations and observe whether the reader can:
- understand it
- answer a task
- continue reading
- return to the source appropriately
- maintain comprehension as information complexity changes

This is a controlled measurement instrument, not a generic speed test.

## Core distinction

Measure separately:
1. Processing speed — time to read/view a defined unit.
2. Task performance — whether the reader correctly understands or uses the information.
3. Continuation behavior — whether the reader proceeds, pauses, rereads, switches representation, or abandons.

These must not be collapsed into one number.

Fast continuation with poor comprehension is not success. Slow reading with high comprehension is not automatically failure.

Recent reading research also shows that response time has a complex relationship with accuracy and can differ by condition, supporting analysis of time and correctness together. Sources: https://onlinelibrary.wiley.com/doi/full/10.1111/jedm.12389 and https://www.tandfonline.com/doi/full/10.1080/10888438.2025.2612649

## Proposed calibration structure

A setup experiment can use:

same semantic information -> representation A -> task -> next information

versus:

same semantic information -> representation B -> task -> next information

The underlying semantic content should be matched.

Record:
- time to first meaningful interaction
- time to answer
- answer accuracy
- rereading
- source recovery
- representation switching
- continuation latency
- abandonment
- confidence
- perceived difficulty
- optional preference

Primary outcome: task performance.

Secondary evidence: timing, continuation, interaction cost, and preference.

## “Stress test” interpretation

The proposed stress test does not mean deliberately making the reader psychologically uncomfortable.

It means increasing controlled task/content demands to determine whether a representation's apparent benefit persists.

Possible dimensions:
- longer passage
- greater information density
- more entities
- more cross-sentence relationships
- temporal ordering
- causal relationships
- comparison
- unfamiliar vocabulary
- increased number of relevant details
- mixed task demands

Manipulate dimensions separately where practical.

The purpose is to identify conditions under which a representation helps, stops helping, or creates additional cost.

## Example

Suppose three equivalent representations are tested:

Original: a normal paragraph.

Chunked: the same information separated into meaningful units.

5W+H: the same explicit information organized under question headings.

A reader might show:
- similar accuracy at low information density
- faster continuation with chunking at medium density
- better retrieval with 5W+H on explicit fact-finding
- more switching under high density

That would not justify declaring one representation universally best.

It would support a conditional finding such as:

“For explicit information-location tasks at higher information density, this reader has shown stronger performance with structured extraction.”

## Important measurement warning

“Continues reading” is ambiguous.

A reader can continue because:
- the content is understood
- the content is easy
- the representation is engaging
- the reader is guessing
- the task is unclear
- the reader is avoiding the question
- the reader has learned the answer pattern

Therefore continuation must be interpreted together with task outcomes.

## Experimental contamination

Repeatedly showing equivalent content can create learning effects.

A reader may perform better on representation B simply because the information was already encountered in representation A.

The primary experiment should therefore use:
- matched parallel content
- randomized/counterbalanced representation order
- separate measurement items
- no requirement to compare versions during the scored trial

Exact same-content comparisons can still be useful for demonstrations and carefully designed within-item experiments, but they should not automatically be treated as independent evidence.

## Adaptive stress testing

The test can become adaptive:

1. Start with moderate complexity.
2. Compare two plausible representations.
3. If results are nearly identical, test a harder condition or another representation.
4. If one representation shows a stable advantage, test whether that advantage survives a new content form.
5. Stop when additional trials are unlikely to materially change the evidence.

Adaptive-testing research supports variable-length stopping based on expected information gain rather than forcing every participant through the same number of items. See https://pmc.ncbi.nlm.nih.gov/articles/PMC3028267/ and https://pmc.ncbi.nlm.nih.gov/articles/PMC7518406/

Recent adaptive-reading work demonstrates the feasibility of adjusting task difficulty from observed performance, while its simulation-based design does not establish a Reframe-specific algorithm. See https://www.mdpi.com/1999-5903/19/2/100

Reframe should not directly adopt educational or clinical CAT thresholds because the construct being measured is different.

## Proposed comprehension trajectory

A useful research visualization may eventually show:

information demand -> representation -> task outcome -> continuation behavior

For example:
- low demand: representations comparable
- medium demand: chunking begins to reduce rereading
- high explicit-retrieval demand: structured extraction improves accuracy
- high inference demand: no reliable representation advantage

This lets Reframe discover boundaries rather than merely winners.

## Representation stress-test dimensions

Content demand:
- length
- density
- vocabulary
- discourse complexity
- number of entities
- number of relationships

Task demand:
- literal retrieval
- integration
- inference
- structure
- action
- summary

Representation demand:
- visual density
- chunk size
- structural transformation
- highlighting amount
- navigation burden
- audio controls

Context:
- device
- screen size
- language/script
- reading mode
- interruptions where ethically and experimentally appropriate

## Do not confuse stress with harm

Do not deliberately induce distress, overload, or failure merely to produce a stronger measurement.

If a condition produces clear deterioration, excessive burden, repeated abandonment, or other adverse effects, record that as a negative result and do not automatically continue escalating.

## New design implication: successful continuation

A particularly useful Reframe event is not simply “next page.”

Define successful continuation as:

completed current task correctly -> continued to next unit without unresolved confusion

This can be operationalized without assuming that every pause or reread is bad.

Useful research labels:
- UNDERSTOOD_AND_CONTINUED
- REREAD_AND_RESOLVED
- REREAD_WITHOUT_RESOLUTION
- SWITCHED_AND_RESOLVED
- SWITCHED_WITHOUT_RESOLUTION
- ANSWERED_INCORRECTLY_AND_CONTINUED
- ABANDONED

These are research labels, not diagnoses.

Recent eye-tracking research shows that readers with different achievement levels can use different amounts of time and rereading, and that rereading can sometimes be associated with better literal-question performance. See https://onlinelibrary.wiley.com/doi/10.1111/1467-9817.70018

## Time-pressure caution

Do not make setup artificially time-pressured by default.

Recent research shows that time pressure can alter skipping, regression, reading speed, and comprehension together. If time pressure becomes a research variable, test it separately. See https://www.nature.com/articles/s41562-026-02534-0

## Current research implication

The proposed setup can become a small representation stress-testing laboratory:

questionnaire -> controlled representation comparisons -> increasing information/task demand -> observe performance and interaction trajectory -> adaptive stopping -> conditional recommendation

This is stronger than asking “Which version do you like?”

It tests:

“When does a representation help this reader, for this task, with this kind of information, and what happens when the demand increases?”

That is directly aligned with Reframe's goal of finding useful representations for individual readers.

## Current status

This is a research specification, not production implementation.

No conclusion has been reached that faster reading, longer continuation, fewer rereads, or fewer interactions are inherently better.

The objective remains:

successful understanding with appropriate effort and acceptable interaction cost, conditional on reader, task, content, and context.

No production implementation begins until the explicit build-warning gate is reached.