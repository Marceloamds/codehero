package com.hero.code.presentation.view.heroes.list

import android.view.ViewGroup
import com.hero.code.domain.entity.hero.Hero
import com.hero.code.presentation.util.paging.PagingListAdapter

class ListHeroesAdapter(
    private val onHeroClickedCallback: (Hero) -> Unit,
    private val onLikeClickedCallback: (Hero) -> Unit,
    private val onShareClickedCallback: (Hero) -> Unit,
    onProgressShownCallback: () -> Unit?
) : PagingListAdapter<Hero, HeroViewHolder>(onProgressShownCallback) {


    override fun onCreateSubViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        return HeroViewHolder.inflate(parent)
    }

    override fun onBindSubViewHolder(holder: HeroViewHolder, position: Int) {
        holder.setupBinding(
            shownList[position],
            onHeroClickedCallback,
            onLikeClickedCallback,
            onShareClickedCallback
        )
    }

    fun updateHero(hero: Hero) {
        val heroIndex = shownList.indexOfFirst { hero.link.url == it.link.url }
        if (heroIndex >= 0) {
            shownList[heroIndex] = hero
            notifyItemChanged(heroIndex)
        }
    }
}