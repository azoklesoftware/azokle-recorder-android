# Changelog

All notable changes to **Azokle Recorder** are documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/).
Versions follow [Semantic Versioning](https://semver.org/).

---

## [Unreleased]

### Planned
- Playback screen within the app
- Export/backup recordings
- Audio format selection (OGG, FLAC)

---

## [1.1.0] — 2025-05-17

### Changed
- **Rebranded** from LineageOS Recorder to Azokle Recorder
- Package renamed: `org.lineageos.recorder` → `org.azokle.recorder`
- New Azokle launcher icons (all density buckets)
- Updated app name to "Azokle Recorder" across all 57+ locales
- Updated notification title and all permission dialog messages
- Migrated repository to `github.com/azoklesoftware/azokle-recorder-android`
- Added Azokle Private Limited copyright to all source files
- Updated REUSE.toml, NOTICE, README, and project documentation
- Cleaned stale personal SDK path from `proguard-rules.pro`

### Added
- `README.md`, `NOTICE`, `CODE_OF_CONDUCT.md`, `CONTRIBUTING.md`,
  `SECURITY.md`, `CHANGELOG.md`
- Comprehensive `.gitignore` for Android/Gradle/IDE/keystore files

---

## [1.0.0] — 2024 (Upstream: LineageOS)

### Base release (inherited from upstream)
- One-tap audio recording with FAB
- Live waveform amplitude visualiser
- Dual recording modes: Standard (AAC/M4A) and High Quality (WAV 44.1 kHz stereo)
- Foreground service with pause/resume/stop notification controls
- MediaStore integration for system-wide recording access
- Optional GPS location tagging for recordings
- Recordings list with rename, share, delete, and multi-select
- Automatic pause on incoming phone call detection
- Material 3 DayNight theme with edge-to-edge display
- 70+ language localisations
- Android 10+ support (API 29), targeting Android 14 (API 34)
- REUSE-compliant licence metadata (Apache-2.0)

---

[Unreleased]: https://github.com/azoklesoftware/azokle-recorder-android/compare/v1.1.0...HEAD
[1.1.0]: https://github.com/azoklesoftware/azokle-recorder-android/releases/tag/v1.1.0
[1.0.0]: https://github.com/LineageOS/android_packages_apps_Recorder
