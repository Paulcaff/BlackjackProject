import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 *   JMenuFrame: includes one JMenuBar,2 JMenus and 8 JMenuItem objects.
 *   When a menu item is selected, a string
 *   showing which menu choice is selected will appear in a label on the frame.
 */
public class BlackjackStartMenu extends JFrame implements ActionListener {

    private JMenu game;
    private JMenu rules;
    private JPanel imagePanel;
    private static BlackjackStartMenu frame;
    String username;
    double balance;






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
        // shut down the program when the window is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

       // cPane = getContentPane();
        //cPane.setLayout(null);


        BufferedImage image = ImageIO.read(new File("Resources\\Blackjack.jpg"));
        JLabel mainLabel = new JLabel(new ImageIcon(image));
        mainLabel.setLayout(null);
        mainLabel.setSize(1000,1000);
        mainLabel.setBackground(Color.red);
        cPane.add(mainLabel);



        createGameMenu();
        createRulesMenu();




        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.cyan);
        menuBar.add(game);
        menuBar.add(rules);

        //cPane.add(menuBar);


    }

    /**
     * when an item is clicked, response starts here
     */
    public void actionPerformed(ActionEvent event) {

    } // end actionPerformend

    /**
     * Creates File menu and its menu items
     */
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





