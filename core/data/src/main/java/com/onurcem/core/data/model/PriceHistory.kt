package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class PriceHistory(
    val departure: DepartureX?
) : Parcelable