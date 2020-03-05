package com.yaksonn.dazntutorial.util.customviews


import android.content.Context
import android.support.annotation.StringRes
import android.widget.Toast

import javax.inject.Inject
import java.lang.ref.WeakReference


class Toaster @Inject
constructor(context: Context) {
    private val contextWeakReference: WeakReference<Context> = WeakReference(context)

    fun toast(text: CharSequence, duration: Int) {
        val context = contextWeakReference.get() ?: return

        Toast.makeText(context, text, duration).show()
    }

    fun shortToast(s: String) {
        toast(s, Toast.LENGTH_SHORT)
    }

}
