package com.example.whiskysample.ui.third

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.whiskysample.R

class ThirdFragment : Fragment() {

    private lateinit var thirdViewModel: ThirdViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        thirdViewModel =
                ViewModelProvider(this).get(ThirdViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_third, container, false)
        val textView: TextView = root.findViewById(R.id.text_third)
        thirdViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}