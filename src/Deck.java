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
        Card temp ;


       for(int i = 0; i <52; i ++) {

           int swap = (int) (Math.random() * 51);
           temp = deck[i];
           deck[i] = deck[swap];
           deck[swap] = temp;
       }
    }

    public Card returnCard(int value){

    return deck[value];
    }




    public String  toString() {
        String str = "";
        for (Card c: deck) {


           str += (c.getValue()+" "+c.getSuit()+ "\n");
        }
        return str;

    }

    public Card getNewCard (int counter){

        playersCards.add(deck[counter]);
    }



}

