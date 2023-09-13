package com.practice.generics;

public class GenericExample<T,U> {

    T obj1;
    U obj2;

    public GenericExample(T obj1,U obj2){
        this.obj1=obj1;
        this.obj2=obj2;

    }

    private void print(){
        System.out.println(obj1);
        System.out.println(obj2);

    }


    public static void main(String[] args) {
        GenericExample genericExample = new GenericExample("Hi",34);
        genericExample.print();
    }


}
