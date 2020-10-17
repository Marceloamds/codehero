package com.hero.code.data.util.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\n\u001a\u00020\b*\u00020\u000bH\u0002\u00a8\u0006\r"}, d2 = {"Lcom/hero/code/data/util/request/AuthInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "md5Encryption", "", "str", "toHex", "", "Companion", "app_debug"})
public final class AuthInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY_QUERY_PARAMETER = "apikey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TIMESTAMP_QUERY_PARAMETER = "ts";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HASH_QUERY_PARAMETER = "hash";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MD5_ALGORITHM = "MD5";
    public static final com.hero.code.data.util.request.AuthInterceptor.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    private final java.lang.String md5Encryption(java.lang.String str) {
        return null;
    }
    
    private final java.lang.String toHex(byte[] $this$toHex) {
        return null;
    }
    
    public AuthInterceptor() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/hero/code/data/util/request/AuthInterceptor$Companion;", "", "()V", "API_KEY_QUERY_PARAMETER", "", "HASH_QUERY_PARAMETER", "MD5_ALGORITHM", "TIMESTAMP_QUERY_PARAMETER", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}