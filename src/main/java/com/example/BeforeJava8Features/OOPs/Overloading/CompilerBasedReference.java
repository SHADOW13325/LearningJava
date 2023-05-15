package com.example.BeforeJava8Features.OOPs.Overloading;
/**
    @author
    saumitra chauhan
*/

public class CompilerBasedReference {
    public static void main(String[] args) {
        Test6 test = new Test6();
        Animal animal = new Animal();
        test.m1(animal);
        Monkey monkey = new Monkey();
        test.m1(monkey);
        animal = new Monkey();
        test.m1(animal); // Method Resolution(Overloading) is based on compiler. Therefore, runtime object won't be considered and animal version will run
        test.m1(null); // child object is given priority over parent
    }
}

class Test6 {
    public void m1(Animal a){
        System.out.println("animal version");
    }

    public void m1(Monkey m){
        System.out.println("monkey version");
    }
}

class Animal{}

class Monkey extends Animal{}