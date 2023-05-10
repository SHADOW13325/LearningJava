package com.example.Java8Features.FunctionalInterface;
@FunctionalInterface
public interface FunctionalInterfaceVariation {

    public abstract void m1();
}

@FunctionalInterface
interface childInterface1 extends FunctionalInterfaceVariation {

}

@FunctionalInterface
interface childInterface2 extends FunctionalInterfaceVariation {

    public abstract void m1();
}

//@FunctionalInterface
interface childInterface3 extends FunctionalInterfaceVariation {

    public abstract void m2();
}

//  FunctionalInterfaceVariation, childInterface1 and childInterface2 are Functional Interfaces but not childInterface3,
//  it is normal Interface.
//  Parent interface are available to child interface and child interface can override the parent abstract method.
//  childInterface1 and childInterface2 clearly have 1 abstract method