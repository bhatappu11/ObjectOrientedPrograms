package com.bridgelabz.inventorymanagement;

public class Inventory {
	private String inventoryName;
	private Double price;
	private Double weight;
	private Double value;
	public Inventory(String inventoryName, double price, double weight) {
		this.inventoryName = inventoryName;
		this.price = price;
		this.weight = weight;
		this.value = 0.0;
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
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Inventory [InventoryName=" + inventoryName + ", Price=" + price + ", Weight=" + weight + ", Value="
				+ value + "]"+"\n";
	}
		

}
