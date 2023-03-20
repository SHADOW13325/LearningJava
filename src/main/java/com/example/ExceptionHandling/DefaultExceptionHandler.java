package com.example.ExceptionHandling;

public class DefaultExceptionHandler {
    public static void main(String[] args) {
        doSomething();
    }

    public static void doSomething() {
        System.out.println(10/0);
    }
}

// Here the Airthmetic exception is handled by Default Exception Handler