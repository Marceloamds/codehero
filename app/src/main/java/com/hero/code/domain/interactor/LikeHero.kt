package com.hero.code.domain.interactor

import com.hero.code.domain.boundary.HeroRepository
import com.hero.code.domain.entity.hero.Hero

class LikeHero constructor(
    private val heroRepository: HeroRepository
) {

    suspend fun execute(hero: Hero) = heroRepository.likeHero(hero)
}