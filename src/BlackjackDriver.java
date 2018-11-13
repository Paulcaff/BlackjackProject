import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class BlackjackDriver {

    public static void main(String[] args) {


        ArrayList<Card> playerCards = new ArrayList<Card>();
        ArrayList<Card> dealerCards = new ArrayList<Card>();

        BlackjackStartMenu frame = new BlackjackStartMenu();
        frame.setVisible(true);

        Deck d = new Deck();
        Deck d2 = new Deck();
        Card c = new Card();


    }
}

