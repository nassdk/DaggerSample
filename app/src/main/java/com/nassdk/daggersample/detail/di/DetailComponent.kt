package com.nassdk.daggersample.detail.di

import com.nassdk.daggersample.AppComponent
import com.nassdk.daggersample.common.di.scope.ScreenScope
import com.nassdk.daggersample.detail.DetailActivity
import dagger.Component

@Component(modules = [DetailModule::class], dependencies = [AppComponent::class])
@ScreenScope
interface DetailComponent {
    fun inject(activity: DetailActivity)
}