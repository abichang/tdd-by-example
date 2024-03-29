package com.abi.practice;

import java.util.Hashtable;

public class Bank {
    private final Hashtable<Pair, Integer> rates = new Hashtable<>();

    int rate(String from, String to) {
        return rates.get(new Pair(from, to));
    }

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);

    }


    private record Pair(String from, String to) {
    }
}
