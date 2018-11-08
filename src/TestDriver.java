import javax.swing.*;
import java.util.ArrayList;

public class TestDriver {

    public static void main(String[] args) {

        ArrayList<Card> playerCards= new ArrayList<Card>();
        ArrayList<Card> dealerCards= new ArrayList<Card>();

      Player player = new Player();
      Deck d = new Deck();
      Deck d2 = new Deck();
      Card c = new Card();



        JOptionPane.showMessageDialog(null,d.toString());

        Deck.toShuffle();
        JOptionPane.showMessageDialog(null,d2.toString());
        JOptionPane.showMessageDialog(null,c.toString());

       // dealerCards.add("1");
        //dealerCards.add("2");

       // JOptionPane.showMessageDialog(null,"array list : "+ playerCards);

        int playerTotal = 0;
        int dealerTotal = 0;

        for(int i = 0; i < 4; i++) {

            playerCards.add(d2.returnCard(i));
            i++;

            playerCards.add(d2.returnCard(i));
            i++;


            dealerCards.add(d2.returnCard(i));
            i++;

            dealerCards.add(d2.returnCard(i));
            i++;


            playerTotal += d2.returnCard(0).getNumber() + d2.returnCard(1).getNumber();
            dealerTotal += d2.returnCard(2).getNumber() + d2.returnCard(3).getNumber();

            JOptionPane.showMessageDialog(null, "array list : " + playerCards);
            JOptionPane.showMessageDialog(null, "array list : " + dealerCards);
            JOptionPane.showMessageDialog(null, "Hand Total : " + playerTotal);
            JOptionPane.showMessageDialog(null, "Hand Total : " + dealerTotal);
        }

        String input = JOptionPane.showInputDialog(null,"y for card n to stick");

        while(input.equals("y")){

            playerCards.add(d2.returnCard(5));
            playerTotal += d2.returnCard(5).getNumber();
            JOptionPane.showMessageDialog(null, "Hand Total : " + playerTotal);
            
        }

        JOptionPane.showMessageDialog(null, "Hand Total : " + playerTotal);



    }
}
