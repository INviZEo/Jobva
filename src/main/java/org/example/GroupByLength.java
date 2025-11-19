package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByLength {
    public void group() {
        String[] words = {"hi", "hello", "hey", "hola", "yo", "bonjour"};
        Map<Integer, List<String>> map = new HashMap<>();
        for (String word : words) {
            int length = word.length();
            map.computeIfAbsent(length, k -> new ArrayList<>()).add(word);
        }
        System.out.println(map);
    }
}
