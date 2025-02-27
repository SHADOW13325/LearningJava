package com.example.DesignPatterns.Structural;

public class FacadePattern {
    public static void main(String[] args) {

        ProductDao productDao = new ProductDao();
        Invoice invoice = new Invoice();
        Payment payment = new Payment();
        Notification notification = new Notification();

        OrderFacade orderFacade = new OrderFacade(productDao, invoice, payment, notification);
        orderFacade.createOrder(25);
    }
}

class OrderFacade {

    ProductDao productDao;
    Invoice invoice;
    Payment payment;
    Notification notification;

    public OrderFacade(ProductDao productDao, Invoice invoice, Payment payment, Notification notification) {
        this.productDao = productDao;
        this.invoice = invoice;
        this.payment = payment;
        this.notification = notification;
    }

    public void createOrder(int productId) {
        Product product = productDao.getProduct(productId);
        invoice.generateInvoice(product);
        payment.makePayment(product);
        notification.sendNotification(product);
        System.out.println("Order created successfully for product id : " + productId);
    }
}


class ProductDao {

    public Product getProduct(int id) {
        System.out.println("Returning product with id : " + id);
        return new Product(id);
    }
}

class Invoice {

    public void generateInvoice(Product product) {
        System.out.println("Generated Invoice for product id : " + product.getVal());
    }
}

class Payment {
    public void makePayment(Product product) {
        System.out.println("Payment done for product id : " + product.getVal());
    }
}

class Notification {
    public void sendNotification(Product product) {
        System.out.println("Notification sent for product id : " + product.getVal());
    }
}

class Product {
    int val;

    public Product(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}