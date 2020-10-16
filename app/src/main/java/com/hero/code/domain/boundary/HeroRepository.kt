package com.hero.code.domain.boundary

import com.hero.code.domain.entity.hero.Hero
import com.hero.code.domain.entity.hero.HeroesList

interface HeroRepository {
    suspend fun getHeroesList(page: Int, query: String): HeroesList?
    suspend fun getFavoriteHeroesList(page: Int): HeroesList?
    suspend fun likeHero(hero: Hero): Hero
}