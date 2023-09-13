package com.practice.datastructure;

public class TwoDArrayExample {

    public static void main(String[] args) {

        int a[][] = new int [5][6];

        //set value

        a[1][3] = 10;

        System.out.println("Value" + a[1][3]);
        System.out.println("Value without setting value : " + a[2][5]);

        System.out.println("row count  : " + a.length);

        System.out.println("column count  : " + a[0].length);

        for(int i=0;i<a.length;i++){ // row wise move
            for(int j=0;j<a[0].length;j++){ //column wise move

            }
        }
    }
}
