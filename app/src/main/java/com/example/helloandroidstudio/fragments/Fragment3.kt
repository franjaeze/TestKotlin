package com.example.helloandroidstudio.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.helloandroidstudio.viewModel.Fragment3ViewModel
import com.example.helloandroidstudio.R

class Fragment3 : Fragment() {

    companion object {
        fun newInstance() = Fragment3()
    }

    private lateinit var viewModel: Fragment3ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment3, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment3ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}