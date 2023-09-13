package com.practice;

public class SwitchTest {

    final static short i = 2;
    public static int j = 0;

    public static void main(String[] args) {
        for (int n = 0; n < 3; n++){
            switch (n){

                case i:
                    System.out.print(" 0 ");
                case i - 1:
                    System.out.print(" 1 ");
                case i - 2:
                    System.out.print(" 2 ");
            }
        }
}
}
