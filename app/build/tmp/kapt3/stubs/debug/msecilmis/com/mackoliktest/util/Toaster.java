package msecilmis.com.mackoliktest.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0018\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lmsecilmis/com/mackoliktest/util/Toaster;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "longToast", "", "resId", "", "s", "", "shortToast", "toast", "text", "", "duration", "app_debug"})
public final class Toaster {
    private final java.lang.ref.WeakReference<android.content.Context> contextWeakReference = null;
    
    public final void toast(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int duration) {
    }
    
    public final void toast(@android.support.annotation.StringRes()
    int resId, int duration) {
    }
    
    public final void shortToast(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    public final void shortToast(@android.support.annotation.StringRes()
    int resId) {
    }
    
    public final void longToast(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    public final void longToast(@android.support.annotation.StringRes()
    int resId) {
    }
    
    @javax.inject.Inject()
    public Toaster(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}