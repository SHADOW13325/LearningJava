package com.example.BeforeJava8Features.Collections.Generics;

/**
 * @author saumitra chauhan
 */
public class GenericMethod {

    public <T> void m1(T t){
        System.out.println(t.toString());
    }

    public <T extends Number> void m2(){}

    public <T extends Runnable> void m3(){}

    public <T extends Number & Runnable> void m4(){}

    public <T extends Comparable & Runnable> void m5(){}

    public <T extends Number & Comparable & Runnable> void m6(){}

//    class must come before interface while extending
//    public <T extends Runnable & Number> void m7(){}

//    can't extends more than 1 class at a time
//    public <T extends Number & Thread> void m8(){}
}
