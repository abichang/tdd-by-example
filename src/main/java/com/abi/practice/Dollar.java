package com.abi.practice;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    @Override
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
