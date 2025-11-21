package org.example;

import java.util.*;

public class GroupByFirstLetter {
    public void group() {
        Map<Character, List<String>> groups = new HashMap<>();

        String[] names = {
                "Анна", "Алексей", "Борис", "Бела", "Владимир",
                "Вера", "Сергей", "Соня", "Дарья", "Дмитрий",
                "елена", "Егор", "алекс", "Юлия", "юрий"
        };

        for (String name : names) {
            char firstLetter = Character.toUpperCase(name.charAt(0));
            groups.computeIfAbsent(firstLetter, k -> new ArrayList<>()).add(name);
        }

        List<Character> keys = new ArrayList<>(groups.keySet());
        Collections.sort(keys);

        for (Character ch : keys) {
            List<String> list = groups.get(ch);
            System.out.println(ch + " -> " + list);
        }
    }
}
