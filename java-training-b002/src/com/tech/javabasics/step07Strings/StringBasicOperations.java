package com.tech.javabasics.step07Strings;

import java.util.Arrays;

public class StringBasicOperations {
	public static void main(String[] args) {
		String name = "Vikas";
		char[] nameAsCharArray = name.toCharArray(); // { 'V', 'i', 'k', 'a', 's' }

		// where does the letter a occur in the String
		System.out.println("Letter a occurs at position : " + name.indexOf("a"));

		// whether a specific letter is present in the String or not

		// using loop
		boolean isPresent = false;
		for (char c : nameAsCharArray) {
			if (c == 's') {
				isPresent = true;
				break;
			}
		}
		System.out.println("Is s present : " + isPresent);
//		String nameStr = nameAsCharArray.toString();
//		System.out.println(nameStr);

		// Using String function
		System.out.println("Is s present : " + name.contains("s"));

		// whether a specific sequence of letters is present in the String or not
		System.out.println("Is 'sa' present : " + name.contains("sa"));

		// whether my String starts with a specific character
		System.out.println("String starts with V : " + name.startsWith("V"));

		// whether my String ends with a specific character
		System.out.println("String ends with 'kas' : " + name.endsWith("kas"));

		String message = "    I am programming in Java    ";
		message = message.trim();

		System.out.println("2 letters from 4th last position are : "
				+ message.substring(message.length() - 4, message.length() - 2));

		// Splitting the string into smaller words based on a delimiter
		String[] words = message.split(" ");

		// Printing all elements of an array in a predefined format
		System.out.println(Arrays.toString(words));

		// Joining multiple individual Strings to create a new String with your own joiner
		System.out.println(String.join(" - ", words));

	}
}
