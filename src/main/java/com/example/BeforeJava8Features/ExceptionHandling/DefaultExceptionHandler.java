package com.example.BeforeJava8Features.ExceptionHandling;

/**
 * @author saumitra chauhan
 */
public class DefaultExceptionHandler {
    public static void main(String[] args) {
        doSomething();
    }

    public static void doSomething() {
        System.out.println(10/0);
    }
}

/*
 Here the Arithmetic exception is handled by Default Exception Handler (DEH).
 If the main method also is not able to handle the exception, jvm handover the responsibility to DEH.
 DEH prints exception and terminates the program abnormally.
*/
