package com.example.Basic;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ClassLoading {
    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("String class");
        Class clazz = Class.forName("java.lang.String");
        printMethodNames(clazz);
        System.out.println("object class");
        clazz = Class.forName("java.lang.Object");
        printMethodNames(clazz);

    }

    public static void printMethodNames(Class clazz){

        Method[] m = clazz.getDeclaredMethods();
        System.out.println("Declared Methods");
        print(m);
        m = clazz.getMethods();
        System.out.println("All methods");
        print(m);
        System.out.println("Annotations");
        Annotation[] a = clazz.getAnnotations();
        print(a);
    }

    public static void print(Method[] methods) {

        for (Method method : methods){
            System.out.println(method.getName());
        }
        System.out.println("Total Number of methods : " + methods.length);
    }

    public static void print(Annotation[] methods) {

        for (Annotation method : methods){
            System.out.println(method.toString());
        }
        System.out.println("Total Number of annotations method : " + methods.length);
    }
}

