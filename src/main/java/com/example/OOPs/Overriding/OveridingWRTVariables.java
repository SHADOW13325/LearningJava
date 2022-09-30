package com.example.OOPs.Overriding;
/*
    @author
    saumitra chauhan
*/

public class OveridingWRTVariables {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.x);
        Child child = new Child();
        System.out.println(child.x);
        parent = new Child();
        System.out.println(parent.x);
    }
}

class Parent{
    int x = 8;
}

class Child extends Parent {
    int x = 9;
}

// variable resolution always takes care by compiler on reference type irrespective of whether the
// variable is static or non-static(Overriding concept only applicable for methods but not for variables)
