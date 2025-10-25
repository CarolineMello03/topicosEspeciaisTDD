package com.rpg;

public class Player {
	private int skill;
	private int luck;
	private int energy;
	private Inventory inventory;
	
	// Rolls attributes dices when player instance is created
	public Player() {
		Dice dice = new Dice(6);
		
		skill = dice.rollDiceSum(6);
		luck = dice.rollDiceSum(6);
		energy = dice.rollDiceSum(6) + dice.rollDiceSum(6);
		
		inventory = new Inventory(6);
	}
	
	public int getSkill() {
		return skill;
	}
	
	public void setSkill(int skill) {
		this.skill = skill;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public Inventory getInventory() {
		return inventory;
	}
	
	public void getHit() {
		energy -= 2;
		if (energy < 0) {
			energy = 0;
		}
	}
	
	public void addEnergy(int n) {
		energy += n;
	}
	
	public boolean testLuck() {
		Dice dice = new Dice(6);
		
		int first = dice.rollDice();
		int second = dice.rollDice();
		
		System.out.println("Resultado do primeiro dado: " + first);
		System.out.println("Resultado do segundo dado: " + second);
		
		int result = first + second;
		
		System.out.println("Resultado: " + result);
		
		if(luck > result) {
			return true;
		}
		
		return false;
	}
	
	public void printAttributes() {
		System.out.println("Sorte: " + luck);
		System.out.println("Habilidade: " + skill);
		System.out.println("Energia: " + energy);
		System.out.println();
		inventory.printItems();
		System.out.println();
	}
}
