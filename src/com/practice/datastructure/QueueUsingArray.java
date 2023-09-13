package com.practice.datastructure;

public class QueueUsingArray {

    private int capacity;
    private int rare;
    private  int front;

    int queue[];

    public QueueUsingArray(int capacity){
        this.capacity= capacity;
        front=rare=0;
        queue = new int[capacity];
    }

    private void insert(int data){
        if(rare==capacity){
            System.out.println("queue is empty");
            return;
        }else{
            queue[rare] = data;
            rare++;
        }

    }

    private void display(){
        if(front==rare){
            System.out.println("queue is empty");
            return;
        }
        for(int i=front;i<=rare;i++){
            System.out.println("->" + queue[i]);
        }
    }

    private void frontDisplay(){
        if(front==rare){
            System.out.println("queue is empty");
            return;
        }

            System.out.println("->" + queue[front]);
    }

    public static void main(String[] args) {
        QueueUsingArray  queueUsingArray = new QueueUsingArray(5);
        queueUsingArray.insert(2);
        queueUsingArray.insert(3);
        queueUsingArray.insert(5);
        queueUsingArray.display();

    }
}
