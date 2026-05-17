/*
 * SPDX-FileCopyrightText: 2021-2024 The LineageOS Project
 * SPDX-FileCopyrightText: 2025 Azokle Private Limited
 * SPDX-License-Identifier: Apache-2.0
 */

package org.azokle.recorder.list

import org.azokle.recorder.models.Recording

interface RecordingItemCallbacks {
    fun onPlay(recording: Recording)
    fun onShare(recording: Recording)
    fun onDelete(recording: Recording)
    fun onRename(recording: Recording)
}
