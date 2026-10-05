# Reframe — Build Status

**Status:** Initial implementation active
**Last updated:** 2026-10-05

## Build warning

The research-to-build gate was reached and the required warning was issued before implementation began.

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
- provenance-preservation tests;
- CI workflow for the shared core;
- Kotlin 2.2.20 toolchain;
- Android Gradle Library Plugin configuration compatible with the selected Kotlin/Gradle toolchain.

The Android build configuration was corrected after reviewing current Kotlin Multiplatform compatibility guidance. The initial `androidLibrary {}` configuration was not valid for the selected Kotlin 2.2.20 + AGP 8.x combination; the shared module now uses the supported `com.android.library` + `androidTarget {}` configuration.

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

## Next engineering gate

The immediate task is **build verification and semantic-core hardening**.

Before adding UI, the shared module must:

1. compile in CI;
2. run common tests;
3. pass provenance tests;
4. receive edge-case tests for negation, numbers, dates, repeated text, whitespace, punctuation, and source offsets;
5. define failure behavior for transformations that cannot establish source evidence.

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
