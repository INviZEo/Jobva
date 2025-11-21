package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetIntersection {
    public void searchDuplicate() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("e");

        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("a");
        hashSet2.add("t");
        hashSet2.add("l");
        hashSet2.add("c");

        hashSet.retainAll(hashSet2);
        System.out.println("Duplicate is: " + hashSet);
    }
}
