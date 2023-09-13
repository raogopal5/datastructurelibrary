package com.practice.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class CustomBinaryTreeDb {
    static class Node
    {
        Node left;
        Node right;
        int value;
        public Node(int value)
        {
            this.value = value;
        }
    }

    public void insert(Node node, int value)
    {
        if (value < node.value)
        {
            if (node.left != null)
            {
                insert(node.left, value);
            } else
            {
                System.out.println("  Inserted " + value + " to left of Node " + node.value);
                node.left = new Node(value);
            }
        }
        else if (value > node.value)
        {
            if (node.right != null)
            {
                insert(node.right, value);
            } else
            {
                System.out.println("  Inserted " + value + " to right of Node " + node.value);
                node.right = new Node(value);
            }
        }
    }



    public void run()
    {
        Node rootnode = new Node(25);
        System.out.println("Building tree with root value " + rootnode.value);
        System.out.println("=================================");
        insert(rootnode, 11);
        insert(rootnode, 15);
        insert(rootnode, 16);
        insert(rootnode, 23);
        insert(rootnode, 79);
    }

    public static void main(String[] args)
    {
        new CustomBinaryTreeDb().run();
    }
}
