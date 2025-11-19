package org.example;

import java.util.ArrayList;
import java.util.List;

public class MergeLists {
    public void merge() {
        List<String> first = new ArrayList<>();
        first.add("Misha");
        first.add("Kirill");
        first.add("Gregory");
        List<String> second = new ArrayList<>();
        second.add("Klavdia");
        second.add("Masha");
        second.add("Raznie Stroki");

        List<String> third = new ArrayList<>(); // или new ArrayList<>(first)

        third.addAll(first); // Если с "или" тогда без этой записи
        third.addAll(second);
        System.out.println(third);
    }
}
