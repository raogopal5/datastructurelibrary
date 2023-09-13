package com.practice;

public class Person {

    private int age;
    private double height;
    private String name;

    public Person(int age, double height, String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}
