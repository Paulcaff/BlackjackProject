import javax.swing.*;

public class Deck {

    private static Card[] deck;


    //constructor
    public Deck() {
        deck = new Card[52];

        int counter = 0;

        String[] value = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    deck[counter] = new Card(suit[i], value[j]);

                    counter++;
                }
            }

    }

    public static void toShuffle(){
        Card temp = new Card(String suit, String value);


       for(int i = 0; i <52; i ++) {

           int swap = (int) (Math.random() * 51);
           deck[i] = temp;
           deck[swap] = deck[i];
           temp = deck[swap];
       }
    }

    public void toString1() {
        for (Card c: deck) {


            System.out.print(c.getValue()+" "+c.getSuit()+ "\n");
        }

    }



}

