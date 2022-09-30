package com.example.OOPs.Overloading;/*
    @author
    saumitra chauhan
*/

public class ParentChild {
    public static void main(String[] args) {
        Test2 test = new Test2();
        test.m1("hello friend");
        test.m1(new Object());
        test.m1(null); // string version runs because child class is always preferred over parent class if both are perfect match.
    }
}

class Test2 {
    public void m1(Object object){
        System.out.println("object version");
    }

    public void m1(String s){
        System.out.println("string version");
    }
}