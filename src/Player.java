import java.io.Serializable;

public class Player implements Serializable {
    private String username;
    private double balance;
    private double bet;


//No argument Constructo
    public Player(){
        this.username = "Not Set";
        this.balance = 0;
        this.bet = 0;
    }
//3 Argument constructor
    public Player(String username,double balance,double bet ){
        setBalance(balance);
        setUsername(username);
        setBet(bet);
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
