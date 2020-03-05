package com.yaksonn.dazntutorial.ui.fragment.news;

import java.lang.System;

/**
 * * Created by @yaksonn
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsPresenterImpl;", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsContract$Presenter;", "view", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsContract$View;", "newsService", "Lcom/yaksonn/dazntutorial/network/newsprovider/INewsService;", "(Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsContract$View;Lcom/yaksonn/dazntutorial/network/newsprovider/INewsService;)V", "getNewsService", "()Lcom/yaksonn/dazntutorial/network/newsprovider/INewsService;", "getView", "()Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsContract$View;", "loadNews", "", "app_debug"})
public final class NewsPresenterImpl implements com.yaksonn.dazntutorial.ui.fragment.news.NewsContract.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final com.yaksonn.dazntutorial.ui.fragment.news.NewsContract.View view = null;
    @org.jetbrains.annotations.NotNull()
    private final com.yaksonn.dazntutorial.network.newsprovider.INewsService newsService = null;
    
    @java.lang.Override()
    public void loadNews() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.ui.fragment.news.NewsContract.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.network.newsprovider.INewsService getNewsService() {
        return null;
    }
    
    public NewsPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.ui.fragment.news.NewsContract.View view, @org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.network.newsprovider.INewsService newsService) {
        super();
    }
}