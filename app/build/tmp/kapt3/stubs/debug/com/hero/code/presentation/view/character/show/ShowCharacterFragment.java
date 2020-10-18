package com.hero.code.presentation.view.character.show;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\u0016\u0010\'\u001a\u00020\u0018*\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006,"}, d2 = {"Lcom/hero/code/presentation/view/character/show/ShowCharacterFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_viewModel", "Lcom/hero/code/presentation/view/character/show/ShowCharacterViewModel;", "get_viewModel", "()Lcom/hero/code/presentation/view/character/show/ShowCharacterViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/hero/code/databinding/FragmentShowCharacterBinding;", "dialog", "Landroid/app/Dialog;", "position", "", "getPosition", "()I", "position$delegate", "query", "", "getQuery", "()Ljava/lang/String;", "query$delegate", "onCharactersReceived", "", "characterPage", "Lcom/hero/code/presentation/view/character/show/CharacterPage;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onNextDialog", "dialogData", "Lcom/hero/code/presentation/util/dialog/DialogData;", "subscribeUi", "setupCharacter", "Lcom/hero/code/databinding/ItemCharacterBinding;", "character", "Lcom/hero/code/domain/entity/character/Character;", "Companion", "app_debug"})
public final class ShowCharacterFragment extends androidx.fragment.app.Fragment {
    private com.hero.code.databinding.FragmentShowCharacterBinding binding;
    private final kotlin.Lazy position$delegate = null;
    private final kotlin.Lazy query$delegate = null;
    private final kotlin.Lazy _viewModel$delegate = null;
    private android.app.Dialog dialog;
    private static final java.lang.String POSITION_EXTRA = "POSITION_EXTRA";
    private static final java.lang.String QUERY_EXTRA = "QUERY_EXTRA";
    public static final com.hero.code.presentation.view.character.show.ShowCharacterFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final int getPosition() {
        return 0;
    }
    
    private final java.lang.String getQuery() {
        return null;
    }
    
    private final com.hero.code.presentation.view.character.show.ShowCharacterViewModel get_viewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void subscribeUi() {
    }
    
    private final void onCharactersReceived(com.hero.code.presentation.view.character.show.CharacterPage characterPage) {
    }
    
    private final void setupCharacter(com.hero.code.databinding.ItemCharacterBinding $this$setupCharacter, com.hero.code.domain.entity.character.Character character) {
    }
    
    private final void onNextDialog(com.hero.code.presentation.util.dialog.DialogData dialogData) {
    }
    
    public ShowCharacterFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/hero/code/presentation/view/character/show/ShowCharacterFragment$Companion;", "", "()V", "POSITION_EXTRA", "", "QUERY_EXTRA", "newInstance", "Lcom/hero/code/presentation/view/character/show/ShowCharacterFragment;", "position", "", "query", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.hero.code.presentation.view.character.show.ShowCharacterFragment newInstance(int position, @org.jetbrains.annotations.NotNull()
        java.lang.String query) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}