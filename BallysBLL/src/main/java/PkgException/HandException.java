package PkgException;

import pkgPokerBLL.Hand;

public class HandException extends Exception {
	
	private Hand invalidHand;
	public HandException(Hand invalidHand) {
		super("There is no five cards in hand");
		this.invalidHand=invalidHand;
	}
	public Hand getInvalidHand() {
		return invalidHand;
	}
	public void setInvalidHand(Hand invalidHand) {
		this.invalidHand = invalidHand;
	}

}
