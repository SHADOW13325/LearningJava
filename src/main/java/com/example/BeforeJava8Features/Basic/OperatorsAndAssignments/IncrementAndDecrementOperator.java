package com.example.BeforeJava8Features.Basic.OperatorsAndAssignments;

/**
 * @author saumitra chauhan
 * @since 11-07-2023 06:19
 */

public class IncrementAndDecrementOperator {

    public static void main(String[] args) {

        int a = 1;
        double b = 1;
        System.out.println("Post Increment : " + a++);
        System.out.println("Pre Increment : " + ++a);
        System.out.println("Post Decrement : " + b--);
        System.out.println("Pre Decrement : " + --b);

        char ch = 'a';
        System.out.println(++ch);

//        Point 1
//        a = ++10;
//        a = ++(++b);

//        cannot assign a value to final variable c
//        final int c = 1;
//        c++;

//        Point 2
//        boolean d = true;
//        d--;

//        Point 3
//        byte e = 10, f = 20, g;
//        g = e + f;

//        Point 4
        byte h = 10;
        System.out.println(h++);
    }
}

/*
    1. These operators can't be applied to a constant. Here (++b) becomes constant.
    2. These operators are applicable on every primitive type except for boolean.
    3. Any arithmetic operation between 2 components/values/variables have type as follows:
            type of resultant = max(int, type of first operand, type of second operand)
    4. Increment/Decrement operators typecast internally.
            Eg. byte a = 10;
            a++; => a = (byte)(a + 1);
 */