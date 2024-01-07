package com.onurcem.core.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Data(
    val airlines: List<Airline>? = null,
    val airports: List<Airport>? = null,
    val baggages: List<Int>? = null,
    val bus_search_data_tab: String? = null,
    val created_at: String? = null,
    val currencies: Currencies? = null,
    val filter_boundaries: FilterBoundaries? = null,
    val flights: Flights? = null,
    val has_vi_flight: Boolean? = null,
    val info_message: String? = null,
    val price_history: PriceHistory? = null,
    val search_parameters: SearchParameters? = null,
    val search_url: String? = null,
    val short_search_url: String? = null,
    val stop_counts: List<Int>? = null
) : Parcelable {
    override fun toString(): String {
        return "Data(airlines=$airlines, airports=$airports, baggages=$baggages, bus_search_data_tab=$bus_search_data_tab, created_at=$created_at, currencies=$currencies, filter_boundaries=$filter_boundaries, flights=$flights, has_vi_flight=$has_vi_flight, info_message=$info_message, price_history=$price_history, search_parameters=$search_parameters, search_url=$search_url, short_search_url=$short_search_url, stop_counts=$stop_counts)"
    }
}