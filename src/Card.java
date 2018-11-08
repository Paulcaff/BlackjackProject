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


            case "Two":
                setNumber(2);
                break;

            case "Three":
                setNumber(3);
                break;

            case "Four":
                setNumber(4);
                break;

            case "Five":
                setNumber(5);
                break;

            case "Six":
                setNumber(6);
                break;

            case "Seven":
                setNumber(7);
                break;

            case "Eight":
                setNumber(8);
                break;
                case "Nine":
                setNumber(9);
                break;

                case "Ten":
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
}
