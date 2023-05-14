package com.example.BeforeJava8Features.Modifiers.Interfaces;
/**
    @author
    saumitra chauhan
*/

interface Interface1 {

    void m1();
    void m2();
}

interface Interface2 {
    void m1();

//    Need to initialize value of instance variables
    public static final int x = 10;

//    static and instance blocks not allowed in interface
//    static {
//        x = 10;
//    }

//    {
//        x = 10;
//    }
}

abstract class AbstractClassStructure implements Interface1, Interface2 {

    @Override
    public void m1() {

    }
}

public class ImplClassStructure extends AbstractClassStructure {


    @Override
    public void m2() {

    }
}

/*
 interface methods are always public and abstract by default
 interface variables are always public, static and final by default
*/
