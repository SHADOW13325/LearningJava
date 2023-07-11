package com.example.BeforeJava8Features.Basic.Arrays;

/**
 * @author saumitra chauhan
 * @since 10-07-2023 23:35
 */

public class AnonymousArray {

    public static void main(String[] args) {

        int total = sum(new int[]{10,20,30}); // anonymous Array
        System.out.println("total is : " + total);
    }

    public static int sum(int[] arr){

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }
}

//    We don't declare but create and initialise anonymous array. Its purpose is to use just for instant purpose