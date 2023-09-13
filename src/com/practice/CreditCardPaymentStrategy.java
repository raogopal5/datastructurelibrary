package com.practice;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Customer pays the money " +
                amount + " USD. using credit card");
    }
}
