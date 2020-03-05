package msecilmis.com.mackoliktest.scores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lmsecilmis/com/mackoliktest/scores/ScoresItemViewModel;", "", "date", "", "matches", "", "Lmsecilmis/com/mackoliktest/scores/MatchViewModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getMatches", "()Ljava/util/List;", "setMatches", "(Ljava/util/List;)V", "Companion", "app_debug"})
public final class ScoresItemViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String date;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<msecilmis.com.mackoliktest.scores.MatchViewModel> matches;
    public static final msecilmis.com.mackoliktest.scores.ScoresItemViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<msecilmis.com.mackoliktest.scores.MatchViewModel> getMatches() {
        return null;
    }
    
    public final void setMatches(@org.jetbrains.annotations.NotNull()
    java.util.List<msecilmis.com.mackoliktest.scores.MatchViewModel> p0) {
    }
    
    public ScoresItemViewModel(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.util.List<msecilmis.com.mackoliktest.scores.MatchViewModel> matches) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lmsecilmis/com/mackoliktest/scores/ScoresItemViewModel$Companion;", "", "()V", "convert", "Lmsecilmis/com/mackoliktest/scores/ScoresItemViewModel;", "scoresResponse", "Lmsecilmis/com/mackoliktest/networking/models/GetScoresResponse;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final msecilmis.com.mackoliktest.scores.ScoresItemViewModel convert(@org.jetbrains.annotations.NotNull()
        msecilmis.com.mackoliktest.networking.models.GetScoresResponse scoresResponse) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}