package com.rpg;

public class Dice {
	private int sides;
	
	public Dice(int sides) {
		this.sides = sides;
	}
	
	public int getSides() {
		return sides;
	}
	
	// Roll dice
	public int rollDice() {
		int result = (int)(Math.random() * (sides)) + 1;
		
		return result;
	}
	
	// Roll dice and sum number
	public int rollDiceSum(int sum) {
		int result = rollDice() + sum;
		
		return result;
	}
	
	// Roll dice and multiply by number
	public int rollDiceMult(int mult) {
		int result = rollDice() * mult;
		
		return result;
	}
}
