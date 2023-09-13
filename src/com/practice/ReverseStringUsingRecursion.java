package com.practice;

public class ReverseStringUsingRecursion {

    private String reverseString(String str){
        String reverseString = null;
        if(str.isEmpty() || (str.length() <= 1)){
           return str;
        }else {
            reverseString = reverseString(str.substring(1)) + str.charAt(0);
            return reverseString;

        }
    }

    void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }


    public static void main(String args[]){
        ReverseStringUsingRecursion reverseStringUsingRecursion = new ReverseStringUsingRecursion();
       String reverse =  reverseStringUsingRecursion.reverseString("Gopal");
        System.out.println("reverse --" +reverse);
    }
}
