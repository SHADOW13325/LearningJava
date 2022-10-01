package com.example.Modifiers.Interfaces;

public interface DefaultMethodInInterfaces {

    void m1();

    void m2();

    default void m3(){}

    default void m4(){}

//    We can,t define default methods for object class methods because
//    they are already available to all child classes
//    default int hashCode(){return 10;}
}

class ChildClass1 implements DefaultMethodInInterfaces {

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}

class ChildClass2 implements DefaultMethodInInterfaces {

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {
        System.out.println("In Child Class m3 method");
    }

    public static void main(String[] args) {
        ChildClass2 childClass2 = new ChildClass2();
        childClass2.m3();
    }
}

//  Default methods in Interfaces came in 1.8v
//  Default methods helps in adding a method in interface and need not
//  to be overiden by all implementing classes. Default methods can be
//  overided by the implementation classes as per the need