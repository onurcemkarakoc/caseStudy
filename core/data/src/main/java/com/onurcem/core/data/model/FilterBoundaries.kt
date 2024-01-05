package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class FilterBoundaries(
    val departureMaxDuration: Int?,
    val departurePrice: DeparturePrice?,
    val returnMaxDuration: Int?,
    val returnPrice: ReturnPrice?
) : Parcelable