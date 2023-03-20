package com.example.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedVsUncheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("abc.txt"); // Checked Exception
        System.out.println(10/0); // UnChecked Exception
    }
}

// Both Checked and Unchecked Exceptions are produced at runtime but checked exceptions are the unreported exceptions
// that compiler thinks might occur at runtime. These exceptions are the most frequently occurring exceptions.
// So they needed to be handled before program execution