package com.example.BeforeJava8Features.Modifiers.accessModifier;
/**
    @author
    saumitra chauhan
*/

public class StaticModifier {
    int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        StaticModifier staticModifier = new StaticModifier();
        staticModifier.m1();
        staticModifier.m2();
        System.out.println(staticModifier.x);
        System.out.println(staticModifier.y);
        m2();
    }

    public void m1() {
        System.out.println(x);
        System.out.println(y);
        m2();
    }

    public static void m2() {
//        System.out.println(x);
        System.out.println(y);
    }
}

// instance members(non-static) can't be accessed from static methods but vice versa is true

class x extends StaticModifier {
//    parent main method runs if child main method not found
}