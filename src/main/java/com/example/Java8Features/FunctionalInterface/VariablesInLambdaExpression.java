package com.example.Java8Features.FunctionalInterface;

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

//            VariablesInLambdaExpression.w = 25;   // Final value can't be changed
            x = 25;                 // Local Variable changes
//            y = 25;                 // local variables referenced from a lambda expression must be final or effectively final
            z = 25;                 // Class Variable and it is not final
        };
        variablesInLambdaExpression.m1();
    }
}