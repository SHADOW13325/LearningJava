package com.example.DesignPatterns.Creational;
/**
    @author
    saumitra chauhan
*/

// Double Locking Method
public class SingletonClass {

    private static SingletonClass singletonClass = null;

    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            synchronized (SingletonClass.class) {
                if (singletonClass == null) {
                    singletonClass = new SingletonClass();
                }
            }
        }

        return singletonClass;
    }

    private SingletonClass(){}
}

/*
    This pattern is designed to restrict more than 1 object formation using private constructors.
    It helps in the memory utilisation.
*/