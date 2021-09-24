package com.nassdk.daggersample.main.data.network

import javax.inject.Inject

class RepositoryMainImpl @Inject constructor(
    val service: ApiServiceMain
) : RepositoryMain