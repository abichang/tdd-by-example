package com.abi.practice;

public class Bank {
    int rate(String from, String to) {
        return from.equals("CHF") && to.equals("USD")
                ? 2 : 1;
    }

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String chf, String usd, int i) {

    }
}
