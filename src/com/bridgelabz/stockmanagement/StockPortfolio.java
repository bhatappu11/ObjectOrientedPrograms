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

	@Override
	public String toString() {
		return "StockPortfolio [noOfStocks=" + noOfStocks + ", stocks=" + stocks + "]";
	}
	
}
