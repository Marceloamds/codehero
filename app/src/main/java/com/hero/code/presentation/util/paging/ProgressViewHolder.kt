package com.hero.code.presentation.util.paging

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hero.code.databinding.ItemProgressBinding

class ProgressViewHolder(val binding: ItemProgressBinding) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun inflate(parent: ViewGroup?): ProgressViewHolder {
            val binding = ItemProgressBinding.inflate(
                LayoutInflater.from(parent?.context),
                parent,
                false
            )
            return ProgressViewHolder(binding)
        }
    }
}
