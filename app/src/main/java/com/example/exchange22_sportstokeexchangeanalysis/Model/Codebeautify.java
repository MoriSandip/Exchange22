package com.example.exchange22_sportstokeexchangeanalysis.Model;

import java.util.ArrayList;

public class Codebeautify {

        Results ResultsObject;


        // Getter Methods

        public Results getResults() {
            return ResultsObject;
        }

        // Setter Methods

        public void setResults(Results resultsObject) {
            this.ResultsObject = resultsObject;
        }

        public class Results {
        Fixture FixtureObject;
        Live_details Live_detailsObject;


        // Getter Methods

        public Fixture getFixture() {
            return FixtureObject;
        }

        public Live_details getLive_details() {
            return Live_detailsObject;
        }

        // Setter Methods

        public void setFixture(Fixture fixtureObject) {
            this.FixtureObject = fixtureObject;
        }

        public void setLive_details(Live_details live_detailsObject) {
            this.Live_detailsObject = live_detailsObject;
        }
    }
    public class Live_details {
        Match_summary Match_summaryObject;
        Officials OfficialsObject;
        ArrayList < Object > scorecard = new ArrayList < Object > ();
        Stats StatsObject;
        Teamsheets TeamsheetsObject;


        // Getter Methods

        public Match_summary getMatch_summary() {
            return Match_summaryObject;
        }

        public Officials getOfficials() {
            return OfficialsObject;
        }

        public Stats getStats() {
            return StatsObject;
        }

        public Teamsheets getTeamsheets() {
            return TeamsheetsObject;
        }

        // Setter Methods

        public void setMatch_summary(Match_summary match_summaryObject) {
            this.Match_summaryObject = match_summaryObject;
        }

        public void setOfficials(Officials officialsObject) {
            this.OfficialsObject = officialsObject;
        }

        public void setStats(Stats statsObject) {
            this.StatsObject = statsObject;
        }

        public void setTeamsheets(Teamsheets teamsheetsObject) {
            this.TeamsheetsObject = teamsheetsObject;
        }
    }
    public class Teamsheets {
        ArrayList < Object > home = new ArrayList < Object > ();
        ArrayList < Object > away = new ArrayList < Object > ();


        // Getter Methods



        // Setter Methods


    }
    public class Stats {
        private String current_run_rate;
        private String min_remaining_overs;
        private String partnership_player_1;
        private float partnership_player_1_runs;
        private float partnership_player_1_balls;
        private String partnership_player_2;
        private float partnership_player_2_runs;
        private float partnership_player_2_balls;
        private String partnership_run_rate;
        private String partnership_overs;
        private float partnership_runs;
        ArrayList < Object > last_18_balls = new ArrayList < Object > ();
        private String last_update;


        // Getter Methods

        public String getCurrent_run_rate() {
            return current_run_rate;
        }

        public String getMin_remaining_overs() {
            return min_remaining_overs;
        }

        public String getPartnership_player_1() {
            return partnership_player_1;
        }

        public float getPartnership_player_1_runs() {
            return partnership_player_1_runs;
        }

        public float getPartnership_player_1_balls() {
            return partnership_player_1_balls;
        }

        public String getPartnership_player_2() {
            return partnership_player_2;
        }

        public float getPartnership_player_2_runs() {
            return partnership_player_2_runs;
        }

        public float getPartnership_player_2_balls() {
            return partnership_player_2_balls;
        }

        public String getPartnership_run_rate() {
            return partnership_run_rate;
        }

        public String getPartnership_overs() {
            return partnership_overs;
        }

        public float getPartnership_runs() {
            return partnership_runs;
        }

        public String getLast_update() {
            return last_update;
        }

        // Setter Methods

        public void setCurrent_run_rate(String current_run_rate) {
            this.current_run_rate = current_run_rate;
        }

        public void setMin_remaining_overs(String min_remaining_overs) {
            this.min_remaining_overs = min_remaining_overs;
        }

        public void setPartnership_player_1(String partnership_player_1) {
            this.partnership_player_1 = partnership_player_1;
        }

        public void setPartnership_player_1_runs(float partnership_player_1_runs) {
            this.partnership_player_1_runs = partnership_player_1_runs;
        }

        public void setPartnership_player_1_balls(float partnership_player_1_balls) {
            this.partnership_player_1_balls = partnership_player_1_balls;
        }

        public void setPartnership_player_2(String partnership_player_2) {
            this.partnership_player_2 = partnership_player_2;
        }

        public void setPartnership_player_2_runs(float partnership_player_2_runs) {
            this.partnership_player_2_runs = partnership_player_2_runs;
        }

        public void setPartnership_player_2_balls(float partnership_player_2_balls) {
            this.partnership_player_2_balls = partnership_player_2_balls;
        }

        public void setPartnership_run_rate(String partnership_run_rate) {
            this.partnership_run_rate = partnership_run_rate;
        }

        public void setPartnership_overs(String partnership_overs) {
            this.partnership_overs = partnership_overs;
        }

        public void setPartnership_runs(float partnership_runs) {
            this.partnership_runs = partnership_runs;
        }

        public void setLast_update(String last_update) {
            this.last_update = last_update;
        }
    }
    public class Officials {
        private String umpire_1;
        private String umpire_2;
        private String umpire_tv;
        private String referee;
        private String umpire_reserve;


        // Getter Methods

        public String getUmpire_1() {
            return umpire_1;
        }

        public String getUmpire_2() {
            return umpire_2;
        }

        public String getUmpire_tv() {
            return umpire_tv;
        }

        public String getReferee() {
            return referee;
        }

        public String getUmpire_reserve() {
            return umpire_reserve;
        }

        // Setter Methods

        public void setUmpire_1(String umpire_1) {
            this.umpire_1 = umpire_1;
        }

        public void setUmpire_2(String umpire_2) {
            this.umpire_2 = umpire_2;
        }

        public void setUmpire_tv(String umpire_tv) {
            this.umpire_tv = umpire_tv;
        }

        public void setReferee(String referee) {
            this.referee = referee;
        }

        public void setUmpire_reserve(String umpire_reserve) {
            this.umpire_reserve = umpire_reserve;
        }
    }
    public class Match_summary {
        private String in_play;
        private String result;
        private String status;
        private String toss;
        private String home_scores;
        private String away_scores;


        // Getter Methods

        public String getIn_play() {
            return in_play;
        }

        public String getResult() {
            return result;
        }

        public String getStatus() {
            return status;
        }

        public String getToss() {
            return toss;
        }

        public String getHome_scores() {
            return home_scores;
        }

        public String getAway_scores() {
            return away_scores;
        }

        // Setter Methods

        public void setIn_play(String in_play) {
            this.in_play = in_play;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setToss(String toss) {
            this.toss = toss;
        }

        public void setHome_scores(String home_scores) {
            this.home_scores = home_scores;
        }

        public void setAway_scores(String away_scores) {
            this.away_scores = away_scores;
        }
    }
    public class Fixture {

        private float id;
        private float series_id;
        private String match_title;
        private String venue;
        private String start_date;
        private String end_date;
        ArrayList< Object > dates = new ArrayList < Object > ();
        Home HomeObject;
        Away AwayObject;


        // Getter Methods

        public float getId() {
            return id;
        }

        public float getSeries_id() {
            return series_id;
        }

        public String getMatch_title() {
            return match_title;
        }

        public String getVenue() {
            return venue;
        }

        public String getStart_date() {
            return start_date;
        }

        public String getEnd_date() {
            return end_date;
        }

        public Home getHome() {
            return HomeObject;
        }

        public Away getAway() {
            return AwayObject;
        }

        // Setter Methods

        public void setId(float id) {
            this.id = id;
        }

        public void setSeries_id(float series_id) {
            this.series_id = series_id;
        }

        public void setMatch_title(String match_title) {
            this.match_title = match_title;
        }

        public void setVenue(String venue) {
            this.venue = venue;
        }

        public void setStart_date(String start_date) {
            this.start_date = start_date;
        }

        public void setEnd_date(String end_date) {
            this.end_date = end_date;
        }

        public void setHome(Home homeObject) {
            this.HomeObject = homeObject;
        }

        public void setAway(Away awayObject) {
            this.AwayObject = awayObject;
        }
    }
    public class Away {
        private float id;
        private String name;
        private String code;


        // Getter Methods

        public float getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        // Setter Methods

        public void setId(float id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
    public class Home {
        private float id;
        private String name;
        private String code;


        // Getter Methods

        public float getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        // Setter Methods

        public void setId(float id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}
