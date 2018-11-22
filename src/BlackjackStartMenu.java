import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class BlackjackStartMenu extends JFrame implements ActionListener {

    private JMenu game;
    private JMenu rules;
    private static BlackjackStartMenu frame;


    public static void main(String[] args) throws IOException {
        frame = new BlackjackStartMenu();
        frame.setVisible(true);
    }

    public BlackjackStartMenu() throws IOException {


        Container cPane = getContentPane();
        cPane.setSize(600,600);
        cPane.setBackground(Color.green);


        //set the frame properties
        setTitle("Blackjack Menu");
        setSize(500, 500);
        setResizable(false);
        setLocation(250, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


//code adapted from https://stackoverflow.com/questions/601274/how-do-i-properly-load-a-bufferedimage-in-java
        BufferedImage image = ImageIO.read(new File("Resources\\Blackjack.jpg"));
        JLabel mainLabel = new JLabel(new ImageIcon(image));
        mainLabel.setLayout(null);
        mainLabel.setSize(1000,1000);
        cPane.add(mainLabel);


//These 2 methods are getting items that are being added to the menubar
        createGameMenu();
        createRulesMenu();

 //and this adds them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.cyan);
        menuBar.add(game);
        menuBar.add(rules);

    }

  //My Action Listeners ae empty as I used Lambdas
    public void actionPerformed(ActionEvent event) {

    }


     // Creates File menu and its menu items

    private void createGameMenu() {
        JMenuItem item;

        game = new JMenu("Game");



        item = new JMenuItem("New Game");
        item.addActionListener(this);
        game.add(item);

        item.addActionListener((ActionEvent e)->{


            GameGUI.makePlayer();
            frame.setVisible(false);

            try {
                GameGUI.main(null);
            } catch (IOException e1) {
                e1.printStackTrace();
            }


        });



        item = new JMenuItem("Load game");
        item.addActionListener(this);
        game.add(item);
        item.addActionListener((ActionEvent e)->{

            GameGUI.loadPlayer();


            frame.setVisible(false);

            try {
                GameGUI.main(null);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        });





    }


    private void createRulesMenu() {

        JMenuItem item;

        rules = new JMenu("Rules");
        rules.addActionListener((ActionEvent e)->{

        });

    }


}





