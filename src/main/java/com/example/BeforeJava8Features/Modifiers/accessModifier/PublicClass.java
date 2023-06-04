package com.example.BeforeJava8Features.Modifiers.accessModifier;
/**
    @author
    saumitra chauhan
*/

public class PublicClass {
    public void test() {
        System.out.println("Inside publicClass");
    }

    public static void main(String[] args) {
        DefaultClass dc = new DefaultClass();
        dc.test();
    }
}

// public class can be accessed from anywhere