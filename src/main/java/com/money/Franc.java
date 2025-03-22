package com.money;

public class Franc extends Money {

    Franc(int amount) {
        super(amount, "CHF");
    }
    

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
