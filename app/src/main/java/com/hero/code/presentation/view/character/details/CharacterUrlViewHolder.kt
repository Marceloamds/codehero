package com.hero.code.presentation.view.character.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hero.code.R
import com.hero.code.databinding.ItemUrlBinding
import com.hero.code.domain.entity.character.Url
import com.hero.code.presentation.util.extension.openBrowser

class CharacterUrlViewHolder(
    private val binding: ItemUrlBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(url: Url) {
        with(binding) {
            val context = root.context
            buttonGoTo.text = context.getString(R.string.go_to_page, url.type)
            buttonGoTo.setOnClickListener {
                root.context.openBrowser(url.url)
            }
        }
    }

    companion object {

        fun inflate(parent: ViewGroup) = CharacterUrlViewHolder(
            ItemUrlBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }
}