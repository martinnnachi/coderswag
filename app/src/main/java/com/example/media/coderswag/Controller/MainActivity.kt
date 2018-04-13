package com.example.media.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.media.coderswag.Adapters.CategoryAdapter
import com.example.media.coderswag.Model.Category
import com.example.media.coderswag.R
import com.example.media.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter


    }
}
