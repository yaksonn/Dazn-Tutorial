package com.yaksonn.dazntutorial.ui.fragment.scores

/**
 * Created by @yaksonn
 */

class ScoresContract {
    interface View {
        fun onLoadScoresSuccess(scoresItemViewModel: ScoresItemViewModel)
        fun onLoadScoresFail(errorMessage: String)
    }
    interface Presenter {
        fun loadScores()
    }
}