package com.nassdk.daggersample.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.nassdk.daggersample.R
import com.nassdk.daggersample.appComponent
import com.nassdk.daggersample.detail.di.DaggerDetailComponent
import javax.inject.Inject

class DetailFragment : Fragment(R.layout.fragment_detail) {

    companion object {
        fun newInstance() = DetailFragment()
    }

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: DetailViewModel by viewModels(factoryProducer = { viewModelFactory })

    override fun onCreate(savedInstanceState: Bundle?) {

        DaggerDetailComponent.builder()
            .appComponent(appComponent)
            .build()
            .inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel
    }
}