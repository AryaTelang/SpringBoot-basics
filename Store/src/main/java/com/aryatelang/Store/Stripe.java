package com.aryatelang.Store;

public class Stripe implements PaymentService {

    @Override
    public void processPayment(double amt)
    {
        System.out.println("stripe");
        System.out.println("amt"+amt);
    }
}
