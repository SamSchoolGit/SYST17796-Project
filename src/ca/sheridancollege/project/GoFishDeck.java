
package ca.sheridancollege.project;

/**
 *
 * @author Samuel Verdejo
 * @author Jacob Kosiba
 * @author Jiaxin Yan
 * @author Cody Fletcher
 */

public class GoFishDeck extends GroupOfCards {
    public GoFishDeck(int size) {
        super(size);
    }
    
    //Create hand for player
    public void createHand(GoFishPlayer p) {
        for (int i = 0; i < 7; i++) {
            p.getHand().getCards().add(drawCard());
        }
    }
    
    //Draw cards
    public Card drawCard() {
        Card card = this.getCards().get(0);
        this.getCards().remove(card);
        this.shuffle();
        return card;
    }
    
    //If the deck has no more empty
    public boolean deckEmpty() {
        if (this.getCards().isEmpty()) {
            return true;
        }
        
        return false;
    }
}
