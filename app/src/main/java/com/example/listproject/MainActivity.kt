package com.example.listproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listproject.databinding.ActivityMainBinding
import com.example.listproject.databinding.ExampleAdapterBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//create 20 products Product(title:"Parrot", price = 100)
        //create adapter and submit list of products
        val listOfProducts = listOf<Product>(
            Product(title = "Tommas", number = 20),
            Product(title = "Sylus", number = 15),
            Product(title = "Xavier", number = 7),
            Product(title = "Zayne", number = 9)
        )
        val adapterExample = ExampleRecyclerAdapter()
        binding.rcProducts.adapter = adapterExample
        adapterExample.submitList(listOfProducts)
    }
}