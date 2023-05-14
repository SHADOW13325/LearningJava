package com.example.BeforeJava8Features.Modifiers.accessModifier;
/**
    @author
    saumitra chauhan
*/

public class ProtectedClass {

    protected void protectedMethod() {
        System.out.println("Inside protectedClass");
    }
}

class ChildProtectedClass extends ProtectedClass{

    public static void main(String[] args) {
        ProtectedClass protectedClass = new ProtectedClass();
        protectedClass.protectedMethod();
        ChildProtectedClass childProtectedClass = new ChildProtectedClass();
        childProtectedClass.protectedMethod();
        protectedClass = new ChildProtectedClass();
        protectedClass.protectedMethod();
    }
}

class IndependentClassInSamePackage {

    public static void main(String[] args) {
        ProtectedClass protectedClass = new ProtectedClass();
        protectedClass.protectedMethod();
        protectedClass = new ChildProtectedClass();
        protectedClass.protectedMethod();
        ChildProtectedClass childProtectedClass = new ChildProtectedClass();
        childProtectedClass.protectedMethod();
    }
}

// Protected members can be accessed from anywhere within the same package