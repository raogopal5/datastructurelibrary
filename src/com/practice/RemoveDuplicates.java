package com.practice;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {

        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] removeDuplicatesUsingForLoop(int[] arr) {
        Arrays.sort(arr);
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[k++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, k);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 2, 1, 2, 4, 5};

        int[] distinct = removeDuplicates(arr);
        System.out.println(Arrays.toString(distinct));
    }
}
