package com.example.progmob2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.progmob2021.adapter.PetaniAdapter
import com.example.progmob2021.model.Petani

class SampleList : AppCompatActivity() {
    lateinit var btnList: Button
    lateinit var btnRecycle: Button
    lateinit var btnCard: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnList=findViewById(R.id.btnShowList)
        btnRecycle=findViewById(R.id.btnSampleRV)
        btnCard=findViewById(R.id.btnCard)

        btnList.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList, SampleListView::class.java)
            startActivity(intent)
        })

        btnRecycle.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList, SampleRecyclerView::class.java)
            startActivity(intent)
        })

        btnCard.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList, SampleCardView::class.java)
            startActivity(intent)
        })
    }
}