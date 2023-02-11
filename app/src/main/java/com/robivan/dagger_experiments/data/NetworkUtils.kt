package com.robivan.dagger_experiments.data

import javax.inject.Inject

class NetworkUtils @Inject constructor(private val connectionManager: ConnectionManager) {
}