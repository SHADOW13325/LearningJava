package com.example.BeforeJava8Features.Collections.Enums;

/**
 * @author saumitra chauhan
 */
public enum Beer {

    KF(20), RC;

    int price;

    Beer(int price) {
        System.out.println("Integer Arg Constructor");
        this.price = price;
    }

    Beer(){
        System.out.println("No Arg Constructor");
        this.price = 0;
    }

    public int getPrice(){
        return this.price;
    }

    public static void main(String[] args) {
        Beer b = Beer.KF;
        System.out.println(b);
        System.out.println(b.getPrice());
        System.out.println(RC);
    }
}

/*
 Every enum constant is public static final.
 Every enum constant represent an object of the type enum
 KF definition => public static final Beer KF = new Beer();
*/

