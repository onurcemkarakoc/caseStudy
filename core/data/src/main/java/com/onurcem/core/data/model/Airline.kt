package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Airline(
    val code: String?,
    val image: String?,
    val name: String?,
    val slug: String?
) : Parcelable