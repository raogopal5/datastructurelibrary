package com.practice.datastructure;

import java.util.HashMap;

public class GetCommonArrayElement {

    private void getCommonElement(int a[],int b[]){

        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<a.length;i++){
            map.put(a[i],1);
        }

        for(int i=0;i<b.length;i++){
            if(map.containsKey(b[i])){
                System.out.println(map.get(0));
            }
        }


    }

    public static void main(String[] args) {
        int a [] = {5,8,9,6,8,3,6,4};
        int b [] = {15,8,19,6,8,3,6,14};
    }


}
