package com.money;

public class Dollar extends Money {

    Dollar(int amount) {
        super(amount, "USD");
    }
    

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
