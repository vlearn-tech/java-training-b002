package com.tech.javabasics.step04Conditionals;

import java.util.Arrays;

import com.tech.javabasics.step03CodeConstructionLogic.ArrayUtils;

public class FindOddNumbersInArray {
	public static void main(String[] args) {
		// Define an array and generate the array with 10 random numbers
		Integer[] myArrayOfNumbers = ArrayUtils.generateArrayWithRandomValues(5);

		// Print the array to see its contents to validate the details
		System.out.println(Arrays.toString(myArrayOfNumbers));

		// Loop through the array
		for (Integer thisValue : myArrayOfNumbers) {
			// For each entry in the array validate if number is odd or even. Print if Odd
			if (thisValue % 2 == 1) {// If dividing by 2 gives a remainder of 1, then its an odd no.
				System.out.println("Odd number found : " + thisValue);
			}
		}

	}
}
