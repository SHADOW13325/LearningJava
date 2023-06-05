package com.example.Java9Features.Enhancements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * @author saumitra chauhan
 */
public class TryWithResourcesImprovement {

    public static void main(String[] args) throws IOException {

        //Before java 9
        Reader inputString = new StringReader("Don't cut any corners");
        BufferedReader bufferedReader = new BufferedReader(inputString);
        try(BufferedReader bufferedReader1=bufferedReader){
            System.out.println("bufferedReader1.readLine() = "
                    + bufferedReader1.readLine());
        }

        //java 9
        Reader inputString2 = new StringReader("Hang in there");
        BufferedReader bufferedReader2 = new BufferedReader(inputString2);
        try(bufferedReader2){
            System.out.println("bufferedReader2.readLine() = "
                    + bufferedReader2.readLine());
        }
    }
}

/*
    Before Java 9, we need to initialise another variable in the try-with-resources block for any resource
    which implements AutoCloseable.
    In Java 9, we can use previously defined variable in the try-with-resources block for any resource
    which implements AutoCloseable.
 */