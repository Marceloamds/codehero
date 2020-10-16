package com.nyt.movies.presentation.view.movies.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\fH\u0002JJ\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\fJ\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/nyt/movies/presentation/view/movies/list/MovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nyt/movies/databinding/ItemMovieBinding;", "(Lcom/nyt/movies/databinding/ItemMovieBinding;)V", "isExpanded", "", "onLikeClicked", "", "movie", "Lcom/nyt/movies/domain/entity/movie/Movie;", "onLikeClickedCallback", "Lkotlin/Function1;", "setupBinding", "callback", "onShareClickedCallback", "setupLike", "startAnimation", "Companion", "TransitionListener", "app_debug"})
public final class MovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private boolean isExpanded = false;
    private com.nyt.movies.databinding.ItemMovieBinding binding;
    public static final com.nyt.movies.presentation.view.movies.list.MovieViewHolder.Companion Companion = null;
    
    public final void setupBinding(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.entity.movie.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.nyt.movies.domain.entity.movie.Movie, kotlin.Unit> callback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.nyt.movies.domain.entity.movie.Movie, kotlin.Unit> onLikeClickedCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.nyt.movies.domain.entity.movie.Movie, kotlin.Unit> onShareClickedCallback) {
    }
    
    private final void onLikeClicked(com.nyt.movies.domain.entity.movie.Movie movie, kotlin.jvm.functions.Function1<? super com.nyt.movies.domain.entity.movie.Movie, kotlin.Unit> onLikeClickedCallback) {
    }
    
    private final void startAnimation(com.nyt.movies.domain.entity.movie.Movie movie) {
    }
    
    private final void setupLike(com.nyt.movies.domain.entity.movie.Movie movie) {
    }
    
    public MovieViewHolder(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.databinding.ItemMovieBinding binding) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u0013\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J*\u0010\u0014\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/nyt/movies/presentation/view/movies/list/MovieViewHolder$TransitionListener;", "Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionListener;", "binding", "Lcom/nyt/movies/databinding/ItemMovieBinding;", "movie", "Lcom/nyt/movies/domain/entity/movie/Movie;", "(Lcom/nyt/movies/databinding/ItemMovieBinding;Lcom/nyt/movies/domain/entity/movie/Movie;)V", "isExpanded", "", "onTransitionChange", "", "p0", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "p1", "", "p2", "p3", "", "onTransitionCompleted", "onTransitionStarted", "onTransitionTrigger", "app_debug"})
    public static final class TransitionListener implements androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener {
        private boolean isExpanded = false;
        private final com.nyt.movies.databinding.ItemMovieBinding binding = null;
        private final com.nyt.movies.domain.entity.movie.Movie movie = null;
        
        @java.lang.Override()
        public void onTransitionStarted(@org.jetbrains.annotations.Nullable()
        androidx.constraintlayout.motion.widget.MotionLayout p0, int p1, int p2) {
        }
        
        @java.lang.Override()
        public void onTransitionChange(@org.jetbrains.annotations.Nullable()
        androidx.constraintlayout.motion.widget.MotionLayout p0, int p1, int p2, float p3) {
        }
        
        @java.lang.Override()
        public void onTransitionCompleted(@org.jetbrains.annotations.Nullable()
        androidx.constraintlayout.motion.widget.MotionLayout p0, int p1) {
        }
        
        @java.lang.Override()
        public void onTransitionTrigger(@org.jetbrains.annotations.Nullable()
        androidx.constraintlayout.motion.widget.MotionLayout p0, int p1, boolean p2, float p3) {
        }
        
        public TransitionListener(@org.jetbrains.annotations.NotNull()
        com.nyt.movies.databinding.ItemMovieBinding binding, @org.jetbrains.annotations.NotNull()
        com.nyt.movies.domain.entity.movie.Movie movie) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/nyt/movies/presentation/view/movies/list/MovieViewHolder$Companion;", "", "()V", "inflate", "Lcom/nyt/movies/presentation/view/movies/list/MovieViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.nyt.movies.presentation.view.movies.list.MovieViewHolder inflate(@org.jetbrains.annotations.Nullable()
        android.view.ViewGroup parent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}