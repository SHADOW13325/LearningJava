package com.example.Modifiers.Interfaces;

public interface StaticMethodInInterfaces {

    public static void m1(){
        System.out.println("Static method inInterface");
    }
}

class ChildClass implements StaticMethodInInterfaces {
    public static void main(String[] args) {
        StaticMethodInInterfaces.m1();
//        m1();
//        ChildClass.m1();
//        ChildClass childClass = new ChildClass();
//        childClass.m1();
    }
}

//  static methods in Interfaces came in 1.8v
//  To define general utility methods which are not related to objects,
//  we can got for static methods in interfaces since class is costly than interface
//  Interface static methods by default not available to impl classes.
//  Therefore only the call from Interface only is allowed for static methods