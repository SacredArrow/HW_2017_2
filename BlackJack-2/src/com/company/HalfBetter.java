package com.company;

public class HalfBetter extends Better {
    @Override
    public int makeBet(int balance) {
        return (balance + 1) / 2;
    }
}
