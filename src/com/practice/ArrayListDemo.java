package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {

    public static void main(String args[]){

        List<String> listString = new ArrayList<>();
        listString.add("Gopal");
        listString.add("Rao");
        listString.add("Anu");

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);

        int maxNumber = listInteger.stream().max(Integer::compare).get();
        List graterFilter = listInteger.stream().filter(d-> d >2).collect(Collectors.toList());
        System.out.println("greater than filter " +graterFilter);

        int minNumber = listInteger.stream().min(Integer::compare).get();
        listInteger.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(maxNumber);


       long a =  listString.stream().count();
        System.out.println(a);
        listString.stream().filter(s ->s.contains("Rao")).collect(Collectors.toList());
        listString.stream().filter(s ->s.equals("Rao")).collect(Collectors.toList());

    }
}
