package com.onurcem.core.common.utils

import android.net.Uri
import androidx.navigation.NavController

fun NavController.toList(searchId: String) {
    val uri = Uri.parse("onurcem://search_list/?searchId=$searchId")
    this.navigate(uri)
}
fun NavController.toDetail(itemId: String) {
    val uri = Uri.parse("onurcem://search_detail/?itemId=$itemId")
    this.navigate(uri)
}