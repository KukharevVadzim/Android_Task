package com.example.android_task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.constraint_fragment.*

class ConstraintFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.lainer_fragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = arguments
        val name = bundle?.getString("text")
        if (savedInstanceState != null) {
            savedInstanceState.getString("text")
            viewFragmentConstraint.text = savedInstanceState.getString("text")
        }
    }
}