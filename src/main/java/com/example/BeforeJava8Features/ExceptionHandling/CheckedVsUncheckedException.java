package com.example.BeforeJava8Features.ExceptionHandling;

/**
 * @author saumitra chauhan
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedVsUncheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("abc.txt"); // Checked Exception
        System.out.println(10/0); // UnChecked Exception
    }
}

/*
 Both Checked and Unchecked Exceptions are produced at runtime but checked exceptions are the unreported exceptions
 that compiler thinks might occur at runtime. These exceptions are the most frequently occurring exceptions.
 So they needed to be handled before program execution. They can be handled using try-catch or throws keyword

 RunTime Exception and its child classes, Errors and its child classes are unchecked exceptions.
 Apart from these all others are checked exceptions.

 Every exception whether checked or unchecked occurs at runtime only.
*/
