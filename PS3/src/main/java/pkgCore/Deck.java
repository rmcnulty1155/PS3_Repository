package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {

	private ArrayList<Card> cardsInDeck = new ArrayList<Card>();

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	public Card Draw() throws DeckException {
		if (this.cardsInDeck.size() == 0) {
			throw new DeckException(this);
		}
		return cardsInDeck.remove(0);
	}
		
	public Card Draw(eSuit eSuit) {
		for (Card c: this.cardsInDeck) {
			if (c.geteSuit()==eSuit) {
				cardsInDeck.remove(c); 
				return c;
				}
			}
	return null;
	}
	
	public Card Draw(eRank eRank) {
		for (Card c: this.cardsInDeck) {
			if (c.geteRank()==eRank) {
				cardsInDeck.remove(c); 
				return c;
				}
			}
	return null;
	}
	
	public int Count(eSuit eSuit) {
		int count = 0;
		for (Card c: this.cardsInDeck) {
			if (c.geteSuit()==eSuit) {
				count++;
				}
			}
		return count;	
		}
		
	public int Count(eRank eRank) {
		int count = 0;
		for (Card c: this.cardsInDeck) {
			if (c.geteRank()==eRank) {
				count++;
				}
			}
		return count;	
		}
		
	public int Count(Card c) {
	for (Card crds: cardsInDeck) {
		if (crds ==c)
			return 1; 
		}
	return 0;
	}

}
