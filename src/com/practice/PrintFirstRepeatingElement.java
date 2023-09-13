package com.practice;

import java.util.HashSet;

public class PrintFirstRepeatingElement {


    static void printFirstRepeating(int arr[]) {
        // Initialize index of first repeating element
        int min = -1;

        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();
        // Traverse the input array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // If element is already in hash set, update min
            if (set.contains(arr[i]))
                min = i;

            else // Else add element to hash set
                set.add(arr[i]);
        }
        if (min != -1) {
            System.out.println("first repeating element is " + arr[min]);
        } else {
            System.out.println("There is not repeating element is ");
        }
    }

    public static void main(String[] args)
            throws java.lang.Exception
    {
        int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
        printFirstRepeating(arr);
    }
}
