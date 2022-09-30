package com.example.Collections.Enums;

public enum Color {

    BLUE, RED{
        public void info(){
            System.out.println("Dangerous Color");
        }
//        Can't find the usage of this method
        public void unique(){
            System.out.println("Unique method for a Enum");
        }
    }, GREEN;

    public void info(){
        System.out.println("Universal Color");
    }

    public static void main(String[] args) {
        Color[] colors = Color.values();
        for (Color color : colors){
            color.info();
        }
    }
}
