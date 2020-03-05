package msecilmis.com.mackoliktest.scores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lmsecilmis/com/mackoliktest/scores/ScoresPresenterImpl;", "Lmsecilmis/com/mackoliktest/scores/ScoresContract$Presenter;", "view", "Lmsecilmis/com/mackoliktest/scores/ScoresContract$View;", "scoresService", "Lmsecilmis/com/mackoliktest/networking/IScoresService;", "(Lmsecilmis/com/mackoliktest/scores/ScoresContract$View;Lmsecilmis/com/mackoliktest/networking/IScoresService;)V", "getScoresService", "()Lmsecilmis/com/mackoliktest/networking/IScoresService;", "getView", "()Lmsecilmis/com/mackoliktest/scores/ScoresContract$View;", "loadScores", "", "app_debug"})
public final class ScoresPresenterImpl implements msecilmis.com.mackoliktest.scores.ScoresContract.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final msecilmis.com.mackoliktest.scores.ScoresContract.View view = null;
    @org.jetbrains.annotations.NotNull()
    private final msecilmis.com.mackoliktest.networking.IScoresService scoresService = null;
    
    @java.lang.Override()
    public void loadScores() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.scores.ScoresContract.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.networking.IScoresService getScoresService() {
        return null;
    }
    
    public ScoresPresenterImpl(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.scores.ScoresContract.View view, @org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.networking.IScoresService scoresService) {
        super();
    }
}