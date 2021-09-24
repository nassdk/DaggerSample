package com.nassdk.daggersample.detail.di

import com.nassdk.daggersample.AppComponent
import com.nassdk.daggersample.common.di.scope.ScreenScope
import com.nassdk.daggersample.common.di.vm.ViewModelModule
import com.nassdk.daggersample.detail.DetailFragment
import dagger.Component

@ScreenScope
@Component(
    modules = [DetailModule::class, ViewModelModule::class],
    dependencies = [AppComponent::class]
)
interface DetailComponent {
    fun inject(fragment: DetailFragment)
}