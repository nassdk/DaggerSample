package com.nassdk.daggersample.main.di

import com.nassdk.daggersample.main.data.network.Repository
import com.nassdk.daggersample.main.data.network.RepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface MainModule {

    @Binds
    fun bindRepository(impl: RepositoryImpl): Repository
}