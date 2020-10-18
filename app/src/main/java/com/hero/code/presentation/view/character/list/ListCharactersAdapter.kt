package com.hero.code.presentation.view.character.list

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hero.code.presentation.view.character.show.ShowCharacterFragment

class ListCharactersAdapter(
    fragmentActivity: FragmentActivity,
    private val totalPages: Int,
    private val query: String
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount() = totalPages

    override fun createFragment(position: Int) = ShowCharacterFragment.newInstance(position, query)
}