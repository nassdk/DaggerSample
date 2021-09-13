package com.nassdk.daggersample.detail.data

import com.nassdk.daggersample.ApiV1
import com.nassdk.daggersample.common.network.ApiService
import javax.inject.Inject

class DetailRepositoryImpl @Inject constructor(
    @ApiV1 val service: ApiService
) : DetailRepository