package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// The user is prompted asking for the price of the item.
		System.out.print("Price of the item: ");
		double price = scanner.nextDouble();

		// The user is then prompted asking how much money was tendered by the customer.
		System.out.print("How much was tendered: ");
		double tendered = scanner.nextDouble();

		while(tendered > price) {
		changeOwedToCustomer(price, tendered);
		break;
		}
		if (tendered < price) {
			System.out.println("They provided too little money!!");
		}
		else {
			System.out.println("That's the exact amount. No change needed.");
		}
	}

	private static void changeOwedToCustomer(double price, double tendered) {
		int twenties = 20;
		int tens = 10;
		int fives = 5;
		int ones = 1;
		double quarters = .25;
		double dimes = .10;
		double nickles = .05;
		double pennies = .01;

		double change = tendered - price;
		System.out.println("Your change:");
		if (change % twenties > 1) {
			change = change / twenties;
			int twentiesOwed = (int) change;
			System.out.print("20's: " + twentiesOwed);
			change = change - twentiesOwed;
		}
		else if (change % tens > 1) {
			change = change / tens;
			int tensOwed = (int) change;
			System.out.print("10's: " + tensOwed);
			change = change - tensOwed;
		}
		else if (change % fives > 1) {
			change = change / fives;
			int fivesOwed = (int) change;
			System.out.println("5's: " + fivesOwed);
			change = change - fivesOwed;
		}
		else if (change % ones > 1) {
			change = change / ones;
			int onesOwed = (int)change;
			System.out.println("1's: " + onesOwed);
			change = change - onesOwed;
		}
		else if (change % quarters > 1) {
			change = change / quarters;
			int quartersOwed = (int)change;
			System.out.println("Quarters: " + quartersOwed);
			change = change - quartersOwed;
		}
		else if (change % dimes > 1) {
			change = change / dimes;
			int dimesOwed = (int)change;
			System.out.println("Dimes: " + dimesOwed);
			change = change - dimesOwed;
		}
		else if (change % nickles > 1) {
			change = change / dimes;
			int nicklesOwed = (int)change;
			System.out.println("Nickles: " + nicklesOwed);
			change = change - nicklesOwed;
		}
		else if (change % pennies > 1) {
			change = change / pennies;
			int penniesOwed = (int)change;
			System.out.println("Pennies: " + penniesOwed);
			change = change - penniesOwed;
		}
	System.out.println("Have a great day!");
	}
}
