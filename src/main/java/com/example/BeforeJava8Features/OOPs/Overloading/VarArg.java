package com.example.BeforeJava8Features.OOPs.Overloading;
/**
    @author
    saumitra chauhan
*/

public class VarArg {
    public static void main(String[] args) {
        Test5 test = new Test5();
        test.m1();
        test.m1(1,2);
        test.m1(1); // general version called to maintain backward compatibility
    }
}

class Test5 {
    public void m1(int i){
        System.out.println("general version");
    }

    public void m1(int... i){
        System.out.println("var-arg version");
    }
}
