import javax.swing.*;

public class Card {

    private String suit;
    private String value;
    private int number = 0;

    public Card(){
        this ("0", "0");
    }

    public Card(String suit, String value){
        this.setNumberFromValue(value);
        setSuit(suit);
        setValue(value);
    }



    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumberFromValue(String value) {

        int number;

        switch(value) {


            case "2":
                setNumber(2);
                break;

            case "3":
                setNumber(3);
                break;

            case "4":
                setNumber(4);
                break;

            case "5":
                setNumber(5);
                break;

            case "6":
                setNumber(6);
                break;

            case "7":
                setNumber(7);
                break;

            case "8":
                setNumber(8);
                break;
                case "9":
                setNumber(9);
                break;

                case "10":
                setNumber(10);
                break;

                case "Jack":
                setNumber(10);
                break;
            case "Queen":
                setNumber(10);
                break;
            case "King":
                setNumber(10);
                break;

            case "Ace":
                setNumber(11);
                break;
        }

    }

    public String toString(){
        return "\nCard:"+value+" "+ suit  + "\nNumber Value : "+number;
    }

    public String cardString(){
        return ""+value+" "+ suit+ "\n\n\n        "+value+" "+ suit;
    }


}
