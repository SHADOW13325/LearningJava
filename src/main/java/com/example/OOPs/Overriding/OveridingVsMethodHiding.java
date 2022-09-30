package com.example.OOPs.Overriding;
/*
    @author
    saumitra chauhan
*/

public class OveridingVsMethodHiding {

    public static void main(String[] args) {

//        Overiding(Method resolution always takes care by JVM based on runtime object)
        ParentClass1 parentClass1 = new ParentClass1();
        parentClass1.m1();

        ChildClass1 childClass1 = new ChildClass1();
        childClass1.m1();

        parentClass1 = new ChildClass1();
        parentClass1.m1();

//        Method Hiding(Method resolution always takes care by compiler based on reference type)
        parentClass1 = new ParentClass1();
        parentClass1.m2();

        childClass1 = new ChildClass1();
        childClass1.m2();

        parentClass1 = new ChildClass1();
        parentClass1.m2();


    }
}

class ParentClass1 {

    public void m1(){
        System.out.println("In parent Class inside m1 method");
    }

    public static void m2(){
        System.out.println("In parent Class inside m2 method");
    }
}

class ChildClass1 extends ParentClass1{

    public void m1(){
        System.out.println("In child Class inside m1 method");
    }

    public static void m2(){
        System.out.println("In child class inside m2 method");
    }
}