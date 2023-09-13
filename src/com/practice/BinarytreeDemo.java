package com.practice;

public class BinarytreeDemo {

    private BinaryNode addNodeRecursive(BinaryNode current,int value){
        
        if(current ==null){
            return new BinaryNode(value);
            
        } else if (value <current.getValue()) {
            current.left = addNodeRecursive(current.left,value);
            
        }
        else if (value > current.getValue()) {
            current.right = addNodeRecursive(current.right,value);

        }else{
            return current;
        }
        return current;
    }

}
