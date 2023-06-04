package com.example.BeforeJava8Features.OOPs.Constructors;
/**
    @author
    saumitra chauhan
*/

public class ClassNameAsMethodName {

    ClassNameAsMethodName(){
        System.out.println("Constructor");
    }

    void ClassNameAsMethodName() {
        System.out.println("Method but not Constructor");
    }

    public static void main(String[] args) {
        ClassNameAsMethodName classNameAsMethodName = new ClassNameAsMethodName();
        System.out.println("Divider");
        classNameAsMethodName.ClassNameAsMethodName();
    }
}

// It is legal but stupid to have a method whose name is exactly same as class name