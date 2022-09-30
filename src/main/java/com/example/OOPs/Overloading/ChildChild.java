package com.example.OOPs.Overloading;/*
    @author
    saumitra chauhan
*/

public class ChildChild {
    public static void main(String[] args) {
        Test3 test = new Test3();
        test.m1("hello friend");
        test.m1(new StringBuffer("hello friend"));
//        test.m1(null); // ambiguous method call since string and stringbuffer both are at same child level
    }
}

class Test3 {
    public void m1(StringBuffer sb){
        System.out.println("stringbuffer version");
    }

    public void m1(String s){
        System.out.println("string version");
    }
}