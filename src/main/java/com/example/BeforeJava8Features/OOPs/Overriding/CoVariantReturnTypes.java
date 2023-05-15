package com.example.BeforeJava8Features.OOPs.Overriding;
/**
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

/*
 CoVariant return type concept applicable only for object types and not for primitive data types.
 child class method return type either must be same or the child of parent method return type.
 If not then existing code might break where the handling of return object is of parent method return type.
 E.g. if parent method returns string and child method returns object. CompileTime Exception
    {
        Parent parent = new Child();
        String name = parent.getName();
    }
*/
