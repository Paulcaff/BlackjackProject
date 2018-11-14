import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameGUI extends JFrame implements ActionListener {

    JButton stick;
    JButton newCard;
    JButton close;
    JLabel dealer;
    JLabel username;
    JLabel gameBalance;
    JLabel stake;
    private static JTextArea playerCards = new JTextArea();


    Player player = new Player();
    int bet = 10;

    public static Deck d2;


    public static void main (String [] args) throws IOException {
        d2 = new Deck();
        GameGUI game = new GameGUI();

    }

    public GameGUI () throws IOException {
        setTitle ("Blackjack");
        setSize (600, 600);
        setLocation(250, 200);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setResizable(false);

        // get the content pane and set properties
        Container contentPane = getContentPane();
        contentPane.setBackground (new Color(50,100,20));
        contentPane.setLayout(null); // so that we can use absolute positioning

        BufferedImage image = ImageIO.read(new File("Resources\\back.bmp"));
        JLabel mainLabel = new JLabel(new ImageIcon(image));
        mainLabel.setLayout(null);
        mainLabel.setBounds(400,200,250,200);
        contentPane.add(mainLabel);

        dealer = new JLabel("Dealer" );
        dealer.setSize(250, 50); // optional
        dealer.setForeground(Color.white);
        dealer.setLocation(50,50);
        contentPane.add(dealer);

        gameBalance = new JLabel("Balance : " + player.getBalance() );
        gameBalance.setSize(250, 50); // optional
        gameBalance.setForeground(Color.white);
        gameBalance.setLocation(475,25);
        contentPane.add(gameBalance);

        stake = new JLabel("Stake : "+ bet );
        stake.setSize(250, 50); // optional
        stake.setForeground(Color.white);
        stake.setLocation(475,50);
        contentPane.add(stake);

        username = new JLabel(player.getUsername() );
        username.setSize(250, 50); // optional
        username.setForeground(Color.white);
        username.setLocation(100,400);
        contentPane.add(username);


        // construct 3 buttons
        stick = new JButton("Stick");
        stick.setBounds(50,500,120,50);
        contentPane.add(stick);
        stick.addActionListener((ActionEvent e)->{
            JOptionPane.showMessageDialog(null,"NO MORE CARDS ");

        });


        newCard = new JButton("New Card");
        newCard.setBounds(250,500,120,50);
        contentPane.add(newCard);
        newCard.addActionListener((ActionEvent e)->{
            playerCards.append(d2.returnCard().cardString());
           // JOptionPane.showMessageDialog(null,playerCards);
           // repaint();


        });


        close = new JButton("Close Game");
        close.setBounds(450,500,120,50);
        contentPane.add(close);
        close.addActionListener((ActionEvent e)->{
            System.exit(0);
        });


        

        contentPane.add(playerCards);
        setVisible(true);









    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


}