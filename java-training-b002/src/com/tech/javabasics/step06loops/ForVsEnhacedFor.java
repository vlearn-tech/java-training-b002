package com.tech.javabasics.step06loops;

import java.util.Arrays;

public class ForVsEnhacedFor {
	public static void main(String[] args) {

		String[] names = { "Akash", "Bindu", "Cynthia", "David", "Emmanuel", "Frank", "Anshul" };

		String[] newNames = new String[4];
		newNames[0] = "Richa";
		newNames[1] = "Suchi";
		newNames[2] = "Sudhanshu";
		newNames[3] = "Abhijeet";

		System.out.println(Arrays.toString(newNames));

		System.out.println("\n=======================\n");
		// Print all names containing the letter a.
		for (int index = 0; index < names.length; index++) {
			if (names[index].contains("a")) {
				System.out.println(names[index]);
			}
		}

		System.out.println("\n=======================\n");

		// Print all names containing the string an but not starting with A
		for (String thisName : names) {
			if (thisName.contains("an") && !thisName.startsWith("A")) {
				System.out.println(thisName);
			}
		}

		System.out.println("\n=======================\n");

		// Another alternative - Very Advanced - Using Lambdas
		Arrays.stream(names).filter(s -> s.contains("an") && !s.startsWith("A")).forEach(System.out::println);

		Integer[] numbers = { 1, 4, 2, 4, 7, 34, 21, 213 };
		
		Integer sum = 0;
		for(Integer n : numbers) {
			sum += n;
		}
		System.out.println("Sum of the numbers is : " + sum);

	}
}
