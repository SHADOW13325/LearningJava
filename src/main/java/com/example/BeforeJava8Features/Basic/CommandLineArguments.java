package com.example.BeforeJava8Features.Basic;
/**
    @author
    saumitra chauhan
*/

import java.util.Arrays;

public class CommandLineArguments {
    public static void main(String[] args) {
        Arrays.stream(args).forEach(e -> {
            System.out.println(e);
        });
    }
}

// Using command line arguments
