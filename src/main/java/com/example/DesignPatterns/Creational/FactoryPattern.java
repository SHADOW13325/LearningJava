package com.example.DesignPatterns.Creational;

/*
Factory pattern is responsible for holding the mechanism of how to create the instances of the class.
There can by multiple factory creating same object but in different way (passing parameters at the time of creation)
 */

public class FactoryPattern {
    public static void main(String[] args) {
        System.out.println("Preparing meat burger");
        Restaurant meatResto = new MeatBurgerRestaurant();
        meatResto.orderBurger();

        System.out.println("Preparing veggie burger");
        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();
    }
}

// Factory
abstract class Restaurant {
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}

class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}

class MeatBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new MeatBurger();
    }
}

// Product
interface Burger {
    void prepare();
}

class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Veggie Burger is prepared");
    }
}

class MeatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("meat Burger is prepared");
    }
}