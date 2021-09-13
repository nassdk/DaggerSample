package com.nassdk.daggersample

import android.content.Context
import com.nassdk.daggersample.common.network.ApiService
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Qualifier
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}


@Module(includes = [NetworkModule::class])
class AppModule

@Module
class NetworkModule {

    @Provides
    @ApiV1
    fun provideRetrofitV1(): ApiService {

        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.google/v1")
            .build()

        return retrofit.create()
    }

    @Provides
    fun provideRetrofitV2(): ApiService {

        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.google/v2")
            .build()

        return retrofit.create()
    }
}

@Qualifier
@Retention
annotation class ApiV1

