package com.tech.javabasics.step04conditionals;

public class LotteryUtil {
	public static void processLuckyDraw(Integer thisValue) {
		System.out.print("\nThe lottery entry is " + thisValue + " - ");
		if (thisValue % 2 != 0) { // If dividing by 2 gives a remainder of 1, then its an odd no.
			if (thisValue >= 23 && thisValue <= 27) {
				System.out.print("You won a lucky gift");
			} else {
				System.out.print("You were close. We have given you a consolation prize");
			}
		} else {
			System.out.print("Better luck next time");
		}
	}

	public static void processMegaDraw(Integer thisValue) {
		System.out.print("\nThe Mega Draw entry is " + thisValue + " - ");

		if (thisValue == 11 || thisValue == 35 || thisValue == 86) {
			System.out.print("Hurray! You are a winner");
		} else {
			if (thisValue == 20 || thisValue == 45 || thisValue == 76 || thisValue == 57 || thisValue == 93
					|| thisValue == 77) {
				System.out.print("You were close. You have won a consolation prize");
			} else {
				System.out.print("Better luck next time");
			}
		}

	}

	public static void processMegaDrawUsingSwitch(Integer thisValue) {
		System.out.print("\nThe Mega Draw entry is " + thisValue + " - ");

		// Evaluate the value of thisValue
		switch (thisValue) {
		// Find the match, and cascade execution for rest of the case statements
		case 11:
		case 35:
		case 86:
			System.out.print("Hurray! You are a winner");
			break;
		case 57:
		case 76:
		case 45:
		case 20:
			System.out.print("You were close. You have won a consolation prize");
			break;
		default:
			System.out.print("Better luck next time");
		}
	}

}
