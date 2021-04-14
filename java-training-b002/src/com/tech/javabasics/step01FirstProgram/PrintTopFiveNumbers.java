package com.tech.javabasics.step01FirstProgram;

public class PrintTopFiveNumbers {
	public static void main(String[] args) {
		// Find the top number
		int maxNumber = Integer.MAX_VALUE;

		// iterate in reverse manner 5 times
		for (int counter = 0; counter < 5; counter++) {
			// For each iteration print the number
			MyPrintUtils.print(maxNumber - counter);
		}

	}
}
