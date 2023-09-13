package com.practice;

public class FunctionInterfaceLambdaTest {

    public static void main(String args[]){

        CustomFunctionalInterface test2 = () -> {
            System.out.println("Display using Lambda Expression");
        };
        test2.display();
    }
}
