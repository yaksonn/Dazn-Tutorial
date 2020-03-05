package com.yaksonn.dazntutorial.ui.fragment.scores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00103\u001a\u00020*2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020*2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020*H\u0016J\b\u0010:\u001a\u00020*H\u0016J\u001a\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006>"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresContract$View;", "()V", "matches", "", "Lcom/yaksonn/dazntutorial/ui/fragment/scores/TeamMatchViewModel;", "getMatches", "()Ljava/util/List;", "setMatches", "(Ljava/util/List;)V", "scoresAdapter", "Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresRecyclerAdapter;", "getScoresAdapter", "()Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresRecyclerAdapter;", "setScoresAdapter", "(Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresRecyclerAdapter;)V", "scoresPresenterImpl", "Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresPresenterImpl;", "getScoresPresenterImpl", "()Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresPresenterImpl;", "setScoresPresenterImpl", "(Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresPresenterImpl;)V", "scoresService", "Lcom/yaksonn/dazntutorial/network/scoresprovider/IScoresService;", "getScoresService", "()Lcom/yaksonn/dazntutorial/network/scoresprovider/IScoresService;", "setScoresService", "(Lcom/yaksonn/dazntutorial/network/scoresprovider/IScoresService;)V", "timer", "Ljava/util/Timer;", "getTimer", "()Ljava/util/Timer;", "setTimer", "(Ljava/util/Timer;)V", "toaster", "Lcom/yaksonn/dazntutorial/util/customviews/Toaster;", "getToaster", "()Lcom/yaksonn/dazntutorial/util/customviews/Toaster;", "setToaster", "(Lcom/yaksonn/dazntutorial/util/customviews/Toaster;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLoadScoresFail", "errorMessage", "", "onLoadScoresSuccess", "scoresItemViewModel", "Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresItemViewModel;", "onPause", "onResume", "onViewCreated", "view", "Companion", "app_debug"})
public final class ScoresFragment extends android.support.v4.app.Fragment implements com.yaksonn.dazntutorial.ui.fragment.scores.ScoresContract.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.yaksonn.dazntutorial.network.scoresprovider.IScoresService scoresService;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.yaksonn.dazntutorial.util.customviews.Toaster toaster;
    @org.jetbrains.annotations.NotNull()
    public com.yaksonn.dazntutorial.ui.fragment.scores.ScoresPresenterImpl scoresPresenterImpl;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.yaksonn.dazntutorial.ui.fragment.scores.TeamMatchViewModel> matches;
    @org.jetbrains.annotations.NotNull()
    public java.util.Timer timer;
    @org.jetbrains.annotations.NotNull()
    public com.yaksonn.dazntutorial.ui.fragment.scores.ScoresRecyclerAdapter scoresAdapter;
    public static final com.yaksonn.dazntutorial.ui.fragment.scores.ScoresFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.network.scoresprovider.IScoresService getScoresService() {
        return null;
    }
    
    public final void setScoresService(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.network.scoresprovider.IScoresService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.util.customviews.Toaster getToaster() {
        return null;
    }
    
    public final void setToaster(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.util.customviews.Toaster p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.ui.fragment.scores.ScoresPresenterImpl getScoresPresenterImpl() {
        return null;
    }
    
    public final void setScoresPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.ui.fragment.scores.ScoresPresenterImpl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yaksonn.dazntutorial.ui.fragment.scores.TeamMatchViewModel> getMatches() {
        return null;
    }
    
    public final void setMatches(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yaksonn.dazntutorial.ui.fragment.scores.TeamMatchViewModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Timer getTimer() {
        return null;
    }
    
    public final void setTimer(@org.jetbrains.annotations.NotNull()
    java.util.Timer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.ui.fragment.scores.ScoresRecyclerAdapter getScoresAdapter() {
        return null;
    }
    
    public final void setScoresAdapter(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.ui.fragment.scores.ScoresRecyclerAdapter p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onLoadScoresSuccess(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.ui.fragment.scores.ScoresItemViewModel scoresItemViewModel) {
    }
    
    @java.lang.Override()
    public void onLoadScoresFail(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    public ScoresFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresFragment$Companion;", "", "()V", "newInstance", "Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.yaksonn.dazntutorial.ui.fragment.scores.ScoresFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}