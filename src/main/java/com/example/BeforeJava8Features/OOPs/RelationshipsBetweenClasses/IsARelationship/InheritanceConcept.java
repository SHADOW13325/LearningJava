package com.example.BeforeJava8Features.OOPs.RelationshipsBetweenClasses.IsARelationship;

/**
 * @author saumitra chauhan
 */
public class InheritanceConcept {

    public static void main(String[] args) {

        Child child = new Child();
        child.className();
    }
}

class Parent {

    public void className(){
        System.out.println("Inside Parent class");
    }
}

class Child extends Parent {

}

/*
    In Is-A relationship 1 class object carries the body part of the another class object.
    We can achieve this relationship using extends Keyword.
    Here both classes are tightly coupled
*/