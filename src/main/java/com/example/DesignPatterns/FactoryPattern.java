package com.example.DesignPatterns;

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