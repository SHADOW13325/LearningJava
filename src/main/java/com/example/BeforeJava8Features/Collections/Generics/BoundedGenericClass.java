package com.example.BeforeJava8Features.Collections.Generics;

/**
 * @author saumitra chauhan
 * @param <T>
 */
public class BoundedGenericClass<T extends Number> {

    public static void main(String[] args) {
        BoundedGenericClass<Integer> boundedGenericClass = new BoundedGenericClass();
//        BoundedGenericClass<String> stringBoundedGenericClass = new BoundedGenericClass<>();
    }
}

class UnboundedGenericClass<T> {

    public static void main(String[] args) {
        UnboundedGenericClass<String> unboundedGenericClass = new UnboundedGenericClass<>();
        UnboundedGenericClass<Integer> integerUnboundedGenericClass = new UnboundedGenericClass<>();
    }
}

/*
    class xyz <T extends x> {...}
    If x is a class or interface, we can pass either x or its child classes.
 */