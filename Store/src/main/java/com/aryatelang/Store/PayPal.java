package com.aryatelang.Store;

public class PayPal implements PaymentService{
    @Override
    public void processPayment(double amt) {
        System.out.println("PayPal");
        System.out.println("amt"+amt);
    }
}
