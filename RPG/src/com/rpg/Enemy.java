package com.rpg;

public class Enemy {
	private int skill;
	private int energy;
	private String name;
	
	public Enemy(int skill, int energy, String name) {
		this.skill = skill;
		this.energy = energy;
		this.name = name;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void getHit() {
		energy -= 2;
		if (energy < 0) {
			energy = 0;
		}
	}
	
	public void printAttributes() {
		System.out.println("Habilidade: " + skill);
		System.out.println("Energia: " + energy);
		System.out.println();
	}
}
