package com.practice.datastructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringRangeLies {

    public static void main(String[] args) {

        String s = "Rama";
        Character input = s.charAt(0);

        if(input >='A'  && input<='O'){
            System.out.println("yes");

        }else{
            System.out.println("false");
        }

        List<String> names = Arrays.asList("Punith, Rajput, Hena, Vimal, Rama, Muhammed, Anitha");

        List<String> sectionBwAAndO = names.stream().filter(input1 -> input1.charAt(0) >='A'  && input1.charAt(0)<='O').collect(Collectors.toList());
        List<String> sectionBwPAndZ = names.stream().filter(input1 -> input1.charAt(0) >='P' && input1.charAt(0) <='Z').collect(Collectors.toList());

        Map<String,List<String>> sectionByName =  new HashMap<>();
        sectionByName.put("A",sectionBwAAndO);
        sectionByName.put("B",sectionBwAAndO);

        System.out.println(sectionBwAAndO);
        System.out.println(sectionBwPAndZ);


    }









}
