package com.practice.datastructure;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class ParentDemoException {

    void doThis() throws FileNotFoundException {
    }
    void doRule1() throws IllegalArgumentException {
    }

    void doThisRule2() throws IOException, ParseException {
        // ...
    }

    void doThatRule2() throws IOException {
        // ...
    }


    void doThisRule3() throws IllegalArgumentException {
        // ...
    }
}
