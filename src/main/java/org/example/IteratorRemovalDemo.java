package org.example;

import java.util.Iterator;
import java.util.LinkedList;


public class IteratorRemovalDemo {
    public void deleteByIterator() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> iterator = list.iterator();
        // list.removeIf(value -> value % 2 == 0); Или так (под капотом у removeIf итератор)

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
