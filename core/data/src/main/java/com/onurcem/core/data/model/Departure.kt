package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Departure(
    val average_price_breakdown: AveragePriceBreakdown?,
    val different_airline_count: Int?,
    val enuid: String?,
    val infos: Infos?,
    val price_breakdown: PriceBreakdown?,
    val provider_packages: List<String>?,
    val segments: List<Segment>?
) : Parcelable