package com.practice;

public class FactorialP {


    private static  int printFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;

    }

    public static  void main(String args[]){

        int fact = FactorialP.printFactorial(3);
        System.out.println(fact);
    }
}
