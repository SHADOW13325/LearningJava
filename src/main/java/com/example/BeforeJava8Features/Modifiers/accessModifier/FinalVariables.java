package com.example.BeforeJava8Features.Modifiers.accessModifier;
/**
    @author
    saumitra chauhan
*/
public class FinalVariables {
//    Defining variables at the time of declaration
    final int x = 10;
    final static int y = 10;

    public static void main(String[] args) {
        final int x;
        int y;
//        Need to assign value before use
//        System.out.println(x);
//        System.out.println(y);
    }
}

class DefineInInstanceAndStaticBlock {
    final int x;
    final static int y;

//    Defining instance variable in instance block
    {
        this.x = 10;
    }

//    Defining static variable in static block
    static {
        y = 10;
    }

}

class DefineInConstructor {
    final int x;

    DefineInConstructor(int x) {
        this.x = x;
    }
}

class DefineVariables {
    int a;
    static int b;

//    final variables needs to be initialized.
//    final int c;
//    final static int d;
}
