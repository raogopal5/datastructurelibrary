package com.practice;

public class TestPractice {

    public static void  main(String args[]){
        String s ="banana";
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                System.out.println(s.charAt(i));
                count++;

            }
        }

        System.out.println(count);
    }
}
