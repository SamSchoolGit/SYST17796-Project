
package ca.sheridancollege.project;

import java.util.*;

/**
 *
 * @author Samuel Verdejo
 * @author Jacob Kosiba
 * @author Jiaxin Yan
 * @author Cody Fletcher
 */
public class GoFishPlayer extends Player {
    private ArrayList<GoFishPlayer> opponents;
    GoFishDeck deck = null;
    
    public GoFishPlayer(String name, GoFishDeck deck) {
        super(name);
        hand = new PlayerHand(7);
        opponents = new ArrayList();
        this.deck = deck;
    }
    //hand for player
    private PlayerHand hand;
    
    //return hand
    public PlayerHand getHand() {
        return hand;
    }
    
    public void setOpponents(ArrayList<GoFishPlayer> players) {
        opponents = players;
    }
    
    
    //pick up card from deck
    public void pickUpCard() {
        hand.getCards().add(deck.drawCard());
    }
    
    //TO BE TESTED
    //check if player has given card
    public static boolean hasCard(String value, ArrayList<Card> cards) {
        for (Card c: cards) {
            if (c instanceof GameCard) {
                if (value.equals(((GameCard) c).getValue())) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    //Ask for card from player
    public void askForCard(String value, GoFishPlayer p) {
        if (GoFishPlayer.hasCard(value, p.hand.getCards())) {
            for (Card c: p.hand.getCards()) {
                if (c instanceof GameCard) {
                    if (((GameCard) c).getValue().equals(value)) {
                        this.getHand().getCards().add(c);
                        p.removeCard((GameCard)c);
                    }
                }
            }

        }
    }
    
    //remove card from deck
    public void removeCard(GameCard card) {
        hand.getCards().remove(card);
    }
    
    //play method
    @Override
    public void play() {
       this.askForCard("3", opponents.get(1));
       
       if(!GoFishPlayer.hasCard("3", opponents.get(1).getHand().getCards())) {
           this.pickUpCard();
       }
    }
}
