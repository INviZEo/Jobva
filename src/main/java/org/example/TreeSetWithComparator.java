package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithComparator {
    public void reverse() {
        Set<String> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add("Karina");
        treeSet.add("Sasha");
        treeSet.add("Angela");
        treeSet.add("David");
        System.out.println(treeSet);
    }
}
