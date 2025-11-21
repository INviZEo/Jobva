package org.example;

import java.util.Set;
import java.util.TreeSet;

public class BookSetDemo {
    public void checkYearOfBook() {
        Set<Book> treeSet = new TreeSet<>();
        treeSet.add(new Book("Dos", 1481));
        treeSet.add(new Book("Kostry", 1777));
        treeSet.add(new Book("Slava", 2025));
        treeSet.add(new Book("Scream", 1512));
        treeSet.add(new Book("Ono", 2015));
        System.out.println(treeSet);
    }
}
