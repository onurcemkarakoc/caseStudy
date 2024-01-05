package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Flights(
    val departure: List<Departure>?
) : Parcelable