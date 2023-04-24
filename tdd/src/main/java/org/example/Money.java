package org.example;

public class Money {
    protected int amount;

    public boolean equals(Object object)  {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
       // return amount == money.amount;
    }

    public static Money dollar(int i) {
        return null;
    }

    public Object times(int i) {
        return null;
    }
}
