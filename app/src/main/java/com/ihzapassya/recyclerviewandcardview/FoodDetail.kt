package com.ihzapassya.recyclerviewandcardview

import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.ihzapassya.recyclerviewandcardview.R

class FoodDetail : AppCompatActivity() {
    private lateinit var nameTxt: TextView
    private lateinit var img: ImageView
    private lateinit var summaryTxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food_detail)

        if (supportActionBar != null)
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        img         = findViewById(R.id.food_image)
        nameTxt     = findViewById(R.id.food_name)
        summaryTxt  = findViewById(R.id.food_summary)

        val i = this.intent

        val images  = i.extras!!.getString("IMAGE_KEY")
        val name    = i.extras!!.getString("NAME_KEY")
        val summary = i.extras!!.getString("SUMMARY_KEY")

        title = "Detail $name"

        img.setImageURI(Uri.parse(images))
        nameTxt.text = name
        summaryTxt.text = summary

        Glide.with(this)
            .load(images)
            .into(img)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
            finish()
        return super.onOptionsItemSelected(item)
    }
    override fun onBackPressed() {
        finish()
    }

}