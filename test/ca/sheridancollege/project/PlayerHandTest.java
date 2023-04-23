
package ca.sheridancollege.project;

import java.util.*;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Samuel Verdejo
 * @author Jacob Kosiba
 * @author Jiaxin Yan
 * @author Cody Fletcher
 */
public class PlayerHandTest {
   
    /**
     * Test of isValidBook method, of class PlayerHand.
     */
    @Test
    public void testIsValidBookGood() {
        System.out.println("isValidBook good");
        ArrayList<Card> cards = new ArrayList<>(Arrays.asList(
                new GameCard("DIAMONDS","2"),
                new GameCard("SPADES","2"),
                new GameCard("CLUBS","2"),
                new GameCard("HEARTS","2")
        ));
        String value = "2";
        boolean expResult = true;
        boolean result = PlayerHand.isValidBook(cards, value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidBookBad() {
        System.out.println("isValidBook bad");
        ArrayList<Card> cards = new ArrayList<>(Arrays.asList(
                new GameCard("DIAMONNDS","2"),
                new GameCard("SPADES","3"),
                new GameCard("CLUBS","2"),
                new GameCard("HEARTS","2")
        ));
        String value = "2";
        boolean expResult = false;
        boolean result = PlayerHand.isValidBook(cards, value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidBookBoundary() {
        System.out.println("isValidBook boundary");
        ArrayList<Card> cards = new ArrayList<>(Arrays.asList(
                new GameCard("DIAMONDS","2"),
                new GameCard("SPADES","2"),
                new GameCard("CLUBS","2"),
                new GameCard("HEARTS","2")
        ));
        String value = "2";
        boolean expResult = true;
        boolean result = PlayerHand.isValidBook(cards, value);
        assertEquals(expResult, result);
    }
    
}
