package com.yaksonn.dazntutorial.ui.fragment.scores

class ScoresContract {
    interface View {
        fun onLoadScoresSuccess(scoresItemViewModel: ScoresItemViewModel)
        fun onLoadScoresFail(errorMessage: String)
    }
    interface Presenter {
        fun loadScores()
    }
}