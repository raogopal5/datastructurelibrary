package com.practice;


public class BinarySearchCustom {

 private int binarySearch(int a[],int x ){

     int l =0 ,r = a.length-1;

     while(l<=r){
        int m = l+(r-1)/2;
         if(a[m]==x){
             return x;
         }
         if(a[m]<x){
             l=m+1;
         }else{
             r=m-1;
         }

     }
     return -1;
 }
    public static void main(String args[])
    {
        BinarySearchCustom ob = new BinarySearchCustom();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }
}
