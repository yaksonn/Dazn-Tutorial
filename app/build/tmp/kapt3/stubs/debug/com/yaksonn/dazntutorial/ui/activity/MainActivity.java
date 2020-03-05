package com.yaksonn.dazntutorial.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/yaksonn/dazntutorial/ui/activity/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Ldagger/android/support/HasSupportFragmentInjector;", "Lcom/yaksonn/dazntutorial/util/listener/IFragmentNavigationSubject;", "()V", "fragmentDispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/support/v4/app/Fragment;", "getFragmentDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setFragmentDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "navigationManager", "Lcom/yaksonn/dazntutorial/util/listener/INavigationManager;", "getNavigationManager", "()Lcom/yaksonn/dazntutorial/util/listener/INavigationManager;", "setNavigationManager", "(Lcom/yaksonn/dazntutorial/util/listener/INavigationManager;)V", "mainContentId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "supportFragmentInjector", "Ldagger/android/AndroidInjector;", "supportFragmentManager", "Landroid/support/v4/app/FragmentManager;", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity implements dagger.android.support.HasSupportFragmentInjector, com.yaksonn.dazntutorial.util.listener.IFragmentNavigationSubject {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> fragmentDispatchingAndroidInjector;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.yaksonn.dazntutorial.util.listener.INavigationManager navigationManager;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> getFragmentDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setFragmentDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.util.listener.INavigationManager getNavigationManager() {
        return null;
    }
    
    public final void setNavigationManager(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.util.listener.INavigationManager p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    @java.lang.Override()
    public int mainContentId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v4.app.FragmentManager supportFragmentManager() {
        return null;
    }
    
    public MainActivity() {
        super();
    }
}