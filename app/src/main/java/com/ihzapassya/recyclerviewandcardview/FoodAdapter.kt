package com.ihzapassya.recyclerviewandcardview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ihzapassya.recyclerviewandcardview.R
import com.ihzapassya.recyclerviewandcardview.FoodModel
import com.ihzapassya.recyclerviewandcardview.FoodDetail

class FoodAdapter (private val listFood: ArrayList<FoodModel>, private val context: Context) :
    RecyclerView.Adapter<FoodAdapter.FoodHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_food_list, parent, false)
        return FoodHolder(view)
    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {
        val (image, name, summary) = listFood[position]

        Glide.with(holder.itemView.context)
            .load(image)
            .apply(RequestOptions().override(550, 550))
            .into(holder.image)

        holder.name.text = name
        holder.summary.text = summary

        holder.btnPreview.setOnClickListener {
            openFoodDetail(image,name,summary)
        }
        holder.btnShare.setOnClickListener {
            shareFood(name,summary)
        }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    inner class FoodHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.food_image)
        var name: TextView = itemView.findViewById(R.id.food_name)
        var summary: TextView = itemView.findViewById(R.id.food_summary)
        var btnPreview: Button = itemView.findViewById(R.id.btnPreview)
        var btnShare: Button = itemView.findViewById(R.id.btnShare)
    }

    private fun openFoodDetail(vararg food: String) {
        val i = Intent(context, FoodDetail::class.java)
        i.putExtra("IMAGE_KEY", food[0])
        i.putExtra("NAME_KEY", food[1])
        i.putExtra("SUMMARY_KEY", food[2])
        context.startActivity(i)
    }

    private fun shareFood(vararg food: String) {1
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, food[0] + "\n\n" + food[1])
            type = "text/plain"
        }

        val shareIntent = Intent.createChooser(sendIntent, null)
        context.startActivity(shareIntent)
    }

}