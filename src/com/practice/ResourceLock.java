package com.practice;

public class ResourceLock {
        public void doSomething(){
            //do some operation, DB read, write etc
        }

        public void doLogging(){
            //logging, no need for thread safety
        }
}
