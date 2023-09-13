package com.practice.datastructure;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapOperation {

    public static int kthLargestElement(int k, int[] array){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int size = array.length;
        for (int i = 0; i < size; i++){
            minHeap.add(array[i]);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static int  kthSmallestElement(int  k, int [] array){
        PriorityQueue<Integer> maxHeap = new  PriorityQueue<>(Collections.reverseOrder());
        int  length = array.length;
        for  (int  i = 0; i < length; i++){
            maxHeap.add(array[i]);
            if  (maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        return  maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] array = {7, 10, 4, 3, 20, 15, 2};
        System.out.println(kthLargestElement(3, array));

    }
}
