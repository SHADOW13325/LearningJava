package com.example.Basic;
/*
    @author
    saumitra chauhan
*/

public class NewInstance {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

//        new() operator
        Test1 test1 = new Test1();

        for (int i = 0; i < args.length; i++){
            Object o = Class.forName(args[i]).newInstance();
            System.out.println("Object created: " + o.getClass().getName());
            System.out.println(Class.forName("java.lang.Object").isInstance(o));
        }
    }
}

class Test1 {
    public Test1(){
        System.out.println("Test1 constructor");
    }
}

class Test2 {
    public Test2(){
        System.out.println("Test2 constructor");
    }
}


// Gives InstantiationException as no-arg constructor is not there
class Test3 {
    public Test3(int i){
        System.out.println("Test3 constructor");
    }
}

// Web container don't know until run time for which servlet it has to create object. Therefore the newInstance() and isInstance()
// method are used for that purpose which are replacement of new and instanceof operator.