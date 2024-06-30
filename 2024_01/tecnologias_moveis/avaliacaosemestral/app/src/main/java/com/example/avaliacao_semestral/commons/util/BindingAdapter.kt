package com.example.avaliacao_semestral.commons.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object BindingAdapter {
    @BindingAdapter("loadImg")
    @JvmStatic
    fun ImageView.loadImg(url: String) {
        Glide
            .with(context)
            .load(url)
            .into(this)
    }
}