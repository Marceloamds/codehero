package com.hero.code.presentation.view.character.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hero.code.R
import com.hero.code.databinding.ItemUrlBinding
import com.hero.code.domain.entity.character.Url
import com.hero.code.domain.entity.character.UrlType
import com.hero.code.presentation.util.extension.openBrowser

class CharacterUrlViewHolder(
    private val binding: ItemUrlBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(url: Url) {
        with(binding) {
            val context = root.context
            buttonGoTo.text = context.getString(R.string.go_to_page, url.type?.getName())
            buttonGoTo.setOnClickListener { context.openBrowser(url.url) }
        }
    }

    private fun UrlType.getName(): String {
        val context = binding.root.context
        return when (this) {
            UrlType.Detail -> context.getString(R.string.detail_url_type_name)
            UrlType.Wiki -> context.getString(R.string.wiki_url_type_name)
            UrlType.ComicLink -> context.getString(R.string.comic_url_type_name)
            is UrlType.Other -> type
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