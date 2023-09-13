package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExampleCount {

    public static void main(String args[]){

        Employee employee = new Employee("gopal","engg1","m",500l);
        Employee employee1 = new Employee("gopal1","engg","m",1500l);
        Employee employee2 = new Employee("gopal1","engg","m",700l);
        Employee employee3 = new Employee("gopal1","engg","m",800l);
        Employee employee4 = new Employee("gopal1","engg","m",900l);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        Map<String,Map<String,Long>> groupMapCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getDesignation,Collectors.groupingBy(Employee::getGender,Collectors.counting())));
        System.out.println(groupMapCount);
        Map<String ,Long> groupByCountName = employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
        System.out.println(groupByCountName);
    }
}
