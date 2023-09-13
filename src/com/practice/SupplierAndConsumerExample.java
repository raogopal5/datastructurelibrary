package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierAndConsumerExample {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee("h","g","m",556L);
        employeeList.add(employee);

        List<String> greets = Arrays.asList("Hi", "Hey", "Hello");


        Supplier<Integer> supplier =() -> 50;
        System.out.println(supplier.get());
        Consumer<String>  consumer  = (x) -> x.toLowerCase();

        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };


        greets.forEach(consumer1);
    }
}
