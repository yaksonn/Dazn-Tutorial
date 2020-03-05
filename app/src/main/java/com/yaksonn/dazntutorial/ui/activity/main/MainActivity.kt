package com.yaksonn.dazntutorial.ui.activity.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import com.yaksonn.dazntutorial.R
import com.yaksonn.dazntutorial.base.BaseActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.view.*
import com.yaksonn.dazntutorial.util.listener.IFragmentNavigationSubject
import com.yaksonn.dazntutorial.util.listener.INavigationManager
import javax.inject.Inject

class MainActivity : BaseActivity(), HasSupportFragmentInjector,
    IFragmentNavigationSubject {


    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var navigationManager: INavigationManager


    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun prepareView(savedInstanceState: Bundle?) {
        spinner.adapter = CustomSpinnerAdapter(
            this,
            arrayOf("News", "Scores", "Standings")
        )

        spinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                spinner.text1.text = ""

                when (position) {
                    0 -> {
                        navigationManager.showNews()
                        return
                    }
                    1 -> {
                        navigationManager.showScores()
                        return
                    }
                    else -> return
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                spinner.text1.text = ""
            }
        }
    }



    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentDispatchingAndroidInjector
    }

    override fun mainContentId(): Int {
        return R.id.container
    }

    override fun supportFragmentManager(): FragmentManager {
        return supportFragmentManager
    }

}
