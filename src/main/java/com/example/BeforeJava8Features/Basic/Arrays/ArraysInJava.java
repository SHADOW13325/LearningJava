package com.example.BeforeJava8Features.Basic.Arrays;

/**
 * @author saumitra chauhan
 * @since 10-07-2023 22:43
 */

public class ArraysInJava {

    public static void main(String[] args) {

//        Declaration of Arrays


        int []a;        // a -> 1D
        int[] b;        // b -> 1D
        int c[];        // c -> 1D
        int []d, e;     // d -> 1D, e -> 1D
        int[] f[], g;   // f -> 2D, g -> 1D
        int[][] h, i[]; // h -> 2D, i -> 3D
//        Specifying dimension before variable name is only applicable for first variable.
//        int[][] j, []k;


//        Creation of Arrays


        int[] j = new int[3];
        long[][] k = new long[3][];
//        Point 1
        System.out.println("single dimension int array class : " + j.getClass().getName());
        System.out.println("double dimension long array class : " + k.getClass().getName());

//        Point 2
        char ch = 'a';
        int[] l = new int[ch];
        int[] m = new int[0]; // sie 0 is allowed

//        RE: java.lang.NegativeArraySizeException
//        int[] n = new int[-1];

//        array dimension missing
//        int[] o = new int[];

        int[][][] p = new int[2][][];
        int[][][] q = new int[2][2][];
        int[][][] r = new int[2][2][2];

//        can't define child array size before parent array size.
//        int[][][] s = new int[2][][2];


//        Initialisation of Arrays


        int[][][] t = {
                        {
                            {10, 20, 30},
                            {40, 50, 60}
                        },
                        {
                            {70, 80},
                            {90, 100, 110}
                        }
                      };
        int[] u = new int[]{10, 20, 30};
        int[] w;
        w = new int[]{10,20,30};

//        java: illegal start of expression. can't initialise like this in different lines.
//        int[] x;
//        x = {10,20,30};

//        array creation with both dimension expression and initialization is illegal
//        int[] y;
//        y = new int[3]{10,20,30};

//        Point 3
        int[][] z = new int[2][];
        System.out.println(z);
        System.out.println(z[0]);
        z[0] = new int[2];
        System.out.println(z[0]);
        System.out.println(z[0][0]);
    }
}

/*
    1. Every array in java is an object since we are using the new keyword. These classes are part of java and
        not available to programmer.
    2. size of an array is stores in a final variable length -> public final int length .
       Hence, arrays are fixed in size. size must be an integer and can't be negative. So, we can pass
       byte, short and char also in the length as they will get promoted.
    3. The array values are assigned as default after initialisation. This doesn't varies and
       remains same for instance, static and local arrays.

 */