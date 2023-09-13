package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateList {

    int a[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
    int j=0;
    int n= a.length;


    private  int removeDuplicate(int a[],int n ){
        if (n == 0 || n == 1) {
            return n;
        }
        for(int i=0;i<a.length-1;i++){

            if(a[i]!=a[i+1]){
                a[j++] = a[i];
            }
            a[j++]=a[n-1];

        }
        return j;
    }

    public static void main(String[] args) {
        List<Integer> listOfInt = Arrays.asList(211,315,189,189,25,98,98,29,25);
        Set<Integer> set = new HashSet<>();
        listOfInt.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);

        List<Integer> s = listOfInt.stream()
                .filter(n -> !set.add(n))
                .collect(Collectors.toList());

        List<Integer> listAfterDuplicate = listOfInt.stream().distinct().collect(Collectors.toList());

        System.out.println("print duplicate ::" +s);
        System.out.println("print list after duplicate ::" +s);

        List <Integer> intList = listOfInt.stream().distinct().collect(Collectors.toList());
        System.out.println(intList);
        int a[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
        int j=0;
        int n= a.length;
        Set<Integer>setToRemoveDuplicate = new HashSet<>();
       
        for(int i=0;i<a.length-1;i++){
            setToRemoveDuplicate.add(a[i]);
            
        }
        RemoveDuplicateList removeDuplicateList = new RemoveDuplicateList();
        int removeNumberArray = removeDuplicateList.removeDuplicate(a,n);
        System.out.println("removeNumberArray" +removeNumberArray);
        System.out.println("setToRemoveDuplicate" + setToRemoveDuplicate);

       
    }

}
