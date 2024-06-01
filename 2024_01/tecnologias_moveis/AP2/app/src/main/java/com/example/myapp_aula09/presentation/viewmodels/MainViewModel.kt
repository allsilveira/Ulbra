package com.example.myapp_aula09.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.example.myapp_aula09.data.models.Product

class MainViewModel : ViewModel() {
    private val products: MutableList<Product> = mutableListOf(
        Product(
            urlImage = "https://t4.ftcdn.net/jpg/06/93/09/47/240_F_693094707_Eavnydwp6Su2Tx9REPzSZxDmEbElu0Az.jpg",
            name = "Laranja",
            price = "15.00"
        ),
        Product(
            urlImage = "https://t4.ftcdn.net/jpg/04/13/50/15/240_F_413501576_JBNFcI7nQ34BYAu7FXJTWLZQ8Y7ptSz3.jpg",
            name = "Morango",
            price = "29.00"
        ),
        Product(
            urlImage = "https://t3.ftcdn.net/jpg/04/91/00/82/240_F_491008206_6J87meZRmjPYlrTpBEeVzFSm1m3kqOd2.jpg",
            name = "Maça",
            price = "11.90"
        ),
        Product(
            urlImage = "https://t4.ftcdn.net/jpg/06/93/09/47/240_F_693094707_Eavnydwp6Su2Tx9REPzSZxDmEbElu0Az.jpg",
            name = "Pera",
            price = "7.50"
        ),
        Product(
            urlImage = "https://t4.ftcdn.net/jpg/04/13/50/15/240_F_413501576_JBNFcI7nQ34BYAu7FXJTWLZQ8Y7ptSz3.jpg",
            name = "Abacate",
            price = "12.10"
        ),
        Product(
            urlImage = "https://t3.ftcdn.net/jpg/04/91/00/82/240_F_491008206_6J87meZRmjPYlrTpBEeVzFSm1m3kqOd2.jpg",
            name = "Banana",
            price = "5.90"
        ),
        Product(
            urlImage = "https://t4.ftcdn.net/jpg/06/93/09/47/240_F_693094707_Eavnydwp6Su2Tx9REPzSZxDmEbElu0Az.jpg",
            name = "Abacaxi",
            price = "9.00"
        )
    )
    fun getProducts(): MutableList<Product> {
        return this.products
    }

    fun removeProduct(product: Product) = products.remove(product)
}