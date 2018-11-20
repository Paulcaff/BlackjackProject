import javax.swing.*;
import java.io.IOException;

public class Deck {

    private static Card[] deck;
    private int dealCount;


    //constructor
    public Deck() throws IOException {
        deck = new Card[52];
        int counter = 0;
        this.dealCount = 0;

        String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    deck[counter] = new Card(suit[i], value[j]);

                    counter++;
                }
            }

    }


    /**
     * this is the method i created to shuffle the deck i just created
     * i have created a deck object that holds 52 card objects.
     * i used a for loop that iterates 52 times so that it runs through the deck 52 times
     * the 52 times was just to make sure that towards the end i would not have a sequential group of cards
     * because using the math.random i have no control of where the card will go next
     * My idea was to take a card out of the deck and swap it randomly so there was no order
     * i Created a temporary Card object to hold the card that was to be swapped
     * it was then put in place of the random position and the card there was put in the position of the temp card
     */

    public static void toShuffle(){
        Card temp ;


       for(int i = 0; i <52; i ++) {

           int swap = (int) (Math.random() * 51);
           temp = deck[i];
           deck[i] = deck[swap];
           deck[swap] = temp;
       }
    }


    /**
     * this method return the position of the a card in the deck that is to be used in the deal
     * and dishing out of the cards.
     * it keeps track of how many cards are dealt and is used for the dealing of the next card
     *
     */
    public Card returnCard(){
        dealCount++;
        if(dealCount > 45){
            dealCount = 1;
        }

    return deck[dealCount - 1];
    }

    /**
     * This is the toString Method
     * it uses an enhanced for loop that give the card value and suit
     */
    public String  toString() {
        String str = "";
        for (Card c: deck) {


           str += (c.getValue()+" "+c.getSuit()+ "\n");
        }
        return str;

    }
    
}

