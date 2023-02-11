package com.robivan.dagger_experiments.di

import com.robivan.dagger_experiments.data.api.ServerApi
import com.robivan.dagger_experiments.view.MainActivity
import com.robivan.dagger_experiments.view.MainActivityPresenter
import dagger.Component
import javax.inject.Named

@Component(modules = [NetworkModule::class, AppModule::class, StorageModule::class])
interface AppComponent {
    fun injectMainActivity(mainActivity: MainActivity)
    fun getMainActivityPresenter(): MainActivityPresenter
    @Named("prod")
    fun getServerApiProd(): ServerApi
    @Named("dev")
    fun getServerApiDev(): ServerApi
}