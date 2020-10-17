package com.hero.code.domain.entity.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\b\t\n\u000bB\u0011\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/hero/code/domain/entity/error/RequestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "httpErrorType", "Lcom/hero/code/domain/entity/error/HttpErrorType;", "(Lcom/hero/code/domain/entity/error/HttpErrorType;)V", "getHttpErrorType", "()Lcom/hero/code/domain/entity/error/HttpErrorType;", "HttpError", "NetworkError", "TimeoutError", "UnexpectedError", "Lcom/hero/code/domain/entity/error/RequestException$HttpError;", "Lcom/hero/code/domain/entity/error/RequestException$NetworkError;", "Lcom/hero/code/domain/entity/error/RequestException$TimeoutError;", "Lcom/hero/code/domain/entity/error/RequestException$UnexpectedError;", "app_debug"})
public abstract class RequestException extends java.lang.Exception {
    @org.jetbrains.annotations.Nullable()
    private final com.hero.code.domain.entity.error.HttpErrorType httpErrorType = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.hero.code.domain.entity.error.HttpErrorType getHttpErrorType() {
        return null;
    }
    
    private RequestException(com.hero.code.domain.entity.error.HttpErrorType httpErrorType) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/hero/code/domain/entity/error/RequestException$HttpError;", "Lcom/hero/code/domain/entity/error/RequestException;", "errorCode", "", "(I)V", "app_debug"})
    public static final class HttpError extends com.hero.code.domain.entity.error.RequestException {
        
        public HttpError(int errorCode) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/hero/code/domain/entity/error/RequestException$NetworkError;", "Lcom/hero/code/domain/entity/error/RequestException;", "()V", "app_debug"})
    public static final class NetworkError extends com.hero.code.domain.entity.error.RequestException {
        
        public NetworkError() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/hero/code/domain/entity/error/RequestException$TimeoutError;", "Lcom/hero/code/domain/entity/error/RequestException;", "()V", "app_debug"})
    public static final class TimeoutError extends com.hero.code.domain.entity.error.RequestException {
        
        public TimeoutError() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/hero/code/domain/entity/error/RequestException$UnexpectedError;", "Lcom/hero/code/domain/entity/error/RequestException;", "()V", "app_debug"})
    public static final class UnexpectedError extends com.hero.code.domain.entity.error.RequestException {
        
        public UnexpectedError() {
            super(null);
        }
    }
}