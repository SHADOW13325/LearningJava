package com.example.DesignPatterns.Behavioral;

public class StrategyPattern {
    public static void main(String[] args) {
        Duck wildDuck = new Duck(new SimpleQuack(), new SimpleFly());
        wildDuck.quack();
        wildDuck.fly();

        Duck noDuck = new Duck(new NoQuack(), new NoFly());
        noDuck.quack();
        noDuck.fly();
    }
}


class Duck {

    IQuackBehaviour quackBehaviour;
    IFlyBehaviour flyBehaviour;

    public Duck(IQuackBehaviour quackBehaviour, IFlyBehaviour flyBehaviour) {
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
    }

    public void quack(){
        quackBehaviour.quack();
    }

    public void fly() {
        flyBehaviour.fly();
    }
}


interface IQuackBehaviour {
    void quack();
}

class SimpleQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Simple quack sound");
    }
}

class NoQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("No quacking");
    }
}


interface IFlyBehaviour {
    void fly();
}

class SimpleFly implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Simple flying");
    }
}

class NoFly implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Duck can't fly");
    }
}