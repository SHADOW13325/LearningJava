package com.example.DesignPatterns.Behavioral;

import java.util.Stack;

public class CommandPattern {
    public static void main(String[] args) {

        AirConditioner airConditioner = new AirConditioner();

        ICommand turnOn = new AcOnCommand(airConditioner);
        ICommand turnOff = new AcOffCommand(airConditioner);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOff);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOn);
        remoteControl.pressButton();
        remoteControl.pressButton();

        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
    }
}

// Invoker
class RemoteControl {
    Stack<ICommand> acCommandHistory = new Stack<>();
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        acCommandHistory.add(command);
    }

    public void undo() {

        if (!acCommandHistory.empty()) {
            ICommand iCommand = acCommandHistory.pop();
            iCommand.undo();
        }
    }
}

// Command
interface ICommand {
    void execute();
    void undo();
}

class AcOnCommand implements ICommand{
    AirConditioner airConditioner;

    public AcOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnAcOn();
    }

    @Override
    public void undo() {
        airConditioner.turnAcOff();
    }
}

class AcOffCommand implements ICommand {
    AirConditioner airConditioner;

    public AcOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnAcOff();
    }

    @Override
    public void undo() {
        airConditioner.turnAcOn();
    }
}


// Receiver
class AirConditioner {

    boolean isAcOn;
    int temperature;

    public void turnAcOn() {
        if (isAcOn) {
            System.out.println("AC is already on");
            return;
        }

        this.isAcOn = true;
        this.temperature = 20;

        System.out.println("AC is turned on and the temperature is : " + this.temperature + "°C");
    }

    public void turnAcOff() {
        if (!isAcOn) {
            System.out.println("AC is already off");
            return;
        }

        this.isAcOn = false;
        this.temperature = 0;

        System.out.println("Ac is turned off");
    }

    public void updateTemperature(int temperature) {
        if (!isAcOn) {
            System.out.println("AC is off. Can't set temperature");
            return;
        }

        this.temperature = temperature;

        System.out.println("Ac Temperature is set to : " + temperature + "°C");
    }
}