package com.example.DesignPatterns.Behavioral;

public class NullObjectPattern {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        printVehicleDetails(vehicle);
        System.out.println("-------------------------------------------------");
        vehicle = VehicleFactory.getVehicle("Bike");
        printVehicleDetails(vehicle);
        System.out.println("-------------------------------------------------");
        vehicle = VehicleFactory.getVehicle(null);
        printVehicleDetails(vehicle);

    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Seating capacity is : " + vehicle.getSeatingCapacity());
        System.out.println("Tank capacity is : " + vehicle.getTankCapacity());
    }
}

abstract class VehicleFactory {
     public static Vehicle getVehicle(String vehicleName) {
        if ("CAR".equalsIgnoreCase(vehicleName)) {
            return new Car();
        }
        return new NoVehicle();
     }
}

interface Vehicle {
    int getSeatingCapacity();
    int getTankCapacity();
}

class Car implements Vehicle {

    @Override
    public int getSeatingCapacity() {
        return 4;
    }

    @Override
    public int getTankCapacity() {
        return 40;
    }
}

class NoVehicle implements Vehicle {

    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }
}