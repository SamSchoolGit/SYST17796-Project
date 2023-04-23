/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.*;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author Samuel Verdejo
 * @author Jacob Kosiba
 * @author Jiaxin Yan
 * @author Cody Fletcher
 */
public class GoFishPlayerTest {

    /**
     * Test of hasCard method, of class GoFishPlayer.
     */
    @Test
    public void testHasCardGood() {
        System.out.println("hasCard good");
        String value = "2";
        ArrayList<Card> cards = new ArrayList<>(Arrays.asList(
                new GameCard("DIAMONDS","2"),
                new GameCard("SPADES","5"),
                new GameCard("CLUBS","3"),
                new GameCard("HEARTS","2")
        ));
        boolean expResult = true;
        boolean result = GoFishPlayer.hasCard(value, cards);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHasCardBad() {
        System.out.println("hasCard bad");
        String value = "2";
        ArrayList<Card> cards = new ArrayList<>(Arrays.asList(
                new GameCard("DIAMONDS","5"),
                new GameCard("CLUBS","5"),
                new GameCard("CLUBS","3"),
                new GameCard("HEARTS","8")
        ));
        boolean expResult = false;
        boolean result = GoFishPlayer.hasCard(value, cards);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHasCardBoundary() {
        System.out.println("hasCard boundary");
        String value = "2";
        ArrayList<Card> cards = new ArrayList<>(Arrays.asList(
                new GameCard("DIAMONDS","2"),
                new GameCard("DIAMONDS","5"),
                new GameCard("CLUBS","6"),
                new GameCard("HEARTS","9")
        ));
        boolean expResult = true;
        boolean result = GoFishPlayer.hasCard(value, cards);
        assertEquals(expResult, result);
    }

}