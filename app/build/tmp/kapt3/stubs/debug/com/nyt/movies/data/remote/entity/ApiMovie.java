package com.nyt.movies.data.remote.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010-\u001a\u00020\u000bH\u00c6\u0003J{\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0006H\u00d6\u0001J\u0006\u00103\u001a\u000204J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014\u00a8\u00066"}, d2 = {"Lcom/nyt/movies/data/remote/entity/ApiMovie;", "", "displayTitle", "", "mpaaRating", "criticsPick", "", "byline", "headline", "summaryShort", "publicationDate", "Ljava/util/Date;", "openingDate", "dateUpdated", "link", "Lcom/nyt/movies/data/remote/entity/ApiLink;", "multimedia", "Lcom/nyt/movies/data/remote/entity/ApiMultimedia;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/nyt/movies/data/remote/entity/ApiLink;Lcom/nyt/movies/data/remote/entity/ApiMultimedia;)V", "getByline", "()Ljava/lang/String;", "getCriticsPick", "()I", "getDateUpdated", "()Ljava/util/Date;", "getDisplayTitle", "getHeadline", "getLink", "()Lcom/nyt/movies/data/remote/entity/ApiLink;", "getMpaaRating", "getMultimedia", "()Lcom/nyt/movies/data/remote/entity/ApiMultimedia;", "getOpeningDate", "getPublicationDate", "getSummaryShort", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toDomainObject", "Lcom/nyt/movies/domain/entity/movie/Movie;", "toString", "app_debug"})
public final class ApiMovie {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "display_title")
    private final java.lang.String displayTitle = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "mpaa_rating")
    private final java.lang.String mpaaRating = null;
    @com.google.gson.annotations.SerializedName(value = "critics_pick")
    private final int criticsPick = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "byline")
    private final java.lang.String byline = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "headline")
    private final java.lang.String headline = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "summary_short")
    private final java.lang.String summaryShort = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "publication_date")
    private final java.util.Date publicationDate = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "opening_date")
    private final java.util.Date openingDate = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "date_updated")
    private final java.util.Date dateUpdated = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "link")
    private final com.nyt.movies.data.remote.entity.ApiLink link = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "multimedia")
    private final com.nyt.movies.data.remote.entity.ApiMultimedia multimedia = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.nyt.movies.domain.entity.movie.Movie toDomainObject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMpaaRating() {
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
    public final java.util.Date getDateUpdated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nyt.movies.data.remote.entity.ApiLink getLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nyt.movies.data.remote.entity.ApiMultimedia getMultimedia() {
        return null;
    }
    
    public ApiMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String mpaaRating, int criticsPick, @org.jetbrains.annotations.NotNull()
    java.lang.String byline, @org.jetbrains.annotations.NotNull()
    java.lang.String headline, @org.jetbrains.annotations.NotNull()
    java.lang.String summaryShort, @org.jetbrains.annotations.NotNull()
    java.util.Date publicationDate, @org.jetbrains.annotations.Nullable()
    java.util.Date openingDate, @org.jetbrains.annotations.NotNull()
    java.util.Date dateUpdated, @org.jetbrains.annotations.NotNull()
    com.nyt.movies.data.remote.entity.ApiLink link, @org.jetbrains.annotations.Nullable()
    com.nyt.movies.data.remote.entity.ApiMultimedia multimedia) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
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
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nyt.movies.data.remote.entity.ApiLink component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nyt.movies.data.remote.entity.ApiMultimedia component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nyt.movies.data.remote.entity.ApiMovie copy(@org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String mpaaRating, int criticsPick, @org.jetbrains.annotations.NotNull()
    java.lang.String byline, @org.jetbrains.annotations.NotNull()
    java.lang.String headline, @org.jetbrains.annotations.NotNull()
    java.lang.String summaryShort, @org.jetbrains.annotations.NotNull()
    java.util.Date publicationDate, @org.jetbrains.annotations.Nullable()
    java.util.Date openingDate, @org.jetbrains.annotations.NotNull()
    java.util.Date dateUpdated, @org.jetbrains.annotations.NotNull()
    com.nyt.movies.data.remote.entity.ApiLink link, @org.jetbrains.annotations.Nullable()
    com.nyt.movies.data.remote.entity.ApiMultimedia multimedia) {
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