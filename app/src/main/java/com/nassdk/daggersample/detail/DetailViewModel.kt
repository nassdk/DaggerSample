package com.nassdk.daggersample.detail

import androidx.lifecycle.ViewModel
import com.nassdk.daggersample.detail.data.DetailRepository
import javax.inject.Inject

class DetailViewModel @Inject constructor(
    private val repository: DetailRepository
) : ViewModel()