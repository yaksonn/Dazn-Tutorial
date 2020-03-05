package com.yaksonn.dazntutorial.networking

import com.yaksonn.dazntutorial.ui.fragment.scores.ScoresItemViewModel

interface IScoresService {
    fun getScores(callback: IGetScoresCallback)

    interface IGetScoresCallback {
        fun onSuccess(scoresViewModel: ScoresItemViewModel)

        fun onFailure(errorMessage: String)
    }
}