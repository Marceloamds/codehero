package com.nyt.movies.presentation.util.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001\u001a,\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u001a,\u0010\f\u001a\n \b*\u0004\u0018\u00010\u00070\u0007*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u001a\u0012\u0010\r\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010\u0011\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"INTENT_TEXT_TYPE", "", "openBrowser", "", "Landroid/content/Context;", "url", "setNegativeButton", "Landroid/app/AlertDialog$Builder;", "kotlin.jvm.PlatformType", "buttonText", "onClick", "Lkotlin/Function0;", "setPositiveButton", "shareMovie", "Landroid/app/Activity;", "movie", "Lcom/nyt/movies/domain/entity/movie/Movie;", "showDialog", "Landroid/app/Dialog;", "dialogData", "Lcom/nyt/movies/presentation/util/dialog/DialogData;", "app_debug"})
public final class ContextExtensionsKt {
    private static final java.lang.String INTENT_TEXT_TYPE = "text/plain";
    
    @org.jetbrains.annotations.NotNull()
    public static final android.app.Dialog showDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showDialog, @org.jetbrains.annotations.NotNull()
    com.nyt.movies.presentation.util.dialog.DialogData dialogData) {
        return null;
    }
    
    public static final android.app.AlertDialog.Builder setPositiveButton(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog.Builder $this$setPositiveButton, @org.jetbrains.annotations.Nullable()
    java.lang.String buttonText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        return null;
    }
    
    public static final android.app.AlertDialog.Builder setNegativeButton(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog.Builder $this$setNegativeButton, @org.jetbrains.annotations.Nullable()
    java.lang.String buttonText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        return null;
    }
    
    public static final void openBrowser(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openBrowser, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public static final void shareMovie(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$shareMovie, @org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.entity.movie.Movie movie) {
    }
}