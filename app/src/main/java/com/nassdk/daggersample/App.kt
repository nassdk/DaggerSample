package com.nassdk.daggersample

import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment

class App : Application() {

//    val appComponent by lazy {
//        DaggerAppComponent.builder()
//            .context(applicationContext)
//            .build()
//    }

    val appComponent by lazy {
        DaggerAppComponent.factory()
            .create(context = applicationContext)
    }
}

val Context.appComponent: AppComponent
    get() = when (this) {
        is App -> appComponent
        else -> this.applicationContext.appComponent
    }

val Fragment.appComponent: AppComponent
    get() = requireContext().appComponent