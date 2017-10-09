package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;

import pkgException.DeckException;

public class DeckTest {

	@Test (expected = DeckException.class) 
	public void TestEmptyDeck() throws DeckException {
		Deck d = new Deck();
		for (int k = 1; k < 54; k++) {
			d.Draw();
		}		
	}
	
	@Test
	public void TestDrawSuit() {
		Deck d = new Deck();
		Card c = d.Draw(eSuit.CLUBS);
		assertTrue(c.geteSuit() == eSuit.CLUBS);
	}
	
	@Test
	public void TestDrawRank() {
		Deck d = new Deck();
		Card c = d.Draw(eRank.QUEEN);
		assertTrue(c.geteRank() == eRank.QUEEN);
	}
	
	@Test
	public void TestDeckRankCount() {
		Deck d = new Deck();
		assertTrue(d.Count(eRank.KING) == 4);
	}
	
	@Test
	public void TestDeckSuitCount() {
		Deck d = new Deck();
		assertTrue(d.Count(eSuit.SPADES) == 13);
	}

}
