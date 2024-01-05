package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class DeparturePrice(
    val max: Int?,
    val min: Int?
) : Parcelable