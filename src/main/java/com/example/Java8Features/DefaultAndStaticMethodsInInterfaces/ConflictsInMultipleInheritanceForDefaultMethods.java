package com.example.Java8Features.DefaultAndStaticMethodsInInterfaces;

/**
 * @author saumitra chauhan
 */
interface Left {
    default void m1() {
        System.out.println("Left Interface m1 method");
    }
}

interface Right {
    default void m1() {
        System.out.println("Right Interface m1 method");
    }
}

public class ConflictsInMultipleInheritanceForDefaultMethods implements Left, Right{

    public void m1(){
        System.out.println("Our own m1 method");
        Left.super.m1();
        Right.super.m1();
    }

    public static void main(String[] args) {
        ConflictsInMultipleInheritanceForDefaultMethods conflictsInMultipleInheritanceForDefaultMethods = new ConflictsInMultipleInheritanceForDefaultMethods();
        conflictsInMultipleInheritanceForDefaultMethods.m1();
    }
}

/*
  We need to override the default method here else it will create CE regarding ambiguity.
  To call the interface default method use an instance reference method of class
  and then type InterfaceName.super.methodName()
*/
