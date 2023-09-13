package com.practice;

public class Customer {

    public static void main(String args[]) {
        PaymentContext ctx = new PaymentContext(
                new CreditCardPaymentStrategy());
        ctx.pay(8000);
        ctx.setPaymentStrategy(new CashPaymentStrategy());
        ctx.pay(6000);
    }
}
