package com.nyt.movies.presentation.view.movies.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BQ\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/nyt/movies/presentation/view/movies/list/ListMoviesAdapter;", "Lcom/nyt/movies/presentation/util/paging/PagingListAdapter;", "Lcom/nyt/movies/domain/entity/movie/Movie;", "Lcom/nyt/movies/presentation/view/movies/list/MovieViewHolder;", "onMovieClickedCallback", "Lkotlin/Function1;", "", "onLikeClickedCallback", "onShareClickedCallback", "onProgressShownCallback", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "onBindSubViewHolder", "holder", "position", "", "onCreateSubViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateMovie", "movie", "app_debug"})
public final class ListMoviesAdapter extends com.nyt.movies.presentation.util.paging.PagingListAdapter<com.nyt.movies.domain.entity.movie.Movie, com.nyt.movies.presentation.view.movies.list.MovieViewHolder> {
    private final kotlin.jvm.functions.Function1<com.nyt.movies.domain.entity.movie.Movie, kotlin.Unit> onMovieClickedCallback = null;
    private final kotlin.jvm.functions.Function1<com.nyt.movies.domain.entity.movie.Movie, kotlin.Unit> onLikeClickedCallback = null;
    private final kotlin.jvm.functions.Function1<com.nyt.movies.domain.entity.movie.Movie, kotlin.Unit> onShareClickedCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nyt.movies.presentation.view.movies.list.MovieViewHolder onCreateSubViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindSubViewHolder(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.presentation.view.movies.list.MovieViewHolder holder, int position) {
    }
    
    public final void updateMovie(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.entity.movie.Movie movie) {
    }
    
    public ListMoviesAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.nyt.movies.domain.entity.movie.Movie, kotlin.Unit> onMovieClickedCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.nyt.movies.domain.entity.movie.Movie, kotlin.Unit> onLikeClickedCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.nyt.movies.domain.entity.movie.Movie, kotlin.Unit> onShareClickedCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onProgressShownCallback) {
        super(null);
    }
}