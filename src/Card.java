public class Card {

    private String suit;
    private int value;

    public Card(String suit, int value){
        setSuit(suit);
        setValue(value);
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
}
