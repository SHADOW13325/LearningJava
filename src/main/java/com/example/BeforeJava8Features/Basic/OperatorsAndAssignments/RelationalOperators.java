package com.example.BeforeJava8Features.Basic.OperatorsAndAssignments;

/**
 * @author saumitra chauhan
 * @since 11-07-2023 07:30
 */

public class RelationalOperators {

    public static void main(String[] args) {

//        Comparison Operators
        System.out.println(10 < 20.0);
        System.out.println('a' >= 10);
        System.out.println('a' < 'b'); // char is promoted to int

//        bad operand types for binary operator '>' first type:  boolean second type: boolean
//        System.out.println(true > false);

//        bad operand types for binary operator '>' first type:  java.lang.String second type: java.lang.String
//        System.out.println("abc" > "def");


//        Equality Operator
        System.out.println(true != false);
        Thread t = new Thread();
        Object o = new Object();
        String s = new String();
        System.out.println(t == o);
        System.out.println(o == s);

//        incomparable types: java.lang.String and java.lang.Thread
//        System.out.println(s == t);

        String str = null;
        System.out.println(str == null);
    }
}

/*
    Comparison Operator includes <, <= , > and >=. They are applicable on any primitive type except boolean. They are
    also not applicable on object type.
    Nesting of comparison operator is not allowed because :-
        Eg. 10<20<30 => true<30 => Not applicable as 1 operator is boolean

    Equality Operator is a universal operator. It is applicable on all primitive types as well as object type.
    It includes == and !=. For object types they are used for reference address comparison. These object types must
    have some relation between them else it would give CE: incomparable types
 */