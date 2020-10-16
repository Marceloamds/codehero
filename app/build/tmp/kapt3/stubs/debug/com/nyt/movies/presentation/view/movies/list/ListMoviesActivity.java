package com.nyt.movies.presentation.view.movies.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0017\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0012H\u0002J\u0012\u0010!\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010#\u001a\u00020\u0012H\u0002J\b\u0010$\u001a\u00020\u0012H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/nyt/movies/presentation/view/movies/list/ListMoviesActivity;", "Lcom/nyt/movies/presentation/util/base/BaseActivity;", "()V", "_viewModel", "Lcom/nyt/movies/presentation/view/movies/list/ListMoviesViewModel;", "get_viewModel", "()Lcom/nyt/movies/presentation/view/movies/list/ListMoviesViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/nyt/movies/presentation/view/movies/list/ListMoviesAdapter;", "baseViewModel", "Lcom/nyt/movies/presentation/util/base/BaseViewModel;", "getBaseViewModel", "()Lcom/nyt/movies/presentation/util/base/BaseViewModel;", "binding", "Lcom/nyt/movies/databinding/ActivityListMoviesBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onEmptyPlaceholder", "showEmptyPlaceholder", "(Ljava/lang/Boolean;)V", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onQueryClosed", "setupRecyclerView", "setupSearchView", "searchItem", "setupUi", "subscribeUi", "Companion", "app_debug"})
public final class ListMoviesActivity extends com.nyt.movies.presentation.util.base.BaseActivity {
    private final kotlin.Lazy _viewModel$delegate = null;
    private com.nyt.movies.databinding.ActivityListMoviesBinding binding;
    private com.nyt.movies.presentation.view.movies.list.ListMoviesAdapter adapter;
    public static final com.nyt.movies.presentation.view.movies.list.ListMoviesActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nyt.movies.presentation.util.base.BaseViewModel getBaseViewModel() {
        return null;
    }
    
    private final com.nyt.movies.presentation.view.movies.list.ListMoviesViewModel get_viewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void subscribeUi() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupUi() {
    }
    
    private final void setupSearchView(android.view.MenuItem searchItem) {
    }
    
    private final boolean onQueryClosed() {
        return false;
    }
    
    private final void onEmptyPlaceholder(java.lang.Boolean showEmptyPlaceholder) {
    }
    
    public ListMoviesActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/nyt/movies/presentation/view/movies/list/ListMoviesActivity$Companion;", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent createIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}