package com.example.myapp_aula09.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp_aula09.R
import com.example.myapp_aula09.data.models.Product
import com.example.myapp_aula09.presentation.adapters.ProductAdapter
import com.example.myapp_aula09.presentation.viewmodels.MainViewModel


class HomeFragment : Fragment() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var adapter: ProductAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val recycler = view.findViewById<RecyclerView>(R.id.recycler)

        val productAdapter = ProductAdapter(mainViewModel.getProducts(), ::clickProduct) {
            mainViewModel.removeProduct(it);
        }

        recycler.adapter = productAdapter
    }

    private fun clickProduct(product: Product) {
        val bundle = bundleOf("data" to product)
        findNavController().navigate(R.id.action_homeFragment_to_productDetailActivity, bundle)
    }
}