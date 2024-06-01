package com.example.myapp_aula09.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import com.example.myapp_aula09.R
import com.example.myapp_aula09.data.models.Product
import com.example.myapp_aula09.presentation.adapters.ProductAdapter
import com.example.myapp_aula09.presentation.viewmodels.MainViewModel

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val rc = binding.rcProduct
        val productAdapter =
            ProductAdapter(
                viewModel.getProducts(),
                goToDetail = ::goToDetail,
                removeItem = ::removeItem
            )

        rc.adapter = productAdapter

        super.onViewCreated(view, savedInstanceState)
    }

    private fun removeItem(product: Product) {
        viewModel.removeProduct(product)
    }


    private fun goToDetail(product: Product) {
        val bundle = bundleOf("data" to product)
        findNavController().navigate(
            R.id.action_homeFragment_to_productDetailActivity,
            bundle
        )
    }

}