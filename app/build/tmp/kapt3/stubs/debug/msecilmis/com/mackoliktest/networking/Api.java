package msecilmis.com.mackoliktest.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lmsecilmis/com/mackoliktest/networking/Api;", "", "news", "Lretrofit2/Call;", "Lmsecilmis/com/mackoliktest/networking/models/GetNewsResponse;", "getNews", "()Lretrofit2/Call;", "scores", "Lmsecilmis/com/mackoliktest/networking/models/GetScoresResponse;", "getScores", "app_debug"})
public abstract interface Api {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/utilities/interviews/techtest/latestnews.xml")
    public abstract retrofit2.Call<msecilmis.com.mackoliktest.networking.models.GetNewsResponse> getNews();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/utilities/interviews/techtest/scores.xml")
    public abstract retrofit2.Call<msecilmis.com.mackoliktest.networking.models.GetScoresResponse> getScores();
}