package com.practice.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListOperation {

    private static Boolean checkPrime(int n){
        Boolean result = false;
        int primeNumber = 0;
        if(n<1){
            return false;
        }
      for(int i=2;i<n;i++){
          if(n %i ==0){
              result=true;
          }
      }
        return result;
    }

    public static boolean isPrime(int number) {
        for (int i = 2 ; i < number ; i++) {
            if (number % i == 0) {
                return false; // number is divisible so its not prime
            }
        }
        return true; // number is prime now
    }

    private Integer checkPrimeNo(int n){
        int primeNumber = 0;
        if(n<1){
            return 0;
        }
        for(int i=2;i<n;i++){
            if(n %i ==0){
                primeNumber=i;
            }
        }
        return primeNumber;
    }

    public static  void removePrimeCorrect(ArrayList<Integer> A) {
        //List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        for(int i=A.size()-1;i>=0;i--){
            if(isPrime(i)){
                A.remove(i);
            }
        }
    }

    public static  void removeEven(ArrayList<Integer> A) {
        //List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        for(int i=A.size();i>0;i--){
            if(A.get(i) %2== 0){
                A.remove(i);
            }
        }
    }

    public static ArrayList<Integer> getListOfFactors(int number)
    {
        int i=0;
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for(i=2;i<=number-1;i++){
            if(number%i==0)
                factors.add(i);
        }
        Collections.sort(factors);
        return factors;
    }

    public static void removePrime1(int number[]) {

        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 0; i < number.length; i++) {
            for (int j = 2; j < number[i]; j++) {
                if (number[i] % j != 0)
                    factors.add(j);
            }

        }
        System.out.println(factors);
    }

    public  static  void checkPrimeNumbers(int arr[]) {
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {

            for (int i = 2; i < arr[j]; i++) {
                if (arr[j] % i == 0) {
                    list.add(arr[j]);
                }
            }

        }
}


    public static void main(String[] args) {

        int A [] ={3, 12, 13, 15};
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 12, 13, 15));
 /*       for(int i=0; i<list.size();i++){
            if(isPrime(i)){
                list.remove(i);
            }
        }*/
        /*ArrayList<Integer> Aw  = new ArrayList<>();
        Aw.add(3);
        Aw.add(12);
        Aw.add(13);
        Aw.add(15);
        removePrime(Aw);
        ArrayList<Integer> Aw1  = new ArrayList<>();
        Aw1.add(1);
        Aw1.add(2);
        Aw1.add(3);
        Aw1.add(4);
        Aw1.add(5);*/

        checkPrimeNumbers(A);


       // System.out.println(Aw1);
    }
}
