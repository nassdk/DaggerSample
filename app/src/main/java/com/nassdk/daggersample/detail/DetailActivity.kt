package com.nassdk.daggersample.detail

import android.app.Activity
import android.os.Bundle
import com.nassdk.daggersample.R
import com.nassdk.daggersample.appComponent
import com.nassdk.daggersample.detail.data.DetailRepository
import com.nassdk.daggersample.detail.di.DaggerDetailComponent
import javax.inject.Inject

class DetailActivity : Activity() {

    @Inject
    lateinit var repository: DetailRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerDetailComponent.builder()
            .appComponent(appComponent)
            .build()
            .inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detail)
    }
}