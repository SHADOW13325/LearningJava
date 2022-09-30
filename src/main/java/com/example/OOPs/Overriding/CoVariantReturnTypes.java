package com.example.OOPs.Overriding;
/*
    @author
    saumitra chauhan
*/

public class CoVariantReturnTypes {

    public Object m1(){
        return null;
    }

    public double m2(){
        return 0;
    }
}

class ChildCoVariantReturnTypes extends CoVariantReturnTypes{

    public String m1(){
        return null;
    }

//    public int m2(){
//        return 0;
//    }
}

// CoVariant return type concept applicable only for object types but not for primitive data types.