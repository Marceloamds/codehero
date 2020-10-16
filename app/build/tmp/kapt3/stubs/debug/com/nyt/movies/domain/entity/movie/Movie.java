package com.nyt.movies.domain.entity.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0011H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\nH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010,\u001a\u00020\rH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003Jq\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010/\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u00102\u001a\u00020\u0005H\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014\u00a8\u00064"}, d2 = {"Lcom/nyt/movies/domain/entity/movie/Movie;", "Ljava/io/Serializable;", "displayTitle", "", "criticsPick", "", "byline", "headline", "summaryShort", "publicationDate", "Ljava/util/Date;", "openingDate", "link", "Lcom/nyt/movies/domain/entity/movie/Link;", "multimedia", "Lcom/nyt/movies/domain/entity/movie/Multimedia;", "isFavorite", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/nyt/movies/domain/entity/movie/Link;Lcom/nyt/movies/domain/entity/movie/Multimedia;Z)V", "getByline", "()Ljava/lang/String;", "getCriticsPick", "()I", "getDisplayTitle", "getHeadline", "()Z", "setFavorite", "(Z)V", "getLink", "()Lcom/nyt/movies/domain/entity/movie/Link;", "getMultimedia", "()Lcom/nyt/movies/domain/entity/movie/Multimedia;", "getOpeningDate", "()Ljava/util/Date;", "getPublicationDate", "getSummaryShort", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class Movie implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String displayTitle = null;
    private final int criticsPick = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String byline = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String headline = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String summaryShort = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date publicationDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date openingDate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.nyt.movies.domain.entity.movie.Link link = null;
    @org.jetbrains.annotations.Nullable()
    private final com.nyt.movies.domain.entity.movie.Multimedia multimedia = null;
    private boolean isFavorite;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayTitle() {
        return null;
    }
    
    public final int getCriticsPick() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getByline() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeadline() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummaryShort() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getPublicationDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getOpeningDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nyt.movies.domain.entity.movie.Link getLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nyt.movies.domain.entity.movie.Multimedia getMultimedia() {
        return null;
    }
    
    public final boolean isFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    public Movie(@org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, int criticsPick, @org.jetbrains.annotations.NotNull()
    java.lang.String byline, @org.jetbrains.annotations.NotNull()
    java.lang.String headline, @org.jetbrains.annotations.NotNull()
    java.lang.String summaryShort, @org.jetbrains.annotations.NotNull()
    java.util.Date publicationDate, @org.jetbrains.annotations.Nullable()
    java.util.Date openingDate, @org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.entity.movie.Link link, @org.jetbrains.annotations.Nullable()
    com.nyt.movies.domain.entity.movie.Multimedia multimedia, boolean isFavorite) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nyt.movies.domain.entity.movie.Link component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nyt.movies.domain.entity.movie.Multimedia component9() {
        return null;
    }
    
    public final boolean component10() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nyt.movies.domain.entity.movie.Movie copy(@org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, int criticsPick, @org.jetbrains.annotations.NotNull()
    java.lang.String byline, @org.jetbrains.annotations.NotNull()
    java.lang.String headline, @org.jetbrains.annotations.NotNull()
    java.lang.String summaryShort, @org.jetbrains.annotations.NotNull()
    java.util.Date publicationDate, @org.jetbrains.annotations.Nullable()
    java.util.Date openingDate, @org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.entity.movie.Link link, @org.jetbrains.annotations.Nullable()
    com.nyt.movies.domain.entity.movie.Multimedia multimedia, boolean isFavorite) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}