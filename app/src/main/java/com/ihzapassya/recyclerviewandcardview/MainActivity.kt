package com.ihzapassya.recyclerviewandcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.ihzapassya.recyclerviewandcardview.R
import com.ihzapassya.recyclerviewandcardview.FoodAdapter
import com.ihzapassya.recyclerviewandcardview.FoodData
import com.ihzapassya.recyclerviewandcardview.FoodModel

class MainActivity : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<FoodModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Food Menu"

        rvFood = findViewById(R.id.rvFood)
        rvFood.setHasFixedSize(true)
        list.addAll(FoodData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val cardviewFoodAdapter = FoodAdapter(list,this)
        rvFood.adapter = cardviewFoodAdapter
    }
}