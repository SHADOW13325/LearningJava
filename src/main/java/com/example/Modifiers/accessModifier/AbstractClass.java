package com.example.Modifiers.accessModifier;/*
    @author
    saumitra chauhan
*/

public abstract class AbstractClass {

    int i = 0;
    public abstract void m1();

    public void m2() {
        System.out.println("In m2 method");
    }

    abstract public void m3();
}

abstract class ChildClass extends AbstractClass{

    protected abstract  void m4();

    public final void m5() {
        System.out.println("In m5 method");
    }

}

class ChildChildClass extends ChildClass {

    @Override
    public void m1() {
        System.out.println("In m1 method");
    }

    @Override
    public void m3() {
        System.out.println("In m3 method");
    }

    @Override
    public void m4() {
        System.out.println(i);
        System.out.println("In m4 method");
    }
}

class impl {
    public static void main(String[] args) {
        ChildClass childClass = new ChildChildClass();
        childClass.m1();
        childClass.m2();
        childClass.m3();
        childClass.m4();
        childClass.m5();
        childClass.i = 5;
        childClass.m4();
    }
}

// Non-abstract child class needs to impl all the abstract methods of parent abstract classes
// final methods allowed inside abstract class but vice-versa is not true