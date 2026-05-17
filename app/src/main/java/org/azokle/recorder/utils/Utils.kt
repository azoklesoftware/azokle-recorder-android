/*
 * SPDX-FileCopyrightText: 2017-2024 The LineageOS Project
 * SPDX-FileCopyrightText: 2025 Azokle Private Limited
 * SPDX-License-Identifier: Apache-2.0
 */

package org.azokle.recorder.utils

import android.app.NotificationManager
import android.content.Context
import org.azokle.recorder.service.SoundRecorderService

object Utils {
    fun cancelShareNotification(context: Context) {
        val nm = context.getSystemService(
            NotificationManager::class.java
        ) ?: return
        nm.cancel(SoundRecorderService.NOTIFICATION_ID)
    }
}
