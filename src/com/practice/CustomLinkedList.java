package com.practice;

import java.util.HashSet;

public class CustomLinkedList {

    Node head;
    public  void insertLinkedList(int data){
    Node newNode = new Node(data);
        if(this.head ==null){
            head= newNode;
        }else{
            Node currentNode = head;
            while (currentNode.getNextNode() !=null){
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }


    public void insertAt(int index,int data){

        Node nodeToBeInsert = new Node(data);
        Node node = head;
        for(int i=0;i<index-1;i++){
            node = node.getNextNode();
        }
        nodeToBeInsert.setNextNode(node.getNextNode());
        node.setNextNode(nodeToBeInsert);
    }

    //check circular linked list

    static boolean isCircularLinkedList(Node head) {

        if(head == null) {
            return Boolean.FALSE;
        }
        Node temp = head;
        do {
            temp = temp.getNextNode();
        } while(temp != null && temp != head);

        return (temp == head);
    }

    static boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            // If we have already has this node
            // in hashmap it means there is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(h)) {
                return true;
            }

            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);

            h = h.getNextNode() ;
        }

        return false;
    }


    public static void main(String args[]){


    }
}
