package com.robivan.dagger_experiments

import android.app.Application
import com.robivan.dagger_experiments.di.AppModule
import com.robivan.dagger_experiments.di.DaggerAppComponent

class App : Application() {

    val appComponent = DaggerAppComponent
        .builder()
        .appModule(AppModule(this))
        .build()
}