package com.company;

public class RandomIntellect extends Intellect  {
    @Override
    public Command decide(int score) {
        if (Math.random()>0.5)
            return Command.HIT;
        else return Command.STAND;
    }
}
