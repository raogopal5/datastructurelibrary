package com.practice.datastructure;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildDemoException extends ParentDemoException{
    //In this example, the doThis() method throws few exceptions than the parent method and the doThat()
    // method throws a greater number of exceptions, however, the scope of the exceptions is not greater
    // than the parent exceptions. If we try to throw a checked exception that was not declared in the parent method
    // or we throw an exception that has a broader scope, then it results in a compilation error. For example,
    // the below code is not valid as the parent method throws a FileNotFoundException exception
    // and the child method throws IOException which is broader in scope as it is the parent class of FileNotFoundException:
    void doThis1() throws FileNotFoundException {
        // Compilation error because IOException is of broader scope than FileNotFoundException
    }

    void doThis() throws IOException {
        // Compilation error because IOException is of broader scope than FileNotFoundException
    }

    //Rule 1: If the parent class method is not throwing any exceptions,
    // then the overridden child class method should not throw checked exceptions. But it can throw an unchecked exception.

    @Override
    void doRule1() throws IllegalArgumentException {

    }

    //Rule2
    //Rule 2: If the parent class method is throwing one or more checked exceptions, then the overridden method
    // in the child class can throw any unchecked exceptions or any exceptions that are the same as checked exceptions of
    // the parent method or the subclasses of those checked exceptions. Consider the below example code:

    @Override
    void doThisRule2() throws IOException {
        // ...
    }

    @Override void doThatRule2() throws FileNotFoundException, EOFException {
        // ...
    }

    //Rule3
    //Rule 3: If the parent class method has a throws clause having unchecked exceptions,
    // then the overriding child method can throw any number of unchecked exceptions even if
    // they are not related to each other. Consider the below example. While the parent class doThis() method
    // threw only 1 unchecked exception which is IllegalArgumentException,
    // the child class could throw multiple unchecked exceptions as shown below:

    @Override
    void doThisRule3() throws ArithmeticException, NumberFormatException, NullPointerException {
        // ...
    }


}
