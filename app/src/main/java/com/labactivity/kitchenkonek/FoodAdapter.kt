package com.labactivity.kitchenkonek

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.kitchenkonek.Food
import com.labactivity.kitchenkonek.databinding.EachItemBinding

class FoodAdapter(private val foodList: ArrayList<Food>)
    : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    var onItemClick: ((Food) -> Unit)? = null

    class FoodViewHolder(private val binding: EachItemBinding): RecyclerView.ViewHolder(binding.root) {
        val imageView = binding.imageOfRecipe
        val textView = binding.titleOfRecipe
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val binding = EachItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.imageView.setImageResource(food.image)
        holder.textView.text = food.name

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(food)
        }
    }
}
