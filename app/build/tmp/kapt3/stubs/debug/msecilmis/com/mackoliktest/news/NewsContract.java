package msecilmis.com.mackoliktest.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lmsecilmis/com/mackoliktest/news/NewsContract;", "", "()V", "Presenter", "View", "app_debug"})
public final class NewsContract {
    
    public NewsContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u00a8\u0006\n"}, d2 = {"Lmsecilmis/com/mackoliktest/news/NewsContract$View;", "", "onLoadNewsFail", "", "errorMessage", "", "onLoadNewsSuccess", "newsViews", "", "Lmsecilmis/com/mackoliktest/news/NewsItemViewModel;", "app_debug"})
    public static abstract interface View {
        
        public abstract void onLoadNewsSuccess(@org.jetbrains.annotations.NotNull()
        java.util.List<msecilmis.com.mackoliktest.news.NewsItemViewModel> newsViews);
        
        public abstract void onLoadNewsFail(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lmsecilmis/com/mackoliktest/news/NewsContract$Presenter;", "", "loadNews", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void loadNews();
    }
}