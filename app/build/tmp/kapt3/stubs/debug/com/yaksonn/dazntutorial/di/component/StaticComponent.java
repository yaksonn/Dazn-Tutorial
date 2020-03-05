package com.yaksonn.dazntutorial.di.component;

import java.lang.System;

/**
 * * Created by @yaksonn
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/yaksonn/dazntutorial/di/component/StaticComponent;", "", "Builder", "app_debug"})
@dagger.Subcomponent(modules = {com.yaksonn.dazntutorial.di.module.StaticModule.class})
public abstract interface StaticComponent {
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/yaksonn/dazntutorial/di/component/StaticComponent$Builder;", "", "build", "Lcom/yaksonn/dazntutorial/di/component/StaticComponent;", "staticModule", "Lcom/yaksonn/dazntutorial/di/module/StaticModule;", "app_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.yaksonn.dazntutorial.di.component.StaticComponent.Builder staticModule(@org.jetbrains.annotations.NotNull()
        com.yaksonn.dazntutorial.di.module.StaticModule staticModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.yaksonn.dazntutorial.di.component.StaticComponent build();
    }
}