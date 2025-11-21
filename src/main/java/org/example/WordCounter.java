package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public void wordCount() {
        String[] words = {"dog", "cat", "dog", "bird", "cat", "dog"};
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}