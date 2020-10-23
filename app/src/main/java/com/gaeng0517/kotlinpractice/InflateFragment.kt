package com.gaeng0517.kotlinpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gaeng0517.kotlinpractice.databinding.FragmentBlankBinding

class InflateFragment:Fragment(){
    private var fragmentBlankBinding:FragmentBlankBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBlankBinding.inflate(inflater, container, false)
        binding.textViewFragment.text = getString(R.string.hello_from_vb_bindfragment)
        return binding.root
    }

    override fun onDestroyView() {
        fragmentBlankBinding = null
        super.onDestroyView()
    }
}