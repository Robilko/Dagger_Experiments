package com.robivan.dagger_experiments.view

import com.robivan.dagger_experiments.data.DatabaseHelper
import com.robivan.dagger_experiments.data.NetworkUtils

class MainActivityPresenter(
    private val databaseHelper: DatabaseHelper,
    private val networkUtils: NetworkUtils
) {
}