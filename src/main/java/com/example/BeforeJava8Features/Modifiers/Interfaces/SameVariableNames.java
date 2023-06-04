package com.example.BeforeJava8Features.Modifiers.Interfaces;
/**
    @author
    saumitra chauhan
*/

public class SameVariableNames implements sample7, sample8{
    public static void main(String[] args) {
//        System.out.println(x);
        System.out.println(sample7.x);
        System.out.println(sample8.x);
    }
}

interface sample7{
    public static final int x = 10;
}

interface sample8{
    public static final int x = 20;
}

/*
 can't access variables directly but can be accessed via interface reference
 interface variables are public final static by default
*/
