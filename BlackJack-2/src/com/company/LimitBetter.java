package com.company;

public class LimitBetter extends Better {
    private int limit;

    public LimitBetter(int limit) {
        this.limit = limit;
    }

    @Override
    public int makeBet(int balance) {
        if (limit < balance) {
            return limit;
        }
        else return balance;
    }
}
