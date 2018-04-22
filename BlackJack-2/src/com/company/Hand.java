package com.company;

import java.util.LinkedList;

public class Hand extends LinkedList<Card> {
    int bet;
    Condition condition = Condition.IN_GAME;
    Player owner;

    public Hand(Player owner) {
        this.owner = owner;
    }

    public void makeBet() {
        bet = owner.makeBet();
    }

    public void take(Card card) {
        this.add(card);
    }

    public int getScore() {
        int sum = 0;
        for (Card c : this) {
            sum += c.getScore();
        }
        if (this.hasAce() && sum + 10 <= 21) {
            sum += 10;
        }

        return sum;

    }

    private boolean hasAce() {
        for (Card c : this)
            if (c.value == Value.ACE) {
                return true;
            }
        return false;
    }
}
