package com.rpg;

import java.util.Scanner;

public class Battle {
	private Player player;
	private Enemy enemy;
	private Scanner scanner;
	
	public Battle(Player player, Enemy enemy, Scanner scanner) {
		this.player = player;
		this.enemy = enemy;
		this.scanner = scanner;
	}
	
	public boolean start() {
		
		Dice dice = new Dice(6);
		
		while (true) {
			System.out.println("Rolar os dados (1).");
			
			int input = scanner.nextInt();
			
			if (input == 1) {
				int firstRollPlayer = dice.rollDice();
				int secondRollPlayer = dice.rollDice();
				int firstRollEnemy = dice.rollDice();
				int secondRollEnemy = dice.rollDice();
				
				int playerResult = firstRollPlayer + secondRollPlayer + player.getSkill();
				int enemyResult = firstRollEnemy + secondRollEnemy + enemy.getSkill();
				
				System.out.println("\nResultado dos dados do jogador:"
						+ "Primeiro dado: " + firstRollPlayer
						+ "\nSegundo dado: " + secondRollPlayer
						+ "\n\nResultado: " + playerResult);
				
				System.out.println("\nResultado dos dados do inimigo:"
						+ "Primeiro dado: " + firstRollEnemy
						+ "\nSegundo dado: " + secondRollEnemy
						+ "\n\nResultado: " + enemyResult);
				
				if (playerResult > enemyResult) {
					enemy.getHit();
				} else if (playerResult < enemyResult) {
					player.getHit();
				}
				
				System.out.println("Status atualizados:");
				System.out.println("\nJogador:");
				player.printAttributes();
				
				System.out.println(enemy.getName() + ":");
				enemy.printAttributes();
				
				if (enemy.getEnergy() <= 0) {
					return true;
				} else if (player.getEnergy() <= 0) {
					return false;
				}
			}
		}
	}
}
