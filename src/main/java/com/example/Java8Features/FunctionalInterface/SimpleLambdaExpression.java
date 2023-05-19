package com.example.Java8Features.FunctionalInterface;
/**
 * @author saumitra chauhan
 */

import java.util.function.BiConsumer;

public class SimpleLambdaExpression {

    public static void main(String[] args) {
        SimpleLambdaExpression.add(10, 20);

        BiConsumer<Integer, Integer> lambda = (a, b) -> System.out.println(a + b);
        lambda.accept(20,30);

    }

    public static void add(int a, int b){
        System.out.println(a + b);
    }
}

/*
  Lambda expression is a function without name, return type and access modifier. It just add lambda symbol (->).
  (a, b) -> System.out.println(a + b); is the lambda expression. We need functional Interface to invoke lambda expression
*/
