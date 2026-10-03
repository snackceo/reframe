# Continuation Instruction and Build Warning

Date: 2026-10-03

## Owner instruction

When the project owner says **“Continue”** or **“Continue research”**, interpret it as authorization to continue the Reframe work autonomously with whatever next actions are necessary.

Do not require the owner to specify the next research topic.

The assistant is responsible for deciding the next useful step based on:

- the current research record
- unresolved research gates
- evidence quality
- project risks
- dependencies between decisions
- the current no-build constraint

This includes researching, comparing evidence, identifying contradictions, refining hypotheses, defining experiments, documenting conclusions, and updating the Reframe repository.

## Build warning requirement

**Before building begins, explicitly warn the owner that building is about to start.**

The warning must occur before the first production implementation action, not after code has already been created.

Research artifacts, research protocols, documentation, evidence tables, and planning documents do not count as building.

The warning should clearly distinguish:

- continued research/documentation
from
- production implementation/building.

Until that warning is given, the existing research gate remains active.

## Current state

Reframe remains in the research phase.

The next research action should be selected autonomously from the highest-value unresolved question. Recent HCI research continues to emphasize user-adaptive interaction, user modelling, human control, and rigorous system evaluation as core concerns for intelligent interfaces. citeturn0search0turn0search3

This supports keeping Reframe's personalization loop measurable and user-controlled rather than treating model output as the product decision.

## Operating rule

The expected loop is:

**Continue -> research what is necessary -> update docs -> reassess gates -> continue**

and eventually:

**research gates sufficiently satisfied -> explicit build warning -> owner is informed that implementation is beginning -> build**
