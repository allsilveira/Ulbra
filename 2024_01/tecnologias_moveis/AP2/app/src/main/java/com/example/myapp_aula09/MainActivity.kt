package com.example.myapp_aula09

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp_aula09.data.models.Product
import com.example.myapp_aula09.presentation.adapters.ProductAdapter
import com.example.myapp_aula09.presentation.fragments.HomeFragment
import com.example.myapp_aula09.presentation.viewmodels.MainViewModel

/*
class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        supportActionBar?.apply {
            title = "Início"
            setDisplayHomeAsUpEnabled(true)

        }


        val recycler = findViewById<RecyclerView>(R.id.recycler)
        val productAdapter = ProductAdapter(mainViewModel.getProducts(), ::goToDetail)

        recycler.adapter = productAdapter

    }

    private fun goToDetail(item: Product) {
        Intent(this, ProductDetailActivity::class.java).apply {
            putExtra("data", item)
            startActivity(this)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
 */