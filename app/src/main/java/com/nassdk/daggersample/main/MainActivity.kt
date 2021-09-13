package com.nassdk.daggersample.main

import android.app.Activity
import android.os.Bundle
import com.nassdk.daggersample.R


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerMainComponent.create().inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}