package com.bridgelabz.inventorymanagement;

import com.bridgelabz.linkedlistfiles.INode;
import com.bridgelabz.linkedlistfiles.LinkedList;
import com.bridgelabz.linkedlistfiles.*;

public class InventoryMain {

	public static void main(String[] args) {
		Inventory rice=new Inventory("Rice",50.0, 10.5);
		Inventory wheat=new Inventory("Wheat",25.0, 25.0);
		Inventory pulses=new Inventory("Pulses",15.5, 23.5);
		LinkedList<Inventory> inventoryList=new LinkedList<>();
		inventoryList.add(new Node<Inventory>(rice));
		inventoryList.add(new Node<Inventory>(wheat));
		inventoryList.add(new Node<Inventory>(pulses));
		rice.valueOfInventory();
		wheat.valueOfInventory();
		pulses.valueOfInventory();
		inventoryList.printNodes();
	}

}
