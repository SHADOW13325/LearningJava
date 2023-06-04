package com.example.BeforeJava8Features.OOPs.Overriding;
/**
    @author
    saumitra chauhan
*/

public class VarArgOverriding {

    public void m1(int ...x){
        System.out.println("parent1");
    }

    public void m2(int ...x){
        System.out.println("parent2");
    }
}

class ChildVarArgOverriding extends VarArgOverriding{

    public void m1(int x) {
        System.out.println("child1");
    }

    public void m2(int ...x){
        System.out.println("child2");
    }
}

class Test {
    public static void main(String[] args) {

        VarArgOverriding varArgOverriding = new VarArgOverriding();
        varArgOverriding.m1(10);
        varArgOverriding.m2(10);

        ChildVarArgOverriding childVarArgOverriding = new ChildVarArgOverriding();
        childVarArgOverriding.m1(10);
        childVarArgOverriding.m2(10);

        varArgOverriding = new ChildVarArgOverriding();
        varArgOverriding.m1(10); // parent
        varArgOverriding.m2(10); // child
    }
}

/*
 We can override var-arg method with another var-arg method only. If we try to override it with
 normal method then it become overloading. m1 -> overloading, m2 -> overriding
*/
