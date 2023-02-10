package com.robivan.dagger_experiments.di

import com.robivan.dagger_experiments.data.ConnectionManager
import com.robivan.dagger_experiments.data.NetworkUtils
import com.robivan.dagger_experiments.data.api.ServerApi
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NetworkModule {

    @Provides
    fun provideNetworkUtils(connectionManager: ConnectionManager): NetworkUtils = NetworkUtils(connectionManager)

    @Provides
    fun provideConnectionManager(): ConnectionManager = ConnectionManager()

    @Named("prod")
    @Provides
    fun provideServerApiProd(): ServerApi = ServerApi("prod.server.com")

    @Named("dev")
    @Provides
    fun provideServerApiDev(): ServerApi = ServerApi("dev.server.com")
}