package com.practice.datastructure;

public class LinkedListUsingQueueImpl {

    private int length;
    private LinkedListUsingQueue front, rear;

    //  Creates an empty queue.
    public LinkedListUsingQueueImpl(){
        length = 0;
        front = rear = null;
    }

    //  Adds the specified data to the rear of the queue.
    public void enQueue (int data){
        LinkedListUsingQueue node = new LinkedListUsingQueue(data);
        if (isEmpty())
            front = node;
        else
            rear.setNext (node);
        rear = node;
        length++;
    }

    //  Removes the data at the front of the queue and returns a
    //  reference to it. Throws an Exception if the
    //  queue is empty.

    public int deQueue() throws Exception{
        if (isEmpty())
            throw new Exception ("queue");
        int result = front.getData();
        front = front.getNext();
        length--;
        if (isEmpty())
            rear = null;
        return result;
    }

    //  Returns a reference to the data at the front of the queue.
    //  The data is not removed from the queue.  Throws an
    //  Exception if the queue is empty.
    public int first() throws Exception{
        if (isEmpty())
            throw new Exception();

        return front.getData();
    }

    //  Returns true if this queue is empty and false otherwise.
    public boolean isEmpty(){
        return (length == 0);
    }

    //  Returns the number of elements in this queue.
    public int size(){
        return length;
    }

    //  Returns a string representation of this queue.
    public String toString(){
        String result = "";
        LinkedListUsingQueue current = front;
        while (current != null){
            result = result + current.toString() + "\n";
            current = current.getNext();
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        LinkedListUsingQueueImpl arrayQueue = new LinkedListUsingQueueImpl();
        arrayQueue.enQueue(10);
        arrayQueue.enQueue(20);
        arrayQueue.enQueue(30);
        arrayQueue.enQueue(40);
        arrayQueue.enQueue(50);
        arrayQueue.enQueue(60);
        arrayQueue.enQueue(70);
        arrayQueue.enQueue(80);
        arrayQueue.enQueue(90);
        arrayQueue.deQueue();
        System.out.println(arrayQueue.toString());
    }
}
