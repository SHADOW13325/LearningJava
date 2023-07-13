package com.example.BeforeJava8Features.Basic.FlowControl;

/**
 * @author saumitra chauhan
 * @since 12-07-2023 09:34
 */

public class EnhancedForLoop {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};

        for (int[] arr1 : arr){
            for (int arr2 : arr1){
                System.out.println(arr2);
            }
        }
    }
}

/*
    1. It came in 1.5v.
    2. It is specially designed only for arrays and collections.
    3. We can't move backward in enhanced loop.
 */