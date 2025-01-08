package com.example.listproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//create 20 products Product(title:"Parrot", price = 100)
        //create adapter and submit list of products
        val listOfProducts = listOf<Product>(Product(title = "Apple", price = 100)); Product(
            title = "Banana", price = 100); Product(title = "Banana", price = 100); (Product(title = "Orange", price = 100))
val adapter = ExampleRecyclerAdapter()
        binding.rcProducts.adapter = adapter
        adapter.submitList(listOfProducts)
    }
}