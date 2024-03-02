package com.abi.practice;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        Money dollar = (Dollar) obj;
        return amount == dollar.amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
