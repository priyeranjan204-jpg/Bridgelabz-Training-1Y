package com.gla.Map;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
}
