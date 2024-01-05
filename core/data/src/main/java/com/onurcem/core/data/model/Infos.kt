package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Infos(
    val active_warning: String?,
    val baggage_info: BaggageInfo?,
    val duration: Duration?,
    val is_business: Boolean?,
    val is_mask_required: Boolean?,
    val is_promo: Boolean?,
    val is_reservable: Boolean?,
    val is_virtual_interlining: Boolean?
) : Parcelable