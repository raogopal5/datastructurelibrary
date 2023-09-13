package com.practice;




public class TestException {

    public static void method() throws Exception
    {
        try {
            throw new Exception();
        }
            finally {
        System.out.print("Finally ");
    }
    }
    public static void  main(String args[]){

        try
        {
            method();
        }
        catch (Exception e) {
            System.out.print("Exception ");
        }
        System.out.print("Finished");
    }

}
