package com.example.BeforeJava8Features.OOPs.Overriding;
/**
    @author
    saumitra chauhan
*/

public abstract class OveridingWRTModifiers {

    public final void m1(){}

    public void m2(){}

    public synchronized void m3(){}

    public void m4(){}

    public native void m5();

    public void m6(){}

    public abstract void m7();

    public void m8(){}

    public strictfp void m9(){}

    public void m10(){}

    public static void m11(){}

    public void m12(){}
}

abstract class ChildOveridingWRTModifiers extends OveridingWRTModifiers {

//    can't overide parent final methods
//    public void m1(){}

    public final void m2(){}

    public void m3(){}

    public synchronized void m4(){}

    public void m5(){}

    public native void m6();

    public void m7(){}

    public abstract void m8();

    public void m9(){}

    public strictfp void m10(){}

//    can't overide static method as non-static method
//    public void m11(){}

//    can't overide non-static method as static method
//    public static void m12(){}
}
