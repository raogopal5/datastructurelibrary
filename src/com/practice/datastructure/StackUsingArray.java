package com.practice.datastructure;

public class StackUsingArray {

    private int maxCapacity;
    private int top;

    private int value;

    private Object stackArray[];

    public StackUsingArray(int value){
        this.value=value;
        stackArray = new subArrayOfArray[value];
    }

    private boolean isFull(){
        return ( top == maxCapacity-1);
    }

    private void insert(int value){
        if(isFull()){
            System.out.println("Stack is empty");
            return;
        }
        top ++;
        stackArray[top] = value;

    }

    private Object pop(int value){
        if(isFull()){
            System.out.println("Stack is empty");
            return null;
        }
        int oldTop = top;
        top --;
        stackArray[oldTop] = null;
        return stackArray[top];

    }

    @Override
    public String toString() {
        return "Stack "+stackArray.toString();
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray(4);
        stackUsingArray.insert(2);
        stackUsingArray.insert(3);
        System.out.println(stackUsingArray);
    }


}
