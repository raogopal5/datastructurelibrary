package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationArraySumPrint {

    private static void recurseAdd(int currentIndex, Integer[] numbers, List<Integer> usedNumbers, int sum, int target) {
        if (currentIndex >= numbers.length) {
            return;
        }

        sum = sum + numbers[currentIndex];
        usedNumbers.add(numbers[currentIndex]);

        if (sum == target) {
            System.out.println(usedNumbers);
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = currentIndex + 1; i < numbers.length; i++) {
            recurseAdd(i, numbers, new ArrayList<>(usedNumbers), sum, target);
        }
    }

    public static void backtrack(int[] candidates, int remaining, int start, List<List<Integer>> result, List<Integer> temp) {
        if (remaining == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if (remaining < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);
            backtrack(candidates, remaining - candidates[i], i, result, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        int start = 0;

        backtrack(candidates, target, start, result, temp);

        return result;
    }

    public static  void main(String args[]){
        Integer[] numbers = { 1, 2, 1, 1, 1 };
        int target = 3;


        int[] numberss = { 2,3,5};
        int result = 7;

    /*    for(int i = 0; i < numbers.length; i++) {
            recurseAdd(i, numbers, new ArrayList<Integer>(), 0, target);
        }*/

        List<List<Integer>> s = combinationSum(numberss,result);
        System.out.println(s);

    }
}
