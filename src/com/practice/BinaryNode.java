package com.practice;

public class BinaryNode {

    private  int value;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int value) {
        this.value = value;
        this.left=null;
        this.right=null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
}
