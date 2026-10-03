# Reframe — Security and Privacy Principles

**Status:** Product/engineering baseline  
**Last reviewed:** 2026-10-02

Reframe may eventually operate on content from applications that users reasonably expect to be private. Security and privacy therefore belong in the product model from the beginning.

## 1. Data classification

Treat the following as sensitive by default:

- screen content;
- selected text;
- OCR output;
- document text;
- messages;
- URLs;
- model prompts containing source content;
- model responses derived from source content;
- cached representations;
- source-to-representation mappings;
- user reading preferences when they reveal sensitive behavior.

Not every item must be stored. The default should be to avoid storing it.

## 2. Data minimization

Collect only what is required for the current product function.

Prefer:

- transient processing;
- local processing where practical;
- ephemeral representations;
- user-controlled history;
- explicit deletion.

Avoid collecting entire screens when selected text or structured content is sufficient.

## 3. External processing

Sending content to a remote model or service should require an explicit product decision.

Before enabling it, document:

- what content is transmitted;
- why transmission is necessary;
- provider;
- retention behavior;
- logging;
- whether data is used for training;
- encryption;
- user disclosure/consent;
- failure behavior;
- deletion guarantees.

"AI API available" is not sufficient justification for transmitting screen content.

## 4. Model-output trust

Model output is untrusted input.

Validate:

- schema;
- source references;
- required fields;
- unsupported claims;
- malformed output;
- unsafe or unexpected content.

Never render a model-generated structural field as authoritative merely because the model returned it.

## 5. Source fidelity and security

Security failures are not limited to unauthorized access.

A transformation that silently changes a user's source content can also create a safety or trust failure.

Examples:

- changing "may" to "will";
- removing a warning;
- dropping a negative condition;
- changing a date;
- attributing an action to the wrong person;
- inventing a missing value.

Semantic validation is therefore part of trustworthiness.

## 6. Logging

Do not log raw source content by default.

Prefer metadata such as:

- transformation type;
- success/failure;
- latency;
- user-selected mode;
- model identifier;
- error class.

If source logging becomes necessary for a research workflow, define retention, access, consent, and deletion requirements first.

## 7. Credentials and secrets

Never commit:

- API keys;
- access tokens;
- private credentials;
- signing keys;
- personal authentication material.

Use environment or platform secret storage appropriate to the eventual deployment.

## 8. Permissions

Future system-wide integrations should request the narrowest capability needed.

A feature that only needs selected text should not require broad screen capture if the platform can provide a narrower mechanism.

Permissions should be understandable to the reader and revocable.

## 9. Local-first bias

Local processing is not automatically safer, but it can reduce transmission and third-party exposure.

The architecture should keep local processing possible even if a remote model is later introduced.

## 10. Research data

User testing data can itself become sensitive.

Research datasets should:

- minimize personally identifying information;
- separate identity from task data where possible;
- define retention;
- restrict access;
- avoid unnecessary diagnostic labels;
- document consent and intended use.

## 11. Security review triggers

A security/privacy review is required before introducing:

- system-wide screen capture;
- cloud model processing of screen content;
- persistent reading history;
- account-linked reading profiles;
- third-party analytics containing source-derived information;
- OCR of private documents;
- automatic background processing.

## 12. Security principle

**The safest representation is often the one that can be generated locally, transiently, with no unnecessary copy of the source.**
