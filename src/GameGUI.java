import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GameGUI extends JFrame implements ActionListener {

    JButton stick;
    JButton newCard;
    JButton close;
    JLabel dealer;
    JLabel username;
    JLabel gameBalance;
    JLabel stake;
    private static Player player;
    private static ArrayList<Card> playerCards;
    private static ArrayList<Card> dealerCards;
    static Container contentPane;
    static int playerValue = 0;
    static int dealerValue = 0;
    static int playerCardCounter = 0;
    static int dealerCardCounter = 0;
    static Deck deck;
    int stickTotal;
    int dealerTotal;



    public static void main(String[] args) throws IOException {
        String balanceAsString;
        double balance = 0;
        String betAsString;
        double bet = 0;
        boolean valid = false;


        deck = new Deck();
        Deck.toShuffle();

        String username = JOptionPane.showInputDialog(null, "Please enter your username :");

        while (!valid) {

            balanceAsString = JOptionPane.showInputDialog(null, "Please enter the amount you want to deposit :");
            betAsString = JOptionPane.showInputDialog(null, "Please enter the amount you want to bet:");


            try {
                balance = Double.parseDouble(balanceAsString);
                bet = Double.parseDouble(betAsString);


                if (bet > balance) {
                    throw new betInputException();
                }


                valid = true;
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Please enter a valid number for your balance and how much you want to bet");

            } catch (betInputException e) {

                JOptionPane.showMessageDialog(null, "You Cannot bet More than your balance!");

            }


        }


        player = new Player(username, balance, bet);
        playHand();





    }

    public GameGUI() throws IOException {

        setTitle("Blackjack");
        setSize(600, 600);
        setLocation(250, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        // get the content pane and set properties
        contentPane = getContentPane();
        contentPane.setBackground(new Color(50, 100, 20));
        contentPane.setLayout(null); // so that we can use absolute positioning

        BufferedImage image = ImageIO.read(new File("Resources\\back.bmp"));
        JLabel mainLabelback = new JLabel(new ImageIcon(image));
        mainLabelback.setLayout(null);
        mainLabelback.setBounds(125, 100, 100, 100);
        contentPane.add(mainLabelback);


        JLabel mainLabel = new JLabel(new ImageIcon(image));

        System.out.println("a");
        mainLabel = displayPlayerCardLabel();
        contentPane.add(mainLabel);

        System.out.println("b");
        mainLabel = displayPlayerCardLabel();
        contentPane.add(mainLabel);

        System.out.println("c");
        mainLabel = displayDealerCardLabel();
        contentPane.add(mainLabel);

        System.out.println("d");
        dealer = new JLabel("Dealer");
        dealer.setSize(250, 50); // optional
        dealer.setForeground(Color.white);
        dealer.setLocation(50, 50);
        contentPane.add(dealer);


        gameBalance = new JLabel("Balance : " + player.getBalance());
        gameBalance.setSize(250, 50); // optional
        gameBalance.setForeground(Color.white);
        gameBalance.setLocation(475, 25);
        contentPane.add(gameBalance);

        stake = new JLabel("Stake : " + player.getBet());
        stake.setSize(250, 50); // optional
        stake.setForeground(Color.white);
        stake.setLocation(475, 50);
        contentPane.add(stake);

        username = new JLabel(player.getUsername());
        username.setSize(250, 50); // optional
        username.setForeground(Color.white);
        username.setLocation(100, 400);
        contentPane.add(username);



        // construct 3 buttons
        stick = new JButton("Stick");
        stick.setBounds(50, 500, 120, 50);
        contentPane.add(stick);
        stick.addActionListener((ActionEvent e) -> {

            newCard.setVisible(false);

            Dealing(stickTotal);


            //contentPane.add(displayDealerCardLabel());
            mainLabelback.setVisible(false);
            repaint();

        });


        newCard = new JButton("Hit");
        newCard.setBounds(250, 500, 120, 50);
        contentPane.add(newCard);
        newCard.addActionListener((ActionEvent e) -> {




               playerCards.add(deck.returnCard());


               contentPane.add(displayPlayerCardLabel());
               repaint();

            if(stickTotal > 21) {
                JOptionPane.showMessageDialog(null, "Unlucky You Lost");
                stick.setVisible(false);
                newCard.setVisible(false);
                try {
                    playHand();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });


        close = new JButton("Close Game");
        close.setBounds(450, 500, 120, 50);
        contentPane.add(close);
        close.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });


        // contentPane.add(playerCards);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public JLabel displayPlayerCardLabel() {

        int xpoint[] = new int[]{50, 125, 200, 275, 350, 425};



        BufferedImage image = playerCards.get(playerCardCounter).getImage();
        //ImageIO.read(new File("Resources\\h2.bmp"));
        JLabel jLabel = new JLabel(new ImageIcon(image));
        jLabel.setLayout(null);
        jLabel.setBounds(xpoint[playerCardCounter], 300, 100, 100);
        stickTotal += playerCards.get(playerCardCounter).getNumber();

        System.out.println(stickTotal);
        playerCardCounter++;


        return jLabel;

    }


    public JLabel displayDealerCardLabel() {

        int xpoint[] = new int[]{50, 125, 200, 275, 350, 425};


        BufferedImage image = dealerCards.get(dealerCardCounter).getImage();
        //ImageIO.read(new File("Resources\\h2.bmp"));
        JLabel jLabel = new JLabel(new ImageIcon(image));
        jLabel.setLayout(null);
        jLabel.setBounds(xpoint[dealerCardCounter], 100, 100, 100);
        dealerTotal += dealerCards.get(dealerCardCounter).getNumber();
        System.out.println(dealerTotal);


        dealerCardCounter++;


        return jLabel;

    }


    public Card Dealing(int stickTotal) {




        if (dealerTotal > stickTotal) {
            dealerCards.add(deck.returnCard());
            JOptionPane.showMessageDialog(null, "Unlucky You Lost");



            contentPane.add(displayDealerCardLabel());
        }


        return null;
    }

    public static void playHand() throws IOException {
        player.setBalance(player.getBalance() - player.getBet());


        playerCards = new ArrayList<Card>();
        dealerCards = new ArrayList<Card>();
        playerCardCounter = 0;
        dealerCardCounter = 0;


        playerCards.add(deck.returnCard());
        // playerValue += deck.returnCard().getNumber();

        playerCards.add(deck.returnCard());
        //playerValue += deck.returnCard().getNumber();

        dealerCards.add(deck.returnCard());


        GameGUI game = new GameGUI();



    }
}
