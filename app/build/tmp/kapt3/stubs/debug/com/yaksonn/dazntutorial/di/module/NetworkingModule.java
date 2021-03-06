package com.yaksonn.dazntutorial.di.module;

import java.lang.System;

/**
 * * Created by @yaksonn
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u00a2\u0006\u0002\b\u000fJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/yaksonn/dazntutorial/di/module/NetworkingModule;", "", "()V", "cache", "Lokhttp3/Cache;", "app", "Lcom/yaksonn/dazntutorial/DaznApp;", "cache$app_debug", "okHttpClient", "Lokhttp3/OkHttpClient;", "okHttpClient$app_debug", "provideApi", "Lcom/yaksonn/dazntutorial/network/ApiServiceInterface;", "retrofit", "Lretrofit2/Retrofit;", "provideApi$app_debug", "client", "retrofit$app_debug", "app_debug"})
@dagger.Module()
public final class NetworkingModule {
    
    /**
     * * Provides [OkHttpClient] instance
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient okHttpClient$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.Cache cache) {
        return null;
    }
    
    /**
     * * Provides [Retrofit] instance
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit retrofit$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.yaksonn.dazntutorial.network.ApiServiceInterface provideApi$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Cache cache$app_debug(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.DaznApp app) {
        return null;
    }
    
    public NetworkingModule() {
        super();
    }
}