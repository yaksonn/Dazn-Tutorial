package msecilmis.com.mackoliktest.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00103\u001a\u00020*2\u0006\u00104\u001a\u000205H\u0016J\u0016\u00106\u001a\u00020*2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001208H\u0016J\u001a\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006<"}, d2 = {"Lmsecilmis/com/mackoliktest/news/NewsFragment;", "Landroid/support/v4/app/Fragment;", "Lmsecilmis/com/mackoliktest/news/NewsContract$View;", "()V", "newsAdapter", "Lmsecilmis/com/mackoliktest/news/NewsAdapter;", "getNewsAdapter", "()Lmsecilmis/com/mackoliktest/news/NewsAdapter;", "setNewsAdapter", "(Lmsecilmis/com/mackoliktest/news/NewsAdapter;)V", "newsDetailFragment", "Lmsecilmis/com/mackoliktest/news/NewsDetailFragment;", "getNewsDetailFragment", "()Lmsecilmis/com/mackoliktest/news/NewsDetailFragment;", "setNewsDetailFragment", "(Lmsecilmis/com/mackoliktest/news/NewsDetailFragment;)V", "newsItemViewModels", "", "Lmsecilmis/com/mackoliktest/news/NewsItemViewModel;", "getNewsItemViewModels", "()Ljava/util/List;", "setNewsItemViewModels", "(Ljava/util/List;)V", "newsPresenterImpl", "Lmsecilmis/com/mackoliktest/news/NewsPresenterImpl;", "getNewsPresenterImpl", "()Lmsecilmis/com/mackoliktest/news/NewsPresenterImpl;", "setNewsPresenterImpl", "(Lmsecilmis/com/mackoliktest/news/NewsPresenterImpl;)V", "newsService", "Lmsecilmis/com/mackoliktest/networking/INewsService;", "getNewsService", "()Lmsecilmis/com/mackoliktest/networking/INewsService;", "setNewsService", "(Lmsecilmis/com/mackoliktest/networking/INewsService;)V", "toaster", "Lmsecilmis/com/mackoliktest/util/Toaster;", "getToaster", "()Lmsecilmis/com/mackoliktest/util/Toaster;", "setToaster", "(Lmsecilmis/com/mackoliktest/util/Toaster;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLoadNewsFail", "errorMessage", "", "onLoadNewsSuccess", "newsViews", "", "onViewCreated", "view", "Companion", "app_debug"})
public final class NewsFragment extends android.support.v4.app.Fragment implements msecilmis.com.mackoliktest.news.NewsContract.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public msecilmis.com.mackoliktest.networking.INewsService newsService;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public msecilmis.com.mackoliktest.util.Toaster toaster;
    @org.jetbrains.annotations.NotNull()
    public msecilmis.com.mackoliktest.news.NewsPresenterImpl newsPresenterImpl;
    @org.jetbrains.annotations.NotNull()
    public msecilmis.com.mackoliktest.news.NewsAdapter newsAdapter;
    @org.jetbrains.annotations.NotNull()
    public msecilmis.com.mackoliktest.news.NewsDetailFragment newsDetailFragment;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<msecilmis.com.mackoliktest.news.NewsItemViewModel> newsItemViewModels;
    public static final msecilmis.com.mackoliktest.news.NewsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.networking.INewsService getNewsService() {
        return null;
    }
    
    public final void setNewsService(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.networking.INewsService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.util.Toaster getToaster() {
        return null;
    }
    
    public final void setToaster(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.util.Toaster p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.news.NewsPresenterImpl getNewsPresenterImpl() {
        return null;
    }
    
    public final void setNewsPresenterImpl(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.news.NewsPresenterImpl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.news.NewsAdapter getNewsAdapter() {
        return null;
    }
    
    public final void setNewsAdapter(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.news.NewsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final msecilmis.com.mackoliktest.news.NewsDetailFragment getNewsDetailFragment() {
        return null;
    }
    
    public final void setNewsDetailFragment(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.news.NewsDetailFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<msecilmis.com.mackoliktest.news.NewsItemViewModel> getNewsItemViewModels() {
        return null;
    }
    
    public final void setNewsItemViewModels(@org.jetbrains.annotations.NotNull()
    java.util.List<msecilmis.com.mackoliktest.news.NewsItemViewModel> p0) {
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
    java.util.List<msecilmis.com.mackoliktest.news.NewsItemViewModel> newsViews) {
    }
    
    @java.lang.Override()
    public void onLoadNewsFail(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    public NewsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lmsecilmis/com/mackoliktest/news/NewsFragment$Companion;", "", "()V", "newInstance", "Lmsecilmis/com/mackoliktest/news/NewsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final msecilmis.com.mackoliktest.news.NewsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}