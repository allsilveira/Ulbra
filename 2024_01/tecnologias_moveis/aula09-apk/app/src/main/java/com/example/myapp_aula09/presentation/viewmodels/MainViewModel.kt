package com.example.myapp_aula09.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.example.myapp_aula09.data.models.Product

class MainViewModel : ViewModel() {
    private val products: MutableList<Product> = mutableListOf(
        Product(
            urlImage = "https://images.unsplash.com/photo-1580052614034-c55d20bfee3b?q=80&w=1374&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            name = "Laranja",
            price = "15.00"
        ),
        Product(
            urlImage = "https://images.unsplash.com/photo-1588165171080-c89acfa5ee83?q=80&w=1374&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            name = "Morango",
            price = "29.00"
        ),
        Product(
            urlImage = "https://images.unsplash.com/photo-1570913149827-d2ac84ab3f9a?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            name = "Maçã",
            price = "11.90"
        ),
        Product(
            urlImage = "https://images.unsplash.com/photo-1572929773424-93549dced6d0?q=80&w=1374&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            name = "Pera",
            price = "7.50"
        ),
        Product(
            urlImage = "https://images.unsplash.com/photo-1523049673857-eb18f1d7b578?q=80&w=1375&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            name = "Abacate",
            price = "12.10"
        ),
        Product(
            urlImage = "https://images.unsplash.com/photo-1528825871115-3581a5387919?q=80&w=1430&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            name = "Banana",
            price = "5.90"
        ),
        Product(
            urlImage = "https://images.unsplash.com/photo-1589820296156-2454bb8a6ad1?q=80&w=1374&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            name = "Abacaxi",
            price = "9.00"
        )
    )
    fun getProducts(): MutableList<Product> {
        return this.products
    }

    fun removeProduct(product: Product): Boolean {
        return products.remove(product);
    }
}