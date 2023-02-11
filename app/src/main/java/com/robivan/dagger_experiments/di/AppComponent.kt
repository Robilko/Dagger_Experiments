package com.robivan.dagger_experiments.di

import android.content.Context
import com.robivan.dagger_experiments.data.api.ServerApi
import com.robivan.dagger_experiments.view.MainActivity
import com.robivan.dagger_experiments.view.MainActivityPresenter
import dagger.BindsInstance
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

//    @Component.Builder
//    interface AppCompBuilder {
//        fun buildAppComp(): AppComponent
//        @BindsInstance
//        fun context(context: Context): AppCompBuilder
//    }

    @Component.Factory
    interface AppCompFactory {
        fun create(@BindsInstance context: Context, networkModule: NetworkModule):AppComponent
    }
}