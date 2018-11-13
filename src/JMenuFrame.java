import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *   JMenuFrame: includes one JMenuBar,2 JMenus and 8 JMenuItem objects. 
 *   When a menu item is selected, a string
 *   showing which menu choice is selected will appear in a label on the frame.
 */
public class JMenuFrame extends JFrame implements ActionListener {

    private JMenu game;
    private JLabel imageLabel;
    private ImageIcon blackjack;
    private BufferedImage blackjack2;


    public static void main(String[] args) {
        JMenuFrame frame = new JMenuFrame();
        frame.setVisible(true);
    }

    public JMenuFrame() {

        Container cPane;

        //set the frame properties
        setTitle("Blackjack Menu");
        setSize(600, 600);
        setResizable(true);
        setLocation(250, 200);
        // shut down the program when the window is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cPane = getContentPane();
        cPane.setLayout(null);

        blackjack = new ImageIcon(getClass().getResource("Blackjack.jpg"));
        imageLabel = new JLabel(blackjack);
        cPane.add(imageLabel);
        validate();


      /*  try {
            BufferedImage temp = ImageIO.read(getClass().getResource("Blackjack.jpg"));
            blackjack2 = temp.getSubimage(62,0,62,48);
            System.out.println("image read");

        }catch(IOException ex){
            System.out.println("error in read, existing.");
            System.exit(0);
        }
*/




        //invoke a user-written method create two menus and their menu items
        // done by separate method to make the constructor shorter
        createGameMenu();




        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.white);
        menuBar.add(game);

        cPane.add(menuBar);


    } // end constructor

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
           System.exit(0);

        });



        item = new JMenuItem("Load Game");
        item.addActionListener(this);
        game.add(item);
        item.addActionListener((ActionEvent e)->{

            JOptionPane.showMessageDialog(null, "Action Listener here");

        });


    }
}