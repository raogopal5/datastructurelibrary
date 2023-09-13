package com.practice;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaEightFeatures {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3,4,23,32,52));
        ArrayList<String> arrayListString = new ArrayList<>(Arrays.asList("AB","CD","AE","GH","AC","CE"));
        List<Person> personList = new ArrayList<>();

        Predicate<Integer> predicateGreaterThan20 = (i) -> i >20;
        Predicate<Integer> predicateGreaterThan10 = (i) -> i >10;

        Predicate<String> startWithA = (i) -> i.startsWith("A");
        Predicate<String> startWithC = (i) -> i.startsWith("A");

        arrayList.stream().sorted(Collections.reverseOrder());
        Comparator<Employee> byNameSort = (x,y) -> x.getName().compareTo(y.getName());
        Comparator<Employee> bySalary =(l,r) -> Long.compare(l.getSalary(), r.getSalary());



        List<String> predicteOrResult = arrayListString.stream().filter(startWithA.or(startWithC)).collect(Collectors.toList());
        List<String> predicteOrResult1 = arrayListString.stream().filter(startWithA.and(startWithC)).collect(Collectors.toList());
        System.out.println(predicteOrResult1);

        arrayList.stream().filter(predicateGreaterThan10);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.stream().sorted(byNameSort.thenComparing(bySalary)).forEach(System.out::println);
        Map<String,Long> mapCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getDesignation,Collectors.counting()));
        employeeList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        personList.stream().sorted(Comparator.comparing(Person::getHeight).thenComparing(Person::getHeight).reversed())
                .map(Person::getName).collect(Collectors.joining(","));
        arrayList.stream().filter(i -> i >20).forEach(System.out::println);

        personList.stream().sorted(Comparator.comparing(Person::getHeight).thenComparing(Person::getHeight).reversed()).collect(Collectors.toList());

    }
}
