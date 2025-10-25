package com.rpg;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemUnitTest {

	@Test
	public void testItem() {
		Item item = new Item("Espada");
		
		assertEquals("Espada", item.getName());
	}

}
