package com.practice.datastructure;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueOperation {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(22);
        queue.offer(23);
        queue.offer(24);
        queue.offer(25);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.size());
    }
}
