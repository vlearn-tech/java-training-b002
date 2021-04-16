package com.tech.javabasics.step02PrintingStrings;

public class StringFormatting {
	public static void main(String[] args) {

		int age = 30;
		String name = "Vikram";

		String message = "Name of the employee is " + name + " and he/she is " + age + " years old.";
		System.out.println(message);

		String newMessage = String.format("Name of the employee is %s and he/she is %d years old.", name, age);
		System.out.println(newMessage);

		System.out.println("\n\n====================================================================\n");

		System.out.printf("Name of the employee is %s and he/she is %d years old.", name, age).println();
		System.out.print(String.format("Name of the employee is %s and he/she is %d years old.", name, age));

		// 01: Ways of formatting: +, concat + String.format
		// 02: Ways of printing: print, println
		// 03: Format while printing: use 01 + 02, use 01 + 02 (String.format) ==> System.out.printf

	}
}
