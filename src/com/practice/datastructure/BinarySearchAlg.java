package com.practice.datastructure;

public class BinarySearchAlg {

    private static int recursiveBinarySearch(int sortedArray[],int key,int low ,int high){
        int mid = low + (high-low)/2;
        if(high <low){
            return -1;
        }
        if(key==sortedArray[mid]){
            return mid;
        }else if(key < sortedArray[mid]){

            return recursiveBinarySearch(sortedArray,key,low,mid-1);
        }else{
            return recursiveBinarySearch(sortedArray,key,mid+1,high);
        }

    }

    public static void main(String[] args) {
        int sortedArray [] = {1,4,3,7,8};
        int index = recursiveBinarySearch(sortedArray,3,1,7);
        System.out.println(index);

    }
}
