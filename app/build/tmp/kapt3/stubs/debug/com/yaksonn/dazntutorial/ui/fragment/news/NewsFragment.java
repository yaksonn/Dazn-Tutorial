package com.yaksonn.dazntutorial.ui.fragment.news;

import java.lang.System;

/**
 * * Created by @yaksonn
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00103\u001a\u00020*2\u0006\u00104\u001a\u000205H\u0016J\u0016\u00106\u001a\u00020*2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001208H\u0016J\u001a\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006<"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsContract$View;", "()V", "newsAdapter", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsRecyclerAdapter;", "getNewsAdapter", "()Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsRecyclerAdapter;", "setNewsAdapter", "(Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsRecyclerAdapter;)V", "newsDetailFragment", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsDetailFragment;", "getNewsDetailFragment", "()Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsDetailFragment;", "setNewsDetailFragment", "(Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsDetailFragment;)V", "newsItemViewModels", "", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsItemViewModel;", "getNewsItemViewModels", "()Ljava/util/List;", "setNewsItemViewModels", "(Ljava/util/List;)V", "newsPresenterImpl", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsPresenterImpl;", "getNewsPresenterImpl", "()Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsPresenterImpl;", "setNewsPresenterImpl", "(Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsPresenterImpl;)V", "newsService", "Lcom/yaksonn/dazntutorial/network/newsprovider/INewsService;", "getNewsService", "()Lcom/yaksonn/dazntutorial/network/newsprovider/INewsService;", "setNewsService", "(Lcom/yaksonn/dazntutorial/network/newsprovider/INewsService;)V", "toaster", "Lcom/yaksonn/dazntutorial/util/customviews/Toaster;", "getToaster", "()Lcom/yaksonn/dazntutorial/util/customviews/Toaster;", "setToaster", "(Lcom/yaksonn/dazntutorial/util/customviews/Toaster;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLoadNewsFail", "errorMessage", "", "onLoadNewsSuccess", "newsViews", "", "onViewCreated", "view", "Companion", "app_debug"})
public final class NewsFragment extends android.support.v4.app.Fragment implements com.yaksonn.dazntutorial.ui.fragment.news.NewsContract.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.yaksonn.dazntutorial.network.newsprovider.INewsService newsService;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.yaksonn.dazntutorial.util.customviews.Toaster toaster;
    @org.jetbrains.annotations.NotNull()
    public com.yaksonn.dazntutorial.ui.fragment.news.NewsPresenterImpl newsPresenterImpl;
    @org.jetbrains.annotations.NotNull()
    public com.yaksonn.dazntutorial.ui.fragment.news.NewsRecyclerAdapter newsAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.yaksonn.dazntutorial.ui.fragment.news.NewsDetailFragment newsDetailFragment;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.yaksonn.dazntutorial.ui.fragment.news.NewsItemViewModel> newsItemViewModels;
    public static final com.yaksonn.dazntutorial.ui.fragment.news.NewsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.network.newsprovider.INewsService getNewsService() {
        return null;
    }
    
    public final void setNewsService(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.network.newsprovider.INewsService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.util.customviews.Toaster getToaster() {
        return null;
    }
    
    public final void setToaster(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.util.customviews.Toaster p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.ui.fragment.news.NewsPresenterImpl getNewsPresenterImpl() {
        return null;
    }
    
    public final void setNewsPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.ui.fragment.news.NewsPresenterImpl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.ui.fragment.news.NewsRecyclerAdapter getNewsAdapter() {
        return null;
    }
    
    public final void setNewsAdapter(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.ui.fragment.news.NewsRecyclerAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.ui.fragment.news.NewsDetailFragment getNewsDetailFragment() {
        return null;
    }
    
    public final void setNewsDetailFragment(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.ui.fragment.news.NewsDetailFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yaksonn.dazntutorial.ui.fragment.news.NewsItemViewModel> getNewsItemViewModels() {
        return null;
    }
    
    public final void setNewsItemViewModels(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yaksonn.dazntutorial.ui.fragment.news.NewsItemViewModel> p0) {
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
    public void onLoadNewsSuccess(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yaksonn.dazntutorial.ui.fragment.news.NewsItemViewModel> newsViews) {
    }
    
    @java.lang.Override()
    public void onLoadNewsFail(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    public NewsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsFragment$Companion;", "", "()V", "newInstance", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.yaksonn.dazntutorial.ui.fragment.news.NewsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}