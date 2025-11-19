package org.example;

import java.util.LinkedList;

public class QueueLinkedList {
    public void queue() {
        LinkedList<Integer> list = new LinkedList<>();
        list.offer(1);
        list.offer(2);
        list.offer(3);
        System.out.println(list.poll());
    }
}
