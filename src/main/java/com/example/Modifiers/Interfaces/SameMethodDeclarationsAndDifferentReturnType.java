package com.example.Modifiers.Interfaces;/*
    @author
    saumitra chauhan
*/

public class SameMethodDeclarationsAndDifferentReturnType
//        implements sample5, sample6
{
//    @Override
//    public void m1() {
//
//    }
//    @Override
//    public int m1() {
//
//    }
}

interface sample5{
    void m1();
}

interface sample6{
    int m1();
}

// return type is different which cause incompatible return type for any one interface method.
// No solution