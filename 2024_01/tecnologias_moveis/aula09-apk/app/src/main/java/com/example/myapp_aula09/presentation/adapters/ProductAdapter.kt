package com.example.myapp_aula09.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapp_aula09.data.models.Product
import com.example.myapp_aula09.R
import com.example.myapp_aula09.databinding.ProductItemBinding

class ProductAdapter(
    private val products: MutableList<Product>,
    private val goToDetails: (item: Product) -> Unit,
    private val removeProduct: ( product: Product ) -> Unit
    ) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        this.context = parent.context

        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.itemView.context).load(products[position].urlImage).centerCrop()
            .into(holder.productImage)

        holder.itemView.rootView.setOnClickListener {
            goToDetails(products[position])
        }

        holder.itemView.rootView.setOnLongClickListener {
            showPopupMenu(holder.itemView, position)
            true
        }

        holder.itemView.rootView.setOnClickListener {
            goToDetails(products[position])
        }

        holder.productName.text = products[position].name
        holder.productPrice.text = products[position].price.toRealMoney()
    }

    override fun getItemCount(): Int {
        return products.size
    }

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val productImage: ImageView = view.findViewById(R.id.productImg)
        val productName: TextView = view.findViewById(R.id.tvProductName)
        val productPrice: TextView = view.findViewById(R.id.tvProductPrice)
    }

    private fun showPopupMenu(view: View, position: Int) {
        PopupMenu(context, view).apply {
            setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.deletar -> {
                        removeItem(products[position])
                        true
                    }

                    else -> false
                }
            }
            inflate(R.menu.popup_menu)
            show()
        }
    }

    fun removeItem(product: Product) {
        this.products.remove(product)
        notifyDataSetChanged()
    }
}