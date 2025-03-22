package com.money;


public abstract class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }

    public abstract Money times(int multiplier);
}
