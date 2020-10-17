package com.hero.code.presentation.view.heroes.list

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.hero.code.domain.entity.character.Character

class ListCharactersAdapter(
    private val onCharacterClickedCallback: (Character) -> Unit,
) : ListAdapter<Character, CharacterViewHolder>(DiffUtilCallback) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        return CharacterViewHolder.inflate(parent)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.setupBinding(getItem(position))
    }

    companion object DiffUtilCallback : DiffUtil.ItemCallback<Character>() {
        override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean =
            oldItem.id == newItem.id
    }
}