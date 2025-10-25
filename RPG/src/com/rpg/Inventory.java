package com.rpg;

public class Inventory {
	public Item[] items;
	public int emptySlots;
	public int size;
	
	public Inventory(int size) {
		items = new Item[size];
		emptySlots = size;
		this.size = size;
	}
	
	public int getEmptySlots() {
		return emptySlots;
	}
	
	public int getSize() {
		return size;
	}
	
	/*
	 * Adds item to inventory
	 * returns true if added or false if inventory full
	 */
	public boolean addItem(Item item) {
		if (emptySlots == 0)
			return false;
		
		for (int i = 0; i < size; i ++) {
			if (items[i] == null) {
				items[i] = item;
				emptySlots--;
				return true;
			}
		}
		
		return false;
	}
	
	/*
	 * Removes item from inventory
	 * returns true if removed or false if item not found
	 */
	public boolean removeItem(String itemName) {
		if (emptySlots == size) 
			return false;
		
		for (int i = 0; i < size; i++) {
			if (items[i] != null) {
				if (items[i].getName().equals(itemName)) {
					emptySlots++;
					items[i] = null;
					return true;
				}
			}
		}
		
		return false;
	}
	
	/*
	 * Removes all items of one type from the inventory
	 * returns true if removed or false if item not found
	 */
	public boolean removeAllItem(String itemName) {
		if (emptySlots == size) 
			return false;
		
		boolean removed = false;
		for (int i = 0; i < size; i++) {
			if (items[i] != null) {
				if (items[i].getName().equals(itemName)) {
					emptySlots++;
					items[i] = null;
					removed = true;
				}
			}
		}
		
		return removed;
	}
	
	public void clearInventory() {
		items = null;
		emptySlots = size;
	}
	
	public boolean checkItem(String itemName) {
		if (emptySlots == size) 
			return false;
		
		for (int i = 0; i < size; i++) {
			if (items[i] != null) {
				if (items[i].getName().equals(itemName)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void printItems() {
		if (size == emptySlots) {
			System.out.println("Inventário vazio!");
			return;
		}
		System.out.println("Itens no inventário: ");
		for (int i = 0; i < size; i ++) {
			if (items[i] != null) {
				System.out.println(items[i].getName());
			}
		}
	}
}
