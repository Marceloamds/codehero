package com.nyt.movies.presentation.view.movies.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/nyt/movies/presentation/view/movies/details/MovieDetailsActivity;", "Lcom/nyt/movies/presentation/util/base/BaseActivity;", "()V", "_viewModel", "Lcom/nyt/movies/presentation/view/movies/details/MovieDetailsViewModel;", "get_viewModel", "()Lcom/nyt/movies/presentation/view/movies/details/MovieDetailsViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "baseViewModel", "Lcom/nyt/movies/presentation/util/base/BaseViewModel;", "getBaseViewModel", "()Lcom/nyt/movies/presentation/util/base/BaseViewModel;", "binding", "Lcom/nyt/movies/databinding/ActivityMoviesDetailsBinding;", "intentMovie", "Lcom/nyt/movies/domain/entity/movie/Movie;", "getIntentMovie", "()Lcom/nyt/movies/domain/entity/movie/Movie;", "intentMovie$delegate", "movie", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMovieChanged", "setupLike", "setupMovieInfo", "setupUi", "subscribeUi", "Companion", "app_debug"})
public final class MovieDetailsActivity extends com.nyt.movies.presentation.util.base.BaseActivity {
    private final kotlin.Lazy _viewModel$delegate = null;
    private com.nyt.movies.databinding.ActivityMoviesDetailsBinding binding;
    private final kotlin.Lazy intentMovie$delegate = null;
    private com.nyt.movies.domain.entity.movie.Movie movie;
    private static final java.lang.String MOVIE_EXTRA = "MOVIE_EXTRA";
    public static final com.nyt.movies.presentation.view.movies.details.MovieDetailsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nyt.movies.presentation.util.base.BaseViewModel getBaseViewModel() {
        return null;
    }
    
    private final com.nyt.movies.presentation.view.movies.details.MovieDetailsViewModel get_viewModel() {
        return null;
    }
    
    private final com.nyt.movies.domain.entity.movie.Movie getIntentMovie() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void subscribeUi() {
    }
    
    private final void setupUi() {
    }
    
    private final void setupMovieInfo() {
    }
    
    private final void onMovieChanged(com.nyt.movies.domain.entity.movie.Movie movie) {
    }
    
    private final void setupLike() {
    }
    
    public MovieDetailsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/nyt/movies/presentation/view/movies/details/MovieDetailsActivity$Companion;", "", "()V", "MOVIE_EXTRA", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "movie", "Lcom/nyt/movies/domain/entity/movie/Movie;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent createIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.nyt.movies.domain.entity.movie.Movie movie) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}