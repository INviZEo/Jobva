package org.example;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetRanges {
    public void range() {
        SortedSet<Integer> treeSet = new TreeSet<>();
        for (int i = 1; i <= 20; i++) {
            treeSet.add(i);
        }
        System.out.println("Меньше 10 = " + treeSet.headSet(10));
        System.out.println("От и больше 10 = " + treeSet.tailSet(10));
        System.out.println("От 5 до 15 = " + treeSet.subSet(5,15));
    }
}
