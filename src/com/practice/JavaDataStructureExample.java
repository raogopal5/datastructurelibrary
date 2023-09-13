package com.practice;

import java.util.*;
import java.util.stream.Collectors;

public class JavaDataStructureExample {

    public static void main(String[] args) {


        HashMap<String, HashMap<String, LinkedList<Integer>>> lotteryMap =  new HashMap<>();

        HashMap<String, LinkedList<Employee>> lotteryMap1 =  new HashMap<>();



        HashMap<String, LinkedList<Integer>>  lotteryValue = new HashMap<>();

        LinkedList<Integer> list = new LinkedList();
        LinkedList<Employee> list1 = new LinkedList();
        list.add(30);
        list.add(10);
        list.add(40);

        lotteryValue.put("Gopal",list);

        lotteryMap.put("Golden",lotteryValue);




        Map<String,Long> countMap = list1.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));

        System.out.println(countMap);








    }
}
