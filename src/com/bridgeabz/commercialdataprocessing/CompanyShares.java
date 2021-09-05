package com.bridgeabz.commercialdataprocessing;

import java.time.LocalDateTime;

public class CompanyShares {
	private String stockSymbol;
	private int numberOfShares;
	private double pricePerShare;
	private double value;
	private LocalDateTime dateTime;
	
	public CompanyShares(String stockSimble, int numberOfShares, double pricePerShare){
		this.stockSymbol = stockSimble;
		this.numberOfShares = numberOfShares;
		this.pricePerShare = pricePerShare;
		this.value = numberOfShares*pricePerShare;
		this.setDateTime(LocalDateTime.now());
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public double getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "CompanyShares [stockSymbol=" + stockSymbol + ", numberOfShares=" + numberOfShares + ", pricePerShare="
				+ pricePerShare + ", value=" + value + ", dateTime=" + dateTime + "]";
	}
	
	
	
}
