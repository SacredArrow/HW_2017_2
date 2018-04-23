package com.company;

public class Human extends Player {
    public Human(String name, int balance) {
        super(new ConsoleIntellect(), new ConsoleBetter(), name, balance);
    }

}
