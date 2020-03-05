package com.yaksonn.dazntutorial.ui.fragment.scores

import com.yaksonn.dazntutorial.network.models.ScoresModel

class MatchViewModel {
    var teamAName: String
    var teamBName: String
    var teamAScore: String
    var teamBScore: String

    constructor(teamAName: String, teamBName: String, teamAScore: String, teamBScore: String) {
        this.teamAName = teamAName
        this.teamBName = teamBName
        this.teamAScore = teamAScore
        this.teamBScore = teamBScore
    }

    companion object {
        fun convert(matches: List<ScoresModel.Match>): List<MatchViewModel> {
            var result: MutableList<MatchViewModel> = ArrayList()
            matches.forEach {
                result.add(it.team_A_name?.let { it1 -> MatchViewModel(it1,
                    it.team_B_name!!, it.fs_A!!, it.fs_B!!) }!!)
            }

            return result
        }
    }
}