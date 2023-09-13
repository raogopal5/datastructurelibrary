package com.practice.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseStackExample {

    private static Stack<Integer> reverseStack(Stack<Integer> stack){

        Queue<Integer> queue = new LinkedList<>();

        while (!stack.isEmpty()){

            queue.add(stack.pop());
        }

        while (!queue.isEmpty()){

            stack.add(queue.remove());
        }

        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        reverseStack(stack);
        System.out.println(stack);

    }
}
