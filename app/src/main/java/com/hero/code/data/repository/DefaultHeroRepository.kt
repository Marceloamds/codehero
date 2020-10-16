package com.hero.code.data.repository

import com.hero.code.data.local.dao.HeroDao
import com.hero.code.data.local.entity.DbHero
import com.hero.code.data.client.ApiClient
import com.hero.code.data.util.request.containsQuery
import com.hero.code.domain.boundary.HeroRepository
import com.hero.code.domain.entity.hero.Hero
import com.hero.code.domain.entity.hero.HeroesList

class DefaultHeroRepository constructor(
    private val apiClient: ApiClient,
    private val heroDao: HeroDao
) : HeroRepository {

    override suspend fun getHeroesList(page: Int, query: String): HeroesList? {
        var heroesList = getHeroesFromDatabase(page, query)
        if (!heroesList.hasMore) { heroesList = updateDatabaseWithApi(page, query) }
        return heroesList
    }

    override suspend fun likeHero(hero: Hero): Hero {
        heroDao.updateHero(DbHero.fromDomainObject(hero))
        return hero
    }

    override suspend fun getFavoriteHeroesList(page: Int): HeroesList? {
        val heroList = heroDao.getFavoriteHeroes(page.localPage())
        return HeroesList(
            heroDao.getFavoriteHeroesCount() > heroList.size,
            heroList.map { it.toDomainObject() }
        )
    }

    private suspend fun getHeroesFromDatabase(page: Int, query: String): HeroesList {
        val heroList = heroDao.getHeroes(page.localPage(), query.containsQuery())
        return HeroesList(
            heroDao.getHeroesCount(query.containsQuery()) > heroList.size,
            heroList.map { it.toDomainObject() }
        )
    }

    private suspend fun updateDatabaseWithApi(page: Int, query: String): HeroesList {
        var hasMoreApiHeroes = false
        var apiException: Exception? = null
        try {
            val apiHeroesList = apiClient.getHeroesList(page.apiPage(), query)?.toDomainObject()
            apiHeroesList?.heroes?.let { heroDao.insertHeroes(it.map(DbHero::fromDomainObject)) }
            hasMoreApiHeroes = apiHeroesList?.hasMore ?: false
        } catch (e: Exception) {
            apiException = e
        }
        return getHeroesFromDatabase(page, query).apply {
            hasMore = hasMoreApiHeroes
            exception = apiException
        }
    }

    private fun Int.localPage() = (this + 1) * HEROES_PER_PAGE
    private fun Int.apiPage() = this * HEROES_PER_PAGE

    companion object {
        private const val HEROES_PER_PAGE = 20
    }
}