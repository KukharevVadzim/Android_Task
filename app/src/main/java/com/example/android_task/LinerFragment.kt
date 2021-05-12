package com.example.android_task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.lainer_fragment.*

class LinerFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.lainer_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val bundle = arguments
        val name = bundle?.getString("text")
        if (savedInstanceState != null) {
            savedInstanceState.getString("text")
            viewLinerFragment.text = savedInstanceState.getString("text")
        }
    }
}