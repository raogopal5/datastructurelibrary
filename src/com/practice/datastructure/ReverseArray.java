package com.practice.datastructure;

public class ReverseArray {
    public static void main(String[] args) {

        //int a [] = {4,6,8,9,-1,4,7};
        int a [] =  {10,20,30,40,50} ;
        int count =0;

        int i =0;
        int n = a.length;
        int j = n-1;


        while(i<j){
        count++;
        int temp =a[i];
        a[i] = a[j];
        a[j] = temp;

        i++;
        j--;

        }
        System.out.println("count" +count);

        for(int k=0;k<a.length;k++){
            System.out.println("" + a[k]);
        }

    }
}
