package com.bridgeabz.commercialdataprocessing;

import java.util.*;
public class StockAccountMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StockAccount myStocks = new StockAccount();
		myStocks.addCompanyShares();
		myStocks.valueOf();
		boolean flag = true;
		while(flag) {
			System.out.println("Select option 1:buy shares   2:sell shares   3: print Report  4:get value  5:exit");
			int option = sc.nextInt();
			int amount=0;
			String symbol;
			switch(option) {
				case 1:
					System.out.println("enter the share amount");
					amount = sc.nextInt();
					System.out.println("enter the stock symbol");
					symbol = sc.next();
					myStocks.buy(amount, symbol);
					break;
				case 2:
					System.out.println("enter the share amount");
					amount = sc.nextInt();
					System.out.println("enter the stock symbol");
					symbol = sc.next();
					myStocks.sell(amount, symbol);
					break;
				case 3:
					myStocks.printReport();
					break;
				case 4:
					System.out.println("the total value of shares : " +myStocks.valueOf());
					break;
				default:
					flag = false;
					System.exit(0);
			}
		}
			
		sc.close();

	}

}
