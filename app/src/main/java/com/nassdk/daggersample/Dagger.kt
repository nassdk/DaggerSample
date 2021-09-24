package com.nassdk.daggersample

import android.content.Context
import dagger.*
import retrofit2.Retrofit
import javax.inject.Qualifier
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun exposeContext(): Context
    fun exposeRetrofit(): Retrofit

    //    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        fun context(context: Context): Builder
//
//        fun build(): AppComponent
//    }
}


@Module
class AppModule

@Module
object NetworkModule {

//    @Provides
//    @ApiV1
//    fun provideRetrofitV1(): ApiService {
//
//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://www.google/v1")
//            .build()
//
//        return retrofit.create()
//    }

    @Provides
    @Reusable
    fun provideRetrofitV2(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("https://www.google/v2")
            .build()
    }
}

@Qualifier
@Retention
annotation class ApiV1

