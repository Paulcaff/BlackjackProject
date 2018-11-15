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







    public static Deck deck;


    public static void main (String [] args) throws IOException {
        deck = new Deck();


        deck.toShuffle();

        playerCards = new ArrayList<Card>();
        dealerCards = new ArrayList<Card>();

        playerCards.add(deck.returnCard());
       // playerValue += deck.returnCard().getNumber();

        playerCards.add(deck.returnCard());
       //playerValue += deck.returnCard().getNumber();

        dealerCards.add(deck.returnCard());



        String username = JOptionPane.showInputDialog("Please enter your username here :");
        double bet= Double.parseDouble(JOptionPane.showInputDialog(null,"Pleas enter the amount you want to bet"));
        double balance=0;

        String balanceAsString =JOptionPane.showInputDialog(null,"Please enter the amount you want to deposit :");

       /* if(balanceAsString.matches("[0-9]*")) {
            balance = Double.parseDouble(balanceAsString);
        }
        else{
            String balanceAsString =JOptionPane.showInputDialog(null,"Please enter the amount you want to deposit :");

        }*/


        player = new Player(username,balance,bet);



        GameGUI game = new GameGUI();

    }

    public GameGUI () throws IOException {
        setTitle ("Blackjack");
        setSize (600, 600);
        setLocation(250, 200);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setResizable(false);

        // get the content pane and set properties
        contentPane = getContentPane();
        contentPane.setBackground (new Color(50,100,20));
        contentPane.setLayout(null); // so that we can use absolute positioning

        BufferedImage image = ImageIO.read(new File("Resources\\back.bmp"));
        JLabel mainLabel = new JLabel(new ImageIcon(image));
        mainLabel.setLayout(null);
        mainLabel.setBounds(400,200,250,200);
        contentPane.add(mainLabel);
//here

            mainLabel = displayPlayerCardLabel();
            contentPane.add(mainLabel);

            mainLabel = displayPlayerCardLabel();
            contentPane.add(mainLabel);

            mainLabel = displayDealerCardLabel();
            contentPane.add(mainLabel);

//here
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

        stake = new JLabel("Stake : "+ player.getBet());
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





            JOptionPane.showMessageDialog(null,dealerCards.toString());




        });


        newCard = new JButton("New Card");
        newCard.setBounds(250,500,120,50);
        contentPane.add(newCard);
        newCard.addActionListener((ActionEvent e)->{

            playerCards.add(deck.returnCard());


            contentPane.add(displayPlayerCardLabel());
            repaint();




            JOptionPane.showMessageDialog(null,playerCards.toString());

        });


        close = new JButton("Close Game");
        close.setBounds(450,500,120,50);
        contentPane.add(close);
        close.addActionListener((ActionEvent e)->{
            System.exit(0);
        });


        

       // contentPane.add(playerCards);
        setVisible(true);









    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

   public JLabel displayPlayerCardLabel(){

        int xpoint[] =new int[]{50,125,200,275,350,425};


        BufferedImage image = playerCards.get(dealerCardCounter).getImage();
        //ImageIO.read(new File("Resources\\h2.bmp"));
        JLabel jLabel = new JLabel(new ImageIcon(image));
        jLabel.setLayout(null);
        jLabel.setBounds(xpoint[playerCardCounter],300,100,100);
        playerCardCounter++;


        return jLabel;

    }


    public JLabel displayDealerCardLabel(){

        int xpoint[] =new int[]{50,125,200,275,350,425};


        BufferedImage image = dealerCards.get(dealerCardCounter).getImage();
        //ImageIO.read(new File("Resources\\h2.bmp"));
        JLabel jLabel = new JLabel(new ImageIcon(image));
        jLabel.setLayout(null);
        jLabel.setBounds(xpoint[dealerCardCounter],200,100,100);
        dealerCardCounter++;



        return jLabel;

    }


}