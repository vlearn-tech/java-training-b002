package com.tech.javabasics.step03codeconstructionlogic;

import java.util.Random;

public class ArrayUtils {
	public static void printArrayContent(Integer[] numbers, char choice) {

		printArraySize(numbers);

		if (choice == 'E') {
			System.out.println("\nNow printing the contents of the array (enhanced for loop)");

			for (Integer a : numbers) {
				System.out.println(a);
			}
		} else {
			System.out.println("\nNow printing the contents of the array (normal loop)");

			for (int index = 0; index < numbers.length; index++) {
				System.out.println(numbers[index]);
			}
		}
	}

	public static void printArraySize(Integer[] numbers) {
		System.out.println("\n\nLength of the array is " + numbers.length);
	}

	public static Integer[] generateArrayWithRandomValues(int sizeOfArray) {
		// Declare an array of the size expected/requested
		Integer[] numArray = new Integer[sizeOfArray];

		Random random = new Random();

		// Generate random numbers and store in array
		for (int i = 0; i < sizeOfArray; i++) {
			numArray[i] = random.nextInt(99); // Generate a random positive value less than 99
		}

		// Return the generated array
		return numArray;
	}

	public static void print(Integer[] arrToPrint) {
		System.out.print("[");
		for (int i : arrToPrint) {
			System.out.print(i + ", ");
		}
		System.out.println("]");
	}

}
