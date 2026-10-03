# Reframe — Build Status

**Status:** Initial implementation started  
**Date:** 2026-10-03

## Build warning

The research-to-build gate was reached and the required build warning was issued before production implementation began.

## Current implementation

The first implementation slice establishes the shared semantic core:

- Kotlin Multiplatform project scaffold;
- Android and iOS targets at the shared-module boundary;
- source document model;
- evidence-span provenance;
- explicit semantic status;
- representation kinds;
- deterministic original representation;
- deterministic chunking;
- deterministic outline representation;
- unit tests for provenance preservation;
- CI workflow for the shared core.

## Deliberate exclusions from this slice

Not implemented yet:

- system-wide screen capture;
- AccessibilityService ingestion;
- cloud processing;
- persistent reader profiles;
- adaptive recommendation;
- generative simplification;
- model-specific production integration;
- analytics;
- account system;
- background processing.

## Build order

1. Shared semantic model and deterministic representations.
2. Provenance/fidelity harness.
3. Calibration task model and trial logging.
4. Native Android/iOS shells.
5. Native accessibility and source recovery.
6. Controlled model adapter.
7. Calibration/recommendation logic.
8. Research export and privacy controls.
9. Product UX expansion.

Every later layer must preserve the source-fidelity and privacy invariants established by the shared core.
