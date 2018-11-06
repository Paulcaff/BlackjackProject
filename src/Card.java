public class Card {

    private String suit;
    private String value;

    public Card(){
        this ("0", "0");
    }

    public Card(String suit, String value){
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
}
