package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample {

    public static void main(String args[]){

        Map<String ,Long> mapExample = new HashMap<>();
        mapExample.put("gopal",200l);
        mapExample.put("gopal1",2300l);
        mapExample.put("gopal2",2003l);
        mapExample.put("gopal3",2030l);
        mapExample.entrySet().forEach(stringLongEntry -> System.out.println(stringLongEntry));
        mapExample.entrySet().stream().forEach(stringLongEntry -> System.out.println(stringLongEntry));
        //only key
        mapExample.keySet().stream().forEach(printValue ->System.out.println(printValue));
        for(Map.Entry<String,Long> mapData : mapExample.entrySet()){
          System.out.println(mapData.getKey() + "::" + mapData.getValue());
        }
    }

}
