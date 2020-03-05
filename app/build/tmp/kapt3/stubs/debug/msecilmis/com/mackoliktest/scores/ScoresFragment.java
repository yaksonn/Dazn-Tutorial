package msecilmis.com.mackoliktest.scores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00103\u001a\u00020*2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020*2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020*H\u0016J\b\u0010:\u001a\u00020*H\u0016J\u001a\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006>"}, d2 = {"Lmsecilmis/com/mackoliktest/scores/ScoresFragment;", "Landroid/support/v4/app/Fragment;", "Lmsecilmis/com/mackoliktest/scores/ScoresContract$View;", "()V", "matches", "", "Lmsecilmis/com/mackoliktest/scores/MatchViewModel;", "getMatches", "()Ljava/util/List;", "setMatches", "(Ljava/util/List;)V", "scoresAdapter", "Lmsecilmis/com/mackoliktest/scores/ScoresAdapter;", "getScoresAdapter", "()Lmsecilmis/com/mackoliktest/scores/ScoresAdapter;", "setScoresAdapter", "(Lmsecilmis/com/mackoliktest/scores/ScoresAdapter;)V", "scoresPresenterImpl", "Lmsecilmis/com/mackoliktest/scores/ScoresPresenterImpl;", "getScoresPresenterImpl", "()Lmsecilmis/com/mackoliktest/scores/ScoresPresenterImpl;", "setScoresPresenterImpl", "(Lmsecilmis/com/mackoliktest/scores/ScoresPresenterImpl;)V", "scoresService", "Lmsecilmis/com/mackoliktest/networking/IScoresService;", "getScoresService", "()Lmsecilmis/com/mackoliktest/networking/IScoresService;", "setScoresService", "(Lmsecilmis/com/mackoliktest/networking/IScoresService;)V", "timer", "Ljava/util/Timer;", "getTimer", "()Ljava/util/Timer;", "setTimer", "(Ljava/util/Timer;)V", "toaster", "Lmsecilmis/com/mackoliktest/util/Toaster;", "getToaster", "()Lmsecilmis/com/mackoliktest/util/Toaster;", "setToaster", "(Lmsecilmis/com/mackoliktest/util/Toaster;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLoadScoresFail", "errorMessage", "", "onLoadScoresSuccess", "scoresItemViewModel", "Lmsecilmis/com/mackoliktest/scores/ScoresItemViewModel;", "onPause", "onResume", "onViewCreated", "view", "Companion", "app_debug"})
public final class ScoresFragment extends android.support.v4.app.Fragment implements msecilmis.com.mackoliktest.scores.ScoresContract.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public msecilmis.com.mackoliktest.networking.IScoresService scoresService;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public msecilmis.com.mackoliktest.util.Toaster toaster;
    @org.jetbrains.annotations.NotNull()
    public msecilmis.com.mackoliktest.scores.ScoresPresenterImpl scoresPresenterImpl;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<msecilmis.com.mackoliktest.scores.MatchViewModel> matches;
    @org.jetbrains.annotations.NotNull()
    public java.util.Timer timer;
    @org.jetbrains.annotations.NotNull()
    public msecilmis.com.mackoliktest.scores.ScoresAdapter scoresAdapter;
    public static final msecilmis.com.mackoliktest.scores.ScoresFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.networking.IScoresService getScoresService() {
        return null;
    }
    
    public final void setScoresService(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.networking.IScoresService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.util.Toaster getToaster() {
        return null;
    }
    
    public final void setToaster(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.util.Toaster p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.scores.ScoresPresenterImpl getScoresPresenterImpl() {
        return null;
    }
    
    public final void setScoresPresenterImpl(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.scores.ScoresPresenterImpl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<msecilmis.com.mackoliktest.scores.MatchViewModel> getMatches() {
        return null;
    }
    
    public final void setMatches(@org.jetbrains.annotations.NotNull()
    java.util.List<msecilmis.com.mackoliktest.scores.MatchViewModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Timer getTimer() {
        return null;
    }
    
    public final void setTimer(@org.jetbrains.annotations.NotNull()
    java.util.Timer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.scores.ScoresAdapter getScoresAdapter() {
        return null;
    }
    
    public final void setScoresAdapter(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.scores.ScoresAdapter p0) {
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
    msecilmis.com.mackoliktest.scores.ScoresItemViewModel scoresItemViewModel) {
    }
    
    @java.lang.Override()
    public void onLoadScoresFail(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    public ScoresFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lmsecilmis/com/mackoliktest/scores/ScoresFragment$Companion;", "", "()V", "newInstance", "Lmsecilmis/com/mackoliktest/scores/ScoresFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final msecilmis.com.mackoliktest.scores.ScoresFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}