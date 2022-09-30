package com.example.Modifiers.Interfaces;
/*
    @author
    saumitra chauhan
*/

public class AdapterClass implements sample9{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m5() {

    }
}

interface sample9 {

    void m1();
    void m2();
    void m3();
    void m4();
    void m5();
}

class ExtendAdapterClass1 extends AdapterClass {

    @Override
    public void m1(){
        System.out.println("In m1 method of extendclass");
    }

    public static void main(String[] args) {
        ExtendAdapterClass1 extendAdapterClass1 = new ExtendAdapterClass1();
        extendAdapterClass1.m1();
    }
}

class ExtendAdapterClass2 extends AdapterClass {

    @Override
    public void m2(){
        System.out.println("In m2 method of extendclass");
    }

    public static void main(String[] args) {
        ExtendAdapterClass2 extendAdapterClass2 = new ExtendAdapterClass2();
        extendAdapterClass2.m2();
    }
}

// Adapter class helps to reduce the code by child classes extending it
// Now the child classes can override the methods they wanna use.