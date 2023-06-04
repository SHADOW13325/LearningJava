package com.example.Java8Features.FunctionalInterface;

/**
 * @author saumitra chauhan
 */
public interface VariablesInLambdaExpression {

    public static final int w = 1;
    public abstract void m1();
}

class Test {
    static int z = 1000;
    public static void main(String[] args) {

        int y = 100;
        VariablesInLambdaExpression variablesInLambdaExpression = () -> {
            int x = 10;
            System.out.println("w = " + VariablesInLambdaExpression.w);
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);

//            Modification of variables
//            VariablesInLambdaExpression.w = 25;   // Final value can't be changed
            x = 25;
//            y = 25;                 // local variables referenced from a lambda expression must be final or effectively final
            z = 25;

//            Declaration of variables
//            int x = 999;            // variable 'x' is already defined in the scope
//            int y = 999;            // Can't declare the same variable name present in the local variable
            int z = 999;
            int w = 999;
        };
        variablesInLambdaExpression.m1();
    }
}

/*
 There are restrictions on the local variables defined on the concrete methods. They can't be modified inside the
 lambda method. Also you can't declare parameter or variable in the lambda with the same name present as the local
 variable. There are no restrictions for the instance and class variables.
*/
