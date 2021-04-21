package com.tech.javabasics.step03CodeConstructionLogic;

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
		Integer[] nums = new Integer[sizeOfArray];
		Random random = new Random();

		for (int i = 0; i < sizeOfArray; i++) {
			nums[i] = random.nextInt(99);
		}

		return nums;
	}

}
