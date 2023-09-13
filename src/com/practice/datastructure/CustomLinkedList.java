package com.practice.datastructure;

import java.util.HashMap;
import java.util.Map;

public class CustomLinkedList {

    private Node head;

    public CustomLinkedList(){
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            head = newNode;
        }else {
            Node currentNode = head;
            while(currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }

    public void insert1(int data){
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
        }else{
            Node currentNode = head;
            while(currentNode.getNextNode() !=null){
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }

    public void insertHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    public void insertAt(int index, int data){
        Node nodeToBeInserted = new Node(data);
        Node node = head;
        for(int i = 0; i< index -1; i++){
            node = node.getNextNode();
        }
        nodeToBeInserted.setNextNode(node.getNextNode());
        node.setNextNode(nodeToBeInserted);
    }

    public void deleteNodeAt(int index){
        Node node = head;
        for(int i = 0; i< index -1; i++){
            node = node.getNextNode();
        }
        node.setNextNode(node.getNextNode().getNextNode());
    }

    public void deleteNodeAt1(int index){
        Node temp = head;
        for(int i = 0; i< index -1; i++){
            temp = temp.getNextNode();
        }
        Node temp1 = temp.getNextNode().getNextNode();
        temp.nextNode = temp1;
    }

    public  int lengthOfNode(){
        int count =0;
        while(head !=null){
            count++;
            head = head.getNextNode();
        }
        return count;
    }

    public boolean searchElement(int k){

        Node temp = head;
        while(temp !=null){

            if(temp.getData()==k){
                return true;
            }
            temp = temp.getNextNode();
        }
        return false;
    }

    public void display(){
        if(head != null){
            Node currentNode = head;
            while(currentNode.getNextNode() != null){
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getData());
        }
    }

    public void findAndPrintMidData(){

        Node fastPointer = head;
        Node slowPointer = head;

        while(fastPointer !=null && fastPointer.getNextNode() !=null){
            fastPointer = fastPointer.getNextNode().getNextNode();
            slowPointer =  slowPointer.getNextNode();
        }
        System.out.println("middle of element is " + slowPointer.getData());
    }

    public Node reverse(){
        Node previous = null;
        Node current = head;
        Node next;
        while (current != null){
            next = current.getNextNode();
            current.setNextNode(previous);
            previous = current;
            current = next;
        }
        return previous;
    }

    public boolean checkLoop(){
        boolean loopExists = false;
        Map<Node, Integer> map = new HashMap<>();
        Node tempNode = head;
        while (tempNode != null){
            if(map.get(tempNode) == null){
                map.put(tempNode, 1);
            }else {
                map.put(tempNode, 2);
                loopExists = true;
                break;
            }
            tempNode = tempNode.getNextNode();
        }
        return loopExists;
    }

    public  void insertNodeAtEnd(int data){

        Node nodeToInsertAtEnd = new Node(data);

        if (head == null) {
            head = nodeToInsertAtEnd;
            return;
        }

        Node last = head;

        while(last.getNextNode() !=null){
            last =nodeToInsertAtEnd;
        }
       // last = nodeToInsertAtEnd;

    }


    public Node removeFirst(){
        if(head ==null){
            return null;
        }
        head = head.getNextNode();
        return head;
    }

    public Node removeLastNode (Node head){

        if(head == null){
            return null;

        }

        if(head.getNextNode() ==null){
            return null;
        }
        Node temp = head;

        while(temp.getNextNode().getNextNode()!=null){
            temp = temp.nextNode;

        }
        temp.nextNode =null;
        return head;
    }


    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.insert(22);
        customLinkedList.insert(23);
        customLinkedList.insert(24);
        customLinkedList.insert(25);
       // customLinkedList.display();
        customLinkedList.insertHead(21);
       // customLinkedList.display();
        customLinkedList.insertAt(3,28);
       // customLinkedList.display();
        Node headNode = new Node(22);

        customLinkedList.removeFirst();
        customLinkedList.display();
        int count =customLinkedList.lengthOfNode();
        System.out.println(count);
        boolean isExist = customLinkedList.searchElement(22);
        System.out.println("isexist " +isExist);
        customLinkedList.findAndPrintMidData();

    }
}
