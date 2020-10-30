package com.gaeng0517.kotlinpractice.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.gaeng0517.kotlinpractice.databinding.ActivityLottoSplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivityLottoSplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLottoSplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val handler = Handler(Looper.getMainLooper())
        val runnable = Runnable {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        handler.postDelayed(runnable, 3000)

        binding.animationView.setOnClickListener {
            handler.removeCallbacks(runnable)
        }
    }
}