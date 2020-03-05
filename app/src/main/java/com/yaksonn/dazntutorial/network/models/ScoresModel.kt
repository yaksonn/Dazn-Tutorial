package com.yaksonn.dazntutorial.network.models

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "gsmrs")
class ScoresModel {

    @Element(name = "method", required = false)
    var method: Method? = null

    @Attribute(name = "last_generated", required = false)
    var last_generated: String? = null

    @Element(name = "competition", required = false)
    var competition: Competition? = null

    @Attribute(name = "lang", required = false)
    var lang: String? = null

    @Attribute(name = "version", required = false)
    var version: String? = null

    @Attribute(name = "sport", required = false)
    var sport: String? = null

    class Method {

        @Attribute(name = "method_id", required = false)
        var method_id: String? = null

        @ElementList(name = "parameter", required = false, entry = "parameter", inline = true)
        var parameter: List<Parameter>? = null

        @Attribute(name = "name", required = false)
        var name: String? = null

    }

    class Parameter {

        @Attribute(name = "name", required = false)
        var name: String? = null

        @Attribute(name = "value", required = false)
        var value: String? = null
    }

    class Competition {
        @Attribute(name = "area_name", required = false)
        var area_name: String? = null

        @Attribute(name = "last_updated", required = false)
        var last_updated: String? = null

        @Attribute(name = "competition_id", required = false)
        var competition_id: String? = null

        @Attribute(name = "name", required = false)
        var name: String? = null

        @Attribute(name = "display_order", required = false)
        var display_order: String? = null

        @Element(name = "season", required = false)
        var season: Season? = null

        @Attribute(name = "type", required = false)
        var type: String? = null

        @Attribute(name = "area_id", required = false)
        var area_id: String? = null

        @Attribute(name = "teamtype", required = false)
        var teamtype: String? = null

        @Attribute(name = "soccertype", required = false)
        var soccertype: String? = null
    }

    class Season {
        @Attribute(name = "end_date", required = false)
        var end_date: String? = null

        @Attribute(name = "last_updated", required = false)
        var last_updated: String? = null

        @Element(name = "round", required = false)
        var round: Round? = null

        @Attribute(name = "service_level", required = false)
        var service_level: String? = null

        @Attribute(name = "name", required = false)
        var name: String? = null

        @Attribute(name = "season_id", required = false)
        var season_id: String? = null

        @Attribute(name = "start_date", required = false)
        var start_date: String? = null
    }

    class Round {
        @Attribute(name = "end_date", required = false)
        var end_date: String? = null

        @Attribute(name = "round_id", required = false)
        var round_id: String? = null

        @Attribute(name = "last_updated", required = false)
        var last_updated: String? = null

        @Attribute(name = "name", required = false)
        var name: String? = null

        @Attribute(name = "has_outgroup_matches", required = false)
        var has_outgroup_matches: String? = null

        @Attribute(name = "groups", required = false)
        var groups: String? = null

        @Attribute(name = "type", required = false)
        var type: String? = null

        @Attribute(name = "start_date", required = false)
        var start_date: String? = null

        @ElementList(name = "group", required = false, entry = "group", inline = true)
        var group: List<Group>? = null

    }

    class Group {
        @Attribute(name = "last_updated", required = false)
        var last_updated: String? = null

        @Attribute(name = "winner", required = false)
        var winner: String? = null

        @Attribute(name = "group_id", required = false)
        var group_id: String? = null

        @Attribute(name = "name", required = false)
        var name: String? = null

        @ElementList(name = "match", required = false, entry = "match", inline = true)
        var match: List<Match>? = null

        @Attribute(name = "details", required = false)
        var details: String? = null
    }

    class Match {
        @Attribute(name = "fs_B", required = false)
        var fs_B: String? = null
        @Attribute(name = "time_utc", required = false)
        var time_utc: String? = null
        @Attribute(name = "ets_B", required = false)
        var ets_B: String? = null
        @Attribute(name = "last_updated", required = false)
        var last_updated: String? = null
        @Attribute(name = "ets_A", required = false)
        var ets_A: String? = null
        @Attribute(name = "date_london", required = false)
        var date_london: String? = null
        @Attribute(name = "match_id", required = false)
        var match_id: String? = null
        @Attribute(name = "team_B_name", required = false)
        var team_B_name: String? = null
        @Attribute(name = "time_london", required = false)
        var time_london: String? = null
        @Attribute(name = "ps_A", required = false)
        var ps_A: String? = null
        @Attribute(name = "ps_B", required = false)
        var ps_B: String? = null
        @Attribute(name = "date_utc", required = false)
        var date_utc: String? = null
        @Attribute(name = "winner", required = false)
        var winner: String? = null

        @Attribute(name = "team_A_id", required = false)
        var team_A_id: String? = null

        @Attribute(name = "team_B_id", required = false)
        var team_B_id: String? = null

        @Attribute(name = "hts_A", required = false)
        var hts_A: String? = null

        @Attribute(name = "team_A_name", required = false)
        var team_A_name: String? = null

        @Attribute(name = "team_B_country", required = false)
        var team_B_country: String? = null

        @Attribute(name = "gameweek", required = false)
        var gameweek: String? = null

        @Attribute(name = "hts_B", required = false)
        var hts_B: String? = null

        @Attribute(name = "team_A_country", required = false)
        var team_A_country: String? = null

        @Attribute(name = "status", required = false)
        var status: String? = null

        @Attribute(name = "fs_A", required = false)
        var fs_A: String? = null
    }


}