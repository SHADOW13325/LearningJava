package com.example.Extra.Gson;/*
    @author
    saumitra chauhan
*/

import com.google.gson.GsonBuilder;

public class Gson {

    public static void main(String[] args) {

//        First way to initialize creating a GsonBuilder instance and calling create() on it.
        GsonBuilder builder = new GsonBuilder();
        builder.setVersion(2.0);
        com.google.gson.Gson gsonBuilder = builder.create();
//        Second way is normal java object creation using new keyword
        com.google.gson.Gson gsonClass = new com.google.gson.Gson();
//        Parsing JSON Into Java Objects
        String json = "{\"brand\":\"Jeep\", \"doors\": 3}";
        Car car = gsonClass.fromJson(json, Car.class);
        System.out.println(car.brand + " " + car.doors);
//        Generating JSON From Java Objects
        car.brand = "Rover";
        car.doors = 5;
        Gson gson = new Gson();
        json = gsonClass.toJson(car);
        System.out.println(json);
//        Version Support in GSON
        Person person = new Person();
        person.firstName = "saumitra";
        person.lastName = "chauhan";
        person.email = "saumitra13325@gmail.com";
        person.middleName = "buddy";
        System.out.println(gsonBuilder.toJson(person));
    }
}

//GSON contains simple version support for the Java objects it reads and writes.
// GSON version support means that you can mark fields in your Java classes with a version number,
// and then have GSON include or exclude fields from your Java classes based on their version number.