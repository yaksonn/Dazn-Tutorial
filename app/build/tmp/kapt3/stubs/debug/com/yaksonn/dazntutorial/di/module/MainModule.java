package com.yaksonn.dazntutorial.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007\u00a8\u0006\t"}, d2 = {"Lcom/yaksonn/dazntutorial/di/module/MainModule;", "", "()V", "provideAppContext", "Landroid/content/Context;", "application", "Lcom/yaksonn/dazntutorial/DaznApp;", "provideAppContext$app_debug", "Companion", "app_debug"})
@dagger.Module(subcomponents = {com.yaksonn.dazntutorial.di.component.StaticComponent.class}, includes = {com.yaksonn.dazntutorial.di.module.NetworkingModule.class})
public abstract class MainModule {
    public static final com.yaksonn.dazntutorial.di.module.MainModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.content.Context provideAppContext$app_debug(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.DaznApp application);
    
    public MainModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/yaksonn/dazntutorial/di/module/MainModule$Companion;", "", "()V", "clipboardManager", "Landroid/content/ClipboardManager;", "app", "Lcom/yaksonn/dazntutorial/DaznApp;", "clipboardManager$app_debug", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager$app_debug", "app_debug"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final android.content.ClipboardManager clipboardManager$app_debug(@org.jetbrains.annotations.NotNull()
        com.yaksonn.dazntutorial.DaznApp app) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final android.view.inputmethod.InputMethodManager inputMethodManager$app_debug(@org.jetbrains.annotations.NotNull()
        com.yaksonn.dazntutorial.DaznApp app) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}