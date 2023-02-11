package com.robivan.dagger_experiments.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.robivan.dagger_experiments.App
import com.robivan.dagger_experiments.R
import com.robivan.dagger_experiments.data.api.ServerApi
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as App).appComponent.injectMainActivity(this)
    }

    //такой метод вызывается при Inject других объектов в классе
    @Inject
    fun postInit(@Named("prod") serverApi: ServerApi) {
        Toast.makeText(this, "$serverApi", Toast.LENGTH_SHORT).show()
    }
}