package com.rpg;

import static org.junit.Assert.*;

import org.junit.Test;

public class InventoryUnitTest {
	
	@Test
	public void testInventory() {
		Inventory inventory = new Inventory(6);
		
		// Must be equal if created correctly
		assertEquals(6, inventory.getSize());
		assertEquals(6, inventory.getEmptySlots());
	}

	@Test
	public void testAddItem() {
		Inventory inventory = new Inventory(6);
		boolean output = inventory.addItem(new Item("Espada"));
		
		// Must be true if added correctly
		assertTrue(output);
		// Must be true if the item exists in the inventory
		assertTrue(inventory.checkItem("Espada"));
	}
	
	@Test
	public void testRemoveItem() {
		Inventory inventory = new Inventory(6);
		inventory.addItem(new Item("Espada"));
		
		boolean output = inventory.removeItem("Espada");
		
		// Must be true if the item exists in the inventory and was removed correctly
		assertTrue(output);
		// Must be false if the item is no longer in the inventory
		assertTrue(!inventory.checkItem("Espada"));
	}
	
	@Test
	public void testRemoveAllItem() {
		Inventory inventory = new Inventory(6);
		inventory.addItem(new Item("Espada"));
		inventory.addItem(new Item("Espada"));
		inventory.addItem(new Item("Espada"));
		
		assertEquals(3, inventory.getEmptySlots());
		
		boolean output = inventory.removeAllItem("Espada");
		
		assertTrue(output);
		assertEquals(6, inventory.getEmptySlots());
		
		output = inventory.removeAllItem("Espada");
		
		assertTrue(!output);
	}
	
	@Test
	public void testClearInventory() {
		Inventory inventory = new Inventory(6);
		inventory.addItem(new Item("Espada"));
		inventory.addItem(new Item("Poção"));
		inventory.addItem(new Item("Poção"));
		
		assertEquals(3, inventory.getEmptySlots());
		
		inventory.clearInventory();
		
		assertEquals(6, inventory.getEmptySlots());
	}

	@Test
	public void testFullInventory() {
		Inventory inventory = new Inventory(6);
		inventory.addItem(new Item("Espada"));
		inventory.addItem(new Item("Poção"));
		inventory.addItem(new Item("Poção"));
		inventory.addItem(new Item("Arco"));
		inventory.addItem(new Item("Poção"));
		inventory.addItem(new Item("Poção"));
		
		assertEquals(0, inventory.getEmptySlots());
		
		boolean output = inventory.addItem(new Item("Espada"));
		
		// Must be false if inventory full
		assertTrue(!output);
	}
}
