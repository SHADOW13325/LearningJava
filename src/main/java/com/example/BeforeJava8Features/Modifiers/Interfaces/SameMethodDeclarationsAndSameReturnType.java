package com.example.BeforeJava8Features.Modifiers.Interfaces;
/**
    @author
    saumitra chauhan
*/

public class SameMethodDeclarationsAndSameReturnType implements sample1, sample2{

    @Override
    public void m1() {
        System.out.println("In m1 method");
    }
}

interface sample1 {
    void m1();
}

interface sample2 {
    void m1();
}

// single method works for both interfaces