package com.practice;

public class CashPaymentStrategy implements PaymentStrategy{



    @Override
    public void pay(int amount) {
        System.out.println("Customer pays the money " +
                amount + " USD. using cash ");
    }
}
