package com.practice.datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IntersectionArray {


    public static void intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int i: nums1){
            set1.add(i);
        }

        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i: nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }

        int[] result = new int[set2.size()];
        int i=0;
        for(int n: set2){
            result[i++] = n;
        }

       for(int k:result){
           System.out.println(result[k]);
       }
    }

    public static void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            // update maxCount if count of
            // current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2
        // return the corresponding element
        if (maxCount > n / 2)
            System.out.println(arr[index]);

        else
            System.out.println("No Majority Element");
    }

    public static void findIntersection(int[] A, int[] B) {

        //Declare hashset
        HashSet<Integer> set1 = new HashSet();
        //Traverse an array, put each element in a set
        for(int val: A){
            set1.add(val);
        }

        /**
         Traverse second array values,
         Search the value in a set (set1),
         If element is found then print it.
         */
        for(int val: B){
            if(set1.contains(val)){
                System.out.println(val);
            }
        }
    }

    public static int findMajorityElement(int[] nums)
    {
        // create an empty `HashMap`
        Map<Integer, Integer> map = new HashMap<>();

        // store each element's frequency in a map
        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // return the element if its count is more than `n/2`
        for (Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if (entry.getValue() > nums.length/2) {
                return entry.getKey();
            }
        }

        // no majority element is present
        return -1;
    }

    private static void findMajority(int[] A)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                int count = map.get(A[i]) +1;
                if (count > A.length /2) {
                    System.out.println("Majority element is " + A[i]);
                    return;
                } else
                    map.put(A[i], count);

            }
            else
                map.put(A[i],1);
        }
        System.out.println("Majority element does not exist");
    }

    public static int majorityElement(int[] A) {
        HashMap<Integer,Integer> numFreq = new HashMap<>();
        for(int num : A) {
            if (!numFreq.containsKey(num)) {
                numFreq.put(num, 1);
            }
            else {
                numFreq.put(num, numFreq.get(num) + 1);
            }
            if (numFreq.get(num) > (A.length / 2))
                return num;
        }
        return -1;
    }




    public static void main(String[] args) {
        int A[] = {3, 8, 5, 8, 5, 3, 5, 10, 9, 1, 7, 5, 6, 0, 10, 7, 10, 2, 1, 0, 3, 9, 4, 6, 0, 3, 8, 5, 7, 4, 0, 3, 5, 8, 5, 7, 0, 9, 9, 6, 1, 0, 2, 2, 5, 1, 5, 0, 4};
        int B[] ={ 10, 10, 6, 1, 5, 2, 10, 0, 8, 0, 6, 10, 3};
        // intersection(A,B);
        int a1[] ={2,1,2};
        majorityElement(a1);
    }
}
