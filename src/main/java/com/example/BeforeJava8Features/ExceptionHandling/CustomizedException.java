package com.example.BeforeJava8Features.ExceptionHandling;

/**
 * @author saumitra chauhan
 */
public class CustomizedException extends RuntimeException{

    CustomizedException(String message) {
        super(message);
    }
}

class CustomizedExceptionDemo {

    public static final String MARRIAGE_MESSAGE = "Your age is not appropriate for the marriage";

    public static void main(String[] args) {

        int age = 61;

        if (age > 60 || age < 18){
            throw new CustomizedException(MARRIAGE_MESSAGE);
        } else {
            System.out.println("Match Details will be sent soon");
        }
    }
}

/*
 1. We are using super(message) to make description message available to Default Exception Handler (DEH). DEH uses
    printStackTrace() method to print the exception which is present in Throwable class. This message gets passed to
    Throwable Constructor > Exception Constructor > RunTimeException Constructor > CustomizedException Constructor

 2. Always extend unchecked exception class else compiler will always poke to handle the
    checked exception if used CE: Unreported Exception.
    RunTimeException is highly recommended for extending customized exception class
*/
