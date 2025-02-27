package com.example.DesignPatterns.Structural;

public class AdapterPattern {
    public static void main(String[] args) {

        WeightMachine weightMachine = new WeightMachineForBabies(35);
        WeightAdapter weightAdapter = new WeightAdapterImpl(weightMachine);
        System.out.println(weightAdapter.getWeightInKg());
    }
}


interface WeightAdapter {

    double getWeightInKg();
}

class WeightAdapterImpl implements WeightAdapter {

    WeightMachine weightMachine;

    public WeightAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {

        double weightInPound = weightMachine.getWeightInPound();

        return weightInPound * .45;
    }
}


interface WeightMachine {
    double getWeightInPound();
}

class WeightMachineForBabies implements WeightMachine {

    double babyWeight;

    public WeightMachineForBabies (double babyWeight) {
        this.babyWeight = babyWeight;
    }

    @Override
    public double getWeightInPound() {
        return this.babyWeight;
    }
}