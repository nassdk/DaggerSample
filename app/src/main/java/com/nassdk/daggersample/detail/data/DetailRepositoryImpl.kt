package com.nassdk.daggersample.detail.data

import com.nassdk.daggersample.detail.di.ApiServiceDetail
import javax.inject.Inject

class DetailRepositoryImpl @Inject constructor(
    val service: ApiServiceDetail
) : DetailRepository