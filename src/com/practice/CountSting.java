package com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountSting {

    public static void main(String[] args) {

        HashMap<Character,Integer> hashMap = new HashMap<>();
        String demo  = "welcomewelcome";

        int count = 1;


        for(Character  s : demo.toCharArray()){

            if(hashMap.containsKey(s)){

                hashMap.put(s,hashMap.get(s)+count);
            }else{

                hashMap.put(s,count);
            }
        }

        System.out.println(hashMap);

        hashMap.entrySet().stream().forEach(System.out::println);
        for(Map.Entry<Character,Integer> cc : hashMap.entrySet()){
            cc.getKey();
            cc.getValue();
        }
    }
}
