package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

        list.stream().map(n -> n *3).collect(Collectors.toList()).forEach(System.out::println);


    }
}
