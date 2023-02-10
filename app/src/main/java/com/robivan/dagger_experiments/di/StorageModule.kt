package com.robivan.dagger_experiments.di

import com.robivan.dagger_experiments.data.DatabaseHelper
import com.robivan.dagger_experiments.data.Repository
import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun provideDatabaseHelper(repository: Repository): DatabaseHelper = DatabaseHelper(repository)

    @Provides
    fun provideRepository(): Repository = Repository()
}