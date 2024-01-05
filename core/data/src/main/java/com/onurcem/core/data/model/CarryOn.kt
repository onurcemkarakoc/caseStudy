package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class CarryOn(
    val allowance: Int?,
    val is_small: Boolean?,
    val part: Int?,
    val type: String?,
    val unit: String?
) : Parcelable