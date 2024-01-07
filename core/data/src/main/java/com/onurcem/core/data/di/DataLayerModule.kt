package com.onurcem.core.data.di

import android.content.Context
import com.google.gson.Gson
import com.onurcem.core.data.dataproviders.FlightSearchProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataLayerModule {
    @Provides
    @Singleton
    fun provideFlightSearchDataProvider(
        @ApplicationContext applicationContext: Context,
        gson: Gson
    ): FlightSearchProvider = FlightSearchProvider(applicationContext, gson)

    @Provides
    @Singleton
    fun provideGson(): Gson = Gson()
}