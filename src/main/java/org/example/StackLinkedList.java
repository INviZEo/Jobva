package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackLinkedList {
    public void stack() {
        LinkedList<Integer> list = new LinkedList<>();
        list.push(1);
        list.push(2);
        list.push(3);
        System.out.println(list.pop());
    }
}
