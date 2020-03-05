package com.yaksonn.dazntutorial.ui.fragment.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsAdapter$ViewHolder;", "newsItemViewModels", "", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsItemViewModel;", "picasso", "Lcom/squareup/picasso/Picasso;", "onNewsItemClickListener", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsAdapter$IOnNewsItemClickListener;", "(Ljava/util/List;Lcom/squareup/picasso/Picasso;Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsAdapter$IOnNewsItemClickListener;)V", "getNewsItemViewModels", "()Ljava/util/List;", "getOnNewsItemClickListener", "()Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsAdapter$IOnNewsItemClickListener;", "getPicasso", "()Lcom/squareup/picasso/Picasso;", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "IOnNewsItemClickListener", "ViewHolder", "app_debug"})
public final class NewsAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.yaksonn.dazntutorial.ui.fragment.news.NewsAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.yaksonn.dazntutorial.ui.fragment.news.NewsItemViewModel> newsItemViewModels = null;
    @org.jetbrains.annotations.NotNull()
    private final com.squareup.picasso.Picasso picasso = null;
    @org.jetbrains.annotations.NotNull()
    private final com.yaksonn.dazntutorial.ui.fragment.news.NewsAdapter.IOnNewsItemClickListener onNewsItemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.yaksonn.dazntutorial.ui.fragment.news.NewsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.ui.fragment.news.NewsAdapter.ViewHolder viewHolder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yaksonn.dazntutorial.ui.fragment.news.NewsItemViewModel> getNewsItemViewModels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.picasso.Picasso getPicasso() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.ui.fragment.news.NewsAdapter.IOnNewsItemClickListener getOnNewsItemClickListener() {
        return null;
    }
    
    public NewsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yaksonn.dazntutorial.ui.fragment.news.NewsItemViewModel> newsItemViewModels, @org.jetbrains.annotations.NotNull()
    com.squareup.picasso.Picasso picasso, @org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.ui.fragment.news.NewsAdapter.IOnNewsItemClickListener onNewsItemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "divider", "getDivider", "()Landroid/view/View;", "ivNews", "Landroid/widget/ImageView;", "getIvNews", "()Landroid/widget/ImageView;", "tvPubDate", "Landroid/widget/TextView;", "getTvPubDate", "()Landroid/widget/TextView;", "tvTitle", "getTvTitle", "app_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivNews = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvPubDate = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View divider = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvNews() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvPubDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getDivider() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsAdapter$IOnNewsItemClickListener;", "", "onNewsItemClick", "", "newsItemViewModel", "Lcom/yaksonn/dazntutorial/ui/fragment/news/NewsItemViewModel;", "app_debug"})
    public static abstract interface IOnNewsItemClickListener {
        
        public abstract void onNewsItemClick(@org.jetbrains.annotations.NotNull()
        com.yaksonn.dazntutorial.ui.fragment.news.NewsItemViewModel newsItemViewModel);
    }
}