package com.bridgelabz.objectorientedprogram;

public class Inventory {
	private String inventoryName;
	private double price;
	private double weight;
	private double value;
	public Inventory(String inventoryName, double price, double weight) {
		this.inventoryName = inventoryName;
		this.price = price;
		this.weight = weight;
		this.value = 0;
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
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Inventory [inventoryName=" + inventoryName + ", price=" + price + ", weight=" + weight + ", value="
				+ value + "]";
	}

}
