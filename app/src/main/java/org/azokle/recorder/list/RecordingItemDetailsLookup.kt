/*
 * SPDX-FileCopyrightText: 2024 The LineageOS Project
 * SPDX-FileCopyrightText: 2025 Azokle Private Limited
 * SPDX-License-Identifier: Apache-2.0
 */

package org.azokle.recorder.list

import android.view.MotionEvent
import androidx.recyclerview.selection.ItemDetailsLookup
import androidx.recyclerview.widget.RecyclerView
import org.azokle.recorder.models.Recording
import kotlin.reflect.safeCast

class RecordingItemDetailsLookup(
    private val recyclerView: RecyclerView,
) : ItemDetailsLookup<Recording>() {
    override fun getItemDetails(e: MotionEvent) =
        recyclerView.findChildViewUnder(e.x, e.y)?.let { childView ->
            recyclerView.getChildViewHolder(childView)?.let { viewHolder ->
                RecordingsAdapter.ViewHolder::class.safeCast(viewHolder)?.itemDetails
            }
        }
}
