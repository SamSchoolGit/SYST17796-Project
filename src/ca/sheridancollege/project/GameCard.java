
package ca.sheridancollege.project;

/**
 *
 * @author Samuel Verdejo
 * @author Jacob Kosiba
 * @author Jiaxin Yan
 * @author Cody Fletcher
 */

public class GameCard extends Card {
    private String suit;
    private String value;

    public GameCard(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }
    
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public static boolean checkSuit(String value) {
        String[] suits = {"DIAMONDS", "CLUBS", "HEARTS", "SPADES"};
        
        for (String s: suits) {
            if (value.equals(s)) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean checkValue(String value) {
        String[] values = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
        
        for (String s: values) {
            if (value.equals(s)) {
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return (value + " of " + suit);
    }
}
