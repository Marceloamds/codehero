package com.nyt.movies.data.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "movie")
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0001DB\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u00102\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\t\u00103\u001a\u00020\u0015H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u000bH\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00b2\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001\u00a2\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00152\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\u0006H\u00d6\u0001J\u0006\u0010A\u001a\u00020BJ\t\u0010C\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b%\u0010!R\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010\'R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018\u00a8\u0006E"}, d2 = {"Lcom/nyt/movies/data/local/entity/DbMovie;", "", "linkUrl", "", "displayTitle", "criticsPick", "", "byline", "headline", "summaryShort", "publicationDate", "", "openingDate", "linkType", "suggestedLinkText", "multimediaType", "multimediaSrc", "multimediaWidth", "", "multimediaHeight", "isFavorite", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Z)V", "getByline", "()Ljava/lang/String;", "getCriticsPick", "()I", "getDisplayTitle", "getHeadline", "()Z", "getLinkType", "getLinkUrl", "getMultimediaHeight", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMultimediaSrc", "getMultimediaType", "getMultimediaWidth", "getOpeningDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPublicationDate", "()J", "getSuggestedLinkText", "getSummaryShort", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Z)Lcom/nyt/movies/data/local/entity/DbMovie;", "equals", "other", "hashCode", "toDomainObject", "Lcom/nyt/movies/domain/entity/movie/Movie;", "toString", "Companion", "app_debug"})
public final class DbMovie {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "link_url")
    @androidx.room.PrimaryKey()
    private final java.lang.String linkUrl = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "display_title")
    private final java.lang.String displayTitle = null;
    @androidx.room.ColumnInfo(name = "critics_pick")
    private final int criticsPick = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "byline")
    private final java.lang.String byline = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "headline")
    private final java.lang.String headline = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "summary_short")
    private final java.lang.String summaryShort = null;
    @androidx.room.ColumnInfo(name = "publication_date")
    private final long publicationDate = 0L;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "opening_date")
    private final java.lang.Long openingDate = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "link_type")
    private final java.lang.String linkType = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "suggested_link_text")
    private final java.lang.String suggestedLinkText = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "multimedia_type")
    private final java.lang.String multimediaType = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "multimedia_src")
    private final java.lang.String multimediaSrc = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "multimedia_width")
    private final java.lang.Double multimediaWidth = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "multimedia_height")
    private final java.lang.Double multimediaHeight = null;
    @androidx.room.ColumnInfo(name = "is_favorite")
    private final boolean isFavorite = false;
    public static final com.nyt.movies.data.local.entity.DbMovie.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.nyt.movies.domain.entity.movie.Movie toDomainObject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLinkUrl() {
        return null;
    }
    
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
    
    public final long getPublicationDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getOpeningDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLinkType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuggestedLinkText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMultimediaType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMultimediaSrc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMultimediaWidth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMultimediaHeight() {
        return null;
    }
    
    public final boolean isFavorite() {
        return false;
    }
    
    public DbMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String linkUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, int criticsPick, @org.jetbrains.annotations.NotNull()
    java.lang.String byline, @org.jetbrains.annotations.NotNull()
    java.lang.String headline, @org.jetbrains.annotations.NotNull()
    java.lang.String summaryShort, long publicationDate, @org.jetbrains.annotations.Nullable()
    java.lang.Long openingDate, @org.jetbrains.annotations.Nullable()
    java.lang.String linkType, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestedLinkText, @org.jetbrains.annotations.Nullable()
    java.lang.String multimediaType, @org.jetbrains.annotations.Nullable()
    java.lang.String multimediaSrc, @org.jetbrains.annotations.Nullable()
    java.lang.Double multimediaWidth, @org.jetbrains.annotations.Nullable()
    java.lang.Double multimediaHeight, boolean isFavorite) {
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
    
    public final long component7() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component14() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nyt.movies.data.local.entity.DbMovie copy(@org.jetbrains.annotations.NotNull()
    java.lang.String linkUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, int criticsPick, @org.jetbrains.annotations.NotNull()
    java.lang.String byline, @org.jetbrains.annotations.NotNull()
    java.lang.String headline, @org.jetbrains.annotations.NotNull()
    java.lang.String summaryShort, long publicationDate, @org.jetbrains.annotations.Nullable()
    java.lang.Long openingDate, @org.jetbrains.annotations.Nullable()
    java.lang.String linkType, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestedLinkText, @org.jetbrains.annotations.Nullable()
    java.lang.String multimediaType, @org.jetbrains.annotations.Nullable()
    java.lang.String multimediaSrc, @org.jetbrains.annotations.Nullable()
    java.lang.Double multimediaWidth, @org.jetbrains.annotations.Nullable()
    java.lang.Double multimediaHeight, boolean isFavorite) {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/nyt/movies/data/local/entity/DbMovie$Companion;", "", "()V", "fromDomainObject", "Lcom/nyt/movies/data/local/entity/DbMovie;", "movie", "Lcom/nyt/movies/domain/entity/movie/Movie;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.nyt.movies.data.local.entity.DbMovie fromDomainObject(@org.jetbrains.annotations.NotNull()
        com.nyt.movies.domain.entity.movie.Movie movie) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}