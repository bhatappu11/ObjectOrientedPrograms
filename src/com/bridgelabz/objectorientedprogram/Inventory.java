package com.bridgelabz.objectorientedprogram;

public class Inventory {
	private String inventoryName;
	private Double price;
	private Double weight;
	public Inventory(String inventoryName, double price, double weight) {
		this.inventoryName = inventoryName;
		this.price = price;
		this.weight = weight;
	}
	public String getInventoryName() {
		return this.inventoryName;
	}
	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public Double valueOfInventory() {
		return this.getPrice()*this.getWeight();
		
	}
	@Override
	public String toString() {
		return "Inventory [InventoryName=" + inventoryName + ", Price=" + price + ", Weight=" + weight
				+ ", Value=" + valueOfInventory() + "]";
	}
	
	
	
	

}
