package com.hero.code.domain.entity.character;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/hero/code/domain/entity/character/UrlType;", "Ljava/io/Serializable;", "()V", "ComicLink", "Detail", "Other", "Wiki", "Lcom/hero/code/domain/entity/character/UrlType$Detail;", "Lcom/hero/code/domain/entity/character/UrlType$ComicLink;", "Lcom/hero/code/domain/entity/character/UrlType$Wiki;", "Lcom/hero/code/domain/entity/character/UrlType$Other;", "app_debug"})
public abstract class UrlType implements java.io.Serializable {
    
    private UrlType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/hero/code/domain/entity/character/UrlType$Detail;", "Lcom/hero/code/domain/entity/character/UrlType;", "()V", "app_debug"})
    public static final class Detail extends com.hero.code.domain.entity.character.UrlType {
        public static final com.hero.code.domain.entity.character.UrlType.Detail INSTANCE = null;
        
        private Detail() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/hero/code/domain/entity/character/UrlType$ComicLink;", "Lcom/hero/code/domain/entity/character/UrlType;", "()V", "app_debug"})
    public static final class ComicLink extends com.hero.code.domain.entity.character.UrlType {
        public static final com.hero.code.domain.entity.character.UrlType.ComicLink INSTANCE = null;
        
        private ComicLink() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/hero/code/domain/entity/character/UrlType$Wiki;", "Lcom/hero/code/domain/entity/character/UrlType;", "()V", "app_debug"})
    public static final class Wiki extends com.hero.code.domain.entity.character.UrlType {
        public static final com.hero.code.domain.entity.character.UrlType.Wiki INSTANCE = null;
        
        private Wiki() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hero/code/domain/entity/character/UrlType$Other;", "Lcom/hero/code/domain/entity/character/UrlType;", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "app_debug"})
    public static final class Other extends com.hero.code.domain.entity.character.UrlType {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String type = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        public Other(@org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            super();
        }
    }
}