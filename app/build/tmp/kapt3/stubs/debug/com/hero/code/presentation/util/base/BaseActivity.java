package com.hero.code.presentation.util.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/hero/code/presentation/util/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "baseViewModel", "Lcom/hero/code/presentation/util/base/BaseViewModel;", "getBaseViewModel", "()Lcom/hero/code/presentation/util/base/BaseViewModel;", "dialog", "Landroid/app/Dialog;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onGoTo", "navData", "Lcom/hero/code/presentation/util/navigation/NavData;", "onNextDialog", "dialogData", "Lcom/hero/code/presentation/util/dialog/DialogData;", "subscribeUi", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.app.Dialog dialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.hero.code.presentation.util.base.BaseViewModel getBaseViewModel();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void subscribeUi() {
    }
    
    private final void onNextDialog(com.hero.code.presentation.util.dialog.DialogData dialogData) {
    }
    
    private final void onGoTo(com.hero.code.presentation.util.navigation.NavData navData) {
    }
    
    public BaseActivity() {
        super();
    }
}