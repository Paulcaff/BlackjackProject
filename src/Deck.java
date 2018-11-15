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

    public static void toShuffle(){
        Card temp ;


       for(int i = 0; i <52; i ++) {

           int swap = (int) (Math.random() * 51);
           temp = deck[i];
           deck[i] = deck[swap];
           deck[swap] = temp;
       }
    }

    public Card returnCard(){
    dealCount++;
    return deck[dealCount - 1];
    }




    public String  toString() {
        String str = "";
        for (Card c: deck) {


           str += (c.getValue()+" "+c.getSuit()+ "\n");
        }
        return str;

    }







}

