package com.gaeng0517.kotlinpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gaeng0517.kotlinpractice.databinding.FragmentBlankBinding

class BindFragment : Fragment(R.layout.fragment_blank) {
    private var fragmentBlankBinding: FragmentBlankBinding ? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentBlankBinding.bind(view)
        fragmentBlankBinding = binding
        binding.textViewFragment.text = getString(R.string.hello_from_vb_bindfragment)
    }

    override fun onDestroyView() {
        fragmentBlankBinding = null
        super.onDestroyView()
    }
}