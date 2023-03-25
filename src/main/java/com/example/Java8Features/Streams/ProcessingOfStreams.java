package com.example.Java8Features.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.example.Java8Features.Streams.Person.getPersons;

public class ProcessingOfStreams {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(11);

        System.out.println("For collecting elements after mapping or filtering, we can use collect() method");
        arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("For counting the total elements present, we can use count() method");
        System.out.println(arrayList.stream().count());


        System.out.println("For sorting elements we can use sorted() function");

//        Natural Sorting Order for above collection
        arrayList.stream().sorted().forEach(System.out::println);
        arrayList.stream().sorted((e1, e2) -> e1.compareTo(e2)).forEach(System.out::println);
        arrayList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

//        Reverse Sorted Order
        arrayList.stream().sorted((e1, e2) -> e2.compareTo(e1)).forEach(System.out::println);
        arrayList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        Natural Sorting Order doesn't work for non comparable objects
//        getPersons().stream().sorted().forEach(System.out::println);

//        Customized Sorting Order
        getPersons().stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName)).forEach(System.out::println);

        System.out.println("For Minimum and Maximum you can use min() and max() function ");
        System.out.println("Max Value: " + arrayList.stream().max((e1, e2) -> e1.compareTo(e2)).get());
        System.out.println("Min Value: " + arrayList.stream().min((e1, e2) -> e1.compareTo(e2)).get());

        System.out.println("We can collect elements in Object array using toArray() method");
        Object[] objects = arrayList.stream().filter(i -> i % 2 == 0).toArray();
        for (Object object : objects){
            System.out.println(object.toString());
        }

        System.out.println("For Using Streams apart from collections, we can use of() method");
        Stream.of(5, 10, 15, 20).filter(i -> i % 2 == 0).forEach(System.out::println);
        String[] name ={"Amar", "Akbar", "Anthony"};
        Stream.of(name).filter(i -> i.length() <= 5).forEach(System.out::println);

    }
}

class Person {

    private String name;
    private int age;
    private Gender gender;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public enum Gender {
        MALE, FEMALE;
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static List<Person> getPersons(){
        return  Stream.of(
                new Person("A", 10, Person.Gender.MALE),
                new Person("B", 100, Person.Gender.FEMALE),
                new Person("C", 90, Person.Gender.MALE),
                new Person("D", 20, Person.Gender.FEMALE),
                new Person("E", 5, Person.Gender.MALE),
                new Person("A", 5, Person.Gender.MALE),
                new Person("F", 55, Person.Gender.FEMALE)
        ).collect(Collectors.toList());


    }

}

// Processing of Streams is used to process the simple or configured streams