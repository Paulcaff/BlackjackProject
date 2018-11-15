public class Player {
    private String username;
    private double balance;
    private double bet;



    public Player(){
        this.username = "Not Set";
        this.balance = 0;
        this.bet = 0;
    }

    public Player(String username,double balance,double bet ){
        setBalance(balance);
        setUsername(username);
        setBet(bet);
    }

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }


    public String toString() {
        return "Username : "+username+ "\nBalance : "+balance;
    }
}
