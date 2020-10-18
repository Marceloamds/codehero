package com.hero.code.presentation.view.character.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/hero/code/presentation/view/character/list/ListCharactersActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_viewModel", "Lcom/hero/code/presentation/view/character/list/ListCharactersViewModel;", "get_viewModel", "()Lcom/hero/code/presentation/view/character/list/ListCharactersViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/hero/code/presentation/view/character/list/ListCharactersAdapter;", "binding", "Lcom/hero/code/databinding/ActivityListCharactersBinding;", "currentTabLayoutMediator", "Lcom/google/android/material/tabs/TabLayoutMediator;", "dialog", "Landroid/app/Dialog;", "getTabLayoutMediator", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onListCharactersInfoReceived", "info", "Lcom/hero/code/presentation/view/character/list/ListCharactersInfo;", "onNextDialog", "dialogData", "Lcom/hero/code/presentation/util/dialog/DialogData;", "onQueryClosed", "setupTabs", "setupUi", "subscribeUi", "Companion", "app_debug"})
public final class ListCharactersActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy _viewModel$delegate = null;
    private com.hero.code.databinding.ActivityListCharactersBinding binding;
    private com.hero.code.presentation.view.character.list.ListCharactersAdapter adapter;
    private com.google.android.material.tabs.TabLayoutMediator currentTabLayoutMediator;
    private android.app.Dialog dialog;
    public static final com.hero.code.presentation.view.character.list.ListCharactersActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.hero.code.presentation.view.character.list.ListCharactersViewModel get_viewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeUi() {
    }
    
    private final void setupUi() {
    }
    
    private final void onListCharactersInfoReceived(com.hero.code.presentation.view.character.list.ListCharactersInfo info) {
    }
    
    private final void setupTabs() {
    }
    
    private final com.google.android.material.tabs.TabLayoutMediator getTabLayoutMediator() {
        return null;
    }
    
    private final void onQueryClosed() {
    }
    
    private final void onNextDialog(com.hero.code.presentation.util.dialog.DialogData dialogData) {
    }
    
    public ListCharactersActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hero/code/presentation/view/character/list/ListCharactersActivity$Companion;", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_debug"})
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