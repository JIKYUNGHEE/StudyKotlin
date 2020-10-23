package com.gaeng0517.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gaeng0517.kotlinpractice.databinding.ActivitySpalshBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySpalshBinding
    private lateinit var viewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpalshBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.splashTitle.text = getString(R.string.splash_name)
    }
}