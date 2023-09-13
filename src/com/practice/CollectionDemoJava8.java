package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CollectionDemoJava8 {

    public static void main(String[] args) {

        List<ArrayList<Integer>>  l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(23);
        l2.add(25);
        l2.add(26);
        l1.add(l2);

        List<String> list = Arrays.asList("Geeks", "GFG",
                "GeeksforGeeks", "gfg");

        list.stream().flatMap(l -> Stream.of(l.charAt(2))).forEach(System.out::println);
        l1.stream().flatMap(s ->Stream.of(s)).forEach(System.out::println);
        l1.stream().map(Collection::stream).forEach(System.out::println);
    }
}
