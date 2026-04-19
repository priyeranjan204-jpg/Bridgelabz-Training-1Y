package com.gla.Map;

import java.util.*;

public class WebsiteTracker {
    public static void main(String[] args) {

        Map<String, Integer> visits = new HashMap<>();
        String[] pages = {
                "home", "about", "products", "home",
                "products", "contact", "home"
        };
        for (String page : pages) {
            visits.put(page, visits.getOrDefault(page, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(visits.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Sorted Pages:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("Most visited: " + list.get(0).getKey());
    }
}
