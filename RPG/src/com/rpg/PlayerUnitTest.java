package com.rpg;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerUnitTest {

	@Test
	public void testPlayer() {
		Player player = new Player();
		
		assertEquals(6, player.getInventory().getSize());
		assertTrue(player.getEnergy() >= 14 && player.getEnergy() <= 24);
		assertTrue(player.getLuck() >= 7 && player.getLuck() <= 12);
		assertTrue(player.getSkill() >= 7 && player.getSkill() <= 12);
	}
	
	@Test
	public void testluckFail() {
		Player player = new Player();
		player.setLuck(1);
		boolean result = player.testLuck();
		
		assertTrue(!result);
	}
	
	@Test
	public void testLuckSuccess() {
		Player player = new Player();
		player.setLuck(13);
		boolean result = player.testLuck();
		
		assertTrue(result);
	}
	
	@Test
	public void testHit() {
		Player player = new Player();
		player.setEnergy(1);
		player.getHit();
		
		assertEquals(0, player.getEnergy());
		
		player.getHit();
		
		assertEquals(0, player.getEnergy());
	}
	
	@Test
	public void testAddEnergy() {
		Player player = new Player();
		player.setEnergy(6);
		player.addEnergy(2);
		
		assertEquals(8, player.getEnergy());
	}
}
