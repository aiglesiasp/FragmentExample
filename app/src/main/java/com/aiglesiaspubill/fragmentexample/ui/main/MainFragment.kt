package com.aiglesiaspubill.fragmentexample.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.aiglesiaspubill.fragmentexample.ActivityCallback
import com.aiglesiaspubill.fragmentexample.R
import com.aiglesiaspubill.fragmentexample.databinding.FragmentMainBinding

class MainFragment(private val text: String) : Fragment() {

    companion object {
        fun newInstance() = MainFragment("Prueba")
    }

    private val viewModel : MainViewModel by activityViewModels()
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.message.setText(text)
        binding.root.setOnClickListener {
            var callback = activity as? ActivityCallback
            callback?.onTextPressed(binding.message.text.toString())
        }
        binding.message.doAfterTextChanged {
            viewModel.text = it.toString()
        }
        //TODO: Es Aqui donde desarrollamos lamayor parte del codigo
    }

}