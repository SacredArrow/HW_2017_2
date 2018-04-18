package com.company;

public class RandomBetter extends Better {
    @Override
    public int makeBet(int balance) {
        return (int)(Math.random()*balance+1);
    }
}
