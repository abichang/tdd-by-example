package com.abi.practice;

public class Franc extends Money {


    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }


    public Franc times(int multiplier) {
        return new Franc(amount * multiplier, "CHF");
    }

}
