package com.bridgelabz.stockmanagement;

import java.util.ArrayList;

public class StockPortfolio {
	private final int noOfStocks;
	private ArrayList<Stock> stocks;
	
	public StockPortfolio(int noOfStocks) {
		this.noOfStocks = noOfStocks;
		this.stocks = new ArrayList<Stock>(noOfStocks);
	}
	
	public void addStock(Stock stock) {
		stocks.add(stock);
	}
	public void totalStockValue() {
		int total = 0;
		for(Stock stock : stocks) {
			Double stockValue = stock.stockValue();
			System.out.println("Value of "+stock.getStockName()+ " : "+stockValue);
			total += stockValue;
		}
		System.out.println("Total Value of all stocks : "+ total);
	}

	@Override
	public String toString() {
		return "StockPortfolio [noOfStocks=" + noOfStocks + ", stocks=" + stocks + "]";
	}
	
}
