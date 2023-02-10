package com.robivan.dagger_experiments.di

import com.robivan.dagger_experiments.data.ConnectionManager
import com.robivan.dagger_experiments.data.NetworkUtils
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun provideNetworkUtils(connectionManager: ConnectionManager): NetworkUtils = NetworkUtils(connectionManager)

    @Provides
    fun provideConnectionManager(): ConnectionManager = ConnectionManager()
}