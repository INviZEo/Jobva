package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SetToListSort {
    public void setToList() {
        HashSet<Integer> set = new HashSet<>();
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
