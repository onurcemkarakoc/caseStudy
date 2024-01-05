package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class DepartureX(
    val next_day_price: Int?,
    val previous_day_price: Int?
) : Parcelable