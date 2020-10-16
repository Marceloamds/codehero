package com.hero.code.presentation.view.heroes.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hero.code.domain.entity.hero.Hero
import com.hero.code.domain.entity.hero.HeroesList
import com.hero.code.domain.interactor.GetFavoriteHeroesList
import com.hero.code.domain.interactor.GetHeroesList
import com.hero.code.domain.interactor.LikeHero
import com.hero.code.presentation.util.base.BaseViewModel
import com.hero.code.presentation.view.heroes.details.HeroDetailsNavData

class ListHeroesViewModel constructor(
    private val getHeroesList: GetHeroesList,
    private val likeHero: LikeHero,
    private val getFavoriteHeroesList: GetFavoriteHeroesList
) : BaseViewModel() {

    val heroesList: LiveData<List<Hero>> get() = _heroesList
    val progressVisible: LiveData<Boolean> get() = _progressVisible
    val showEmptyPlaceholder: LiveData<Boolean> get() = _showEmptyPlaceholder
    val shareHero: LiveData<Hero> get() = _shareHero

    private val _heroesList by lazy { MutableLiveData<List<Hero>>() }
    private val _progressVisible by lazy { MutableLiveData<Boolean>() }
    private val _showEmptyPlaceholder by lazy { MutableLiveData<Boolean>() }
    private val _shareHero by lazy { MutableLiveData<Hero>() }

    private var currentPage: Int = 0
    private var currentQuery = ""

    init {
        requestNewHeroes()
    }

    fun onQueryChanged(query: String) {
        currentQuery = query
        currentPage = 0
        requestNewHeroes()
    }

    fun onHeroeselected(hero: Hero) {
        goTo(HeroDetailsNavData(hero))
    }

    fun onLikeClicked(hero: Hero) {
        launchDataLoad {
            likeHero.execute(hero)
        }
    }

    fun onShareClicked(hero: Hero) {
        _shareHero.value = hero
    }

    fun onFavoriteHeroesClicked() {
        currentPage = 0
        launchDataLoad(onFailure = ::onFailure) {
            setHeroesList(getFavoriteHeroesList.execute(currentPage))
        }
    }

    fun getAllHeroes() {
        currentPage = 0
        requestNewHeroes()
    }

    fun onProgressItemShown() {
        currentPage += 1
        requestNewHeroes(false)
    }

    private fun requestNewHeroes(showPlaceholder: Boolean = true) {
        launchDataLoad(showPlaceholder, onFailure = ::onFailure) {
            val heroesList = getHeroesList.execute(currentPage, currentQuery)
            setHeroesList(heroesList)
            heroesList?.exception?.let { setDialog(it) { requestNewHeroes(showPlaceholder) } }
        }
    }

    private fun setHeroesList(heroesList: HeroesList?) {
        _progressVisible.value = heroesList?.hasMore
        _heroesList.value = heroesList?.heroes
        _showEmptyPlaceholder.value = heroesList?.heroes?.isEmpty()
    }

    private fun onFailure(throwable: Throwable) {
        setDialog(throwable) { requestNewHeroes(true) }
    }
}