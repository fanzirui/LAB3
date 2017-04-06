package pkgPokerBLL;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;


import PkgException.HandException;

import pkgPokerEnum.eHandStrength;

import pkgPokerEnum.eRank;

import pkgPokerEnum.eSuit;

public class Hand_Test2 {

	@BeforeClass

	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass

	public static void tearDownAfterClass() throws Exception {

	}

	@Before

	public void setUp() throws Exception {

	}

	@After

	public void tearDown() throws Exception {

	}

	@Test

	public void TestRodyalFlush() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.JACK, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.QUEEN, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.KING, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.RoyalFlush);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

	}

	@Test

	public void TestRodyalFlush1() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.JACK, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.QUEEN, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.KING, 1));

		h.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.RoyalFlush);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

	}

	@Test

	public void TestStraightFlush() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.JACK, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.QUEEN, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.KING, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.NINE, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	@Test

	public void TestStraightFlush1() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.JACK, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.QUEEN, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.KING, 1));

		h.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}



	@Test
	public void TestFiveOfAKind() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.FiveOfAKind);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

	}
	
	@Test

	public void TestFourOfAKind() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.SIX, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.FourOfAKind);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

	}

	@Test

	public void TestFourOfAKind1() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.FourOfAKind);

		assertTrue(h.getHandScore().getHiHand() == eRank.TEN);

	}

	@Test

	public void TestFourOfAKind2() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.FourOfAKind);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

	}


	
	@Test

	public void TestFullHouse1() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TWO, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.FullHouse);

		assertTrue(h.getHandScore().getHiHand() == eRank.TEN);

		assertTrue(h.getHandScore().getLoHand() == eRank.TWO);

	}

	@Test

	public void TestFullHouse2() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TEN, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.FullHouse);

		assertTrue(h.getHandScore().getHiHand() == eRank.TWO);

		assertTrue(h.getHandScore().getLoHand() == eRank.TEN);

	}

	@Test

	public void TestFullHouse3() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TWO, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}
		

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.FullHouse);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

		assertTrue(h.getHandScore().getLoHand() == eRank.TWO);

	}

	@Test

	public void TestFlush() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.KING, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.Flush);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

	}

	@Test

	public void TestFlush1() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.NINE, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.SIX, 1));

		h.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}
	
		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.Flush);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

	}

	@Test

	public void TestStraight1() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.FIVE, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.SIX, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.Straight);

		assertTrue(h.getHandScore().getHiHand() == eRank.SIX);

		assertTrue(h.getHandScore().getLoHand() == null);

	}

	@Test

	public void TestStraight2() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.FIVE, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.Straight);

		assertTrue(h.getHandScore().getHiHand() == eRank.FIVE);

		assertTrue(h.getHandScore().getLoHand() == null);

	}

	@Test

	public void TestStraight3() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.SIX, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.FIVE, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertFalse(h.getHandScore().getHandStrength() == eHandStrength.Straight);

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.HighCard);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

		assertTrue(h.getHandScore().getLoHand() == null);

	}

	@Test

	public void TestStraight4() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.SIX, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertFalse(h.getHandScore().getHandStrength() == eHandStrength.Straight);

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.Pair);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

		assertTrue(h.getHandScore().getLoHand() == null);

	}

	
	@Test

	public void TestAcesAndEights1() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.EIGHT, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.EIGHT, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}


		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.AcesAndEights);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

		assertTrue(h.getHandScore().getLoHand() == eRank.EIGHT);

	}

	@Test
	
	public void TestAcesAndEights2() {

		Hand h = new Hand();

	
		h.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.QUEEN, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.EIGHT, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.EIGHT, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		
		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.AcesAndEights);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

		assertTrue(h.getHandScore().getLoHand() == eRank.EIGHT);

	}

	

	
	@Test

	public void ThreeOfAKind1() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.ThreeOfAKind);

		assertTrue(h.getHandScore().getHiHand() == eRank.TWO);

	}

	@Test

	public void ThreeOfAKind2() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.THREE, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.ThreeOfAKind);

		assertTrue(h.getHandScore().getHiHand() == eRank.THREE);

	}

	@Test

	public void ThreeOfAKind3() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TWO, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.ThreeOfAKind);

		assertTrue(h.getHandScore().getHiHand() == eRank.FOUR);

	}

	@Test

	public void ThreeOfAKind4() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER, 1));

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.EIGHT, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		
		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.ThreeOfAKind);
		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

	}

	@Test

	public void TwoPair1() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.TwoPair);

		assertTrue(h.getHandScore().getHiHand() == eRank.TEN);

		assertTrue(h.getHandScore().getLoHand() == eRank.THREE);

	}

	@Test

	public void TwoPair2() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.SIX, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.TwoPair);

		assertTrue(h.getHandScore().getHiHand() == eRank.TEN);

		assertTrue(h.getHandScore().getLoHand() == eRank.THREE);

	}

	@Test

	public void TwoPair3() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TWO, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.TwoPair);

		assertTrue(h.getHandScore().getHiHand() == eRank.TEN);

		assertTrue(h.getHandScore().getLoHand() == eRank.THREE);

	}

	@Test

	public void Pair1() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.KING, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.Pair);

		assertTrue(h.getHandScore().getHiHand() == eRank.KING);

		assertTrue(h.getHandScore().getLoHand() == null);

	}

	@Test

	public void Pair2() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.KING, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.Pair);

		assertTrue(h.getHandScore().getHiHand() == eRank.KING);

		assertTrue(h.getHandScore().getLoHand() == null);

	}

	@Test

	public void Pair3() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.JACK, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.JACK, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.Pair);

		assertTrue(h.getHandScore().getHiHand() == eRank.JACK);

		assertTrue(h.getHandScore().getLoHand() == null);

	}

	@Test

	public void Pair4() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.JACK, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.Pair);

		assertTrue(h.getHandScore().getHiHand() == eRank.TWO);

		assertTrue(h.getHandScore().getLoHand() == null);

	}

	@Test
	public void Pair5() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.KING, 1));

		h.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.Pair);

		assertTrue(h.getHandScore().getHiHand() == eRank.ACE);

		assertTrue(h.getHandScore().getLoHand() == null);

	}

	@Test

	public void HighCard() {

		Hand h = new Hand();

		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TWO, 1));

		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.JACK, 1));

		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));

		try {

			h = h.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		assertTrue(h.getHandScore().getHandStrength() == eHandStrength.HighCard);

		assertTrue(h.getHandScore().getHiHand() == eRank.KING);

	}

	
	@Test

	public void WinHand1() {

		ArrayList<Hand> HandList = new ArrayList<>();

		Hand h1 = new Hand();

		h1.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		h1.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h1.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.ACE, 1));

		h1.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.ACE, 1));

		h1.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER, 1));
		

		try {

			h1 = h1.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}


		Hand h2 = new Hand();

		h2.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.THREE, 1));

		h2.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h2.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h2.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.JACK, 1));

		h2.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));
		

		try {

			h2 = h2.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		HandList.add(h1);
		HandList.add(h2);

		try {
			assertEquals(Hand.PickBestHand(HandList), h1);
		} catch (HandException e) {
			
			e.printStackTrace();
		}

	}
		
	@Test
	
	public void WinHand2(){
		
		ArrayList<Hand> HandList = new ArrayList<>();

		Hand h1 = new Hand();

		h1.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TWO, 1));

		h1.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h1.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h1.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.JACK, 1));

		h1.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));

		try {

			h1 = h1.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		
		
		Hand h2 = new Hand();

		h2.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN, 1));

		h2.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.JACK, 1));

		h2.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.QUEEN, 1));

		h2.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.KING, 1));

		h2.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER, 1));
		

		try {

			h2 = h2.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}
	
	
		HandList.add(h1);
		HandList.add(h2);

		try {
			assertEquals(Hand.PickBestHand(HandList), h2);
		} catch (HandException e) {
			
			e.printStackTrace();
		}

	}
	
	@Test
	
	public void WinHand3(){
		
		ArrayList<Hand> HandList = new ArrayList<>();
	
		Hand h1 = new Hand();

		h1.AddToCardsInHand(new Card(eSuit.SPADES, eRank.EIGHT, 1));

		h1.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TWO, 1));

		h1.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 1));

		h1.AddToCardsInHand(new Card(eSuit.SPADES, eRank.FOUR, 1));

		h1.AddToCardsInHand(new Card(eSuit.SPADES, eRank.KING, 1));
		

		try {

			h1 = h1.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}
		

		Hand h2 = new Hand();

		h2.AddToCardsInHand(new Card(eSuit.SPADES, eRank.FOUR, 1));

		h2.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));
		
		h2.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TWO, 1));

		h2.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.EIGHT, 1));

		h2.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.EIGHT, 1));
		

		try {

			h2 = h2.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}
		
		HandList.add(h1);
		HandList.add(h2);

		try {
			assertEquals(Hand.PickBestHand(HandList), h1);
		} catch (HandException e) {
			
			e.printStackTrace();
		}
	}


	
	@Test

	public void WinHand4() {

		ArrayList<Hand> HandList = new ArrayList<>();

		Hand h1 = new Hand();

		h1.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h1.AddToCardsInHand(new Card(eSuit.SPADES, eRank.QUEEN, 1));

		h1.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h1.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN, 1));

		h1.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));
		

		try {

			h1 = h1.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}


		Hand h2 = new Hand();

		h2.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		h2.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h2.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h2.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.EIGHT, 1));

		h2.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.EIGHT, 1));
		

		try {

			h2 = h2.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		HandList.add(h1);
		HandList.add(h2);

		try {
			assertEquals(Hand.PickBestHand(HandList), h2);
		} catch (HandException e) {
			
			e.printStackTrace();
		}
	}
	
	// Test for a HandException when you try to evaluate a hand with not equal to 5 cards
	@Test(expected=HandException.class)
	public void test_HandException1() throws HandException {
		
		Hand h2 = new Hand();
		
		h2.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE, 1));

		h2.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE, 1));

		h2.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h2.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.EIGHT, 1));
	
		h2.EvaluateHand();
		}
	
	// Test for a HandException when top two hands are tied
	@Test(expected=HandException.class)
	public void test_HandException2() throws HandException {
		
		ArrayList<Hand> HandList = new ArrayList<>();

		Hand h1 = new Hand();

		h1.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h1.AddToCardsInHand(new Card(eSuit.SPADES, eRank.QUEEN, 1));

		h1.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h1.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN, 1));

		h1.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));
		

		try {

			h1 = h1.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}


		Hand h2 = new Hand();

		h2.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 1));

		h2.AddToCardsInHand(new Card(eSuit.SPADES, eRank.QUEEN, 1));

		h2.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR, 1));

		h2.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN, 1));

		h2.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.KING, 1));
		

		try {

			h2 = h2.EvaluateHand();

		} catch (Exception e) {

			e.printStackTrace();

		}

		HandList.add(h1);
		HandList.add(h2);
		Hand.PickBestHand(HandList);
	}

}