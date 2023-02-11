package com.robivan.dagger_experiments.di

import android.content.Context
import com.robivan.dagger_experiments.data.DatabaseHelper
import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun provideDatabaseHelper(context: Context): DatabaseHelper = DatabaseHelper(context)

}