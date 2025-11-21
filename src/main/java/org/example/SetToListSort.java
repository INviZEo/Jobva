package org.example;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToListSort {
    public void setToList() {
        Set<Integer> set = new HashSet<>();
        set.add(13);
        set.add(7);
        set.add(3);
        set.add(189);
        set.add(5);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
