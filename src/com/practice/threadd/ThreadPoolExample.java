package com.practice.threadd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample implements  Runnable {


    @Override
    public void run() {
        System.out.println("Exector");
    }

    public static void main(String[] args) {
        ThreadPoolExample threadPoolExample = new ThreadPoolExample();

        ExecutorService executors = Executors.newFixedThreadPool(10);
        Thread t1 = new Thread(threadPoolExample);
        Thread t2 = new Thread(threadPoolExample);
        executors.execute(t1);
        executors.submit(t2);

    }

}
