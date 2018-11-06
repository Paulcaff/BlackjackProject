public class Player {
    private String username;
    private double balance;


    public Player(){
        this.username = "Not Set";
        this.balance = 0;
    }

    public Player(String username,double balance ){
        setBalance(balance);
        setUsername(username);
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
