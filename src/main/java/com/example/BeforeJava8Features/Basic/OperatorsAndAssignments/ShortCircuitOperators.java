package com.example.BeforeJava8Features.Basic.OperatorsAndAssignments;

/**
 * @author saumitra chauhan
 * @since 11-07-2023 10:17
 */

public class ShortCircuitOperators {

    public static void main(String[] args) {

        System.out.println((10 < 29) && (29 > 35));
        System.out.println((10 < 29) || (29 > 35));
    }
}

/*
    Short circuit operators include &&(AND) and ||(OR)
    They are applicable only for boolean type
 */