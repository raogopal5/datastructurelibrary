package com.practice.datastructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonInTwoArray {
    private static void FindCommonElement(String[] arr1,
                                         String[] arr2)
    {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr1
                = { "Article", "in", "Geeks", "for", "Geeks" };

        // create Array 2
        String[] arr2 = { "Geeks", "for", "Geeks" };

        // print Array 1
        System.out.println("Array 1: "
                + Arrays.toString(arr1));

        // print Array 2
        System.out.println("Array 2: "
                + Arrays.toString(arr2));

        System.out.print("Common Elements: ");
        FindCommonElement(arr1, arr2);
    }
}
