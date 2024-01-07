package com.onurcem.core.data.dataproviders

import android.content.Context
import com.google.gson.Gson
import com.onurcem.core.common.Constants
import com.onurcem.core.common.utils.readJsonAsset
import com.onurcem.core.data.model.Data
import com.onurcem.core.data.model.SearchResponse
import kotlinx.coroutines.delay


class FlightSearchProvider(
    private val context: Context,
    private val gson: Gson
) {
    suspend fun getFlightData(searchId: String): Data? {
        return try {
            val jsonString = context.readJsonAsset(Constants.FLIGHT_SEARCH_JSON_FILE_NAME)
            // fake delay
            delay(2000)
            gson.fromJson(jsonString, SearchResponse::class.java)?.data ?: Data()
            } catch (e: Exception) {
               null
            }
    }
}