package com.yaksonn.dazntutorial.util;

import java.lang.System;

/**
 * * Created by @yaksonn
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/yaksonn/dazntutorial/util/NavigationManager;", "Lcom/yaksonn/dazntutorial/util/listener/INavigationManager;", "navSubject", "Lcom/yaksonn/dazntutorial/util/listener/IFragmentNavigationSubject;", "(Lcom/yaksonn/dazntutorial/util/listener/IFragmentNavigationSubject;)V", "supportFragmentManager", "Landroid/support/v4/app/FragmentManager;", "showNews", "", "showScores", "app_debug"})
public final class NavigationManager implements com.yaksonn.dazntutorial.util.listener.INavigationManager {
    private final android.support.v4.app.FragmentManager supportFragmentManager = null;
    private final com.yaksonn.dazntutorial.util.listener.IFragmentNavigationSubject navSubject = null;
    
    @java.lang.Override()
    public void showNews() {
    }
    
    @java.lang.Override()
    public void showScores() {
    }
    
    @javax.inject.Inject()
    public NavigationManager(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.util.listener.IFragmentNavigationSubject navSubject) {
        super();
    }
}