package com.yaksonn.dazntutorial.ui.fragment.scores

import com.yaksonn.dazntutorial.network.scoresprovider.IScoresService

class ScoresPresenterImpl constructor(val view: ScoresContract.View, val scoresService: IScoresService) :
    ScoresContract.Presenter {

    override fun loadScores() {
        scoresService.getScores(object : IScoresService.IGetScoresCallback {
            override fun onSuccess(scoresViewModel: ScoresItemViewModel) {
                view.onLoadScoresSuccess(scoresViewModel)
            }
            override fun onFailure(errorMessage: String) {
                view.onLoadScoresFail(errorMessage)
            }
        })
    }
}