package org.example;

import java.util.Deque;
import java.util.LinkedList;

public class StackLinkedList {
    public void stack() {
        Deque<Integer> list = new LinkedList<>();
        list.push(1);
        list.push(2);
        list.push(3);
        System.out.println(list.pop());
    }
}
