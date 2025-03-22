package com.money;

public abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    static Money dollar(int amount) {
        return new Dollar(amount);
    }
    
    static Money franc(int amount) {
        return new Franc(amount);
    }
    
    public abstract Money times(int multiplier);

    public String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency.equals(money.currency);
    }
}
