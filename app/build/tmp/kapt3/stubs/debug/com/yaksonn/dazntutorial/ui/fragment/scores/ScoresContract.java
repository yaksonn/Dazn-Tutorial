package com.yaksonn.dazntutorial.ui.fragment.scores;

import java.lang.System;

/**
 * * Created by @yaksonn
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresContract;", "", "()V", "Presenter", "View", "app_debug"})
public final class ScoresContract {
    
    public ScoresContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresContract$View;", "", "onLoadScoresFail", "", "errorMessage", "", "onLoadScoresSuccess", "scoresItemViewModel", "Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresItemViewModel;", "app_debug"})
    public static abstract interface View {
        
        public abstract void onLoadScoresSuccess(@org.jetbrains.annotations.NotNull()
        com.yaksonn.dazntutorial.ui.fragment.scores.ScoresItemViewModel scoresItemViewModel);
        
        public abstract void onLoadScoresFail(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresContract$Presenter;", "", "loadScores", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void loadScores();
    }
}