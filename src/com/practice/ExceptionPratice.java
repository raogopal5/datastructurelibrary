package com.practice;

import java.util.HashMap;
import java.util.Map;

public class ExceptionPratice {

    public static void main(String[] args) {


        Map<Object,String> map = new HashMap<>();
        Employee e  = new Employee("g","g","g",232);

        map.put(e,"a");
        e =null;
        map.put(e,"b");

        System.out.println(map.size());
        System.out.println(map.get(e));



            try {

                System.out.println("hi");
                System.exit(0);
            }catch (Exception ex){
                System.out.println("exception");
            }finally {
                System.out.println("final");
            }



    }

}
