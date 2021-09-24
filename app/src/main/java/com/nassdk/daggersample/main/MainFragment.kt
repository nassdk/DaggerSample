package com.nassdk.daggersample.main

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.nassdk.daggersample.R
import com.nassdk.daggersample.appComponent
import com.nassdk.daggersample.main.di.DaggerMainComponent
import com.nassdk.daggersample.main.di.MainViewModel
import javax.inject.Inject

class MainFragment : Fragment(R.layout.fragment_main) {

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject lateinit var viewModelAssistedFactory: MainViewModel.Factory

    private val viewModel: MainViewModel by viewModels {
        MainViewModel.provideFactory(viewModelAssistedFactory, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerMainComponent
            .builder()
            .appComponent(appComponent)
            .build()
            .inject(this)

        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.firstLaunchState.observe(viewLifecycleOwner) { isFirstLaunch ->
            Toast.makeText(requireContext(), "$isFirstLaunch", Toast.LENGTH_LONG).show()
        }
    }
}