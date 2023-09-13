package com.practice;

import java.util.Arrays;

public class ReverseArray {

    private void reverseArray(int a[],int start,int end){

        int temp;

        while(start < end){

            temp = a[start];
            a[start] =a[end];
            a[end] = a[temp];
            start++;
            end--;
        }
    }

    public static void  main(String args[]){

        int a [] ={34,32,42,12,23};
        int arr[] = {1, 2, 3, 4, 5, 6};
        ReverseArray  reverseArray  = new ReverseArray();
        reverseArray.reverseArray(arr,0,5);
        for(int i=0;i<a.length;i++){
            System.out.println("reverse array " + arr[i]);

        }
        System.out.println();
    }
}
