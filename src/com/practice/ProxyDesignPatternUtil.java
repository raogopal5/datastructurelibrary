package com.practice;

// Provide a surrogate or placeholder for another object to control access to it. The definition itself is very clear and
// proxy design pattern is used when we want to provide controlled access of a functionality. Let’s say we have a
// class that can run some command on the system. Now if we are using it, its fine but if we want to give
// this program to a client application, it can have severe issues because client program can issue command
// to delete some system files or change some settings
// that you don’t want. Here a proxy class can be created to provide controlled access of the program.
public class ProxyDesignPatternUtil implements ProxyDesignPatternInterface {

    private  boolean isAdmin = false;
    private ProxyDesignPatternInterface proxyDesignPatternInterface;
    ProxyDesignPatternUtil(String userName,String password){

        if(userName.equals("Gopal") && password.equals("password")){
            isAdmin = true;
            proxyDesignPatternInterface = new ProxyDesignPatternImpl();
        }
    }


    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin){
            proxyDesignPatternInterface.runCommand(cmd);
        }else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                proxyDesignPatternInterface.runCommand(cmd);
            }
        }
    }
}
