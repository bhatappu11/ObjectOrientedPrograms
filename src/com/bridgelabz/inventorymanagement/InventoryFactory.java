package com.bridgelabz.inventorymanagement;

import com.bridgelabz.linkedlistfiles.LinkedList;
import com.bridgelabz.linkedlistfiles.Node;

import java.util.*;

public class InventoryFactory {

	public LinkedList<Inventory> addInventories() {
		LinkedList<Inventory> inventoryList=new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num of inventories");
		int numOfInventories=scanner.nextInt();
		for(int index=0;index<numOfInventories;index++) {
			System.out.println("Enter name of inventory");
			String name  = scanner.next();
			System.out.println("Enter the weight: ");
			Double weight  = scanner.nextDouble();
			System.out.println("Enter the price: ");
			Double price = scanner.nextDouble();
			Inventory inventory = new Inventory(name, weight, price);
			inventoryList.add(new Node<Inventory>(inventory));
		}
		return inventoryList;
	}
	
}
