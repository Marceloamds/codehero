package com.hero.code.presentation.view.character.details

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.hero.code.domain.entity.character.Url

class CharacterUrlsAdapter : ListAdapter<Url, CharacterUrlViewHolder>(DiffUtilCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterUrlViewHolder {
        return CharacterUrlViewHolder.inflate(parent)
    }

    override fun onBindViewHolder(holder: CharacterUrlViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object DiffUtilCallback : DiffUtil.ItemCallback<Url>() {
        override fun areItemsTheSame(oldItem: Url, newItem: Url) = (oldItem == newItem)
        override fun areContentsTheSame(oldItem: Url, newItem: Url) = (oldItem.url == newItem.url)
    }
}
