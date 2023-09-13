package com.practice.datastructure;

import java.util.Arrays;

public class CustomArrayList {

    private int size=0;
    private  int bucketSize=10;


    Object [] elements;


    public CustomArrayList(int bucketSize){
        elements = new Object[bucketSize];
    }


    private  void add(String value){

        if(size==bucketSize){
            ensureCapacity();
        }

        elements[size++] = value;
    }

    private void ensureCapacity(){

        int newSize = bucketSize * 2;
        elements = Arrays.copyOf(elements,newSize);

    }

    public String get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (String) elements[i];
    }

    public static void main(String[] args) {
      CustomArrayList customArrayList = new CustomArrayList(10);

      customArrayList.add("fhfhh");
      customArrayList.add("ghtrr");
        System.out.println(customArrayList.get(0));
    }
}
