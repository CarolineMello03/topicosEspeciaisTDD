package com.rpg;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceUnitTest {

	@Test
	public void testDice() {
		Dice dice = new Dice(6);
		assertEquals(6, dice.getSides());
	}
	
	@Test
	public void testRollDice() {
		Dice dice = new Dice(6);
		int roll = dice.rollDice();
		
		assertTrue(roll >= 1 && roll <= 6);
	}
	
	@Test
	public void testRollDiceSum() {
		Dice dice = new Dice(6);
		int roll = dice.rollDiceSum(3);
		
		assertTrue(roll >= 4 && roll <= 9);
	}

	@Test
	public void testRollDiceMult() {
		Dice dice = new Dice(6);
		int roll = dice.rollDiceMult(2);
		
		assertTrue(roll % 2 == 0);
	}
}
