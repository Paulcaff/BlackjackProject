import javax.swing.*;
import java.io.Serializable;

public class Player implements Serializable {
    private String username;
    private double balance;
    private double bet;
    private boolean valid;
    private String balanceAsString;
    private String betAsString;


//No argument Constructo
    public Player(String username,double balance,double bet){
        setUsername(username);
        setBalance(balance);
        setBet(bet);
    }
//3 Argument constructor
    public Player() {

    }


// mutator methods
    public void setBet(double bet) {
        this.bet = bet;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//accessor methods
    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }

    public double getBet() {
        return bet;
    }

//toString Method
    public String toString() {
        return "Username : "+username+ "\nBalance : "+balance;
    }
}
