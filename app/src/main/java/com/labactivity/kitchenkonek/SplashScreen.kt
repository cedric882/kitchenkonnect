package com.labactivity.kitchenkonek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.kitchenkonek.databinding.ActivitySplashScreenBinding
class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivNote.alpha = 0f
        binding.ivNote.animate().setDuration(1500).alpha(1f).withEndAction{
            val i = Intent(this, LoginScreen::class.java)
            startActivity(i)
            finish()
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
}