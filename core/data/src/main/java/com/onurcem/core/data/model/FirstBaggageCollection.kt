package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class FirstBaggageCollection(
    val allowance: Int?,
    val part: Int?,
    val paxType: String?,
    val small: Boolean?,
    val type: String?,
    val unit: String?
) : Parcelable