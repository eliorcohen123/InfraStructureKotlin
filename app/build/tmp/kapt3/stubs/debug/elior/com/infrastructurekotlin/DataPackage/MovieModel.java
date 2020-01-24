package elior.com.infrastructurekotlin.DataPackage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u001a\u00103\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000e\u00a8\u00066"}, d2 = {"Lelior/com/infrastructurekotlin/DataPackage/MovieModel;", "", "()V", "backdrop_path", "", "getBackdrop_path", "()Ljava/lang/String;", "setBackdrop_path", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "isAdult", "", "()Z", "setAdult", "(Z)V", "isVideo", "setVideo", "is_watch", "set_watch", "original_language", "getOriginal_language", "setOriginal_language", "original_title", "getOriginal_title", "setOriginal_title", "overview", "getOverview", "setOverview", "popularity", "", "getPopularity", "()D", "setPopularity", "(D)V", "poster_path", "getPoster_path", "setPoster_path", "release_date", "getRelease_date", "setRelease_date", "title", "getTitle", "setTitle", "vote_average", "getVote_average", "setVote_average", "vote_count", "getVote_count", "setVote_count", "app_debug"})
public final class MovieModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String overview;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String poster_path;
    private int is_watch;
    private double vote_average;
    private double popularity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String release_date;
    private int vote_count;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String original_title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String original_language;
    private int id;
    private boolean isVideo;
    private boolean isAdult;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String backdrop_path;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoster_path() {
        return null;
    }
    
    public final void setPoster_path(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int is_watch() {
        return 0;
    }
    
    public final void set_watch(int p0) {
    }
    
    public final double getVote_average() {
        return 0.0;
    }
    
    public final void setVote_average(double p0) {
    }
    
    public final double getPopularity() {
        return 0.0;
    }
    
    public final void setPopularity(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRelease_date() {
        return null;
    }
    
    public final void setRelease_date(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getVote_count() {
        return 0;
    }
    
    public final void setVote_count(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_title() {
        return null;
    }
    
    public final void setOriginal_title(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_language() {
        return null;
    }
    
    public final void setOriginal_language(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final boolean isVideo() {
        return false;
    }
    
    public final void setVideo(boolean p0) {
    }
    
    public final boolean isAdult() {
        return false;
    }
    
    public final void setAdult(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdrop_path() {
        return null;
    }
    
    public final void setBackdrop_path(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public MovieModel() {
        super();
    }
}