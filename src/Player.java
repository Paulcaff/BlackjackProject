import javax.swing.*;
import java.io.Serializable;


 /**
 * <h1>Blackjack Player Class!</h1>
 * The player class creates an object using the attributes assigned to it.
  * it takes 3 attributes (username, balance, bet) which are also used during
  * the gameplay. i also created accessor methods and mutator methods as i will
  * need to change the value of the attributes as well as reading the attributes
  * i.e. reading username to load in previous balance
  * I also created a toString for when i needed a String repreentation of the object.
 * @author  Paul Cafferkey
 * @version 1.0
 * @since   21-11-2018
 */


public class Player implements Serializable {
    /**
     *these are the attributes used in the class
     * username is the name the player uses while playing the game
     * which is displayed on the game window
     * Balance is the amount the player wants to start with and they cannot
     * bet if the balance is 0.
     * bet is the amount the player wishes to bet every hand and a hand
     * can only be played if the balance is bigger or equal to the bet
     */

    private String username;
    private double balance;
    private double bet;


    /**
     * 3 argument Constructor
     * Creates a player object with the 3 attributes inputted
     * @param username = player's name
     * @param balance = player's balance for betting with
     * @param bet = Player's amount they wish to bet on every hand with
     */

    public Player(String username,double balance,double bet){
        setUsername(username);
        setBalance(balance);
        setBet(bet);
    }


    /**
     * Changes the amount of the bet for every
     * hand the player plays
     * @param bet = The Players bet.
     */

    public void setBet(double bet) {
        this.bet = bet;
    }

    /**
     * Changes the amount of the balance for the
     * player of which he uses to bet with
     * @param balance = The Players balance.
     */

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Changes the username of the
     * player of which he uses
     * @param username = The Players username.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the balance of the Player.
     * @return the Player's balance.
     */

    public double getBalance() {
        return balance;
    }


    /**
     * Gets the username of the Player.
     * @return the Player's username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the bet of the Player.
     * @return the Player's bet.
     */
    public double getBet() {
        return bet;
    }

    /**
     *This is the toString method which returns the values of the attributes
     * inside the object
     * @return the attributes as a String
          */
    public String toString() {
        return "Username : "+username+ "\nBalance : "+balance;
    }
}
