package com.rpg;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnemyUnitTest {

	@Test
	public void testEnemy() {
		Enemy enemy = new Enemy(2, 3, "Inimigo");
		assertEquals(2, enemy.getSkill());
		assertEquals(3, enemy.getEnergy());
		assertEquals("Inimigo", enemy.getName());
	}
	
	@Test
	public void testHit() {
		Enemy enemy = new Enemy(2, 3, "Inimigo");
		enemy.setEnergy(1);
		enemy.getHit();
		
		assertEquals(0, enemy.getEnergy());
		
		enemy.getHit();
		
		assertEquals(0, enemy.getEnergy());
	}

}
