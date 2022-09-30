package com.example.OOPs.Overloading;
/*
    @author
    saumitra chauhan
*/

public class ArgReversal {
    public static void main(String[] args) {
        Test4 test = new Test4();
        test.m1(1, 2.5f);
        test.m1(2.5f, 1);
//        test.m1(1, 1); // ambiguous method call
//        test.m1(2.5f, 2.5f); // cannot resolve method
    }
}

class Test4 {
    public void m1(int i, float f){
        System.out.println("int-float version");
    }

    public void m1(float f, int i){
        System.out.println("float-int version");
    }
}