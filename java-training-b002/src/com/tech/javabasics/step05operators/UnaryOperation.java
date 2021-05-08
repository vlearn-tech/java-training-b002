package com.tech.javabasics.step05operators;

@SuppressWarnings("unused")
public class UnaryOperation {
	public static void main(String[] args) {
		int age = 28;
		String message;

//		if (age >= 18) {
//			message = "Eligible to vote";
//		} else {
//			message = "Not yet eligible to vote";
//		}

		if (age < 18) {
			message = "You are not eligible to vote";
		} else {
			if (age >= 18) {
				message = "You are eligible to vote";
			} else {
				// Nothing here
			}
		}

		System.out.println(
				age < 18 ? "You are not eligible to vote" : age >= 18 ? "You are eligible to vote" : "No condition");

		String name = "Sudhanshu";

		if (name.matches(".*ansh.*")) {
			System.out.println(name);
		}

	}
}
