package com.hero.code.presentation.view.heroes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hero.code.domain.entity.hero.Hero

object OnHeroChangedObservable{

    val updatedHero: LiveData<Hero> get() = _updatedHero
    private val _updatedHero by lazy { MutableLiveData<Hero>() }

    fun updateHero(hero: Hero){
        _updatedHero.value = hero
    }
}