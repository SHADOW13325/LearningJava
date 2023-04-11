package com.example.Java8Features.DefaultAndStaticMethodsInInterfaces;


public class MultipleInheritanceExecutionInDefaultMethods implements FirstInterface, SecondInterface, ThirdInterface {

    public static void main(String[] args) {

        MultipleInheritanceExecutionInDefaultMethods multipleInheritanceExecutionInDefaultMethods = new MultipleInheritanceExecutionInDefaultMethods();
        multipleInheritanceExecutionInDefaultMethods.FirstInterfaceMethod(10);
        multipleInheritanceExecutionInDefaultMethods.SecondInterfaceMethod(10);
        multipleInheritanceExecutionInDefaultMethods.ThirdInterfaceMethod(10);
    }

    public void ThirdInterfaceMethod(int value){

        System.out.println("ThirdInterfaceMethod of Class MultipleInheritanceExecutionInDefaultMethods square : " + (value * value));
    }
}


interface FirstInterface extends ThirdInterface {

    default void FirstInterfaceMethod(int value) {
        System.out.println("FirstInterfaceMethod of FirstInterface square : " + (value * value));
    }

    default void ThirdInterfaceMethod(int value) {
        System.out.println("ThirdInterfaceMethod of FirstInterface square : " + (value * value));
    }
}

interface SecondInterface {

    default void SecondInterfaceMethod(int value) {
        System.out.println("SecondInterfaceMethod of SecondInterface square : " + (value * value));
    }
}

interface ThirdInterface {

    default void ThirdInterfaceMethod(int value) {
        System.out.println("ThirdInterfaceMethod of ThirdInterface square : " + (value * value));
    }
}

// The ThirdIntrfaceMethod gets resolved to the child first.
// If there is any subinterface and bot parent and child interfaces are implemented by a child then the subInterface
// method will gets resolved. If the current class has the same overrided method, it will call the class method.