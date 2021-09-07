package com.bridgelabz.inventorymanagement;

public class InventoryMain {

	public static void main(String[] args) {
		InventoryManager inventoryManager = new InventoryManager();
		inventoryManager.readInventory();
		inventoryManager.valueOfInventory();
		inventoryManager.printInventory();
	}

}
