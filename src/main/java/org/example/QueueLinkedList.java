package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public void queue() {
        Queue<Integer> list = new LinkedList<>();
        list.offer(1);
        list.offer(2);
        list.offer(3);
        System.out.println(list.poll());
    }
}
