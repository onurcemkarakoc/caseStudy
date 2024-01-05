package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class BaggageInfo(
    val carryOn: CarryOn?,
    val firstBaggageCollection: List<FirstBaggageCollection?>?
) : Parcelable