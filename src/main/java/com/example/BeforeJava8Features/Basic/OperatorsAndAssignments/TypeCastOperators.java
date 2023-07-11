package com.example.BeforeJava8Features.Basic.OperatorsAndAssignments;

/**
 * @author saumitra chauhan
 * @since 11-07-2023 12:07
 */

public class TypeCastOperators {

    public static void main(String[] args) {

//        Implicit Type Casting
        int x = 'a';


//        Explicit Type Casting
        int y = 130;
        byte z = (byte) y;

//        incompatible types: possible lossy conversion from int to byte
//        byte a = y;
    }
}

/*
    Implicit Type Casting -> It is performed by the compiler. It is performed from smaller to bigger type of variable.
                                There is no loss of information.
    Explicit Type Casting -> It is performed by the programmer. It is performed from the bigger to smaller type of
                                variable. There can be loss of information.
 */