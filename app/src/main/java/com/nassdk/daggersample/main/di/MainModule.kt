package com.nassdk.daggersample.main.di

import com.nassdk.daggersample.main.data.network.ApiServiceMain
import com.nassdk.daggersample.main.data.network.RepositoryMain
import com.nassdk.daggersample.main.data.network.RepositoryMainImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import retrofit2.Retrofit
import retrofit2.create

@Module
abstract class MainModule {

    @Binds
    @Reusable
    abstract fun bindRepository(impl: RepositoryMainImpl): RepositoryMain

    companion object {
        @Provides
        @Reusable
        fun provideRestApi(retrofit: Retrofit): ApiServiceMain = retrofit.create()
    }
}