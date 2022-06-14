package com.mike.blackjack;


//Re-factored String into Enum Classes created ie Suit, Rank
public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {
        Card card1 = new Card(Suit.CLUBS, Rank.JACK);
        Card card2 = new Card(Suit.DIAMONDS, Rank.TEN);
        // int total = card1.plus(card2);
        // Hand myHand = new Hand();
        // myHand.add(card1);
        // myHand.add(card2);
        // int total =  myHand.getTotal();
    }

    public int getValue() {
        return switch(this.rank){
            case JACK, QUEEN, KING -> 10;
            default -> this.rank.ordinal() + 1;
        };

    }
}
