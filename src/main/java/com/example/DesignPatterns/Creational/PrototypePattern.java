package com.example.DesignPatterns.Creational;

/*
    This pattern exists to clone an object without accessing its private fields
*/
public class PrototypePattern {
    public static void main(String[] args) {
        Prototype prototypeObject = new PrototypeObject(10, 15, "Naresh");
        System.out.println(prototypeObject);
        Prototype cloneObject = (PrototypeObject) prototypeObject.clone();
        System.out.println(cloneObject);

    }
}

interface Prototype {
    Prototype clone();
    String toString();
}

class PrototypeObject implements Prototype {

    private int age;
    private int rollNumber;
    private String name;

    public PrototypeObject() {
    }

    public PrototypeObject(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new PrototypeObject(this.age, this.rollNumber, this.name);
    }

    @Override
    public String toString() {
        return "PrototypeObject{" +
                "age=" + age +
                ", rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}


