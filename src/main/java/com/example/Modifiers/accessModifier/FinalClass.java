package com.example.Modifiers.accessModifier;/*
    @author
    saumitra chauhan
*/

public class FinalClass {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x);
        System.out.println(a.y);
        a.x = 10;
        System.out.println(a.x);
        a.test();
    }
}

class B {
    public int y = 10;
}

final class A extends B {

    public int x = 5;

    public void test() {
        System.out.println(x);
    }
}

// can change final class variables if variables are not defined as final.
// But all methods are final and we cannot override them.