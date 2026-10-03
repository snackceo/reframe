# Reframe Research Note — Privacy, Consent, Data Minimization, and Reader-Evidence Governance

**Date:** 2026-10-03  
**Status:** Research / pre-implementation

## 1. Research question

How should Reframe collect, derive, store, use, retain, delete, and potentially share reader evidence so personalization is useful without turning reading behavior, accessibility information, or inferred difficulty into an unnecessary persistent profile?

Core principle:

> Collect and retain the minimum evidence necessary for a stated purpose, prefer local processing where practical, keep derived conclusions distinguishable from raw observations, and never infer or persist a disability/health identity merely because behavior is consistent with one.

NIST treats privacy risk as potential problems individuals can experience from system data operations across the full data lifecycle, not merely as a cybersecurity breach.

## 2. Why Reframe has an unusual privacy problem

Potentially sensitive evidence includes:

- reading speed;
- rereading and navigation;
- representation switching;
- comprehension performance;
- confidence and perceived difficulty;
- preferred presentation settings;
- source documents;
- OCR-derived text;
- audio interaction;
- language/script;
- task history;
- accessibility settings;
- questionnaire responses;
- optional disability/accessibility disclosures.

A behavioral profile can therefore become more sensitive than an ordinary UI-preference profile.

A particularly important boundary is **inference**. Privacy guidance recognizes that profiling can create sensitive information through inference even when the inferred condition was never explicitly supplied. The ICO specifically notes that inferring health status can constitute processing of special-category data under the UK GDPR framework. This is a legal reference point, not a determination of Reframe's legal status or obligations in every jurisdiction.

## 3. Data classes

Reframe should distinguish at least six classes.

### A. Source content

Imported documents, pasted text, OCR output, and selected passages.

Default:
- process locally where feasible;
- do not transmit source content merely because telemetry is enabled;
- do not use source documents for model training unless a separate, explicit purpose and permission exists.

### B. Raw interaction events

Representation shown, task started/completed, response, response time, reread, source recovery, switch, abandonment.

These are valuable research observations but can accumulate into a behavioral profile.

### C. Derived representation evidence

Estimated utility difference, uncertainty, evidence count, task/content/context scope, validation date.

This is evidence, not an immutable user identity.

### D. Questionnaire information

Reading goals, reported difficulties, existing supports, optional accessibility information.

Questionnaire information is a prior for calibration, not a diagnosis or representation assignment.

### E. Research/aggregate data

De-identified trial summaries, aggregate representation effects, item statistics, and fidelity-error statistics.

Separate this from identifiable account/profile data whenever practical.

### F. Operational/security data

App version, model version, crash diagnostics, authentication/session information.

These have different purposes and retention requirements and should not automatically be merged with reader-evidence data.

## 4. Purpose limitation

Every collected field should have a declared purpose before collection.

Proposed purposes:

1. **Immediate rendering** — display a representation.
2. **Personalization** — improve recommendations for the same reader.
3. **Research/evaluation** — evaluate representation effectiveness.
4. **Security/operations** — secure and operate the service.
5. **Model improvement** — separate purpose requiring separate governance.

A field collected for personalization should not silently become training data.

A research dataset should not silently become a permanent individual profile.

A source document should not silently become product telemetry.

This follows the general privacy-engineering direction of purpose limitation, data minimization, and lifecycle risk assessment.

## 5. Local-first processing

The provisional preferred architecture is:

**source → local semantic representation → local calibration evidence → local profile**

before introducing a cloud data path.

Apple recommends processing data on-device where possible and provides application data-protection mechanisms for local files and databases. Android likewise recommends minimizing data collection and permissions, using scoped alternatives where possible, and encrypting sensitive application data.

This does not mean all processing must be local. It means cloud transmission requires a concrete purpose and documented data boundary.

## 6. Raw evidence versus derived profile

Reframe should preserve:

**Observation**
> The reader answered 4/5 literal-retrieval items correctly with representation A.

**Derived evidence**
> Representation A currently has moderate evidence for literal-retrieval tasks under the tested conditions.

**Recommendation**
> Reframe currently recommends representation A for this task class.

These are not interchangeable.

The recommendation must not become its own evidence.

## 7. Evidence lifecycle

Provisional lifecycle:

**collect → validate → derive → use → age → revalidate → delete/archive according to purpose**

For personalization:
- retain only observations needed to support the current profile;
- retain uncertainty and scope;
- periodically decay or invalidate stale evidence;
- allow controlled re-testing;
- remove evidence when the user deletes profile/history;
- do not retain raw events indefinitely merely because future modeling might be useful.

Storage-limitation guidance emphasizes justified retention periods and periodic deletion/anonymization when data is no longer needed.

## 8. User controls

Before production, Reframe should support explicit controls for:

- delete reader profile;
- delete calibration history;
- delete imported/source content;
- delete research/telemetry history where applicable;
- disable personalization;
- disable research telemetry;
- export reader profile;
- inspect current representation evidence;
- reset calibration;
- correct questionnaire information;
- withdraw optional research participation.

The UI must distinguish **turn off future collection** from **delete previously collected data**.

## 9. Consent boundaries

Where consent is the chosen legal/ethical basis, consent should be purpose-specific.

Reframe should not combine these into one ambiguous switch:

- using calibration to personalize the current reader;
- contributing calibration data to research;
- contributing data to global model improvement;
- sharing data with a third-party model/API provider.

Current privacy-by-design guidance emphasizes specific, understandable choices and ongoing controls rather than opaque one-time consent.

Formal human-subject research also requires the applicable research-ethics/IRB process; product consent is not a substitute.

## 10. Sensitive inference prohibition

Reframe should not create labels such as:

- dyslexic;
- ADHD reader;
- autistic reader;
- language-impaired reader;
- cognitively impaired reader;
- disability likelihood.

Behavioral evidence may support a conditional statement such as:

> For literal information-location tasks in the tested conditions, representation A produced better observed performance than representation B.

It should not be converted into a medical, psychological, or disability identity.

This distinction matters scientifically and for privacy risk because inferred sensitive information can itself create privacy obligations and harms.

## 11. Product personalization versus research mode

### Product personalization

Purpose: help the individual reader.

Potential retention: compact evidence/profile needed for personalization.

### Research mode

Purpose: evaluate hypotheses about representation effectiveness.

Potential retention: richer trial-level observations under an explicit protocol.

Research mode should not silently exist inside ordinary product telemetry.

A future research mode should define:
- study identifier;
- protocol version;
- consent status;
- fields collected;
- retention period;
- withdrawal behavior;
- de-identification/pseudonymization;
- raw-data access;
- reuse permission;
- model-training permission.

## 12. Training-data boundary

**Reader evidence is not training data by default.**

If calibration observations or source/representation pairs later enter model training, the dataset needs an explicit provenance chain:

**source → collection purpose → consent/permission state → transformation → annotation → training eligibility → dataset version**

Training eligibility must be a deliberate state, not an implicit consequence of using Reframe.

## 13. Threat model

| Asset | Example risk |
|---|---|
| Source documents | sensitive personal/work/school information exposed |
| OCR text | sensitive content retained after image deletion |
| Raw behavior | reading/accessibility profile reconstructed |
| Derived profile | sensitive ability/disability inference |
| Questionnaire | explicit accessibility/disability information exposed |
| Research dataset | re-identification through rare behavioral patterns |
| Model inputs | sensitive source text sent to a third-party provider |
| Logs | source text or answers accidentally captured |
| Backups | deleted data remaining in uncontrolled copies |
| Analytics SDKs | unintended collection/sharing |
| Shared device | another person accessing profile or source content |

NIST recommends assessing privacy risks across the data lifecycle and considering re-identification and de-identification risks.

## 14. Minimum technical requirements before production

Research should establish requirements for:

- encrypted local storage;
- secure key management;
- app-private storage;
- no source text in ordinary analytics logs;
- no raw questionnaire answers in crash logs;
- redaction rules for diagnostic events;
- explicit cloud-processing boundary;
- provider/model data-retention terms;
- deletion semantics;
- backup behavior;
- profile export format;
- profile reset;
- telemetry controls;
- research consent state;
- model-training eligibility state;
- audit/provenance records;
- schema/version migration;
- accessible privacy controls.

Android recommends app-private storage and encryption for sensitive data. Apple provides data-protection classes for application files and databases.

## 15. Children and readers needing additional support

If Reframe is available to children or populations needing additional support, privacy design should become stricter rather than weaker.

Potential requirements:
- minimize collection;
- avoid unnecessary diagnosis/disability questions;
- clear age-appropriate explanations;
- separate research participation from ordinary access;
- avoid manipulative consent UX;
- stronger defaults;
- carefully defined retention;
- guardian/assent processes where legally and ethically applicable.

Current ICO guidance gives children's privacy additional consideration within privacy-by-design/default processes.

## 16. Research gaps still open

Before implementation, research should resolve:

1. exact schema for raw events versus derived evidence;
2. retention periods for calibration and longitudinal learning;
3. local-only versus optional cloud research modes;
4. secure storage/key-management strategy on iOS and Android;
5. deletion across backups and synchronized devices;
6. export format and raw-versus-derived export policy;
7. research consent/withdrawal protocol;
8. model-provider data handling;
9. privacy implications of OCR, screen capture, clipboard, accessibility APIs, and audio;
10. child/teen participation policy if in scope;
11. de-identification requirements for aggregate research;
12. re-identification risk from rare behavior combinations;
13. jurisdiction-specific legal review.

## 17. Gate implications

The privacy gate is not satisfied merely by writing a privacy policy.

Before production implementation, Reframe needs a documented:

**data map → purpose map → threat model → retention schedule → consent model → deletion model → local/cloud boundary → research-data boundary → model-training boundary**

Only after these decisions are sufficiently researched should implementation begin.

## 18. Current conclusion

> **Reframe should learn from readers without needing to permanently learn who they are.**

The product should retain the smallest conditional evidence necessary to improve representation selection, keep source content separate from telemetry, prefer on-device processing where practical, make research/model-training reuse explicit, and treat sensitive inference as a prohibited product identity rather than a personalization target.

## Sources

- NIST Privacy Framework — https://www.nist.gov/privacy-framework
- NIST Privacy Risk Assessment — https://www.nist.gov/itl/applied-cybersecurity/privacy-engineering/collaboration-space/privacy-risk-assessment
- Apple privacy — https://www.apple.com/privacy/
- Apple developer privacy guidance — https://developer.apple.com/design/human-interface-guidelines/privacy/
- Apple Platform Security — https://help.apple.com/pdf/security/en_CA/apple-platform-security-guide-v.pdf
- Android privacy — https://developer.android.com/privacy
- Android privacy/security — https://developer.android.com/quality/privacy-and-security
- Android security checklist — https://developer.android.com/privacy-and-security/security-tips
- ICO data protection by design/default — https://ico.org.uk/for-organisations/uk-gdpr-guidance-and-resources/accountability-and-governance/guide-to-accountability-and-governance/data-protection-by-design-and-by-default
- ICO data minimisation — https://ico.org.uk/for-organisations/uk-gdpr-guidance-and-resources/data-protection-principles/a-guide-to-the-data-protection-principles/data-minimisation/
- ICO storage limitation — https://ico.org.uk/for-organisations/uk-gdpr-guidance-and-resources/data-protection-principles/a-guide-to-the-data-protection-principles/storage-limitation/
- ICO special-category data/inference — https://ico.org.uk/for-organisations/uk-gdpr-guidance-and-resources/lawful-basis/special-category-data/what-is-special-category-data/
- FTC privacy by design — https://www.ftc.gov/sites/default/files/documents/public_statements/privacy-design-and-new-privacy-framework-u.s.federal-trade-commission/120613privacydesign.pdf
