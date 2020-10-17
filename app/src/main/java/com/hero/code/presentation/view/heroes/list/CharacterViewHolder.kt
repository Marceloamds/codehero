package com.hero.code.presentation.view.heroes.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.hero.code.R
import com.hero.code.databinding.ItemCharacterBinding
import com.hero.code.domain.entity.character.Character
import com.hero.code.presentation.util.extension.load

class CharacterViewHolder(
    private var binding: ItemCharacterBinding
) : RecyclerView.ViewHolder(binding.root) {


    fun setupBinding(character: Character) {
        with(binding) {
            imageCharacter.load(character.thumbnail)
            textCharacterName.text = character.name
        }
    }

    companion object {
        fun inflate(parent: ViewGroup?) = CharacterViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent?.context),
                R.layout.item_character,
                parent,
                false
            )
        )
    }
}