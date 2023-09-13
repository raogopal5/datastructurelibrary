package com.practice.datastructure;

public class RecursionAlgorithmExample {

     public static void printNumberUsingRecursion(int n){

         if(n==0){
             return ;
         }

         printNumberUsingRecursion(n-1);
         System.out.println(n);

     }

    public static void printElementFromArrayUsingRecursion(int [] arr,int i){

        if(i == arr.length){
            return ;
        }

        printElementFromArrayUsingRecursion(arr,i+1);
        System.out.println(arr[i]);

    }

    public static int printIndexFromArrayAfterMatchingUsingRecursion(int [] arr,int x,int i){

         if(i==arr.length){
             return -1;
         }
        if(arr[i]==x){
            return i;
        }else{
            int resultIndex = printIndexFromArrayAfterMatchingUsingRecursion(arr,x,i+1);
            //System.out.println(resultIndex);
            return  resultIndex;
        }
    }

    public static int printFactorial(int n){
         if(n==0){
             return 1;
         }
         int nminus1Fac = printFactorial(n-1);
         return n * nminus1Fac;

    }
    public static void main(String[] args) {
       //  printNumberUsingRecursion(9);
         int a [] ={45,56,65,34,33};
       // printElementFromArrayUsingRecursion(a,0);
        int indexFind  = printIndexFromArrayAfterMatchingUsingRecursion(a,34,0);
        System.out.println(indexFind);

        int fact = printFactorial(7);
        System.out.println("fact " + fact);

    }
}
