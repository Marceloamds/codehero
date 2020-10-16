package com.nyt.movies.domain.boundary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/nyt/movies/domain/boundary/MovieRepository;", "", "getFavoriteMoviesList", "Lcom/nyt/movies/domain/entity/movie/MoviesList;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMoviesList", "query", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "likeMovie", "Lcom/nyt/movies/domain/entity/movie/Movie;", "movie", "(Lcom/nyt/movies/domain/entity/movie/Movie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMoviesList(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyt.movies.domain.entity.movie.MoviesList> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavoriteMoviesList(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyt.movies.domain.entity.movie.MoviesList> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object likeMovie(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.entity.movie.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyt.movies.domain.entity.movie.Movie> p1);
}