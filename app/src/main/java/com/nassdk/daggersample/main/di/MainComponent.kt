package com.nassdk.daggersample.main.di

import com.nassdk.daggersample.AppComponent
import com.nassdk.daggersample.common.di.scope.ScreenScope
import com.nassdk.daggersample.main.MainFragment
import dagger.Component

@ScreenScope
@Component(
    modules = [MainModule::class],
    dependencies = [AppComponent::class]
)
interface MainComponent {
    fun inject(fragment: MainFragment)
}