package com.bridgelabz.objectorientedprogram;

public class InventoryMain {

	public static void main(String[] args) {
		Inventory rice=new Inventory("Rice",50.0, 10.5);
		Inventory wheat=new Inventory("Wheat",25.0, 25.0);
		Inventory pulses=new Inventory("Pulses",15.5, 23.5);
		System.out.println(rice);
		System.out.println(wheat);
		System.out.println(pulses);
	}

}
