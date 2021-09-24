package com.nassdk.daggersample.detail.di

import androidx.lifecycle.ViewModel
import com.nassdk.daggersample.common.di.scope.ScreenScope
import com.nassdk.daggersample.common.di.vm.ViewModelModule
import com.nassdk.daggersample.detail.DetailViewModel
import com.nassdk.daggersample.detail.data.DetailRepository
import com.nassdk.daggersample.detail.data.DetailRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import retrofit2.Retrofit
import retrofit2.create

@Module
abstract class DetailModule {

    @Binds
    @ScreenScope
    abstract fun bindRepository(impl: DetailRepositoryImpl): DetailRepository

    @Binds
    @IntoMap
    @ViewModelModule.ViewModelKey(DetailViewModel::class)
    abstract fun provideRegistrationViewModel(viewModel: DetailViewModel): ViewModel

    companion object {
        @Provides
        @ScreenScope
        fun provideRestApi(retrofit: Retrofit): ApiServiceDetail = retrofit.create()
    }
}

