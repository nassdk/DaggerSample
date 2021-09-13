package com.nassdk.daggersample.detail

import android.app.Activity
import android.os.Bundle
import com.nassdk.daggersample.R
import com.nassdk.daggersample.appComponent
import com.nassdk.daggersample.detail.data.DetailRepository
import com.nassdk.daggersample.main.data.network.Repository
import javax.inject.Inject

class DetailActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detail)
    }
}