package com.practice;

import java.util.Arrays;

public class ManMaxArray {

    public static void  main(String args[]){

        int a [] ={34,32,42};

        Arrays.sort(a);

        System.out.println("min " + a[0] + "->  " + "max" + a[a.length-1]);
    }
}
