package com.nassdk.daggersample.detail.di

import com.nassdk.daggersample.detail.data.DetailRepository
import com.nassdk.daggersample.detail.data.DetailRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface DetailModule {

    @Binds
    fun bindRepository(impl: DetailRepositoryImpl): DetailRepository
}

