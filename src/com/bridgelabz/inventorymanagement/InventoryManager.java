package com.bridgelabz.inventorymanagement;

import com.bridgelabz.linkedlistfiles.LinkedList;
import com.bridgelabz.linkedlistfiles.Node;

public class InventoryManager {
	LinkedList<Inventory> inventoryList;
	
	public void readInventory() {
		InventoryFactory inventoryFactory = new InventoryFactory();
		this.inventoryList = inventoryFactory.addInventories();
	}

	public void valueOfInventory() {
		Node<Inventory> tempNode = (Node<Inventory>) inventoryList.getHead();
		while(tempNode != null) {
			Inventory current = tempNode.getKey();
			current.setValue(current.getPrice()*current.getWeight());
			tempNode = (Node<Inventory>)tempNode.getNext();
		}
		
	}
	public void printInventory() {
		inventoryList.printNodes();
	}
}
