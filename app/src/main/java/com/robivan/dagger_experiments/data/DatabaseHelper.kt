package com.robivan.dagger_experiments.data

import javax.inject.Inject

class DatabaseHelper @Inject constructor(private val repository: Repository) {
}