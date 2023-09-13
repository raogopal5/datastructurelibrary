package com.practice.threadd;

public class ThreadByRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("hii");
    }


    public static void main(String[] args) {
        ThreadByRunnable threadByRunnable = new ThreadByRunnable();
        Thread t1 = new Thread(threadByRunnable);
        Thread t2 = new Thread(threadByRunnable);
        t1.start();
        t2.start();
    }
}
