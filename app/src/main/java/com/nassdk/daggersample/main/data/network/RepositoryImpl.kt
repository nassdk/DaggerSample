package com.nassdk.daggersample.main.data.network

import com.nassdk.daggersample.ApiV1
import com.nassdk.daggersample.common.network.ApiService
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    @ApiV1 val service: ApiService
) : Repository