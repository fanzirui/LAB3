package PkgException;

import pkgPokerBLL.Deck;

public class DeckException extends Exception{

	
	private Deck deck;
		
	public DeckException(Deck deck){
		super("This is an empty deck"); 	
		this.deck=deck;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
	
	

}
