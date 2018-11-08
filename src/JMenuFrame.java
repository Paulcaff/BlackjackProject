import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *   JMenuFrame: includes one JMenuBar,2 JMenus and 8 JMenuItem objects. 
 *   When a menu item is selected, a string
 *   showing which menu choice is selected will appear in a label on the frame.
 */
public class JMenuFrame extends JFrame implements ActionListener {
    private JMenu NewGame;
    private JMenu LoadGame;
    private JLabel imageLabel;
    private ImageIcon blackjack;


    public static void main(String[] args) {
        JMenuFrame frame = new JMenuFrame();
        frame.setVisible(true);
    }

    public JMenuFrame() {
        Container cPane;

        //set the frame properties
        setTitle("Blackjack Menu");
        setSize(600, 600);
        setResizable(false);
        setLocation(250, 200);
        // shut down the program when the window is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        // blackjack = new ImageIcon(getClass().getResource("blackjack.jpg"));
        imageLabel = new JLabel(new ImageIcon("blackjack.jpg"));
        cPane.add(imageLabel);


        //invoke a user-written method create two menus and their menu items
        // done by separate method to make the constructor shorter
        createFileMenu();


        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.white);
        menuBar.add(NewGame);
        menuBar.add(LoadGame);

    } // end constructor

    /**
     * when an item is clicked, response starts here
     */
    public void actionPerformed(ActionEvent event) {

    } // end actionPerformend

    /**
     * Creates File menu and its menu items
     */
    private void createFileMenu() {
        JMenuItem item; // declare a re-usable JMenuItem object

        // first, create the menu: then you can start on the items
        NewGame = new JMenu("New Game");

// end class
    }
}