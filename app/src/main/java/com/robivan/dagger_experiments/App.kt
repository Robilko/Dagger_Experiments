package com.robivan.dagger_experiments

import android.app.Application
import com.robivan.dagger_experiments.di.DaggerAppComponent

class App : Application() {

    val appComponent = DaggerAppComponent.create()
}