package com.bridgelabz.stockmanagement;

import java.util.*;

public class StockMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of stocks");
		int numOfStocks = scanner.nextInt();
		StockPortfolio stockPortfolio = new StockPortfolio(numOfStocks);
		System.out.println("Enter the details of each stock");
		for(int index=0;index<numOfStocks;index++) {
			System.out.println("Enter name, num of shares and share price for stock");
			String stockName = scanner.next();
			int numberOfShares = scanner.nextInt();
			Double sharePrice = scanner.nextDouble();
			Stock stock = new Stock(stockName,numberOfShares,sharePrice);
			stockPortfolio.addStock(stock);
		}
		System.out.println(stockPortfolio);

	}

}
