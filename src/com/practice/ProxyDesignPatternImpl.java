package com.practice;

public class ProxyDesignPatternImpl implements ProxyDesignPatternInterface{
    @Override
    public void runCommand(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
