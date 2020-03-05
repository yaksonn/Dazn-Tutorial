package com.yaksonn.dazntutorial.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection

abstract class BaseActivity: AppCompatActivity(){

    /**
     * Layout resource id
     */
    abstract fun getLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        prepareView(savedInstanceState)
    }

    /**
     * Prepare UI Components here
     */
    abstract fun prepareView(savedInstanceState: Bundle?)

}