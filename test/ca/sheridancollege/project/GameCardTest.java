
package ca.sheridancollege.project;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Samuel Verdejo
 * @author Jacob Kosiba
 * @author Jiaxin Yan
 * @author Cody Fletcher
 */
public class GameCardTest {

    /**
     * Test of checkSuit method, of class GameCard.
     */
    @Test
    public void testCheckSuitGood() {
        System.out.println("checkSuit good");
        String value = "DIAMONDS";
        boolean expResult = true;
        boolean result = GameCard.checkSuit(value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckSuitBad() {
        System.out.println("checkSuit bad");
        String value = "apples";
        boolean expResult = false;
        boolean result = GameCard.checkSuit(value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckSuitBoundary() {
        System.out.println("checkSuit boundary");
        String value = "SPADES";
        boolean expResult = true;
        boolean result = GameCard.checkSuit(value);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkValue method, of class GameCard.
     */
    @Test
    public void testCheckValueGood() {
        System.out.println("checkValue good");
        String value = "2";
        boolean expResult = true;
        boolean result = GameCard.checkValue(value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckValueBad() {
        System.out.println("checkValue bad");
        String value = "apples";
        boolean expResult = false;
        boolean result = GameCard.checkValue(value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckValueBoundary() {
        System.out.println("checkValue boundary");
        String value = "KING";
        boolean expResult = true;
        boolean result = GameCard.checkValue(value);
        assertEquals(expResult, result);
    }
    
}
