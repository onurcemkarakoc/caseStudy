package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class SegmentAttributes(
    val airplane_brand: String?,
    val entertainment: String?,
    val free_meal: Boolean?,
    val seat_pitch: String?,
    val seat_plan: String?,
    val wifi: Int?
) : Parcelable