package com.robivan.dagger_experiments.di

import com.robivan.dagger_experiments.view.MainActivity
import com.robivan.dagger_experiments.view.MainActivityPresenter
import dagger.Component

@Component(modules = [StorageModule::class, NetworkModule::class, MainModule::class])
interface AppComponent {
    fun injectMainActivity(mainActivity: MainActivity)
    fun getMainActivityPresenter(): MainActivityPresenter
}