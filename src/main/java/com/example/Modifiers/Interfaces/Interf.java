package com.example.Modifiers.Interfaces;
/*
    @author
    saumitra chauhan
*/

public interface Interf {

    void m1();
    void m2();
}

interface hade {
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

abstract class ServiceProvider implements Interf, hade {

    @Override
    public void m1() {

    }
}

class ok extends ServiceProvider{


    @Override
    public void m2() {

    }
}

// interface methods are always public and abstract by default
// interface variables are always public, static and final by default