
package ca.sheridancollege.project;

import java.util.*;
/**
 *
 * @author Samuel Verdejo
 * @author Jacob Kosiba
 * @author Jiaxin Yan
 * @author Cody Fletcher
 */
public class PlayerHand extends GroupOfCards {
    public PlayerHand(int size) {
        super(size);
    }
    //count for how many books
    private int bookCount = 0;
   
    //method to create book as well as if successful in finding/creating book
    public void createBook(String value) {
        if (PlayerHand.isValidBook(this.getCards(), value)) {
            bookCount++;
        }
    }
    
    //return book count
    public int getBookCount() {
        return bookCount;
    }
    
    public static boolean isValidBook(ArrayList<Card> cards, String value) {
        int count = 0;
        for (Card c: cards) {
            if (c instanceof GameCard) {
                if (((GameCard)c).getValue().equals(value) && GameCard.checkSuit(((GameCard)c).getSuit())) {
                    count++;
                }
            }
        }
        
        return count == 4;
    }
}
