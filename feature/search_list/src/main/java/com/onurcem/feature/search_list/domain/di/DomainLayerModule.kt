package com.onurcem.feature.search_list.domain.di

import com.onurcem.core.data.dataproviders.FlightSearchProvider
import com.onurcem.feature.search_list.domain.use_cases.GetFlightListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainLayerModule {
    @Provides
    @Singleton
    fun provideGetFlightListUseCase(flightSearchProvider: FlightSearchProvider): GetFlightListUseCase =
        GetFlightListUseCase(flightSearchProvider)
}