package com.practice.datastructure;

import java.util.Arrays;

public class MaxMinElementInArray {

    public int sumOfMaxMinElement(int [] A){

        Arrays.sort(A);
        int sum = A[0] + A[A.length-1];
        return sum;
    }
    public static void main(String[] args) {

     MaxMinElementInArray maxMinElementInArray = new MaxMinElementInArray();
     int [] A = {-2, 1, -4, 5, 3};
        int [] B= {1, 3, 4, 1};
     int result = maxMinElementInArray.sumOfMaxMinElement(A);
     int result1 = maxMinElementInArray.sumOfMaxMinElement(B);
        System.out.println("result " + result);
        System.out.println("result1 :: " + result1);
    }
}
