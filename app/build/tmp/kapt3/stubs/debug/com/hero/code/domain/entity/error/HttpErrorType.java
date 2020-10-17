package com.hero.code.domain.entity.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/hero/code/domain/entity/error/HttpErrorType;", "", "(Ljava/lang/String;I)V", "UNAUTHORIZED", "TOO_MANY_REQUESTS", "Companion", "app_debug"})
public enum HttpErrorType {
    /*public static final*/ UNAUTHORIZED /* = new UNAUTHORIZED() */,
    /*public static final*/ TOO_MANY_REQUESTS /* = new TOO_MANY_REQUESTS() */;
    public static final com.hero.code.domain.entity.error.HttpErrorType.Companion Companion = null;
    
    HttpErrorType() {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/hero/code/domain/entity/error/HttpErrorType$Companion;", "", "()V", "getErrorForCode", "Lcom/hero/code/domain/entity/error/HttpErrorType;", "errorCode", "", "(Ljava/lang/Integer;)Lcom/hero/code/domain/entity/error/HttpErrorType;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.hero.code.domain.entity.error.HttpErrorType getErrorForCode(@org.jetbrains.annotations.Nullable()
        java.lang.Integer errorCode) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}