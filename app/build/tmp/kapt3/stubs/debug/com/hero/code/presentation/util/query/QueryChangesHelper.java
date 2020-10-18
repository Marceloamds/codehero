package com.hero.code.presentation.util.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/hero/code/presentation/util/query/QueryChangesHelper;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "callback", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "onQueryTextChange", "", "query", "onQueryTextSubmit", "app_debug"})
public final class QueryChangesHelper implements androidx.appcompat.widget.SearchView.OnQueryTextListener {
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> callback = null;
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    public QueryChangesHelper(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
        super();
    }
}