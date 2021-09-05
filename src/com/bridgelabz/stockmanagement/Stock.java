package com.bridgelabz.stockmanagement;

public class Stock {
	private String stockName;
	private	Integer numberOfShares;
	private Double sharePrice;
	public Stock(String stockName, Integer numberOfShares, Double sharePrice) {
		this.stockName = stockName;
		this.numberOfShares = numberOfShares;
		this.sharePrice = sharePrice;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Integer getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(Integer numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public Double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(Double sharePrice) {
		this.sharePrice = sharePrice;
	}	
	
}
