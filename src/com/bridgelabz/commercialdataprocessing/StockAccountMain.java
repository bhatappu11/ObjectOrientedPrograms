package com.bridgelabz.commercialdataprocessing;

import java.util.*;
public class StockAccountMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StockAccount myStocks = new StockAccount();
		myStocks.addCompanyShares();
		myStocks.valueOf();
		boolean flag = true;
		while(flag) {
			System.out.println("Select option 1:add Companyshares   2: remove companyshares   3:buy shares   4:sell shares   5: print Report 6:print transactions  7:get value  8:exit");
			int option = sc.nextInt();
			int amount=0;
			String symbol;
			switch(option) {
				case 1:
					myStocks.addCompanyShares();
					myStocks.valueOf();
					break;
				case 2:
					System.out.println("Enter the Share Symbol is remove it");
					myStocks.removeCompanyShares(sc.next());
					myStocks.valueOf();
					break;
				case 3:
					System.out.println("enter the share amount");
					amount = sc.nextInt();
					System.out.println("enter the stock symbol");
					symbol = sc.next();
					myStocks.buy(amount, symbol);
					break;
				case 4:
					System.out.println("enter the share amount");
					amount = sc.nextInt();
					System.out.println("enter the stock symbol");
					symbol = sc.next();
					myStocks.sell(amount, symbol);
					break;
				case 5:
					myStocks.printReport();
					break;
				case 6:
					myStocks.printTransaction();
				case 7:
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
