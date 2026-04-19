package com.gla.Map;

import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        String[] inputVotes = {
                "A", "B", "A", "C", "B",
                "A", "C", "A", "B", "A"
        };
        for (String v : inputVotes) {
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }
        String winner = "";
        int max = 0;
        for (String candidate : votes.keySet()) {
            if (votes.get(candidate) > max) {
                max = votes.get(candidate);
                winner = candidate;
            }
        }
        System.out.println("Votes: " + votes);
        System.out.println("Winner: " + winner);
    }
}