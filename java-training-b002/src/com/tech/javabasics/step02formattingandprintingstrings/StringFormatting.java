package com.tech.javabasics.step02formattingandprintingstrings;

public class StringFormatting {
	public static void main(String[] args) {

		int age = 30;
		String name = "Vikram";

		String message = "Name of the employee is " + name + " and he/she is " + age + " years old.";
		System.out.println(message);

		String newMessage = String.format("Name of the employee is %s and he/she is %d years old.", name, age);
		System.out.println(newMessage);

		String concatMessage = "Name of the employee is ".concat(name).concat(" and he/she is ").concat("" + age)
				.concat(" years old.");
		System.out.println(concatMessage);

		System.out.println("\n\n====================================================================\n");

		System.out.printf("Name of the employee is %s and he/she is %d years old.", name, age).println();
		System.out.print(String.format("Name of the employee is %s and he/she is %d years old.", name, age));

		System.out.println("\nHello \"World\"");
		System.out.println("\nHello \"Amitav\", How are you doing today");

		System.out.println("where name like 'A%'");
		System.out.println(String.format("where name like '%s%%'", "A"));

		// Ways to format String -
		// a. Concatenation (+ Operator)
		// b. String.format

		// Ways to print String
		// 1. SOP
		// 2. SOPL

		// Ways to do both
		// 1a, 1b, 2a, 2b, SOPF (*1b)

	}
}
