package com.example.BeforeJava8Features.Modifiers.accessModifier.subpackages;
/**
    @author
    saumitra chauhan
*/

import com.example.BeforeJava8Features.Modifiers.accessModifier.ProtectedClass;

public class ProtectedClassCalling extends ProtectedClass {

    public static void main(String[] args) {
        ProtectedClass protectedClass = new ProtectedClass();
//        protectedClass.protectedMethod();
        protectedClass = new ProtectedClassCalling();
//        protectedClass.protectedMethod();
        ProtectedClassCalling protectedClassCalling = new ProtectedClassCalling();
        protectedClassCalling.protectedMethod();

    }
}

// we should use child ref only for calling protected members

class   A extends ProtectedClassCalling {

    public static void main(String[] args) {
        ProtectedClass protectedClass = new ProtectedClass();
//        protectedClass.protectedMethod();
        ProtectedClassCalling protectedClassCalling = new ProtectedClassCalling();
//        protectedClassCalling.protectedMethod();
        A a = new A();
        a.protectedMethod();
        protectedClass = new ProtectedClassCalling();
//        protectedClass.protectedMethod();
        protectedClass = new A();
//        protectedClass.protectedMethod();
        protectedClassCalling = new A();
//        protectedClassCalling.protectedMethod();
    }
}

class B {
    public static void main(String[] args) {
        ProtectedClass protectedClass = new ProtectedClass();
//        protectedClass.protectedMethod();
        protectedClass = new ProtectedClassCalling();
//        protectedClass.protectedMethod();
    }
}

// We can't access the protected members from non-child classes