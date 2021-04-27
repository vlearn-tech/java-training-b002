package com.tech.javabasics.step06Loops;

import java.util.Scanner;

public class LoopWithScannerInputs {

	static Scanner sc;

	public static void main(String[] args) {
		int choice = 0;
		sc = new Scanner(System.in);
		System.out.println("Welcome to the game. Enter your choice between 1 and 6. Enter 0 to quit : ");
		int i = 0;

		while (true) {
			choice = getNextOption();
//			System.out.println(choice);

			if (choice == 0) {
				System.out.println("Thank you for playing. Hope you enjoyed the game");
				break;
			}
			if (choice >= 7) {
				System.out
						.println("Incorrect choice. Try again. Enter your choice between 1 and 6. Enter 0 to quit : ");
				choice = 0;
				continue;
			}
			evaluateChoice();
			System.out.println("Awesome! You may try again. Enter your choice between 1 and 6. Enter 0 to quit : ");
		}

		sc.close();
	}

	private static void evaluateChoice() {
		System.out.println("Doing something..");
	}

	private static int getNextOption() {
		int choice = 0;

		try {
			if (sc.hasNextLine()) {
				choice = Integer.valueOf(sc.nextLine());
			}
			if (choice < 0) {
				choice = 100;
			}
		} catch (Exception e) {
			choice = 99;
		}
		return choice;
	}
}
