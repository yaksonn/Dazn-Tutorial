package com.yaksonn.dazntutorial.ui.fragment.scores

import com.yaksonn.dazntutorial.network.models.ScoresModel

class ScoresItemViewModel {

    var date: String
    var matches: List<TeamMatchViewModel>

    constructor(date: String, matches: List<TeamMatchViewModel>) {
        this.date = date
        this.matches = matches
    }

    companion object {
        fun convert(scoresResponse: ScoresModel): ScoresItemViewModel? {
            var allMatches: MutableList<ScoresModel.Match> = ArrayList()
            scoresResponse.competition?.season?.round?.group?.forEach {
                it.match?.forEach {
                    allMatches.add(it)
                }
            }
            return allMatches.get(0).date_utc?.let { ScoresItemViewModel(it, TeamMatchViewModel.convert(allMatches)) }
        }
    }

}