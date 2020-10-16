package com.hero.code.presentation.view.heroes.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hero.code.domain.entity.hero.Hero
import com.hero.code.domain.interactor.LikeHero
import com.hero.code.presentation.util.base.BaseViewModel
import com.hero.code.presentation.view.heroes.OnHeroChangedObservable

class HeroDetailsViewModel(
    private val likeHero: LikeHero
) : BaseViewModel() {

    val shareHero: LiveData<Hero> get() = _shareHero
    private val _shareHero by lazy { MutableLiveData<Hero>() }

    fun onLikeClicked(hero: Hero?) {
        hero?.let {
            launchDataLoad {
                it.isFavorite = !it.isFavorite
                OnHeroChangedObservable.updateHero(likeHero.execute(it))
            }
        }
    }

    fun onShareClicked(hero: Hero?) {
        _shareHero.value = hero
    }
}