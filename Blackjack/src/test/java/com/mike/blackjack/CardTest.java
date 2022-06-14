package com.mike.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void cangetValueofATwoCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.TWO);
        assertEquals(2, card1.getValue());
    }
    @Test
    void cangetValueofAThreeCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.THREE);
        assertEquals(3, card1.getValue());
    }
    @Test
    void cangetValueofAnAceCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.ACE);
        assertEquals(1, card1.getValue());
    }

    @Test
    void cangetValueofAJackCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.JACK);
        assertEquals(10, card1.getValue());
    }

    @Test
    void cangetValueofAKingCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.KING);
        assertEquals(10, card1.getValue());
    }
}