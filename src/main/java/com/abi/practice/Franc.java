package com.abi.practice;

public class Franc extends Money {


    private final String currency;

    public Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }


    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public String getCurrency() {
        return currency;
    }
}
