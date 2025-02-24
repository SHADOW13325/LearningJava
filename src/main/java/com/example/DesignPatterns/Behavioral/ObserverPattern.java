package com.example.DesignPatterns.Behavioral;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        StockObservable iPhoneObservable = new IPhoneObservable();

        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertNotification("anu@gmail.com", iPhoneObservable);
        NotificationAlertObserver notificationAlertObserver2 = new MsgAlertNotification("mohini@gmail.com", iPhoneObservable);
        NotificationAlertObserver notificationAlertObserver3 = new EmailAlertNotification("rekha@gmail.com", iPhoneObservable);

        iPhoneObservable.add(notificationAlertObserver1);
        iPhoneObservable.add(notificationAlertObserver2);
        iPhoneObservable.add(notificationAlertObserver3);

        iPhoneObservable.setStockCount(10);
        iPhoneObservable.setStockCount(0);
        iPhoneObservable.setStockCount(20);
    }
}

interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifyStockChange();
    void setStockCount(int stockCount);
    int getStockCount();
}

class IPhoneObservable implements StockObservable {

    public List<NotificationAlertObserver> observers = new ArrayList<>();
    public int stockCount;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyStockChange() {
        observers.forEach(NotificationAlertObserver::update);
    }

    @Override
    public void setStockCount(int stockCount) {
        if (stockCount > 0) {
            notifyStockChange();
        }
        this.stockCount += stockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}


interface NotificationAlertObserver {
    void update();
}

class EmailAlertNotification implements NotificationAlertObserver {

    String emailId;
    StockObservable stockObservable;

    public EmailAlertNotification(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        System.out.println("Email sent to user : " + emailId);
    }
}

class MsgAlertNotification implements NotificationAlertObserver {

    String emailId;
    StockObservable stockObservable;

    public MsgAlertNotification(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        System.out.println("Message sent to user : " + emailId);
    }
}