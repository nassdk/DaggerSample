package com.nassdk.daggersample.main.di

import androidx.lifecycle.ViewModel
import com.nassdk.daggersample.common.di.scope.ScreenScope
import com.nassdk.daggersample.common.di.vm.ViewModelModule
import com.nassdk.daggersample.main.data.network.ApiServiceMain
import com.nassdk.daggersample.main.data.network.RepositoryMain
import com.nassdk.daggersample.main.data.network.RepositoryMainImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.multibindings.IntoMap
import retrofit2.Retrofit
import retrofit2.create

@Module
abstract class MainModule {

    @Binds
    @ScreenScope
    abstract fun bindRepository(impl: RepositoryMainImpl): RepositoryMain

    companion object {
        @Provides
        @ScreenScope
        fun provideRestApi(retrofit: Retrofit): ApiServiceMain = retrofit.create()
    }
}