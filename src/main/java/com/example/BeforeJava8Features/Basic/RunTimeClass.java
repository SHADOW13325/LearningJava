package com.example.BeforeJava8Features.Basic;

/**
 * @author saumitra chauhan
 */
public class RunTimeClass {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total processors : " + runtime.availableProcessors());
        System.out.println("Free Memory in heap(in bytes) : " + runtime.freeMemory());
        System.out.println("Max Memory in heap(in bytes) : " + runtime.maxMemory());
        System.out.println("Total Memory in heap(in bytes) : " + runtime.totalMemory());
        System.out.println("Consumed Memory in heap(in bytes) : " + (runtime.totalMemory() - runtime.freeMemory()));
    }
}

/*
 A java application can communicate with jvm by using runtime object
 for setting max heap size -> java -Xmx512m <.class file> -> set max memory to 512 mb
 for setting min heap size -> java -Xms6 4m <.class file> -> set min memory to 64 mb
*/
