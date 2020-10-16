package com.nyt.movies.presentation.util.paging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\b&\u0018\u0000 (*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001(B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u001d\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\nH&\u00a2\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u001d\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nH&\u00a2\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0016J\u000e\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000eJ\u0014\u0010%\u001a\u00020\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\'R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006)"}, d2 = {"Lcom/nyt/movies/presentation/util/paging/PagingListAdapter;", "T", "ViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "onProgressShownCallback", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "progressPosition", "", "getProgressPosition", "()I", "progressVisible", "", "shownList", "", "getShownList", "()Ljava/util/List;", "setShownList", "(Ljava/util/List;)V", "getItemCount", "getItemViewType", "position", "getProgressSubItemViewType", "onBindSubViewHolder", "holder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "onBindViewHolder", "onCreateSubViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "setProgressVisible", "visible", "submitList", "list", "", "Companion", "app_debug"})
public abstract class PagingListAdapter<T extends java.lang.Object, ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private boolean progressVisible = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<T> shownList;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onProgressShownCallback = null;
    private static final int VIEW_TYPE_PROGRESS = -4;
    private static final int VIEW_TYPE_PROGRESS_SUB_ITEM = -3;
    public static final com.nyt.movies.presentation.util.paging.PagingListAdapter.Companion Companion = null;
    
    private final int getProgressPosition() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getShownList() {
        return null;
    }
    
    public final void setShownList(@org.jetbrains.annotations.NotNull()
    java.util.List<T> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract ViewHolder onCreateSubViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType);
    
    public abstract void onBindSubViewHolder(@org.jetbrains.annotations.NotNull()
    ViewHolder holder, int position);
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public int getProgressSubItemViewType(int position) {
        return 0;
    }
    
    public final void setProgressVisible(boolean visible) {
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list) {
    }
    
    public PagingListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onProgressShownCallback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/nyt/movies/presentation/util/paging/PagingListAdapter$Companion;", "", "()V", "VIEW_TYPE_PROGRESS", "", "VIEW_TYPE_PROGRESS_SUB_ITEM", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}