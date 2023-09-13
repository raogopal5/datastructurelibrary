package com.practice;

public class ThreadExample {

      public synchronized void printTable(int n){
          for(int i=0;i<=10;i++){
              System.out.println(n * i);
                  try {
                      Thread.sleep(500);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
          }

      }

}
