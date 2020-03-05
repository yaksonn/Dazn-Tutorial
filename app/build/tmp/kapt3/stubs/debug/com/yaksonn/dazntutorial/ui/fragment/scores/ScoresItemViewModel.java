package com.yaksonn.dazntutorial.ui.fragment.scores;

import java.lang.System;

/**
 * * Created by @yaksonn
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresItemViewModel;", "", "date", "", "matches", "", "Lcom/yaksonn/dazntutorial/ui/fragment/scores/TeamMatchViewModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getMatches", "()Ljava/util/List;", "setMatches", "(Ljava/util/List;)V", "Companion", "app_debug"})
public final class ScoresItemViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String date;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.yaksonn.dazntutorial.ui.fragment.scores.TeamMatchViewModel> matches;
    public static final com.yaksonn.dazntutorial.ui.fragment.scores.ScoresItemViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yaksonn.dazntutorial.ui.fragment.scores.TeamMatchViewModel> getMatches() {
        return null;
    }
    
    public final void setMatches(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yaksonn.dazntutorial.ui.fragment.scores.TeamMatchViewModel> p0) {
    }
    
    public ScoresItemViewModel(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yaksonn.dazntutorial.ui.fragment.scores.TeamMatchViewModel> matches) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresItemViewModel$Companion;", "", "()V", "convert", "Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresItemViewModel;", "scoresResponse", "Lcom/yaksonn/dazntutorial/network/models/ScoresModel;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.yaksonn.dazntutorial.ui.fragment.scores.ScoresItemViewModel convert(@org.jetbrains.annotations.NotNull()
        com.yaksonn.dazntutorial.network.models.ScoresModel scoresResponse) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}