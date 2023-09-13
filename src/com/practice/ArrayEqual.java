package com.practice;

import java.util.Arrays;

public class ArrayEqual {

    private Boolean checkEqual(int a[],int b[]){

        if(a.length != b.length || a == null || b == null){
            return false;
        }
        for(int i=0;i< a.length;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){

        ArrayEqual arrayEqual = new ArrayEqual();
        int a[] = {2,3,5,6};
        int b[] = {2,3,5,6};
       Boolean check =  arrayEqual.checkEqual(a,b);
       //by utility

       Boolean checkByUtil =  Arrays.equals(a,b);

       System.out.println(check);
       System.out.println("checkByUtil " + checkByUtil);
    }
}
