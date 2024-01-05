package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class DepartureDatetime(
    val date: String?,
    val time: String?,
    val timestamp: Int?
) : Parcelable