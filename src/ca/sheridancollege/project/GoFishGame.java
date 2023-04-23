
package ca.sheridancollege.project;

import java.util.*;

/**
 *
 * @author Samuel Verdejo
 * @author Jacob Kosiba
 * @author Jiaxin Yan
 * @author Cody Fletcher
 */
public class GoFishGame extends Game {
    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    
    public GoFishGame(String name) {
        super(name);
    }
    
    @Override
    public void play() {
        
        GoFishDeck deck = new GoFishDeck(52);
        
        ArrayList<Player> players = new ArrayList<>(Arrays.asList(
            new GoFishPlayer("Player1", deck),
            new GoFishPlayer("Player2", deck),
            new GoFishPlayer("Player3", deck),
            new GoFishPlayer("Player4", deck)
        ));
        
        this.setPlayers(players);
        
        for (Player p: players) {
            if (p instanceof GoFishPlayer) {
                deck.createHand((GoFishPlayer) p);
            }
        }
       
        while (!deck.deckEmpty()) {
            for (Player p: players) {
                if (p instanceof GoFishPlayer) {
                    p.play();
                }
            }
        }
        
        declareWinner();
    }

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    @Override
    public void declareWinner() {
        GoFishPlayer winner = null;
        
        for (Player p: this.getPlayers()) {
            if (p instanceof GoFishPlayer) {
                if (GoFishGame.isAutoWinner(((GoFishPlayer) p).getHand().getBookCount())) {
                    winner = (GoFishPlayer)p;
                    break;
                }
                
                int max = 0;
                if (((GoFishPlayer) p).getHand().getBookCount() > max) {
                    max = ((GoFishPlayer) p).getHand().getBookCount();
                    winner = (GoFishPlayer)p;
                }
            }
        }
        
        System.out.println("Winner is " + winner.getName());
    }
    
    public static boolean isAutoWinner(int count) {
        return count == 13;
    }
}

