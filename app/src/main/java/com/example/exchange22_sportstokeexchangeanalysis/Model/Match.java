package com.example.exchange22_sportstokeexchangeanalysis.Model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Match {public int unique_id;
    public Date date;
    public Date dateTimeGMT;
    @SerializedName("team-1")
    public String team1;
    @SerializedName("team-2")
    public String team2;
    public String toss_winner_team;
    public boolean squad;
    public boolean matchStarted;
    public String type;

    public int getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(int unique_id) {
        this.unique_id = unique_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateTimeGMT() {
        return dateTimeGMT;
    }

    public void setDateTimeGMT(Date dateTimeGMT) {
        this.dateTimeGMT = dateTimeGMT;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getToss_winner_team() {
        return toss_winner_team;
    }

    public void setToss_winner_team(String toss_winner_team) {
        this.toss_winner_team = toss_winner_team;
    }

    public boolean isSquad() {
        return squad;
    }

    public void setSquad(boolean squad) {
        this.squad = squad;
    }

    public boolean isMatchStarted() {
        return matchStarted;
    }

    public void setMatchStarted(boolean matchStarted) {
        this.matchStarted = matchStarted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

  class Provider{
    public String source;
    public String url;
    public Date pubDate;

      public String getSource() {
          return source;
      }

      public void setSource(String source) {
          this.source = source;
      }

      public String getUrl() {
          return url;
      }

      public void setUrl(String url) {
          this.url = url;
      }

      public Date getPubDate() {
          return pubDate;
      }

      public void setPubDate(Date pubDate) {
          this.pubDate = pubDate;
      }
  }

  class Root{
    public List<Match> matches;
    public String v;
    public int ttl;
    public Provider provider;
    public int creditsLeft;

      public List<Match> getMatches() {
          return matches;
      }

      public void setMatches(List<Match> matches) {
          this.matches = matches;
      }

      public String getV() {
          return v;
      }

      public void setV(String v) {
          this.v = v;
      }

      public int getTtl() {
          return ttl;
      }

      public void setTtl(int ttl) {
          this.ttl = ttl;
      }

      public Provider getProvider() {
          return provider;
      }

      public void setProvider(Provider provider) {
          this.provider = provider;
      }

      public int getCreditsLeft() {
          return creditsLeft;
      }

      public void setCreditsLeft(int creditsLeft) {
          this.creditsLeft = creditsLeft;
      }
  }
