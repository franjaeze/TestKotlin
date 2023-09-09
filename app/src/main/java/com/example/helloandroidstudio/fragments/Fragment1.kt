package com.example.helloandroidstudio.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.helloandroidstudio.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Fragment1 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val v =  inflater.inflate(R.layout.fragment_fragment1, container, false);

        val b = v.findViewById<Button> (R.id.button1)

        b.setOnClickListener{
           val action = Fragment1Directions.actionFragment1ToFragment2()
            v.findNavController().navigate(action)
        }

        return v
    }

    }
