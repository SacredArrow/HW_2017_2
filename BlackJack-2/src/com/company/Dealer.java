package com.company;

public class Dealer extends Computer {
    Deck deck = new Deck();
    int deckLimit = 17;

    public Dealer() {
        super(new DealerIntellect(), null, "Dealer", 10000);
    }


    public void deal(Hand hand) {
        Card current = deck.pop();
        hand.take(current);
    }

    public void checkDeck() {
        if (deck.size() <= deckLimit) {
            deck = new Deck();
        }
    }
}
