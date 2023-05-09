package com.labactivity.kitchenkonek


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.kitchenkonek.databinding.OptionallayoutforcontentBinding

class MenuSection : AppCompatActivity() {
    private lateinit var binding: OptionallayoutforcontentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OptionallayoutforcontentBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    public fun backToHomeScreen() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
        finish()
    }


    fun recipeDetails(){
        val intent = Intent(this,RecipeDetails::class.java)
        startActivity(intent)
        finish()
    }
}