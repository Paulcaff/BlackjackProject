import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class TestDriver {

    public static void main(String[] args) {


        ArrayList<Card> playerCards = new ArrayList<Card>();
        ArrayList<Card> dealerCards = new ArrayList<Card>();

        JMenuFrame frame = new JMenuFrame();
        frame.setVisible(true);

        Deck d = new Deck();
        Deck d2 = new Deck();
        Card c = new Card();
        GameGUI game = new GameGUI();


        //  JOptionPane.showMessageDialog(null, d.toString());

        //  Deck.toShuffle();
        //JOptionPane.showMessageDialog(null, d2.toString());
        //JOptionPane.showMessageDialog(null, c.toString());

        // dealerCards.add("1");
        //dealerCards.add("2");

        // JOptionPane.showMessageDialog(null,"array list : "+ playerCards);

        int playerTotal = 0;
        int dealerTotal = 0;

        for (int i = 0; i < 4; i++) {

            playerCards.add(d2.returnCard());
            i++;

            playerCards.add(d2.returnCard());
            i++;


            dealerCards.add(d2.returnCard());
            i++;

            dealerCards.add(d2.returnCard());
            i++;


            playerTotal += d2.returnCard().getNumber() + d2.returnCard().getNumber();
            dealerTotal += d2.returnCard().getNumber() + d2.returnCard().getNumber();

            // JOptionPane.showMessageDialog(null, "array list : " + playerCards);
            // JOptionPane.showMessageDialog(null, "array list : " + dealerCards);
            // JOptionPane.showMessageDialog(null, "Hand Total : " + playerTotal);
            // JOptionPane.showMessageDialog(null, "Hand Total : " + dealerTotal);
        }

         String input = JOptionPane.showInputDialog(null, "y for card n to stick");

           int counter = 4;

        while (input.equals("y")) {

            counter++;

            //playerCards.add(d2.returnCard(counter));
            //playerTotal += d2.returnCard(counter).getNumber();
            JOptionPane.showMessageDialog(null, "Hand Total : " + playerTotal);
            break;
        }


        JOptionPane.showMessageDialog(null, "Hand Total : " + playerTotal);



        }

         public static void saveProfile(Player player) throws FileNotFoundException {
           /* File file = new File("Player.dat");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(player);
            oos.close();*/
        }



    }




