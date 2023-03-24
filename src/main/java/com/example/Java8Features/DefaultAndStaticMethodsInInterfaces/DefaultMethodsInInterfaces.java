package com.example.Java8Features.DefaultAndStaticMethodsInInterfaces;

public interface DefaultMethodsInInterfaces {

    public void printMyName();

    public default void defaultMethod1(){
        System.out.println("Default Method 1. Override it in child class only if parent impl is not needed");
    }

    public default void defaultMethod2(){
        System.out.println("Default Method 2. Override it in child class only if parent impl is not needed");
    }

//    public default int hashCode(){
//        return 100;
//    }

//    public default boolean equals(Object obj){
//        return true;
//    }

    public default void overrideThisMethod(){
        System.out.println("simple default method of interface override by the parent class of the class implementing this interface");
    }
}

class OverridingClass {

    public void overrideThisMethod(){
        System.out.println("This method has override the interface method");
    }
}

class ImplClass extends OverridingClass implements DefaultMethodsInInterfaces{

    public static void main(String[] args) {
        ImplClass implClass = new ImplClass();
        implClass.printMyName();
        implClass.defaultMethod1();
        implClass.defaultMethod2();
        System.out.println(implClass.hashCode());
        implClass.overrideThisMethod();

    }

    @Override
    public void printMyName() {
        System.out.println("My Name is Anonymous");
    }

    @Override
    public void defaultMethod1(){
        System.out.println("In Override default method 1");
    }
}

//  Default Methods is a way of adding new methods in interfaces w/o affecting the impl classes.
//  It is upto the child classes whether they want to override the default method or not.
//  To Override the default method, default keyword should be removed in child class and the access modifier must be put public
//
//  default keyword was only used in switch case and never as a access modifier.
//  Here, the default keyword is used only in interfaces for default methods impl
//
//  Default Methods can't override the Object class methods like hashCode, etc. or it will give CE.
//  These Object methods are by default accessible to the classes directly or indirectly