package com.nassdk.daggersample.main.di

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nassdk.daggersample.main.data.network.RepositoryMain
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class MainViewModel @AssistedInject constructor(
    private val repository: RepositoryMain,
    @Assisted private val isFirstLaunch: Boolean
) : ViewModel() {

    private val _firstLaunchState = MutableLiveData<Boolean>()

    val firstLaunchState: LiveData<Boolean>
        get() = _firstLaunchState

    init {
        _firstLaunchState.value = isFirstLaunch
        repository
    }

    @AssistedFactory
    interface Factory {
        fun create(isFirstLaunch: Boolean): MainViewModel
    }

    @Suppress("UNCHECKED_CAST")
    companion object {
        fun provideFactory(
            assistedFactory: Factory,
            isFirstLaunch: Boolean
        ): ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return assistedFactory.create(isFirstLaunch = isFirstLaunch) as T
            }
        }
    }
}