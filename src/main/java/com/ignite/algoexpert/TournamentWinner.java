package com.ignite.algoexpert;

import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.Map;

public class TournamentWinner {

    public static String winner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> teamWinCount = Maps.newHashMap();
        String currentBestTeam = "";
        for(int i = 0 ; i < competitions.size() ; i++) {
            String teamName = results.get(i) == 1 ? competitions.get(i).get(0) : competitions.get(i).get(1);
            if (teamWinCount.getOrDefault(teamName, -1) == -1) {
                teamWinCount.put(teamName, 1);
            } else {
                int winCount = teamWinCount.get(teamName);
                winCount++;
                teamWinCount.put(teamName, winCount);
            }
            if (teamWinCount.get(currentBestTeam) == null || teamWinCount.get(currentBestTeam) < teamWinCount.get(teamName)) {
                currentBestTeam = teamName;
            }
        }
        return currentBestTeam;
    }
}
