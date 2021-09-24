package com.nassdk.daggersample.detail.di

import com.nassdk.daggersample.detail.data.DetailRepository
import com.nassdk.daggersample.detail.data.DetailRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import retrofit2.Retrofit
import retrofit2.create

@Module
abstract class DetailModule {

    @Binds
    @Reusable
    abstract fun bindRepository(impl: DetailRepositoryImpl): DetailRepository

    companion object {
        @Provides
        @Reusable
        fun provideRestApi(retrofit: Retrofit): ApiServiceDetail = retrofit.create()
    }
}

