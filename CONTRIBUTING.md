# Contributing to Azokle Recorder

Thank you for your interest in contributing to **Azokle Recorder**! We welcome all kinds of contributions — bug reports, feature suggestions, code, documentation, and translations.

Please take a moment to read this guide before submitting anything.

---

## Table of Contents

- [Code of Conduct](#code-of-conduct)
- [Getting Started](#getting-started)
- [How to Contribute](#how-to-contribute)
  - [Reporting Bugs](#reporting-bugs)
  - [Suggesting Features](#suggesting-features)
  - [Submitting Code](#submitting-code)
  - [Improving Documentation](#improving-documentation)
  - [Contributing Translations](#contributing-translations)
- [Development Setup](#development-setup)
- [Code Style](#code-style)
- [Commit Message Guidelines](#commit-message-guidelines)
- [Pull Request Process](#pull-request-process)
- [License](#license)

---

## Code of Conduct

By participating in this project, you agree to abide by our [Code of Conduct](CODE_OF_CONDUCT.md). Please read it before contributing.

---

## Getting Started

1. **Fork** the repository on GitHub.
2. **Clone** your fork locally:
   ```bash
   git clone https://github.com/<your-username>/azokle-recorder-android.git
   cd azokle-recorder-android
   ```
3. **Create a branch** for your changes:
   ```bash
   git checkout -b feature/your-feature-name
   # or
   git checkout -b fix/issue-description
   ```
4. Make your changes, then **push** and open a **Pull Request**.

---

## How to Contribute

### Reporting Bugs

Before filing a bug report:
- Search [existing issues](https://github.com/azoklesoftware/azokle-recorder-android/issues) to avoid duplicates.
- Make sure you are on the latest version of the app.

When filing a bug report, include:
- **Device model** and **Android version**
- **App version** (from About > Version)
- **Steps to reproduce** the issue
- **Expected vs. actual behaviour**
- **Logcat output** if applicable (use `adb logcat -s RecorderActivity SoundRecorderService`)

> **Security vulnerabilities** must not be reported via public issues. See [SECURITY.md](SECURITY.md).

### Suggesting Features

Open a [GitHub Issue](https://github.com/azoklesoftware/azokle-recorder-android/issues/new) with the label `enhancement`. Describe:
- The problem you are trying to solve
- Your proposed solution
- Any alternatives you considered

### Submitting Code

- Keep pull requests **focused** — one feature or fix per PR.
- Ensure your code **compiles** and the debug APK installs correctly on a device or emulator.
- Write **clear, descriptive** commit messages (see [Commit Message Guidelines](#commit-message-guidelines)).
- Add or update **documentation** where appropriate.
- Make sure no **new lint errors** are introduced (`./gradlew lint`).

### Improving Documentation

Documentation lives in:
- `README.md` — Project overview
- `CONTRIBUTING.md` — This file
- `CODE_OF_CONDUCT.md` — Community standards
- `SECURITY.md` — Security policy
- `CHANGELOG.md` — Version history
- `NOTICE` — Third-party attribution

Feel free to fix typos, improve clarity, or expand any section.

### Contributing Translations

Translations are maintained in `app/src/main/res/values-<locale>/strings.xml`.

To add or update a translation:
1. Copy `app/src/main/res/values/strings.xml` (the English source).
2. Create or update the appropriate `values-<locale>/strings.xml` file.
3. Translate only the string **values**, not the keys or comments.
4. Do **not** translate `app_name` — keep it as `Azokle Recorder` for brand consistency.
5. Submit a pull request with your changes.

---

## Development Setup

### Requirements

| Tool | Version |
|---|---|
| Android Studio | Hedgehog (2023.1.1) or newer |
| JDK | 17+ |
| Android SDK | API 34 |
| Kotlin | 1.8+ |

### Build Commands

```bash
# Debug build
./gradlew assembleDebug

# Release build (requires keystore)
./gradlew assembleRelease

# Run lint
./gradlew lint

# Clean build outputs
./gradlew clean
```

### Project Structure

```
azokle-recorder-android/
├── app/
│   ├── src/main/
│   │   ├── java/org/azokle/recorder/   ← Kotlin source code
│   │   ├── res/                         ← Resources (layouts, strings, icons)
│   │   └── AndroidManifest.xml
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── build.gradle.kts                     ← Root build config
├── settings.gradle.kts
└── gradle/wrapper/
```

---

## Code Style

- Follow [Kotlin coding conventions](https://kotlinlang.org/docs/coding-conventions.html).
- Use **4 spaces** for indentation (no tabs).
- Keep lines under **120 characters**.
- All public and internal functions/classes should have **KDoc comments** where the purpose is not immediately obvious.
- Prefer **immutability** (`val` over `var`, `listOf` over `mutableListOf`) where possible.
- Use **descriptive names** — avoid single-letter variables outside of lambdas.

### SPDX Headers

All new source files must include an SPDX license header:

**Kotlin files:**
```kotlin
/*
 * SPDX-FileCopyrightText: 2025 Azokle Private Limited
 * SPDX-License-Identifier: Apache-2.0
 */
```

**XML files:**
```xml
<!--
     SPDX-FileCopyrightText: 2025 Azokle Private Limited
     SPDX-License-Identifier: Apache-2.0
-->
```

---

## Commit Message Guidelines

We follow a simplified version of [Conventional Commits](https://www.conventionalcommits.org/).

### Format

```
<type>(<scope>): <short summary>

[optional body]

[optional footer]
```

### Types

| Type | When to use |
|---|---|
| `feat` | A new feature |
| `fix` | A bug fix |
| `refactor` | Code restructuring without behaviour change |
| `chore` | Build scripts, CI, dependencies |
| `docs` | Documentation only changes |
| `style` | Formatting, whitespace (no logic change) |
| `test` | Adding or fixing tests |
| `revert` | Reverting a previous commit |

### Examples

```
feat(recorder): add high-quality WAV recording mode

fix(service): prevent crash when stopping null recorder

chore: bump material to 1.12.0

docs: update README build instructions
```

- Use the **imperative mood** in the summary ("add feature" not "added feature").
- Keep the summary line under **72 characters**.
- Reference issues where applicable: `Closes #42`, `Fixes #17`.

---

## Pull Request Process

1. Ensure your branch is **up to date** with `main`:
   ```bash
   git fetch origin
   git rebase origin/main
   ```
2. Open a pull request against the `main` branch.
3. Fill in the PR template with:
   - A clear description of what changed and why
   - Steps to test
   - Screenshots/recordings for UI changes
4. A maintainer will review your PR. Please be patient — we may ask for revisions.
5. Once approved, your PR will be **squash-merged** to keep a clean history.

---

## License

By contributing to Azokle Recorder, you agree that your contributions will be licensed under the **Apache License, Version 2.0** — the same license that covers this project. See [LICENSE](LICENSES/Apache-2.0.txt) and [NOTICE](NOTICE) for details.

---

*Thank you for helping make Azokle Recorder better! 🎙️*
