package com.practice;

public class SingletonDesignPatternDemo {

    private static SingletonDesignPatternDemo singletonDesignPatternDemo;

    private  SingletonDesignPatternDemo(){

    }

    private SingletonDesignPatternDemo createSingleton(SingletonDesignPatternDemo singletonDesignPatternDemo){

        if(singletonDesignPatternDemo ==null){
             singletonDesignPatternDemo = new SingletonDesignPatternDemo();
            return singletonDesignPatternDemo;
        }

        return singletonDesignPatternDemo;
    }

}
