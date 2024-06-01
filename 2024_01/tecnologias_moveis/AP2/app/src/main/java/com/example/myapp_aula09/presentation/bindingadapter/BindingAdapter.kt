package com.example.myapp_aula09.presentation.bindingadapter

import android.widget.ImageView
import com.bumptech.glide.Glide
import androidx.databinding.BindingAdapter

object BindingAdapter {
    @BindingAdapter("loadImg")
    @JvmStatic
    fun ImageView.loadImg(url: String) {
        Glide.with(context)
            .load(url)
            .fitCenter()
            .into(this)
    }
}