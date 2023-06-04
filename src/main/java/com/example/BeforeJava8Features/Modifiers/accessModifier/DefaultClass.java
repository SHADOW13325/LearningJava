package com.example.BeforeJava8Features.Modifiers.accessModifier;
/**
    @author
    saumitra chauhan
*/

class DefaultClass {

    public void test() {
        System.out.println("Inside defaultClass");
    }

    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        pc.test();
    }
}

// default class can be accessed from within package classes only
// (subpackages are also not allowed)