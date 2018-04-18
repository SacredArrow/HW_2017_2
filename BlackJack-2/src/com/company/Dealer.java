package com.company;

public class Dealer extends Computer {
    Deck deck= new Deck();

    public Dealer() {
        super(new DealerIntellect(),null, "Dealer",10000);
    }


    public void deal(Hand hand) {
        Card current = deck.pop();
        hand.take(current);
    }
    public void checkDeck(){
        if(deck.size()<=17)
            deck=new Deck();
    }
}
