package com.labactivity.kitchenkonek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.kitchenkonek.databinding.UserprofileLayoutBinding

class RecipeDetails : AppCompatActivity() {
    private lateinit var binding: UserprofileLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = UserprofileLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
   fun backToHomeScreen(){
        val intent = Intent(this,MenuSection::class.java)
        startActivity(intent)
        finish()
    }

}