package com.yaksonn.dazntutorial.util.listener

import android.support.v4.app.FragmentManager

/**
 * Created by @yaksonn
 */

interface IFragmentNavigationSubject {

    fun mainContentId(): Int

    fun supportFragmentManager(): FragmentManager
}
