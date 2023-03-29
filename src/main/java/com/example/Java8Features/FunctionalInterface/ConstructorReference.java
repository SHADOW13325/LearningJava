package com.example.Java8Features.FunctionalInterface;

public class ConstructorReference {

    public static void main(String[] args) {

        SampleFunctionalInterface1 sampleFunctionalInterface1 = ConstructorReference::new;
        ConstructorReference constructorReference1 = sampleFunctionalInterface1.test();

        SampleFunctionalInterface2 sampleFunctionalInterface2 = ConstructorReference::new;
        ConstructorReference constructorReference2 = sampleFunctionalInterface2.test(10);
    }

    ConstructorReference(){
        System.out.println("In ConstructorReference constructor with no arguments");
    }

    ConstructorReference(int x){
        System.out.println("In ConstructorReference constructor with argument : " + x);
    }
}

@FunctionalInterface
interface SampleFunctionalInterface1 {

    public abstract ConstructorReference test();
}

@FunctionalInterface
interface SampleFunctionalInterface2 {

    public abstract ConstructorReference test(int x);
}
