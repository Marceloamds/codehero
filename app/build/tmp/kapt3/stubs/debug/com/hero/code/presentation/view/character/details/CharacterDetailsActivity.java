package com.hero.code.presentation.view.character.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/hero/code/presentation/view/character/details/CharacterDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_viewModel", "Lcom/hero/code/presentation/view/character/details/CharacterDetailsViewModel;", "get_viewModel", "()Lcom/hero/code/presentation/view/character/details/CharacterDetailsViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/hero/code/presentation/view/character/details/CharacterUrlsAdapter;", "binding", "Lcom/hero/code/databinding/ActivityCharacterDetailsBinding;", "character", "Lcom/hero/code/domain/entity/character/Character;", "getCharacter", "()Lcom/hero/code/domain/entity/character/Character;", "character$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupCharacterInfo", "setupUrlRecycler", "Companion", "app_debug"})
public final class CharacterDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy _viewModel$delegate = null;
    private com.hero.code.databinding.ActivityCharacterDetailsBinding binding;
    private final kotlin.Lazy character$delegate = null;
    private com.hero.code.presentation.view.character.details.CharacterUrlsAdapter adapter;
    private static final java.lang.String CHARACTER_EXTRA = "CHARACTER_EXTRA";
    public static final com.hero.code.presentation.view.character.details.CharacterDetailsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.hero.code.presentation.view.character.details.CharacterDetailsViewModel get_viewModel() {
        return null;
    }
    
    private final com.hero.code.domain.entity.character.Character getCharacter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupCharacterInfo() {
    }
    
    private final void setupUrlRecycler() {
    }
    
    public CharacterDetailsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/hero/code/presentation/view/character/details/CharacterDetailsActivity$Companion;", "", "()V", "CHARACTER_EXTRA", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "character", "Lcom/hero/code/domain/entity/character/Character;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent createIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.hero.code.domain.entity.character.Character character) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}