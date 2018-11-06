import javax.swing.*;

public class TestDriver {

    public static void main(String[] args) {
      Deck d = new Deck();
      Card c = new Card("Hearts","Ace");




        Deck.toShuffle();
        JOptionPane.showMessageDialog(null,d.toString1());
        JOptionPane.showMessageDialog(null,c.toString());


    }
}
