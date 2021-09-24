package com.nassdk.daggersample.main

import android.app.Activity
import android.os.Bundle
import com.nassdk.daggersample.R
import com.nassdk.daggersample.appComponent
import com.nassdk.daggersample.main.data.network.RepositoryMain
import com.nassdk.daggersample.main.di.DaggerMainComponent
import javax.inject.Inject


class MainActivity : Activity() {

    @Inject
    lateinit var repository: RepositoryMain

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerMainComponent
            .builder()
            .appComponent(appComponent)
            .build()
            .inject(this)


        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}