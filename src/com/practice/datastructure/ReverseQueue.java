package com.practice.datastructure;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> queue,int k){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<k;i++){
           stack.push(queue.remove());
        }
        for(int i=0;i<k;i++){
            queue.offer(stack.pop());
        }

        int count  = queue.size() -k;

        for(int i=0;i<k;i++){
            queue.offer(queue.remove());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        reverseQueue(queue,2);

    }
}
