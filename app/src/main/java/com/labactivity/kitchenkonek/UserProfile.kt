package com.labactivity.kitchenkonek


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.labactivity.kitchenkonek.databinding.UserprofileLayoutBinding
import java.io.File

class UserProfile : AppCompatActivity() {
    private lateinit var binding: UserprofileLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = UserprofileLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logo.setOnClickListener(){
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
            finish()
        }

    }

}
