package com.abi.practice;

public class Franc {

    public int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        return amount == ((Franc) obj).amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
