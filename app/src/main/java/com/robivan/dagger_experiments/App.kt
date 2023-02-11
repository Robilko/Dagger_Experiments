package com.robivan.dagger_experiments

import android.app.Application
import com.robivan.dagger_experiments.di.DaggerAppComponent
import com.robivan.dagger_experiments.di.NetworkModule

class App : Application() {

    val appComponent = DaggerAppComponent
        .factory()
        .create(this, NetworkModule())
}