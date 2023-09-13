package com.practice.datastructure;

import java.util.LinkedList;

public class StakeUsingLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addFirst(40);
        linkedList.addFirst(50);

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeFirst());
    }
}
