package api.CricLiveScores.Service;

import api.CricLiveScores.Entity.Match;

import java.util.List;

public interface MatchService {

    List<Match> getAllMatches();
    List<Match> getLiveMatchScores();
    List<List<String>> getCWC2023PointTable();
    List<Match> getSideBarNews();

}
