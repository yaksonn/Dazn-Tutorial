package com.yaksonn.dazntutorial.di.module;

import java.lang.System;

/**
 * * Created by @yaksonn
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/yaksonn/dazntutorial/di/module/HelperModule;", "", "()V", "loadingProgressBar", "Lcom/yaksonn/dazntutorial/util/customviews/LoadingProgressBar;", "loadingProgressBar$app_debug", "newsService", "Lcom/yaksonn/dazntutorial/network/newsprovider/INewsService;", "api", "Lcom/yaksonn/dazntutorial/network/ApiServiceInterface;", "newsService$app_debug", "scoresService", "Lcom/yaksonn/dazntutorial/network/scoresprovider/IScoresService;", "scoresService$app_debug", "app_debug"})
@dagger.Module(subcomponents = {com.yaksonn.dazntutorial.di.component.StaticComponent.class})
public final class HelperModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.yaksonn.dazntutorial.network.newsprovider.INewsService newsService$app_debug(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.network.ApiServiceInterface api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.yaksonn.dazntutorial.network.scoresprovider.IScoresService scoresService$app_debug(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.network.ApiServiceInterface api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.yaksonn.dazntutorial.util.customviews.LoadingProgressBar loadingProgressBar$app_debug() {
        return null;
    }
    
    public HelperModule() {
        super();
    }
}