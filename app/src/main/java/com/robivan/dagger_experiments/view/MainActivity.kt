package com.robivan.dagger_experiments.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robivan.dagger_experiments.App
import com.robivan.dagger_experiments.R

class MainActivity : AppCompatActivity() {

    lateinit var mainActivityPresenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityPresenter = (application as App).appComponent.getMainActivityPresenter()


    }
}