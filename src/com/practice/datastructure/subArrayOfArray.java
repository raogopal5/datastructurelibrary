package com.practice.datastructure;


public class subArrayOfArray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};

        int si = 0;
        int ei = 0;
        int n = arr.length;

        for(si=0;si<n;si++){
            for(ei=si;ei<n;ei++){
                for(int k=si;k <=ei ;k++)
                    System.out.print(arr[k] + " ");
                    System.out.println("");
            }
        }
    }
}
