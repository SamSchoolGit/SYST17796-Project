package ca.sheridancollege.project;


import ca.sheridancollege.project.GoFishGame;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Samuel Verdejo
 * @author Jacob Kosiba
 * @author Jiaxin Yan
 * @author Cody Fletcher
 */
public class GoFishGameTest {
    /**
     * Test of isAutoWinner method, of class GoFishGame.
     */
    @Test
    public void testIsAutoWinnerGood() {
        System.out.println("isAutoWinner good");
        int count = 13;
        boolean expResult = true;
        boolean result = GoFishGame.isAutoWinner(count);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsAutoWinnerBad() {
        System.out.println("isAutoWinner bad");
        int count = 0;
        boolean expResult = false;
        boolean result = GoFishGame.isAutoWinner(count);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsAutoWinnerBoundary() {
        System.out.println("isAutoWinner boundary");
        int count = 13;
        boolean expResult = true;
        boolean result = GoFishGame.isAutoWinner(count);
        assertEquals(expResult, result);
    }
    
}
