package com.abi.practice;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier, "USD");
    }

}
