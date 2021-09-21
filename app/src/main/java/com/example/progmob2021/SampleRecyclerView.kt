package com.example.progmob2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView


class SampleRecyclerView : AppCompatActivity() {
    var items = arrayOf(
        "MA", "Meidianti Ayu", "100", "200", "300",
        "MA1", "Meidianti Ayu", "100", "200", "300",
        "MA2", "Meidianti Ayu", "100", "200", "300",
        "MA3", "Meidianti Ayu", "100", "200", "300",
        "MA4", "Meidianti Ayu", "100", "200", "300"
    )

    lateinit var rv_lat : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_recycler_view)

        rv_lat = findViewById(R.id.rvLatihan)



    }
}