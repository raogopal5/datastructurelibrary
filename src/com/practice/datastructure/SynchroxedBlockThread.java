package com.practice.datastructure;

public class SynchroxedBlockThread {
    private static volatile SynchroxedBlockThread _instance;

    public static SynchroxedBlockThread getInstance() {
        if (_instance == null) {
            synchronized(SynchroxedBlockThread.class) {
                if (_instance == null)
                    _instance = new SynchroxedBlockThread();
            }
        }
        return _instance;
    }

}
