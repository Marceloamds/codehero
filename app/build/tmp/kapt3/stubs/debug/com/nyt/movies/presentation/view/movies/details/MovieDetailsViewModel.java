package com.nyt.movies.presentation.view.movies.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0013\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/nyt/movies/presentation/view/movies/details/MovieDetailsViewModel;", "Lcom/nyt/movies/presentation/util/base/BaseViewModel;", "likeMovie", "Lcom/nyt/movies/domain/interactor/LikeMovie;", "(Lcom/nyt/movies/domain/interactor/LikeMovie;)V", "_shareMovie", "Landroidx/lifecycle/MutableLiveData;", "Lcom/nyt/movies/domain/entity/movie/Movie;", "get_shareMovie", "()Landroidx/lifecycle/MutableLiveData;", "_shareMovie$delegate", "Lkotlin/Lazy;", "shareMovie", "Landroidx/lifecycle/LiveData;", "getShareMovie", "()Landroidx/lifecycle/LiveData;", "onLikeClicked", "", "movie", "onShareClicked", "app_debug"})
public final class MovieDetailsViewModel extends com.nyt.movies.presentation.util.base.BaseViewModel {
    private final kotlin.Lazy _shareMovie$delegate = null;
    private final com.nyt.movies.domain.interactor.LikeMovie likeMovie = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nyt.movies.domain.entity.movie.Movie> getShareMovie() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<com.nyt.movies.domain.entity.movie.Movie> get_shareMovie() {
        return null;
    }
    
    public final void onLikeClicked(@org.jetbrains.annotations.Nullable()
    com.nyt.movies.domain.entity.movie.Movie movie) {
    }
    
    public final void onShareClicked(@org.jetbrains.annotations.Nullable()
    com.nyt.movies.domain.entity.movie.Movie movie) {
    }
    
    public MovieDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.interactor.LikeMovie likeMovie) {
        super();
    }
}