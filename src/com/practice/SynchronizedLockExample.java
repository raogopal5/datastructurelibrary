package com.practice;

import java.util.concurrent.locks.Lock;

public class SynchronizedLockExample implements Runnable {

    private ResourceLock resource;

    public SynchronizedLockExample(ResourceLock r){
        this.resource = r;
    }

    @Override
    public void run() {
        synchronized (resource) {
            resource.doSomething();
        }
        resource.doLogging();
    }
}
