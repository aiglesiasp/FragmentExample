package com.aiglesiaspubill.fragmentexample.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.viewModels
import com.aiglesiaspubill.fragmentexample.ActivityCallback
import com.aiglesiaspubill.fragmentexample.R
import com.aiglesiaspubill.fragmentexample.databinding.FragmentMainBinding
import com.aiglesiaspubill.fragmentexample.databinding.FragmentSecondBinding

class SecondFragment() : Fragment() {

    private val viewModel : MainViewModel by viewModels()
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //TODO: Es Aqui donde desarrollamos lamayor parte del codigo
    }

}