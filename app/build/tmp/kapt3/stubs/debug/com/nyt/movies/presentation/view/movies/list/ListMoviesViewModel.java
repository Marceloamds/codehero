package com.nyt.movies.presentation.view.movies.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020)J\u000e\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\fJ\u000e\u00100\u001a\u00020)2\u0006\u0010/\u001a\u00020\fJ\u0006\u00101\u001a\u00020)J\u000e\u00102\u001a\u00020)2\u0006\u00103\u001a\u00020\u001eJ\u000e\u00104\u001a\u00020)2\u0006\u0010/\u001a\u00020\fJ\u0012\u00105\u001a\u00020)2\b\b\u0002\u00106\u001a\u00020\u0012H\u0002J\u0012\u00107\u001a\u00020)2\b\u0010\u001f\u001a\u0004\u0018\u000108H\u0002R\'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0016\u0010\u000eR!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0019\u0010\u000eR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0 8F\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120 8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010!R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0 8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010!R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120 8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010!\u00a8\u00069"}, d2 = {"Lcom/nyt/movies/presentation/view/movies/list/ListMoviesViewModel;", "Lcom/nyt/movies/presentation/util/base/BaseViewModel;", "getMoviesList", "Lcom/nyt/movies/domain/interactor/GetMoviesList;", "likeMovie", "Lcom/nyt/movies/domain/interactor/LikeMovie;", "getFavoriteMoviesList", "Lcom/nyt/movies/domain/interactor/GetFavoriteMoviesList;", "(Lcom/nyt/movies/domain/interactor/GetMoviesList;Lcom/nyt/movies/domain/interactor/LikeMovie;Lcom/nyt/movies/domain/interactor/GetFavoriteMoviesList;)V", "_moviesList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/nyt/movies/domain/entity/movie/Movie;", "get_moviesList", "()Landroidx/lifecycle/MutableLiveData;", "_moviesList$delegate", "Lkotlin/Lazy;", "_progressVisible", "", "get_progressVisible", "_progressVisible$delegate", "_shareMovie", "get_shareMovie", "_shareMovie$delegate", "_showEmptyPlaceholder", "get_showEmptyPlaceholder", "_showEmptyPlaceholder$delegate", "currentPage", "", "currentQuery", "", "moviesList", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "progressVisible", "getProgressVisible", "shareMovie", "getShareMovie", "showEmptyPlaceholder", "getShowEmptyPlaceholder", "getAllMovies", "", "onFailure", "throwable", "", "onFavoriteMoviesClicked", "onLikeClicked", "movie", "onMovieSelected", "onProgressItemShown", "onQueryChanged", "query", "onShareClicked", "requestNewMovies", "showPlaceholder", "setMoviesList", "Lcom/nyt/movies/domain/entity/movie/MoviesList;", "app_debug"})
public final class ListMoviesViewModel extends com.nyt.movies.presentation.util.base.BaseViewModel {
    private final kotlin.Lazy _moviesList$delegate = null;
    private final kotlin.Lazy _progressVisible$delegate = null;
    private final kotlin.Lazy _showEmptyPlaceholder$delegate = null;
    private final kotlin.Lazy _shareMovie$delegate = null;
    private int currentPage = 0;
    private java.lang.String currentQuery = "";
    private final com.nyt.movies.domain.interactor.GetMoviesList getMoviesList = null;
    private final com.nyt.movies.domain.interactor.LikeMovie likeMovie = null;
    private final com.nyt.movies.domain.interactor.GetFavoriteMoviesList getFavoriteMoviesList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.nyt.movies.domain.entity.movie.Movie>> getMoviesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProgressVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowEmptyPlaceholder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nyt.movies.domain.entity.movie.Movie> getShareMovie() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.nyt.movies.domain.entity.movie.Movie>> get_moviesList() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_progressVisible() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_showEmptyPlaceholder() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<com.nyt.movies.domain.entity.movie.Movie> get_shareMovie() {
        return null;
    }
    
    public final void onQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void onMovieSelected(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.entity.movie.Movie movie) {
    }
    
    public final void onLikeClicked(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.entity.movie.Movie movie) {
    }
    
    public final void onShareClicked(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.entity.movie.Movie movie) {
    }
    
    public final void onFavoriteMoviesClicked() {
    }
    
    public final void getAllMovies() {
    }
    
    public final void onProgressItemShown() {
    }
    
    private final void requestNewMovies(boolean showPlaceholder) {
    }
    
    private final void setMoviesList(com.nyt.movies.domain.entity.movie.MoviesList moviesList) {
    }
    
    private final void onFailure(java.lang.Throwable throwable) {
    }
    
    public ListMoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.interactor.GetMoviesList getMoviesList, @org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.interactor.LikeMovie likeMovie, @org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.interactor.GetFavoriteMoviesList getFavoriteMoviesList) {
        super();
    }
}