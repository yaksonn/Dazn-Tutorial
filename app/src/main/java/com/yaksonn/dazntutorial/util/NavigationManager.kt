package com.yaksonn.dazntutorial.util

import android.support.v4.app.FragmentManager
import com.yaksonn.dazntutorial.R
import com.yaksonn.dazntutorial.ui.fragment.news.NewsFragment
import com.yaksonn.dazntutorial.ui.fragment.scores.ScoresFragment
import com.yaksonn.dazntutorial.util.listener.IFragmentNavigationSubject
import com.yaksonn.dazntutorial.util.listener.INavigationManager
import javax.inject.Inject

class NavigationManager @Inject constructor(private val navSubject: IFragmentNavigationSubject) :
    INavigationManager {

    private val supportFragmentManager: FragmentManager = navSubject.supportFragmentManager()

    override fun showNews() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, NewsFragment.newInstance())
            .commit()
    }

    override fun showScores() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, ScoresFragment.newInstance())
            .commit()
    }
}
