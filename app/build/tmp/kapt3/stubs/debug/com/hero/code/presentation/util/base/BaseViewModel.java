package com.hero.code.presentation.util.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020 2\u0006\u0010!\u001a\u00020\fH\u0004JN\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020 0\'2\u001c\u0010)\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0*\u0012\u0006\u0012\u0004\u0018\u00010+0\'H\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u0012\u0010-\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010\u0006H\u0004J\u001e\u0010-\u001a\u00020 2\u0006\u0010/\u001a\u00020(2\f\u00100\u001a\b\u0012\u0004\u0012\u00020 01H\u0004J\u0010\u00102\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u0010H\u0004R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\bR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00063"}, d2 = {"Lcom/hero/code/presentation/util/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/KoinComponent;", "()V", "_dialog", "Landroidx/lifecycle/MutableLiveData;", "Lcom/hero/code/presentation/util/dialog/DialogData;", "get_dialog", "()Landroidx/lifecycle/MutableLiveData;", "_dialog$delegate", "Lkotlin/Lazy;", "_goTo", "Lcom/hero/code/presentation/util/navigation/NavData;", "get_goTo", "_goTo$delegate", "_placeholder", "Lcom/hero/code/presentation/util/placeholder/Placeholder;", "get_placeholder", "_placeholder$delegate", "dialog", "Landroidx/lifecycle/LiveData;", "getDialog", "()Landroidx/lifecycle/LiveData;", "errorHandler", "Lcom/hero/code/presentation/util/error/ErrorHandler;", "getErrorHandler", "()Lcom/hero/code/presentation/util/error/ErrorHandler;", "errorHandler$delegate", "goTo", "getGoTo", "placeholder", "getPlaceholder", "", "navData", "launchDataLoad", "Lkotlinx/coroutines/Job;", "shouldLoad", "", "onFailure", "Lkotlin/Function1;", "", "block", "Lkotlin/coroutines/Continuation;", "", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "setDialog", "dialogData", "throwable", "retryAction", "Lkotlin/Function0;", "setPlaceholder", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel implements org.koin.core.KoinComponent {
    private final kotlin.Lazy errorHandler$delegate = null;
    private final kotlin.Lazy _placeholder$delegate = null;
    private final kotlin.Lazy _goTo$delegate = null;
    private final kotlin.Lazy _dialog$delegate = null;
    
    private final com.hero.code.presentation.util.error.ErrorHandler getErrorHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hero.code.presentation.util.placeholder.Placeholder> getPlaceholder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hero.code.presentation.util.navigation.NavData> getGoTo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hero.code.presentation.util.dialog.DialogData> getDialog() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<com.hero.code.presentation.util.placeholder.Placeholder> get_placeholder() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<com.hero.code.presentation.util.navigation.NavData> get_goTo() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<com.hero.code.presentation.util.dialog.DialogData> get_dialog() {
        return null;
    }
    
    protected final void setPlaceholder(@org.jetbrains.annotations.NotNull()
    com.hero.code.presentation.util.placeholder.Placeholder placeholder) {
    }
    
    protected final void setDialog(@org.jetbrains.annotations.Nullable()
    com.hero.code.presentation.util.dialog.DialogData dialogData) {
    }
    
    protected final void setDialog(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retryAction) {
    }
    
    protected final void goTo(@org.jetbrains.annotations.NotNull()
    com.hero.code.presentation.util.navigation.NavData navData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.Job launchDataLoad(boolean shouldLoad, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onFailure, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}