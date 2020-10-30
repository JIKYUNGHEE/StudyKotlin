package com.gaeng0517.kotlinpractice.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.gaeng0517.kotlinpractice.R
import com.gaeng0517.kotlinpractice.databinding.ActivityLottoMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityLottoMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLottoMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lotteryNumbers = arrayListOf(
            binding.number1,
            binding.number2,
            binding.number3,
            binding.number4,
            binding.number5,
            binding.number6
        )

        val countDownTimer = object : CountDownTimer(3000, 100) {
            override fun onFinish() {}

            override fun onTick(p0: Long) {
                lotteryNumbers.forEach {
                    val randomNumber = (Math.random() * 45 + 1).toInt()
                    it.text = "$randomNumber"
                }
            }
        }

        binding.btnLotto.setOnClickListener {
            if (binding.btnLotto.isAnimating) {
                binding.btnLotto.cancelAnimation()
                countDownTimer.cancel()
            } else {
                binding.btnLotto.playAnimation()
                countDownTimer.start()
            }
        }
    }
}