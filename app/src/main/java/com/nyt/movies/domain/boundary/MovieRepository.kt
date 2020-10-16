package com.nyt.movies.domain.boundary

import com.nyt.movies.domain.entity.movie.Movie
import com.nyt.movies.domain.entity.movie.MoviesList

interface MovieRepository {

    suspend fun getMoviesList(page: Int, query: String): MoviesList?
    suspend fun getFavoriteMoviesList(page: Int): MoviesList?
    suspend fun likeMovie(movie: Movie): Movie
}