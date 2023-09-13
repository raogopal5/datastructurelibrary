package com.practice;

public class DebitCardPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Customer pays the money " +
                amount + " USD. using debit card");
    }
}
