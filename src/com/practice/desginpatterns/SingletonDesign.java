package com.practice.desginpatterns;

public class SingletonDesign {

    private static SingletonDesign instance;
    private String value;

    private SingletonDesign(String value){
              this.value=value;
    }

    private static  synchronized SingletonDesign getInstance(String value) {
        if (instance == null) {
            return new SingletonDesign(value);
        }
        return instance;
    }

}
