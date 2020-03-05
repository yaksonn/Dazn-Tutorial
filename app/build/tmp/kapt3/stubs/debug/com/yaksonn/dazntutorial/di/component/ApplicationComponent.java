package com.yaksonn.dazntutorial.di.component;

import java.lang.System;

/**
 * * Created by @yaksonn
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/yaksonn/dazntutorial/di/component/ApplicationComponent;", "Ldagger/android/AndroidInjector;", "Lcom/yaksonn/dazntutorial/DaznApp;", "api", "Lcom/yaksonn/dazntutorial/network/ApiServiceInterface;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.yaksonn.dazntutorial.di.module.ActivityBindingModule.class, com.yaksonn.dazntutorial.di.module.MainModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent extends dagger.android.AndroidInjector<com.yaksonn.dazntutorial.DaznApp> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.yaksonn.dazntutorial.network.ApiServiceInterface api();
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/yaksonn/dazntutorial/di/component/ApplicationComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lcom/yaksonn/dazntutorial/DaznApp;", "()V", "app_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<com.yaksonn.dazntutorial.DaznApp> {
        
        public Builder() {
            super();
        }
    }
}