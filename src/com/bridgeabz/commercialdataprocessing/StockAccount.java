package com.bridgeabz.commercialdataprocessing;

import com.bridgelabz.linkedlistfiles.LinkedList;
import com.bridgelabz.linkedlistfiles.Node;

import java.util.*;

public class StockAccount {
	LinkedList<CompanyShares> stockList;
	Double total ;
	public StockAccount() {
		stockList =new LinkedList<CompanyShares>();
		total = 0.0;
	}
	
	public double valueOf() {
		Node<CompanyShares> tempNode = (Node<CompanyShares>) stockList.getHead();
		while(tempNode != null) {
			this.total += tempNode.getKey().getValue();
			tempNode = (Node<CompanyShares>)tempNode.getNext();
		}
		return this.total;
	}
	public void buy(int amount,String symbol) {
		Node<CompanyShares> tempNode = (Node<CompanyShares>) stockList.getHead();
		while(tempNode != null) {
			if(tempNode.getKey().getStockSymbol().equals(symbol)) {
				int currentShares = tempNode.getKey().getNumberOfShares();
				tempNode.getKey().setNumberOfShares(amount+currentShares);
				double value = tempNode.getKey().getPricePerShare() * (amount+currentShares);
				this.total = value;
				tempNode.getKey().setValue(value);
				System.out.println(" added "+amount+" shares to stockSymbol "+symbol+" updated value is "+value);
				return;
			}
			tempNode = (Node<CompanyShares>)tempNode.getNext();
		}
		System.out.println("Symbol not found");
	}
	public void sell(int amount,String symbol) {
		Node<CompanyShares> tempNode = (Node<CompanyShares>) stockList.getHead();
		while(tempNode != null) {
			if(tempNode.getKey().getStockSymbol().equals(symbol)) {
				int currentShares = tempNode.getKey().getNumberOfShares();
				if(currentShares-amount < 0) {
					System.out.println("There is not enough shares to sell. pls reduce amount!");
					return;
				}
				tempNode.getKey().setNumberOfShares(currentShares-amount);
				double value = tempNode.getKey().getPricePerShare() * (currentShares-amount);
				tempNode.getKey().setValue(value);
				this.total = value;
				System.out.println(" sold "+amount+" shares of stockSymbol "+symbol+" updated value is "+value);
				return;
			}
			tempNode = (Node<CompanyShares>)tempNode.getNext();
		}
		System.out.println("Symbol not found");
	}
	public void printReport() {
		System.out.println("The stock report: ");
		System.out.println("The total value is : "+ this.total);
		stockList.printNodes();
	}

	public void addCompanyShares() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of CompanyShares");
		int number = sc.nextInt();
		for(int index=0;index<number;index++) {
			System.out.println("enter the Stock Symbol");
			String symbol = sc.next();
			System.out.println("Enter the number of shares");
			int numOfShares = sc.nextInt();
			System.out.println("Enter the price of one share");
			double price = sc.nextDouble();
			CompanyShares stock = new CompanyShares(symbol,numOfShares,price);
			stockList.append(new Node<CompanyShares>(stock));
		
	}
}
}