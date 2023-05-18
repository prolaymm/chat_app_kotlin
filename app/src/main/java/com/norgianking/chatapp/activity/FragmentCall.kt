package com.norgianking.chatapp.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.norgianking.chatapp.R

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentCall.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentCall : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_call, container, false)
    }


}