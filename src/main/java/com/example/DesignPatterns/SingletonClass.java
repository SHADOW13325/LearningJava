package com.example.DesignPatterns;
/*
    @author
    saumitra chauhan
*/

public class SingletonClass {

    private static SingletonClass singletonClass = null;

    public static SingletonClass getInstance() {
        if (singletonClass == null){
            singletonClass = new SingletonClass();
        }

        return singletonClass;
    }

    private SingletonClass(){}
}
