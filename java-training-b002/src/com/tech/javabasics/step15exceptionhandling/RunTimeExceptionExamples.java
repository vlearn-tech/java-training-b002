package com.tech.javabasics.step15exceptionhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RunTimeExceptionExamples {
	public static void main(String[] args) {
//		Integer i = Integer.valueOf("2 3"); // NumberFormatException
		// System.out.println(i);

		int[] intArr = { 1, 2, 3, 4 };
		// System.out.println(intArr[5]); // ArrayIndexOutOfBoundsException

		String name = null;
		// System.out.println("Length of my name is " + name.length()); // NullPointerException

		Integer[] numList = new Integer[10];
		Integer[] denList = { 2, 5, 0 };

		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			numList[i] = random.nextInt(100);
		}

		List<String> errors = new ArrayList<>();

		for (Integer i : numList) {
			int den = denList[random.nextInt(3)];
			try {
				System.out.println(String.format("%d divided by %d gives %d", i, den, i / den));
			} catch (RuntimeException e) {
				errors.add(String.format("%d could not be divided by %d", i, den));
			}
		}

		System.out.println("==============E R R O R S  ==========");
		System.out.println(errors);

		int num = 100;
		int den = 0;

		System.out.println("Quotient : " + (num / den)); // ArithmeticException

	}
}

//Exception - 3 types

//1. Compile Time Exceptions - [Checked Exception]
//2. [RunTime Exception] - Unchecked Exception
//3. [Errors]
