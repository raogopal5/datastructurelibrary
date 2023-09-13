package com.practice;

public class CustomSumLambdaExample {

    public static void main(String args[]){

        SumLambda sumLambda = (x,y) -> {
            return  x+y;
        };

        int suml = sumLambda.sum(7,7);
        System.out.println(suml);
    }
}
