package com.practice.datastructure;

import java.util.Stack;

public class StackOperation {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(34);
        stack.push(33);
        stack.push(38);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
