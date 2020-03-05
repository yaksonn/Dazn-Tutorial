package com.yaksonn.dazntutorial.network.newsprovider;

import java.lang.System;

/**
 * * Created by @yaksonn
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/yaksonn/dazntutorial/network/newsprovider/INewsService;", "", "getNews", "", "callback", "Lcom/yaksonn/dazntutorial/network/newsprovider/INewsService$IGetNewsCallback;", "IGetNewsCallback", "app_debug"})
public abstract interface INewsService {
    
    public abstract void getNews(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.network.newsprovider.INewsService.IGetNewsCallback callback);
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u00a8\u0006\n"}, d2 = {"Lcom/yaksonn/dazntutorial/network/newsprovider/INewsService$IGetNewsCallback;", "", "onFailure", "", "errorMessage", "", "onSuccess", "newsViewModels", "", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsItemViewModel;", "app_debug"})
    public static abstract interface IGetNewsCallback {
        
        public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
        java.util.List<com.yaksonn.dazntutorial.ui.fragment.news.NewsItemViewModel> newsViewModels);
        
        public abstract void onFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
    }
}