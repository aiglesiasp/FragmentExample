package com.aiglesiaspubill.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aiglesiaspubill.fragmentexample.databinding.ActivityMainBinding
import com.aiglesiaspubill.fragmentexample.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(binding.container.id, MainFragment.newInstance())
                .commitNow()
        }
    }
}