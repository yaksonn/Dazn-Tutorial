package com.yaksonn.dazntutorial.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\n"}, d2 = {"Lcom/yaksonn/dazntutorial/base/BaseActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "prepareView", "app_debug"})
public abstract class BaseActivity extends android.support.v7.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    /**
     * * Layout resource id
     */
    public abstract int getLayoutId();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * * Prepare UI Components here
     */
    public abstract void prepareView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    public BaseActivity() {
        super();
    }
}