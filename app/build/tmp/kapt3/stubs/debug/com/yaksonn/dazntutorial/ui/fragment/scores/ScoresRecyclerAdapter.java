package com.yaksonn.dazntutorial.ui.fragment.scores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresRecyclerAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresRecyclerAdapter$ViewHolder;", "teamMatchViewModel", "", "Lcom/yaksonn/dazntutorial/ui/fragment/scores/TeamMatchViewModel;", "(Ljava/util/List;)V", "getTeamMatchViewModel", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "ViewHolder", "app_debug"})
public final class ScoresRecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.yaksonn.dazntutorial.ui.fragment.scores.ScoresRecyclerAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.yaksonn.dazntutorial.ui.fragment.scores.TeamMatchViewModel> teamMatchViewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.yaksonn.dazntutorial.ui.fragment.scores.ScoresRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.ui.fragment.scores.ScoresRecyclerAdapter.ViewHolder viewHolder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yaksonn.dazntutorial.ui.fragment.scores.TeamMatchViewModel> getTeamMatchViewModel() {
        return null;
    }
    
    public ScoresRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yaksonn.dazntutorial.ui.fragment.scores.TeamMatchViewModel> teamMatchViewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/fragment/scores/ScoresRecyclerAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "rlRoot", "Landroid/support/constraint/ConstraintLayout;", "getRlRoot", "()Landroid/support/constraint/ConstraintLayout;", "scoreTextView", "Landroid/widget/TextView;", "getScoreTextView", "()Landroid/widget/TextView;", "teamATextView", "getTeamATextView", "teamBTextView", "getTeamBTextView", "app_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView teamATextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView teamBTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView scoreTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.support.constraint.ConstraintLayout rlRoot = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTeamATextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTeamBTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getScoreTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.support.constraint.ConstraintLayout getRlRoot() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}