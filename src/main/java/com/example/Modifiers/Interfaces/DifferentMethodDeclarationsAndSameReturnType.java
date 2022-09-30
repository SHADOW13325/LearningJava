package com.example.Modifiers.Interfaces;/*
    @author
    saumitra chauhan
*/

public class DifferentMethodDeclarationsAndSameReturnType implements sample3, sample4{
    @Override
    public void m1() {
        System.out.println("In m1 method with no arg");
    }

    @Override
    public void m1(int i) {
        System.out.println("In m1 method with arg");
    }
}

interface sample3{
    void m1();
}

interface sample4{
    void m1(int i);
}

// method declaration is different for both interfaces, so they can independently overloaded