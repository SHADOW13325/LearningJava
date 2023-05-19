package com.example.Java8Features.DefaultAndStaticMethodsInInterfaces;

/**
 * @author saumitra chauhan
 */
public interface StaticMethodInInterfaces {

    public static void m1(){
        System.out.println("Static method in Interface");
    }
}

class ChildClass implements StaticMethodInInterfaces {
    public static void main(String[] args) {
        StaticMethodInInterfaces.m1();
        m1();
        ChildClass.m1();
        ChildClass childClass = new ChildClass();
        childClass.m1();
        StaticMethodInInterfaces staticMethodInInterfaces = new ChildClass();
//        staticMethodInInterfaces.m1(); // illegal static interface method call
    }

    public static void m1(){
        System.out.println("static method in Class");
    }
}

/*
  static methods in Interfaces came in 1.8v.
  To define general utility methods which are not related to objects, we can get for static methods in interfaces
  since class is costlier than interface
  Interface static methods by default are not available to impl classes, and thus we can't call them via
  object reference and can't override them.
  Therefore, only the call from Interface is allowed for static methods.
  Overriding and Method Hiding Concept is not applicable here in m1() method of Class.
*/
