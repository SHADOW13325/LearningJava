package com.example.DesignPatterns.Behavioral;

public class TemplatePattern {
    public static void main(String[] args) {
        PaymentFlow payToUser = new PayToCustomerFlow();
        payToUser.sendMoney();

        System.out.println("------------------------------------------------------------------");

        PaymentFlow payToMerchant = new PayToMerchantFlow();
        payToMerchant.sendMoney();
    }
}


abstract class PaymentFlow {

//    Template method defining steps to execute. It is always final for not overriding
    public final void sendMoney() {

        this.validateRequest();
        this.calculateFees();
        this.debitMoney();
        this.creditMoney();
        this.sendNotification();
    }

    abstract void validateRequest();
    abstract void sendNotification();
    abstract void calculateFees();
    abstract void debitMoney();
    abstract void creditMoney();
}

class PayToCustomerFlow extends PaymentFlow {

    @Override
    void validateRequest() {
        System.out.println("Request validated for Customer Payment");
    }

    @Override
    void sendNotification() {
        System.out.println("Notification sent to customer");
    }

    @Override
    void calculateFees() {
        System.out.println("Calculating fees for the current payment method and amount");
    }

    @Override
    void debitMoney() {
        System.out.println("Money debited from the user");
    }

    @Override
    void creditMoney() {
        System.out.println("Money credited to the customer");
    }
}

class PayToMerchantFlow extends PaymentFlow {

    @Override
    void validateRequest() {
        System.out.println("Request validated for Merchant Payment");
    }

    @Override
    void sendNotification() {
        System.out.println("Notification sent to merchant");
    }

    @Override
    void calculateFees() {
        System.out.println("Calculating fees for the current payment method and amount");
    }

    @Override
    void debitMoney() {
        System.out.println("Money debited from the user");
    }

    @Override
    void creditMoney() {
        System.out.println("Money credited to the merchant");
    }
}