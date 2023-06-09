package com.labactivity.kitchenkonek

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.kitchenkonek.databinding.HomescreenBinding

class HomeScreen : AppCompatActivity() {
    private lateinit var binding: HomescreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomescreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.italianFood.setOnClickListener() {
            gotoactivity(this, MenuActivity::class.java, "category1", "recipe1")
        }
        binding.filipinoFood.setOnClickListener(){
            gotoactivity(this, MenuActivity::class.java, "category2", "recipe2")
        }
        binding.koreanFood.setOnClickListener(){
            gotoactivity(this, MenuActivity::class.java, "category3", "recipe3")

        }
        binding.breakfastLogo.setOnClickListener(){
            gotoactivity(this, MenuActivity::class.java,"category4", "recipe4")
        }

        binding.lunchlogo.setOnClickListener(){
            gotoactivity(this, MenuActivity::class.java,"category5", "recipe5")
        }

        binding.dinnerlogo.setOnClickListener(){
            gotoactivity(this, MenuActivity::class.java,"category6", "recipe6")
        }

        binding.userProfile.setOnClickListener(){
            gotoactivity(this, UserProfile::class.java,"category7", "recipe7")
        }
        binding.aboutUsBtn.setOnClickListener(){
            gotoactivity(this, AboutUs::class.java)
        }


    }
    fun gotoactivity(activity: Activity, classs: Class<*>, category: String, keyCategory: String) {
        val intent = Intent(activity, classs)
        intent.putExtra(category, keyCategory)
        startActivity(intent)
    }
    fun gotoactivity(activity: Activity, classs: Class<*>) {
        val intent = Intent(activity, classs)
        startActivity(intent)
    }
}