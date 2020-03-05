package com.yaksonn.dazntutorial.ui.fragment.scores


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_scores.view.*
import com.yaksonn.dazntutorial.R
import com.yaksonn.dazntutorial.network.scoresprovider.IScoresService
import com.yaksonn.dazntutorial.util.customviews.Toaster
import com.yaksonn.dazntutorial.util.getFormattedDateWithMonthNameFromDateString
import javax.inject.Inject
import java.util.*


/**
 * Created by @yaksonn
 */

class ScoresFragment : Fragment(), ScoresContract.View {

    @Inject
    lateinit var scoresService: IScoresService

    @Inject
    lateinit var toaster: Toaster
    lateinit var scoresPresenterImpl: ScoresPresenterImpl
    var matches: MutableList<TeamMatchViewModel> = ArrayList()
    lateinit var timer: Timer
    lateinit var scoresAdapter: ScoresRecyclerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_scores, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        scoresPresenterImpl = ScoresPresenterImpl(this, scoresService)
        scoresAdapter = ScoresRecyclerAdapter(matches)
        view.scoresRecyclerView.adapter = scoresAdapter
        scoresPresenterImpl.loadScores()

    }

    override fun onResume() {
        super.onResume()
        timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                scoresPresenterImpl.loadScores()
            }
        }, 0, 30000)
    }

    override fun onPause() {
        super.onPause()
        timer.cancel()
        timer.purge()
    }

    override fun onLoadScoresSuccess(scoresItemViewModel: ScoresItemViewModel) {
        view?.matchDate?.text =
            getFormattedDateWithMonthNameFromDateString(scoresItemViewModel.date)
        matches.clear()
        matches.addAll(scoresItemViewModel.matches)
        scoresAdapter.notifyDataSetChanged()
        if (matches.size == 0)
            toaster.shortToast("There are no matches to show")
    }

    override fun onLoadScoresFail(errorMessage: String) {
        toaster.shortToast(errorMessage)
    }

    companion object {
        fun newInstance(): ScoresFragment {
            return ScoresFragment()
        }
    }
}
