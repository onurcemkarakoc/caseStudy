package com.onurcem.core.common.utils

import android.content.Context
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

fun Context.readJsonAsset(fileName: String): String {
    val inputStream = assets.open(fileName)
    val size = inputStream.available()
    val buffer = ByteArray(size)
    inputStream.read(buffer)
    inputStream.close()
    return String(buffer, Charsets.UTF_8)
}