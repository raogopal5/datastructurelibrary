package com.practice.threadd;

import java.util.concurrent.Callable;

public class ThreadByCollable implements Callable {


    @Override
    public Object call() throws Exception {
        System.out.println("hi");
        return true;
    }


    public static void main(String[] args) {
        ThreadByCollable threadByCollable = new ThreadByCollable();
        Thread t1 = new Thread();
        t1.start();
    }
}
