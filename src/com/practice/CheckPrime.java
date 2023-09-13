package com.practice;

public class CheckPrime {

    private static Boolean isCheckPrime(int num){
        for( int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        boolean checkPrime = isCheckPrime(4);
        System.out.println(checkPrime);
    }
}
