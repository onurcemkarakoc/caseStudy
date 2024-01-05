package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class SegmentDelay(
    val day: Int?,
    val hour: Int?,
    val minute: Int?,
    val total_minutes: Int?
) : Parcelable