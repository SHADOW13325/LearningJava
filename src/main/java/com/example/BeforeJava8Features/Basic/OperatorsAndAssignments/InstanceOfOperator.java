package com.example.BeforeJava8Features.Basic.OperatorsAndAssignments;

import java.io.Serializable;

/**
 * @author saumitra chauhan
 * @since 11-07-2023 09:26
 */

public class InstanceOfOperator {

    public static void main(String[] args) {

        Number n = Integer.valueOf(10);
        System.out.println(n instanceof Integer);
        System.out.println(n instanceof Number);
        System.out.println(n instanceof Float);
        System.out.println(n instanceof Object);
        System.out.println(n instanceof Serializable);
//        incompatible types: java.lang.Number cannot be converted to java.lang.Thread
//        System.out.println(n instanceof Thread);
        System.out.println(null instanceof Number);

    }

}

/*
    instanceof operator is used to check whether the given object is of particular type or not and we know the
    type in the beginning.
    Syntax:
        r instanceof X
        r is an object and X is a class or interface
    null instanceof X will always result in false
 */