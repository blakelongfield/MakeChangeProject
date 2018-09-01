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

		while (tendered > price) {
			price = price * 100;
			tendered = tendered * 100;
			int alteredPrice = (int) (price);
			int alteredTendered = (int) (tendered);
			changeOwedToCustomer(alteredPrice, alteredTendered);
			break;
		}
		if (tendered < price) {
			System.out.println("They provided too little money!!");
		}
		while (tendered == price) {
			System.out.println("That's the exact amount. No change needed.");
			break;
		}
		scanner.close();
	}

	private static void changeOwedToCustomer(int price, int tendered) {
		int twenties = 2000;
		int tens = 1000;
		int fives = 500;
		int ones = 100;
		int quarters = 25;
		int dimes = 10;
		int nickles = 5;
		int pennies = 1;

		int change = tendered - price;
		System.out.println("Your change:");
		if (change / twenties >= 1) {
			int twentiesOwed = change / twenties;
			System.out.println("20's: " + twentiesOwed);
			change = change - (twentiesOwed * twenties);
		}
		if (change / tens >= 1) {
			int tensOwed = change / tens;
			System.out.println("10's: " + tensOwed);
			change = change - (tensOwed * tens);
		}
		if (change / fives >= 1) {
			int fivesOwed = change / fives;
			System.out.println("5's: " + fivesOwed);
			change = change - (fivesOwed * fives);
		}
		if (change / ones >= 1) {
			int onesOwed = change / ones;
			System.out.println("1's: " + onesOwed);
			change = change - (onesOwed * ones);
		}
		if (change / quarters >= 1) {
			int quartersOwed = change / quarters;
			System.out.println("Quarters: " + quartersOwed);
			change = change - (quartersOwed * quarters);
		}
		if (change / dimes >= 1) {
			int dimesOwed = change / dimes;
			System.out.println("Dimes: " + dimesOwed);
			change = change - (dimesOwed * dimes);
		}
		if (change / nickles >= 1) {
			int nicklesOwed = change / nickles;
			System.out.println("Nickles: " + nicklesOwed);
			change = change - (nicklesOwed * nickles);
		}
		if (change / pennies >= 1) {
			int penniesOwed = change / pennies;
			System.out.println("Pennies: " + penniesOwed);
			change = change - (penniesOwed * pennies);
		}
		System.out.println("Have a great day!");
	}
}
