package com.example.Collections.Generics;

public class GenericClass<T> {

    T obj;

    GenericClass(T obj){
        this.obj = obj;
    }

    GenericClass(){}

    public void show(){

        if (obj != null) System.out.println("The type of object is: " + obj.getClass().getName());
        else System.out.println("No object is defined");
    }

    public T getObj(){
        return obj;
    }
}

class GenericClassTest {

    public static void main(String[] args) {

        GenericClass<String> g1 = new GenericClass<>("saumitra");
        g1.show();
        System.out.println(g1.getObj());

        GenericClass<Integer> g2 = new GenericClass<>(10);
        g2.show();
        System.out.println(g2.getObj());

        GenericClass<Double> g3 = new GenericClass<>(10.5);
        g3.show();
        System.out.println(g3.getObj());

        GenericClass g4 = new GenericClass();
        g4.show();
        System.out.println(g4.getObj());

//        primitive types are not allowed in base parameters
//        GenericClass<int> g5 = new GenericClass<int>(20);
    }
}
