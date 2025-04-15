package com.example.DesignPatterns.Structural;

/*
    Bridge Pattern is the extension of Strategy Pattern. Here the Living Things and its implementations,
    if merged into one class, it becomes the strategy pattern
*/


public class BridgePattern {
    public static void main(String[] args) {
        LivingThings tree = new Tree(new TreeBreathe(), new Herbivores());
        tree.breatheProcess();
        tree.eatProcess();

        LivingThings fish = new Fish(new FishBreathe(), new Omnivores());
        fish.breatheProcess();
        fish.eatProcess();
    }
}


abstract class LivingThings {
    IBreatheImplementor breatheImplementor;
    IEatImplementor eatImplementor;

    public LivingThings(IBreatheImplementor breatheImplementor, IEatImplementor eatImplementor) {
        this.breatheImplementor = breatheImplementor;
        this.eatImplementor = eatImplementor;
    }

    abstract void breatheProcess();
    abstract void eatProcess();
}

class Tree extends LivingThings {

    public Tree(IBreatheImplementor breatheImplementor, IEatImplementor eatImplementor) {
        super(breatheImplementor, eatImplementor);
    }

    @Override
    void breatheProcess() {
        breatheImplementor.breathe();
    }

    @Override
    void eatProcess() {
        eatImplementor.eat();
    }
}

class Fish extends LivingThings {

    public Fish(IBreatheImplementor breatheImplementor, IEatImplementor eatImplementor) {
        super(breatheImplementor, eatImplementor);
    }

    @Override
    void breatheProcess() {
        breatheImplementor.breathe();
    }

    @Override
    void eatProcess() {
        eatImplementor.eat();
    }
}


interface IBreatheImplementor {
    void breathe();
}

class TreeBreathe implements IBreatheImplementor {

    @Override
    public void breathe() {
        System.out.println("Trees inhales CO2 and exhales O2");
    }
}

class FishBreathe implements IBreatheImplementor {

    @Override
    public void breathe() {
        System.out.println("Fish breathes underwater and inhales O2 and exhales CO2");
    }
}


interface IEatImplementor {
    void eat();
}

class Herbivores implements IEatImplementor {

    @Override
    public void eat() {
        System.out.println("They eat plants");
    }
}

class Carnivorus implements IEatImplementor {

    @Override
    public void eat() {
        System.out.println("They eat meat");
    }
}

class Omnivores implements IEatImplementor {

    @Override
    public void eat() {
        System.out.println("They eat both plants and meat");
    }
}