package com.example.DesignPatterns.Creational;

/*
    Creating a bunch of products related to similar family. They will help to maintain the
    mismatch of the products for the certain type.
*/

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        System.out.println("Art Deco Furniture is ordered");
        FurnitureFactory artDecoFurniture = new ArtDecoFurniture();
        artDecoFurniture.getChair();
        artDecoFurniture.getSofa();
        artDecoFurniture.getTable();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Victorian Furniture is ordered");
        FurnitureFactory victorianFurniture = new VictorianFurniture();
        victorianFurniture.getChair();
        victorianFurniture.getSofa();
        victorianFurniture.getTable();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Modern Furniture is ordered");
        FurnitureFactory modernFurniture = new ModernFurniture();
        modernFurniture.getChair();
        modernFurniture.getSofa();
        modernFurniture.getTable();
    }
}

// Abstract Factory
abstract class FurnitureFactory {

    public Chair getChair() {
        Chair chair = createChair();
        chair.isComfortable();
        return chair;
    }

    public abstract Chair createChair();

    public Sofa getSofa() {
        Sofa sofa = createSofa();
        sofa.isSoft();
        return sofa;
    }

    public abstract Sofa createSofa();

    public Table getTable() {
        Table table = createTable();
        table.isStrong();
        return table;
    }

    public abstract Table createTable();
}

// Factory A
class ArtDecoFurniture extends FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }
}

// Factory B
class VictorianFurniture extends FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}

// Factory C
class ModernFurniture extends FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}


// Product A
interface Chair {
    void isComfortable();
}

class ArtDecoChair implements Chair {

    @Override
    public void isComfortable() {
        System.out.println("Art Deco Chair is created and is very comfortable");
    }
}

class VictorianChair implements Chair {

    @Override
    public void isComfortable() {
        System.out.println("Victorian Chair is created and is very comfortable");
    }
}

class ModernChair implements Chair {

    @Override
    public void isComfortable() {
        System.out.println("Modern Chair is created and is very comfortable");
    }
}


// Product B
interface Sofa {
    void isSoft();
}

class ArtDecoSofa implements Sofa {

    @Override
    public void isSoft() {
        System.out.println("Art Deco Sofa is created and is very cosy");
    }
}

class VictorianSofa implements Sofa {

    @Override
    public void isSoft() {
        System.out.println("Victorian Sofa is created and is very cosy");
    }
}

class ModernSofa implements Sofa {

    @Override
    public void isSoft() {
        System.out.println("Modern Sofa is created and is very cosy");
    }
}


// Product C
interface Table {
    void isStrong();
}

class ArtDecoTable implements Table {

    @Override
    public void isStrong() {
        System.out.println("Art Deco Table is created and is very strong");
    }
}

class VictorianTable implements Table {

    @Override
    public void isStrong() {
        System.out.println("Victorian Table is created and is very strong");
    }
}

class ModernTable implements Table {

    @Override
    public void isStrong() {
        System.out.println("Modern Table is created and is very strong");
    }
}