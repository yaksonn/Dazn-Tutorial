package com.yaksonn.dazntutorial.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/yaksonn/dazntutorial/di/module/ActivityBindingModule;", "", "()V", "mainActivity", "Lcom/yaksonn/dazntutorial/ui/activity/main/MainActivity;", "mainActivity$app_debug", "app_debug"})
@dagger.Module()
public abstract class ActivityBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.yaksonn.dazntutorial.di.module.MainActivityModule.class})
    @com.yaksonn.dazntutorial.di.scope.ActivityScope()
    public abstract com.yaksonn.dazntutorial.ui.activity.main.MainActivity mainActivity$app_debug();
    
    public ActivityBindingModule() {
        super();
    }
}