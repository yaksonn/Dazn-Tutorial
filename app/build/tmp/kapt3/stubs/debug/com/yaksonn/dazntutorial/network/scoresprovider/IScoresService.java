package com.yaksonn.dazntutorial.network.scoresprovider;

import java.lang.System;

/**
 * * Created by @yaksonn
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/yaksonn/dazntutorial/network/scoresprovider/IScoresService;", "", "getScores", "", "callback", "Lcom/yaksonn/dazntutorial/network/scoresprovider/IScoresService$IGetScoresCallback;", "IGetScoresCallback", "app_debug"})
public abstract interface IScoresService {
    
    public abstract void getScores(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.network.scoresprovider.IScoresService.IGetScoresCallback callback);
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/yaksonn/dazntutorial/network/scoresprovider/IScoresService$IGetScoresCallback;", "", "onFailure", "", "errorMessage", "", "onSuccess", "scoresViewModel", "Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresItemViewModel;", "app_debug"})
    public static abstract interface IGetScoresCallback {
        
        public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
        com.yaksonn.dazntutorial.ui.fragment.scores.ScoresItemViewModel scoresViewModel);
        
        public abstract void onFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
    }
}