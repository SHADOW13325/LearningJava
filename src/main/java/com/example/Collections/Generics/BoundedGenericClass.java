package com.example.Collections.Generics;

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
