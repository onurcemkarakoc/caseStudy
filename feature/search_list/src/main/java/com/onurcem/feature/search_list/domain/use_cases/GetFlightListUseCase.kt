package com.onurcem.feature.search_list.domain.use_cases

import com.onurcem.core.common.utils.Resource
import com.onurcem.core.data.dataproviders.FlightSearchProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetFlightListUseCase @Inject constructor(private val flightSearchProvider: FlightSearchProvider) {
    suspend operator fun invoke(searchId: String) = flow {
        emit(Resource.Loading())
        flightSearchProvider.getFlightData(searchId)?.let {
            emit(Resource.Success(it))
        }?: emit(Resource.Error("Error"))
    }.catch {
        emit(Resource.Error(it.message.toString()))
    }.flowOn(Dispatchers.IO)
}