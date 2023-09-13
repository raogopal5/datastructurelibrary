package com.practice.datastructure;

public class LinkedListUsingQueue{

    public LinkedListUsingQueue next;
    public int data;


    public LinkedListUsingQueue(){
        next = null;
        data = Integer.MIN_VALUE;
    }

    // Creates a node storing the specified data.
    public LinkedListUsingQueue (int data){
        next = null;
        this.data = data;
    }

    // Returns the node that follows this one.
    public LinkedListUsingQueue getNext(){
        return next;
    }

    // Sets the node that follows this one.
    public void setNext (LinkedListUsingQueue node){
        next = node;
    }

    // Returns the data stored in this node.
    public int getData(){
        return data;
    }

    // Sets the data stored in this node.
    public void setdata (int elem){
        data = elem;
    }

    // Sets the data stored in this node.
    public String toString (){
        return Integer.toString(data);
    }
}




