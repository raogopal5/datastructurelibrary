package com.practice.datastructure;

import java.util.LinkedList;

public class QueueUsingLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        //Two way approach
        //add at first node and remove form last node
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addFirst(40);
        System.out.println( linkedList.removeLast());
        System.out.println( linkedList.removeLast());

        //add at last node and remove form first node
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        System.out.println( linkedList.removeFirst());
        System.out.println( linkedList.removeFirst());

    }
}
