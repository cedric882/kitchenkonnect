package com.labactivity.kitchenkonek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.kitchenkonek.databinding.ActivityMenuBinding


class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recyclerView = findViewById(R.id.recyclerView)
        recyclerView = binding.recyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        var italianFoods = intent.getStringExtra("category1").equals("recipe1")
        var filipinoFoods = intent.getStringExtra("category2").equals("recipe2")
        var koreanfoods = intent.getStringExtra("category3").equals("recipe3")
        var breakfastFoods = intent.getStringExtra("category4").equals("recipe4")
        var lunchFoods = intent.getStringExtra("category5").equals("recipe5")
        var dinnerFoods = intent.getStringExtra("category6").equals("recipe6")


        val labelOfFoods: FoodDetailsActivity = FoodDetailsActivity()


        if (italianFoods) {
            binding.category.setText("Italian Recipe")
            foodList = ArrayList()
            foodList.add(Food(R.drawable.spaghetti_aglio_eolio, labelOfFoods.italianFood[0]))
            foodList.add(Food(R.drawable.pastacarbonara, labelOfFoods.italianFood[1]))
            foodList.add(Food(R.drawable.margherita_pizza_recipe, labelOfFoods.italianFood[2]))
            foodList.add(Food(R.drawable.pesto_pasta, labelOfFoods.italianFood[3]))
            foodList.add(Food(R.drawable.risotto, labelOfFoods.italianFood[4]))

            foodAdapter = FoodAdapter(foodList)
            recyclerView.adapter = foodAdapter


            foodAdapter.onItemClick = {
                val intent = Intent(this, FoodDetailsActivity::class.java)
                intent.putExtra("food", it)
                startActivity(intent)
            }

        } else if (filipinoFoods) {
            binding.category.setText("Filipino Recipe")
            foodList = ArrayList()
            foodList.add(Food(R.drawable.chickenadobo, labelOfFoods.filipinoFood[0]))
            foodList.add(Food(R.drawable.sinigangnababoy, labelOfFoods.filipinoFood[1]))
            foodList.add(Food(R.drawable.karekare, labelOfFoods.filipinoFood[2]))
            foodList.add(Food(R.drawable.chopsuey, labelOfFoods.filipinoFood[3]))

            foodAdapter = FoodAdapter(foodList)
            recyclerView.adapter = foodAdapter


            foodAdapter.onItemClick = {
                val intent = Intent(this, FoodDetailsActivity::class.java)
                intent.putExtra("food", it)
                startActivity(intent)
            }

        } else if (koreanfoods) {
            binding.category.setText("Korean Recipe")
            foodList = ArrayList()
            foodList.add(Food(R.drawable.bibimbap, labelOfFoods.koreanFood[0]))
            foodList.add(Food(R.drawable.kimchi, labelOfFoods.koreanFood[1]))
            foodList.add(Food(R.drawable.bulgogi, labelOfFoods.koreanFood[2]))
            foodList.add(Food(R.drawable.japchae, labelOfFoods.koreanFood[3]))

            foodAdapter = FoodAdapter(foodList)
            recyclerView.adapter = foodAdapter


            foodAdapter.onItemClick = {
                val intent = Intent(this, FoodDetailsActivity::class.java)
                intent.putExtra("food", it)
                startActivity(intent)
            }

        } else if (breakfastFoods) {
            binding.category.setText("Breakfast Recipe")
            foodList = ArrayList()
            foodList.add(Food(R.drawable.eggsbenedict, labelOfFoods.breakfastFood[0]))
            foodList.add(Food(R.drawable.buttermilkpancakes, labelOfFoods.breakfastFood[1]))
            foodList.add(Food(R.drawable.frenchtoast, labelOfFoods.breakfastFood[2]))
            foodList.add(Food(R.drawable.breakfastburrito, labelOfFoods.breakfastFood[3]))

            foodAdapter = FoodAdapter(foodList)
            recyclerView.adapter = foodAdapter


            foodAdapter.onItemClick = {
                val intent = Intent(this, FoodDetailsActivity::class.java)
                intent.putExtra("food", it)
                startActivity(intent)
            }


        } else if (lunchFoods) {

            binding.category.setText("Lunch Recipe")
            foodList = ArrayList()
            foodList.add(Food(R.drawable.capresesalad, labelOfFoods.lunchFood[0]))
            foodList.add(Food(R.drawable.bltsandwich, labelOfFoods.lunchFood[1]))
            foodList.add(Food(R.drawable.chickencaesarsalad, labelOfFoods.lunchFood[2]))
            foodList.add(Food(R.drawable.grileedcheesesandwich, labelOfFoods.lunchFood[3]))

            foodAdapter = FoodAdapter(foodList)
            recyclerView.adapter = foodAdapter


            foodAdapter.onItemClick = {
                val intent = Intent(this, FoodDetailsActivity::class.java)
                intent.putExtra("food", it)
                startActivity(intent)
            }

        } else if (dinnerFoods) {
            binding.category.setText("Dinner Recipe")
            foodList = ArrayList()
            foodList.add(Food(R.drawable.grilledsteak, labelOfFoods.dinnerFood[0]))
            foodList.add(Food(R.drawable.roastedchicken, labelOfFoods.dinnerFood[1]))
            foodList.add(Food(R.drawable.salmonfillet, labelOfFoods.dinnerFood[2]))
            foodList.add(Food(R.drawable.vegetablestirfry, labelOfFoods.dinnerFood[3]))

            foodAdapter = FoodAdapter(foodList)
            recyclerView.adapter = foodAdapter


            foodAdapter.onItemClick = {
                val intent = Intent(this, FoodDetailsActivity::class.java)
                intent.putExtra("food", it)
                startActivity(intent)
            }


        }


    }

}
