package com.aiglesiaspubill.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aiglesiaspubill.fragmentexample.databinding.ActivityMainBinding
import com.aiglesiaspubill.fragmentexample.ui.main.MainFragment
import com.aiglesiaspubill.fragmentexample.ui.main.SecondFragment

interface ActivityCallback {
    fun onTextPressed(text: String)
}

class MainActivity : AppCompatActivity() , ActivityCallback {

    private  lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            val fragment = MainFragment("Pasando un String")
            supportFragmentManager.beginTransaction()
                .replace(binding.container.id, fragment)
                .commitNow()
        }

        //AL PULSAR EL BOTON CAMBIA DE FRAGMEN
        binding.btnButton.setOnClickListener {
            val fragment = SecondFragment()
            supportFragmentManager.beginTransaction()
                .replace(binding.container.id, fragment)
                .commitNow()
        }
    }

    override fun onTextPressed(text: String) {
        binding.btnButton.text = text
    }
}