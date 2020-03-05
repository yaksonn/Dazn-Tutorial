package com.yaksonn.dazntutorial.network.scoresprovider

import com.yaksonn.dazntutorial.ui.fragment.scores.ScoresItemViewModel

/**
 * Created by @yaksonn
 */

interface IScoresService {
    fun getScores(callback: IGetScoresCallback)

    interface IGetScoresCallback {
        fun onSuccess(scoresViewModel: ScoresItemViewModel)

        fun onFailure(errorMessage: String)
    }
}