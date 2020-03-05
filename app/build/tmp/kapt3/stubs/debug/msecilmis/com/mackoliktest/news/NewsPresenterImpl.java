package msecilmis.com.mackoliktest.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lmsecilmis/com/mackoliktest/news/NewsPresenterImpl;", "Lmsecilmis/com/mackoliktest/news/NewsContract$Presenter;", "view", "Lmsecilmis/com/mackoliktest/news/NewsContract$View;", "newsService", "Lmsecilmis/com/mackoliktest/networking/INewsService;", "(Lmsecilmis/com/mackoliktest/news/NewsContract$View;Lmsecilmis/com/mackoliktest/networking/INewsService;)V", "getNewsService", "()Lmsecilmis/com/mackoliktest/networking/INewsService;", "getView", "()Lmsecilmis/com/mackoliktest/news/NewsContract$View;", "loadNews", "", "app_debug"})
public final class NewsPresenterImpl implements msecilmis.com.mackoliktest.news.NewsContract.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final msecilmis.com.mackoliktest.news.NewsContract.View view = null;
    @org.jetbrains.annotations.NotNull()
    private final msecilmis.com.mackoliktest.networking.INewsService newsService = null;
    
    @java.lang.Override()
    public void loadNews() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.news.NewsContract.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.networking.INewsService getNewsService() {
        return null;
    }
    
    public NewsPresenterImpl(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.news.NewsContract.View view, @org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.networking.INewsService newsService) {
        super();
    }
}