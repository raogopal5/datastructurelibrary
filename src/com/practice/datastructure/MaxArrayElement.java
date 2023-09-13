package com.practice.datastructure;

public class MaxArrayElement {

    public static void main(String[] args) {

        int a[] = {3,6,9,0,2,9,1,17};

        int max  = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){

            if(a[i] > max){
                max = a[i];
            }
        }

        System.out.println("max " + max);
    }
}
