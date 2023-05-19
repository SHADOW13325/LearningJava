package com.example.Java8Features.DefaultAndStaticMethodsInInterfaces;

/**
 * @author saumitra chauhan
 */

public class MultipleInheritanceExecutionInDefaultMethods implements FirstInterface, SecondInterface, ThirdInterface {

    public static void main(String[] args) {

        MultipleInheritanceExecutionInDefaultMethods multipleInheritanceExecutionInDefaultMethods = new MultipleInheritanceExecutionInDefaultMethods();
        multipleInheritanceExecutionInDefaultMethods.firstInterfaceMethod(10);
        multipleInheritanceExecutionInDefaultMethods.secondInterfaceMethod(10);
        multipleInheritanceExecutionInDefaultMethods.thirdInterfaceMethod(10);
    }

//    comment out this method for the ThirdInterfaceMethod call and see the magic
    public void thirdInterfaceMethod(int value){

        System.out.println("thirdInterfaceMethod of Class MultipleInheritanceExecutionInDefaultMethods square : " + (value * value));
    }
}


interface FirstInterface extends ThirdInterface {

    default void firstInterfaceMethod(int value) {
        System.out.println("firstInterfaceMethod of FirstInterface square : " + (value * value));
    }

//    comment out this method and the thirdInterfaceMethod of class and see the magic
    default void thirdInterfaceMethod(int value) {
        System.out.println("thirdInterfaceMethod of FirstInterface square : " + (value * value));
    }
}

interface SecondInterface {

    default void secondInterfaceMethod(int value) {
        System.out.println("secondInterfaceMethod of SecondInterface square : " + (value * value));
    }
}

interface ThirdInterface {

    default void thirdInterfaceMethod(int value) {
        System.out.println("thirdInterfaceMethod of ThirdInterface square : " + (value * value));
    }
}

/*
 The thirdInterfaceMethod gets resolved to the child first.
 If there is any subInterface and both parent and child interfaces are implemented by a class then the subInterface
 method will get resolved. If the current class has the same overrided method, it will call the class method.
*/
