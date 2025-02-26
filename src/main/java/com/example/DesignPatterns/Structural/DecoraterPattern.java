package com.example.DesignPatterns.Structural;

/*
    In the below example, it would seem that replacing all the classes with the hashmap containing cost as a value
    would be reducing the complexity which is true in one way.
    However, when the behaviour of the cost method implementation changes, then the usage of decorator pattern
    comes in handy.
*/

public class DecoraterPattern {
    public static void main(String[] args) {
        BasePizza veggieDelightPizza = new ExtraPaneerTopping(new ExtraCheeseTopping(
                        new ExtraPaneerTopping(new VeggieDelightPizza())));
        System.out.println("Cost of veggie delight pizza with toppings : " + veggieDelightPizza.cost());

        BasePizza farmHousePizza = new ExtraPaneerTopping(new ExtraCheeseTopping(
                new ExtraCheeseTopping(new FarmHousePizza())));
        System.out.println("Cost of farm house pizza with toppings : " + farmHousePizza.cost());
    }
}

abstract class BasePizza {
    abstract int cost();
}

class VeggieDelightPizza extends BasePizza {

    @Override
    public int cost() {
        return 150;
    }
}

class FarmHousePizza extends BasePizza {

    @Override
    public int cost() {
        return 225;
    }
}

abstract class ToppingDecorater extends BasePizza {

}

class ExtraCheeseTopping extends ToppingDecorater {

    BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 17;
    }
}

class ExtraPaneerTopping extends ToppingDecorater {

    BasePizza basePizza;

    public ExtraPaneerTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 33;
    }
}