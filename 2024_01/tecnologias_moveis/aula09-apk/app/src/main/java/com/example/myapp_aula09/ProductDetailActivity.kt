package com.example.myapp_aula09

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.myapp_aula09.data.models.Product
import com.example.myapp_aula09.presentation.adapters.toRealMoney

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_product_detail)

        val productBundle = intent.extras?.getSerializable("data") as? Product

        val image = findViewById<ImageView>(R.id.productImg)
        val name = findViewById<TextView>(R.id.tvProductName)
        val price = findViewById<TextView>(R.id.tvProductPrice)

        name.text = productBundle?.name
        price.text = productBundle?.price?.toRealMoney()
        Glide.with(this).load(productBundle?.urlImage).into(image)
    }
}