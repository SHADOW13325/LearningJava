package com.example.BeforeJava8Features.OOPs.Constructors;
/**
    @author
    saumitra chauhan
*/

public class ConstructorModifiers {

    public ConstructorModifiers(){
        System.out.println("public Modifier");
    }

    ConstructorModifiers(int i){
        System.out.println("default Modifier");
    }

    protected ConstructorModifiers(double d){
        System.out.println("protected Modifier");
    }

    private ConstructorModifiers(String s){
        System.out.println("private Modifier");
    }

//    static ConstructorModifiers(int i, int j){}

//    final ConstructorModifiers(int i, int j){}

//    synchronized ConstructorModifiers(int i, int j){}

//    native ConstructorModifiers(int i, int j){}

//    abstract ConstructorModifiers(int i, int j);

//    strictfp ConstructorModifiers(int i, int j){}

    public static void main(String[] args) {
        ConstructorModifiers constructorModifiers = new ConstructorModifiers();
        constructorModifiers = new ConstructorModifiers(10);
        constructorModifiers = new ConstructorModifiers(10.5);
        constructorModifiers = new ConstructorModifiers("Hello, Friend");
    }

}

// Modifiers applicable for constructors are public, <default>, protected and private only.
